//Search a value in an array program
package co.skr;

import java.util.Scanner;

class SearchValueInAnArray{
    public boolean searchValue(int[] arr, int valueToBeSearched){
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] == valueToBeSearched)
    		{
    			return true;
    		}
    	}
    	return false;
    }
}

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		System.out.print("Value to be searched is ");
		int searchValue = sc.nextInt();
		SearchValueInAnArray value = new SearchValueInAnArray();
		System.out.println("Is "+searchValue+" present in the array? "+value.searchValue(arr, searchValue));
		sc.close();
	}

}
