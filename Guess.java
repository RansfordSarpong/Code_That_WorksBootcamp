
import java.util.Random;
import java.util.Scanner;
public class Guess{
	public static void main(String [] args) {
		//Guess game
		Random random = new Random();
		Scanner input=new Scanner(System.in);
		
		int i =1;
		int attempts=0;
		int win =0;
		int Loose =0;
		while(i<=10) {
		System.out.println("Enter the guess number for attempt: "+i);
		int numRandom = random.nextInt(5)+1;
		int guess = input.nextInt();

			if(guess!=numRandom) {
			System.out.println(numRandom);
			System.out.println("loose");
			Loose++;
		}
			else {
			System.out.println("win");
			win ++;
			System.out.println("Random Number(Hint)= "+numRandom);
		}
		i++;
		attempts++;
	}
		System.out.println("total win:"+win);
		System.out.println("total losse:"+Loose);
		System.out.println("total attempts :"+attempts);
		}
	}

