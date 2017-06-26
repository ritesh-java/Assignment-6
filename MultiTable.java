package packageone;

import java.util.Scanner;

public class MultiTable{
   
	public void displayTable(int x){
		for(int i =1;i<11;i++)
			System.out.println(x+" X "+i+" = "+(x*i));
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
      
      MultiTable table = new MultiTable();
      table.displayTable(x);
		
	}
}