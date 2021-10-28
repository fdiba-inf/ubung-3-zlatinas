package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int x = input.nextInt();
       char ch = input.next().charAt(0);
       double radiant;
       double grad;
       do {
         if (ch == 'r') {
           radiant = (x * 3.14) / 180;
           System.out.println("Angle: " + radiant + ch);
         } else {
           grad = (x * 180) / 3.14;
           System.out.println("Angle: " + grad + ch);
         }
         ch = input.next().charAt(0);
       } while((ch == 'r') || (ch == 'd'));
       
       
    }

}