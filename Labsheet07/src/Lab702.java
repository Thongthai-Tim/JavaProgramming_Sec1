import java.util.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] scores = new double[5];
		double sum = 0,average = 0;
		
		for(int i = 0; i < scores.length;i++){
			
			System.out.print("Input score of student "+ (i+1)+" : " );
			
			scores[i] = scan.nextDouble();
			
			sum = sum+scores[i];
		}
		System.out.println();
		
		average = sum/scores.length;
		
		System.out.println("Average of "+scores.length+ " student is "+average);
			for(int i = 0; i < scores.length;i++) 
			{
				if(scores[i]>average) 
				{
					System.out.print("\n> Student "+(i+1)+" ("+scores[i]+")");
				}
			}
	}

}

