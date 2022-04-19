package calculus;

import java.util.Scanner;

public class Calculator {

    public  static void main(String args[]) {
        Scanner Scan = new Scanner(System.in);


        System.out.println(" choose your operation");
        System.out.println(" type 1 for addition");
        System.out.println(" type 2 for multiplication");
        System.out.println(" type 3 for subtraction");
        System.out.println(" type 4 for division");
        int choose = Scan.nextInt();


        System.out.println(" enter your numbers");
        int x = Scan.nextInt();
        int y = Scan.nextInt();





        if (choose == 1) {
            System.out.println( "your total is"+" "+ add(x,y) );
        } else if (choose == 2) {
            System.out.println( "your total is"+" "+ multi(x,y) );
        } else if (choose == 3) {
            System.out.println( "your total is"+" "+sub(x,y)  );
        } else if (choose == 4) {
            System.out.println( "your total is"+" "+div(x,y)  );
        }

    }


       static int  add ( int x, int y){
            int total = x + y;

            return total;
        }

        static int multi ( int x, int y){
            int total = x * y;

            return total;
        }

        static int sub ( int x, int y){
            int total = x - y;

            return total;
        }

        static int div ( int x, int y){
            int total = x / y;

            return total;
        }


    }






