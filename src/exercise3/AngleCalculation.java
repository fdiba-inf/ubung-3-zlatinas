package exercise3;

import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter angle: ");
    double angle;
    char ch;

    do {
      angle = input.nextDouble();
      ch = input.next().charAt(0);

      if(ch == 'r') {
        double conangle = angle / Math.PI * 180;
        System.out.println("Angle: " + conangle + "d");

      } else if(ch == 'd') {
        double conangle = angle * Math.PI / 180;
        System.out.println("Angle: " + conangle + "r");
      }
  

    } while(ch == 'r' || ch == 'd'); 


  }

}