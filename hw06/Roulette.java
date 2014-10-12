//////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//This program runs 1000 repetitions of the 100-spin simulation,compute 
//the number of times the user lose everything (his number never comes up),
//and compute the total winnings (of all simulations added together), and 
//compute the number of times he walked away with a profit in one session
//of 100 spins of the wheel.
//
//first compile the program
//  javac Roulette.java
//run the program
//  java Roulette

public class Roulette{
    public static void main (String[] args){
        
        int repetitions=0; //initialize and declare repetition is zero
        int spins=0; //initialize and declare spins is zero
        int money=0; //initialize and declare money is zero
        int win=0; //initialize and declare win (wins in each session whcih is 100 spins) is zero
        int totalwins=0; //initialize and declare total wins (win in entire 100000 plays) is zero
        int lose=0; //initialize and declare lose is zero
        //initialize and declare session wins (which is the times you walk away with at least 3 
        //wins after each session) is zero
        int sessionWin=0; 
        int neverComesUp=0; //initialize and declare loss (which is the times when none of your bet matches) is zero
        
        
        //set up the loop, the condition is that when the number of repetition is less than 1000
        while (repetitions<1000){
            repetitions++; //when satisfy the condition, increase repetition by 1
            int userBet=(int)(Math.random()*38); //initialize and declare user bet as a random int from o to 37
            //set up the loop, the condition is that when the number of spins is less than 100
            while (spins<100){
                int roulette=(int)(Math.random()*38); //initialize and declare roulette as a random int from o to 37
                //set up the condition when user bet equals roulette number
                if(userBet==roulette){
                    //if satisfies
                    win++; //increase win by 1
                    money=money+36; //increase money by 36
                    totalwins++; //increase total wins by 1
                }
                //if not satisfy
                else{
                    lose++; //increase lose by 1
                }
                spins++; //increase spin by 1
            }
            spins=0; //declare spin number back to zero in order to go again for another session
                
            //set up the condition when you win at least three times in one session
            if (money>=108){
                sessionWin++; //increase session win by 1
            }
            //if you did not win at all in one session
            else if (money==0){
                neverComesUp++; //increase never comes up by 1
            }
            win=0; //declare number of win to zero in order to go again
            money=0; //declare number of money to zero in order to go again
            
        }
        
        //print out the result
        System.out.println("The number of times you lose everything- "+neverComesUp);
        System.out.println("The totalwins- "+totalwins);
        System.out.println("The number of times you walked away with profit in one session- "+sessionWin);
        
        
        
    }
}