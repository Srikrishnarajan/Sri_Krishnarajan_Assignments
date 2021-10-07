//Income Tax Calculation Program
package co.skr;

import java.util.Scanner;

class TaxAmount{
	
    public double calculateTaxAmount(int ctc){
    	double amount;
    	
		if (ctc <= 180000) {
			amount = 0;
			return amount;
		}
		else if(ctc >= 180001 && ctc <= 300000) {
			amount = 0.1 * (ctc);
			return amount;
		}
		else if(ctc >= 300001 && ctc <= 500000) {
			amount = 0.2 * (ctc);
			return amount;
		}
		else if(ctc >= 500001 && ctc <= 1000000) {
			amount = 0.3 * (ctc);
			return amount;
		}
		
	return 0;
    }
    
}

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you CTC: ");
		int CTC = sc.nextInt();
		sc.close();
		TaxAmount obj = new TaxAmount();
		System.out.println("Tax Amount: "+obj.calculateTaxAmount(CTC));
	}

}
