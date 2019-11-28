import java.io.IOException;
import java.util.Scanner;
public class Roombooking {
	public static int id=0;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	public void book(String ac,String cot,String cable,String wifi,String laundry)
	{
		
		int cost=0;
		String c;
		this.ac=ac;
		this.cot=cot;
		this.cable=cable;
		this.wifi=wifi;
		this.laundry=laundry;
		System.out.println("Booking:");
		do
		{
		cost=0;
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		Scanner sc=new Scanner(System.in);
		ac=sc.nextLine();
		if(ac.equals("AC"))
		{
		cost=cost+1000;
		}
		else
		{
		cost=cost+750;
		}
		System.out.println("Cot(Single/Double)");
		cot=sc.nextLine();
		if(cot.equals("Single"))
		{
		cost=cost+0;
		}
		else
		{
		cost=cost+350;
		}
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=sc.nextLine();
		if(cable.equals("C"))
		{
		cost=cost+50;
		cable="cable";
		}
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=sc.nextLine();
		if(wifi.equals("W"))
		{
		cost=cost+200;
		wifi="wifi";
		}
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=sc.nextLine();
		if(laundry.equals("L"))
		{
		cost=cost+100;
		laundry="laundry";
		}
		System.out.println("\nThe total charge is Rs." +cost);
		System.out.println("The services chosen are");
		System.out.println(cot+" cot "+ac+ " room");
		System.out.println(cable+" enabled");
		System.out.println(wifi+" enabled");
		System.out.println("with " + laundry+ " service");
		System.out.println("Do you want to proceed?(yes/no)");
		c=sc.nextLine();
		}
		while(c.equals("no"));
		System.out.println("Thank you for booking. Your room number is "+ ++id); 
		
		}
	public static void main(String args[]) 
	{
	Roombooking b=new Roombooking();
	String ac="null";
	String cot="null";
	String cable="null";
	String wifi="null";
	String laundry="null";
	b.book(ac,cot,cable,wifi,laundry);
	}
	
		
	}
	


