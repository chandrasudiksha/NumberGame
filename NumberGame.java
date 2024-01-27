import java.util.Scanner;
class NumberGame
{
	public static void main(String arg[])
	{
		int score=0,number,i,guess,current_score;
		Scanner sc=new Scanner(System.in);
		String op;
		System.out.println("--------------------------------NUMBER GAME--------------------------------\nNumber will be from 1-100.\nYou can take 5 chances to find the number.\nMaximum score for a correct answer is 50 points. Each wrong guesses has negative 10 points.");
		do
		{
			current_score=50;
			number=1+(int)(Math.random()*100);
			for(i=0;i<5;i++)
			{
				System.out.print("Enter a number:");
				guess=sc.nextInt();
				if(guess>100)
				{
					current_score-=10;
					System.out.println("OOPS!! Enter a number less than 100");
				}
				else if(guess==number)
				{
					System.out.println("Congratulation... You're correct");
					break;
				}
				else if(guess<number)
				{
					current_score-=10;
					System.out.println("OOPS!! Number is greater than "+guess);
				}
				else 
				{
					current_score-=10;
					System.out.println("OOPS!! Number is lesser than "+guess);
				}
			}
			score+=current_score;
			if(i==5)
				System.out.println("Better luck next time..");
			else if(i==4)
				System.out.println("You have guessed in 5th attempt. Try to break within less attempt.");
			else if(i==3)
				System.out.println("You have guessed in 4th attempt. Try to break within less attempt.");
			else if(i==2)
				System.out.println("You have guessed in 3rd attempt. Good!! Try to break less attempt.");
			else if(i==1)
				System.out.println("You have guessed in 2nd attempt. Good!! Try to break in first attempt.");
			else
				System.out.println("You have guessed in 1st attempt. Excellent.");
			System.out.println("Your current score is "+score);
			System.out.print("To continue press Y.. To exit press E.. ");
			op=sc.next();
		}
		while(op.equals("Y")||op.equals("y"));
		System.out.println("Your score is "+score);
		
	}
}
		
		
		
		
		