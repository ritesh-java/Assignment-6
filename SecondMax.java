package packageone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondMax{

	public int[] sort(int arr[]){
		int len = arr.length;
		
		for(int i =len-1;i>=0;i--){
			for(int j=1;j<=i;j++){
				if(arr[j]>arr[j-1]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String args[]) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Enter the integeral values you would like to sort");
	   String str = br.readLine();
       String[] strarr = str.split(" ");
       int[] intval = new int[strarr.length];
       
       for(int i=0;i<strarr.length;i++){
    	   intval[i] = Integer.parseInt(strarr[i]);
       }
       
       SecondMax to = new SecondMax();
       int[] sortarr = to.sort(intval);
	  System.out.println("Second highest value is "+sortarr[1]);
   }
}

