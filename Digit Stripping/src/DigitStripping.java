import java.util.Scanner;
public class DigitStripping
	{
		static int [] userArray = new int[6];
		static Scanner userInput = new Scanner(System.in);
		static int lastDigit = 0;
		public static void main(String[] args)
			{
				//stripDigits();
				reportNumberOfDigits();
			}
		public static void stripDigits()
			{
				System.out.println("Please enter a six digit number");
				int userNumber = userInput.nextInt();
				for(int i = 0; i < 6; i++)
					{
						lastDigit = userNumber%10;
						userArray[i] = lastDigit;
						userNumber = userNumber/10;
						System.out.println(userArray[i]);
					}
			}
		public static void reportNumberOfDigits()
			{
				System.out.println("Enter a number");
				int userNumber = userInput.nextInt();
				int counter = 0;
				boolean run = true;
				int oddNumbers = 0;
				int sum = 0;
				do 
					{
						if (userNumber > 0)
							{
								lastDigit = userNumber % 10;
								if (lastDigit %2 == 1)
									{
										oddNumbers = oddNumbers + 1;
									}
								sum = sum + lastDigit;
								userNumber = userNumber /10;
								counter++;
							}
						else 
							{
								run = false;
							}
						
					} while (run == true);
				if (counter == 1)
					{
						System.out.println("There is one digit");
					}
				else 
					{
						System.out.println("There are " + counter + " digits");
					}
				if (oddNumbers == 1)
					{
						System.out.println("There is one odd number");
					}
				else 
					{
						System.out.println("There are " + oddNumbers + " odd digits");
					}
				System.out.println("The sum of the digits is " + sum);
				System.out.println("The rounded sum of the digits is " + roundedSum);
			}
	}
