/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week06lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Week06lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner userInput = new Scanner( System.in );
         Random rand = new Random(); 
         rand.nextInt(10); 
         int ranNumber = rand.nextInt(10) + 1;
         int playAgain = 1;
         boolean correct;
         boolean less;
         boolean play = true;
         do
        {
                 System.out.println("enter a number");
                   int guess = userInput.nextInt();
                   correct = (guess==ranNumber);
                   less = (guess<ranNumber);
                   if(correct)
                       System.out.println("you win");
                   else if (less)
                       System.out.println("your guess is less than the number!");
                   else
                       System.out.println("You guess is greater than the number");
                   System.out.println("Do you want to play again? 1 for yes 2 for no.");
                     int again = userInput.nextInt();
                     switch (again) {
                         case 1: again=1;
                             play = true;
                             break;
                         case 2: again = 2;
                             play = false;
                             break;   
                     }
                   
   
        }     while(play);
        
}
}