package com.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TabuleiroSecreto {

    public static void main(String[] args) throws IOException {

        //Scanner input = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // quebrar a linha lida em 2 string com espaço como separador
        String[] str = input.readLine().split(" ");

        //tamanho do tabuleiro (N) e número de operações (Q), operação a ser feita (O)
        int N, Q, O;
        //X é linha ou coluna, R é o número a ser atribuído
        int X, R;
        N = Integer.parseInt(str[0]);
        Q = Integer.parseInt(str[1]);
        int ocorrencias = 0;
        int[][] M = new int[N][N];

        //atribui 0 a todos os elementos
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++)
                M[i][j] = 0;
        }

        for (int i = 0; i < Q; i++) {

            String[] operacao = input.readLine().split(" ");
            //lê operação
            O = Integer.parseInt(operacao[0]);
            //lê linha ou coluna
            X = Integer.parseInt(operacao[1]);
            X -= 1;

            //se a operação for de atribuição
            if (O == 1 || O == 2) {
                R = Integer.parseInt(operacao[2]);
                for (int j = 0; j < M.length; j++) {
                    //atribua o valor R para a linha inteira
                    if (O == 1)
                        M[X][j] = R;
                        //atribua o valor R para a coluna inteira
                    else
                        M[j][X] = R;
                }
            }
            //se a operação for de imprimir
            else if (O == 3 || O == 4) {
                if (O == 3) {
                    Map<Integer, Integer> mapLin = new HashMap<>();
                    mapLin.put(M[X][0], 1);
                    for (int j = 1; j < M.length; j++) {
                        if (mapLin.containsKey(M[X][j]))
                            mapLin.put(M[X][j], mapLin.get(M[X][j]) + 1);
                        else
                            mapLin.put(M[X][j], 1);
                    }
                    getOcorrencia((HashMap<Integer, Integer>) mapLin);
                }
                else {
                    Map<Integer, Integer> mapCol = new HashMap<>();
                    mapCol.put(M[0][X], 1);
                    for (int j = 1; j < M.length; j++) {
                        if (mapCol.containsKey(M[j][X]))
                                mapCol.put(M[j][X], mapCol.get(M[j][X]) + 1);
                            else
                                mapCol.put(M[j][X], 1);
                        }
                    getOcorrencia((HashMap<Integer, Integer>) mapCol);
                }
            }
        }
    }

    public static void getOcorrencia(HashMap<Integer, Integer> map) {
        var ocorrencia = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        if (map.get(ocorrencia) == 1)
            ocorrencia = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        System.out.println(ocorrencia);
    }
}


