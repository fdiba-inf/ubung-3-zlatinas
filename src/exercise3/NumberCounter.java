package exercise3;

import java.util.Scanner;

 public class NumberCounter {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int pn = 0;
    int nn = 0 ;
    double sum = 0.0;
    double average = 0.0;
    
    int x = input.nextInt();

    while ( x != 0)  {
        
        if (x > 0) {
        pn++;
        } else
          if (x < 0) {
          nn++;
          }
    
       
       sum = sum + x; 
       x = input.nextInt(); 
      } 

    
       average = sum / (pn+nn); 

      System.out.println("Positive numbers: " + pn);
      System.out.println("Negative numbers: " + nn);
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average); 
    
    
   }
 }  

    