import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
				//your code goes here
		int l = arr.length;
		//l-1 because Java starts counting at 0 
		for(int i = l-1; i>=0; i--){
			System.out.print(arr[i]);
		}
	}

}
