package kadai;
import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
	}
	static String translateEng(int n) {
		
		if(n==0) return "zero";
		String num[] ={"billion ","million " ,"thousand "};
		String str = "";
		int i=1000000000;
		int j=0;
		 	
		while(i>=1000){
			if(n/i > 0){
				str += (eng100(n/i)+" "+num[j]);
			}
			n%=i;
			j++;
			i /= 1000;
		}
		if(n!=0)str += eng100(n); //n%=iによって余りが0のときにzeroが追加されるのを防ぐ
		return str;
    }
	public static String eng100(int n) {
		String num1[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String num2[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String num3[] = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		
		
		StringBuilder sb = new StringBuilder();
		
		if((n/100)>0){
			sb.append(num1[n/100]+" hundred ");
			n%=100;
		}
		if((n/10)>0){
			if((n/10)==1)sb.append(num2[n%10]); //10~19
			else if(n%10 != 0) sb.append(num3[n/10-2]+" "+num1[n%10]+" ");
			else sb.append(num3[n/10-2]);
		}
		if(sb.length() == 0) sb.append(num1[n%10]); //nが一桁のとき
		else if(n/10 == 0 && n%10 != 0 ) sb.append(num1[n%10]);
		return new String(sb);
	}
}
