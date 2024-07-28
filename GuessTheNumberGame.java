package test;
 import java.util.Random;

 import java.util.Scanner;

public class GuessTheNumberGame {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random  random= new Random();
		String playAgain="Yes";
		int totalRounds= 0;
		int totalAttempts=0;
		
		System.out.println(" Welcome to the   Random Number Gussing game.  ");
		
		while (playAgain.equalsIgnoreCase("Yes"))
		{
		int number=random.nextInt(100) + 1;
		int attempts=0;
		int maxAttempts=10;
		totalRounds++;
		System.out.println("Round " + totalRounds+":");
		System.out.println("I have Generated a number beteewn 1 to 100. You have "  +maxAttempts+ " attempts to guess it.");
		
		while (attempts < maxAttempts)
		{
			System.out.println("Enter the Guess:");
			int guess = scanner.nextInt();
			attempts++;
			totalAttempts++;
			
			if(guess < number)
			{
				System.out.println("Too low! Try again");
			}
			else if(guess > number)
			{
				System.out.println("Too high! Try again");
			}
			else
			{
				System.out.println("Congratulations! You have Guessed the number in " +attempts+ " attempts.");
				break;
			}
			
			
		}
		if (attempts == maxAttempts)
		{
			System.out.println("Sorry You have used all" + maxAttempts+ " attempts.");
		}
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();
         }

             System.out.println("Game over! You played " + totalRounds + " rounds with a total of " + totalAttempts + " attempts.");
             System.out.println("Thanks for playing!");
             scanner.close();

	
		}
		
		
		
		

	}


