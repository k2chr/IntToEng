package kadai;
import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
	}
	static String translateEng(int n) {
		String num[] = {"one","two","threr","four","five","six","seven","eight","nine"};
		String num2[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String num3[] = {"twnty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		
        return "";
    }
}
