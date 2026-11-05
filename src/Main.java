import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] simbol = {'T', 'G', 'C', 'F', 'D', 'R', 'H'};

        StringBuilder salidaGlobal = new StringBuilder();

        while (sc.hasNextInt()) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int divisor = 1000000;
            int temp = n;

            for (int i = 6; i >= 0; i--) {
                int cantidad = temp / divisor;
                temp %= divisor;
                divisor /= 10;

                for (int j = 0; j < cantidad; j++) {
                    salidaGlobal.append(simbol[i]);
                }
            }
            salidaGlobal.append("\n");
        }

        System.out.print(salidaGlobal.toString());
    }
}

