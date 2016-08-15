/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karas_000
 */
import java.util.InputMismatchException;
import java.util.Scanner;


public class VariableDice {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int newdie = 0;
        int wintracker = 0;
        int losstracker = 0;
        int tietracker = 0;
        boolean keeprolling = true;
        boolean correctinput = false;
        
        
        System.out.println("Welcome to the Dice Roller Game \nTry to roll a number higher than the computer \nThe game continues until you beat the robot overlords \nBest of 5 rolls");        
        //System.out.println("How many sides will both die have?");
        //newdie = scan.nextInt();
        
        while(correctinput == false){
        System.out.println("How many sides will both die have? Enter value great than 1");
        
            try{
                newdie = scan.nextInt();
                if(newdie <= 1){
                    throw new Exception("");
                }
            }   catch(InputMismatchException ime){
                System.out.println("Input Error: Non Integer");
                //correctinput = false;
                }
                catch(Exception exception){
                System.out.println("Input Error: Negative Number or One");  
                }
            if(newdie > 1){
                correctinput = true;
            }           
            scan.nextLine();
        }
        
       
        while(keeprolling == true){ 
        
            DiceRoller diceRoller = new DiceRoller(newdie);
            diceRoller.getRoll();
            System.out.println("You rolled a " + diceRoller.getRoll());
         
            Die die = new Die();
            die.Die(newdie);
            System.out.println("Computer rolled a " + die.getDie());
            
            if(diceRoller.getRoll() > die.getDie() ){
                System.out.println("Your roll is higher!!!");
                wintracker += 1;
                
            }
            else if(diceRoller.getRoll() < die.getDie()){
                System.out.println("The computer's roll is higher!!!");
                losstracker += 1;
        }
            else{
                System.out.println("Tie!!!");
                tietracker += 1;//tietracker++ :)
            }
       
            //System.out.println("Standings: \nYou: " + wintracker + "\nComputer: " + losstracker + "\nTies: " + tietracker + "\n" );
            
            // Alt: System.out.println("You have " + wintracker + " points");
            // you can also just do "You: {0}\rComputer: {1}" where {0} is wintracker and {1} is losetracker
            switch (wintracker){
                case 1:     System.out.println("You have 1 point");
                            break;
                case 2:     System.out.println("You have 2 point");
                            break;
                case 3:     System.out.println("You have 3 points");
                            keeprolling = false;
                            break; 
                default:    System.out.println("You have no points recorded");
                            break;
            }
            
            switch (losstracker){
                case 1:     System.out.println("Computer has 1 point");
                            break;
                case 2:     System.out.println("Computer has 2 points");
                            break;
                case 3:     System.out.println("Computer has 3 points");
                            keeprolling = false;
                            break; 
                default:    System.out.println("Computer has no points recorded");
                            break;
            }
            
            switch (tietracker){
                default: System.out.println("Number of ties: " + tietracker );
                         break;
            }
            
            if(keeprolling == false && wintracker > losstracker){
                System.out.println("\nYou have won!!!");
            }
            if(keeprolling == false && wintracker < losstracker){
                System.out.println("\nYou have lost!!!");
            }
     
            System.out.println("Press Any Key to Continue");
            new java.util.Scanner(System.in).nextLine();
        
       
        }
    }
}
    
    
    
