package packageone;

import java.util.Scanner;

public class MultiTableThreeD{
   
	public void displayTable(int x){
		for(int i =1;i<11;i++)
			for(int j=1;j<11;j++)
			System.out.println(x+" X "+i+" X "+j+" = "+(x*i*j));
	}
	
	public static void main(String args[]){
	  int x=0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number to get it's multiplcation table");
      try{
      x = scan.nextInt();
      }
      catch(Exception e){
    	System.out.println("Only numerical value is accepted!!");
    	System.exit(0);
      }
      
      MultiTableThreeD table = new MultiTableThreeD();
      table.displayTable(x);
		
	}
}