import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();
        Set<Integer> setFig = new HashSet<>();

        for(int i = 1; i <= numFigCompradas; i++) {
            int figComprada = scan.nextInt();
            setFig.add(figComprada);
        }

        System.out.println(numTotal - setFig.size());
    }
}