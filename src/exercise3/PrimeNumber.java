package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(); 
        int x = 2;
        boolean prime = true;

      while (n > 2) {
        if ( n % x == 0 && n!= x) {
          prime = false;
          break;
        } if (x ==100) {
          break;
        }

       x++;

      }

     System.out.println("Prime number: " + prime);
      

    }
}
