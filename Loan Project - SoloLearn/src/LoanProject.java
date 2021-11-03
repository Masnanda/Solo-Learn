import java.util.Scanner;
public class LoanProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		
		for(int i=0 ; i<3 ; i++){
            int payment= ((amount*10)/100);
            int remaining = amount - payment ;

            //System.out.println(payment);
            
            amount = remaining ;
		}
            System.out.println(amount);
	}

}
