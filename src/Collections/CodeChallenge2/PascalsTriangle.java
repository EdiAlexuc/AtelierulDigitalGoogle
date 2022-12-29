package Collections.CodeChallenge2;

import java.util.Scanner;

public class PascalsTriangle {

    public int factorial(int number) {
        int result = 1, i;
        for(i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }

        public static void main (String[] args){
            PascalsTriangle pascalsTriangle = new PascalsTriangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n:");
        int n = sc.nextInt();
//            int n = 5;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    // for left spacing
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(" " + pascalsTriangle.factorial(i) / (pascalsTriangle.factorial(i - j) * pascalsTriangle.factorial(j)));
                }
                // prints a new line (row)
                System.out.println();
            }
        }
    }
