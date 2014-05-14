package kadai;
import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
	}
	static String translateEng(int n) {
		String num[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String num2[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String num3[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		
		if(n >= 10000) throw new IllegalArgumentException("–|–ó‚Å‚«‚é‚Ì‚Í9999‚Ü‚Å‚Å‚·");
		
		StringBuilder sb = new StringBuilder();
		if(n/1000 > 0){
			sb.append(num[n/1000]+" thousand ");
			n%=1000;
		}
		if((n/100)>0){
			sb.append(num[n/100]+" hundred ");
			n%=100;
		}
		if((n/10)>0){
			if((n/10)==1)sb.append(num2[n%10]);
			else if(n%10 != 0) sb.append(num3[n/10-2]+" "+num[n%10]+" ");
			else sb.append(num3[n/10-2]);
		}
		if(sb.length() == 0) sb.append(num[n%10]);
		else if(n/10 == 0 && n%10 != 0 ) sb.append(num[n%10]);
		return new String(sb);
    }
}
