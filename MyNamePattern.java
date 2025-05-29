// File: MyNamePattern.java
public class MyNamePattern {

    static int n = 7;

    public static void printS() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n / 2 || i == n - 1)
                    System.out.print("*");
                else if (i < n / 2 && j == 0)
                    System.out.print("*");
                else if (i > n / 2 && j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printH() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printA() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if ((j == 0 || j == n / 2) && i != 0 ||
                        i == 0 && j != 0 && j != n / 2 ||
                        i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printI() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printK() {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                if (j == Math.abs(n / 2 - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
        }
    }

    public static void printV() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n * 2; j++) {
                if (j == i || j == 2 * n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printL() {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i == n - 1) {
                for (int j = 1; j < n; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void printSpace() {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Print S
        printS();
        printSpace();

        // Print H
        printH();
        printSpace();

        // Print A
        printA();
        printSpace();

        // Print I
        printI();
        printSpace();

        // Print K
        printK();
        printSpace();

        // SPACE BETWEEN WORDS
        System.out.println("\n\n");

        // Print S
        printS();
        printSpace();

        // Print H
        printH();
        printSpace();

        // Print A
        printA();
        printSpace();

        // Print S
        printS();
        printSpace();

        // Print H
        printH();
        printSpace();

        // Print A
        printA();
        printSpace();

        // SPACE BETWEEN WORDS
        System.out.println("\n\n");

        // Print V
        printV();
        printSpace();

        // Print A
        printA();
        printSpace();

        // Print L
        printL();
        printSpace();

        // Print I
        printI();
        printSpace();
    }
}
