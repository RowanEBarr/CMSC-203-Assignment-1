import java.util.Scanner;

/*
 * A program that takes in the temperature and wind speed and calculates the wind chill
 * Author: Rowan Barr
 * Date: 1/30/20
 */
public class WindChill
{
	public static void main(String[] args)
	{
		final double CONST_1 = 35.74;
		final double CONST_2 = 0.6215;
		final double CONST_3 = 35.75;
		final double CONST_4 = 0.16;
		final double CONST_5 = 0.4275;
		
		double temp;
		double windSpeed;
		double windChill;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wind Chill Calculator:\n");
		
		System.out.println("Enter the temperature in Fahrenheit (betweeen -45 and 40 degrees): ");
		temp = input.nextDouble();
		
		while (temp < -45 || temp > 40 )
		{
			System.out.println("The temperature must be betweeen -45 and 40 degrees!\n");
			System.out.println("Please enter the temperature: ");
			temp = input.nextDouble();
		}
		
		System.out.println("Enter the wind speed (between 5 and 60): ");
		windSpeed = input.nextDouble();
		
		while (windSpeed < 5 || windSpeed > 60 )
		{
			System.out.println("The wind speed must be between 5 and 60!\n");
			System.out.println("Please enter the wind speed: ");
			windSpeed = input.nextDouble();
		}
		
		windChill = CONST_1 + CONST_2*temp - CONST_3*Math.pow(windSpeed,CONST_4)+CONST_5*temp*Math.pow(windSpeed,CONST_4);
		System.out.println("The wind chill is " + windChill);
		
		System.out.println("\n\nProgrammer: Rowan Barr");
		input.close();
	}
}
