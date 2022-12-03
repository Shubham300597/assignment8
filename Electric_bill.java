package assignment8;

import java.util.Scanner;

public class Electric_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Unit");
	    int unit=0;
	    double TotalCharges;
	    unit=sc.nextInt();
	    if(unit>0 && unit<=100)
	    {
	    	TotalCharges=unit*1.20;
	    	System.out.println("Your Electricity Bill is:- "+TotalCharges);
	    }
	    else if(unit>100 && unit<=300)
	    {
	    	TotalCharges=unit*2.0;
	    	System.out.println("Your Electricity Bill is:- "+TotalCharges);
	    }
	    else if(unit>300)
	    {
	    	TotalCharges=unit*3.0;
	    	System.out.println("Your Electricity Bill is:- "+TotalCharges);
	    }
	    else
	    {
	    	System.out.println("Invalid Inpu0t");
	    }
	    sc.close();
		}
	}
