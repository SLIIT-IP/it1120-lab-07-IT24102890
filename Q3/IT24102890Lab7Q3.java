import java.util.Scanner;

public class IT24102890Lab7Q3 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		final double DISCOUNT_RATE=0.05;

		for(int customer=1;customer<=5;customer++)
		{
			System.out.println("customer"+customer);

			System.out.print("Enter total bill amount:");

			double totalBill=input.nextDouble();

			System.out.print("Enter mode of payment(C for cash ,0 for other);");
			char paymentMode=input.next().charAt(0);

			double amountToPay=totalBill;

			if(paymentMode=='C'||paymentMode=='c') 	
			{
				double discount=totalBill*DISCOUNT_RATE;

				amountToPay=totalBill-discount;

				System.out.println("Discount is :"+discount);
			}

			else if(paymentMode=='O'||paymentMode=='o')
			}
				System.out.println("No discount applicable.");
			}
	
			else
			{
				System.out.println("Payment mode is not valid");
				continue;
			}

			System.out.println("Amount to be paid:"+amountToPay);

			System.out.println();
		}
	}
}

