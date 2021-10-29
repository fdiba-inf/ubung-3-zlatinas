package exercise3;

import java.util.Scanner;

  public class Triangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a, b, c, s;
    double p= 0;
     
    do {
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();

    if (a + b < c && b + c < a && a +c > b && a > 0 && b > 0 && c > 0)   {
     System.out.println("Values are not correct!");
    
    } else  
    p = (a + b + c)/2;
    s = Math.sqrt( p *(p - a)*(p - b)*(p - c));
    System.out.println("Area: " + s);


    if ( a == b || b == c || a == c) {

    System.out.println("Triangle: isosceles");

    } else if ( a== b && b == c) {
      System.out.println("Triangle: equilateral");

    } else  { 
      System.out.println("Triangle: scalene");

    }
  
    } while ( a > 0 && b > 0 && c > 0); 

  }
 }