import java.util.Scanner;

public class IT24102890Lab7Q1B {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		int count,total;
		double average;

		for(count=1;count<=3;count++)
		{
			System.out.println("Student"+count);

			System.out.print("Enter marks:");

			int mark1=input.nextInt();
			int mark2=input.nextInt();
			int mark3=input.nextInt();
			int mark4=input.nextInt();

			total=mark1+mark2+mark3+mark4;
			average=total/4.0;

			
			System.out.println("Average is:" +average );

			if(average>=75 && average<=100)
			{
				System.out.println("Overall grade is:Distinction"  );
			}

			else if(average>=50 && average<=75)
			{
				System.out.println("Overall grade is:Credit"  );
			}

			else
			{
				System.out.println("Overall grade is:Fail"  );

			}

			System.out.println(" ");
		}
	}
}
