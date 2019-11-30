package Calc;
import java.util.Scanner;
import java.lang.NullPointerException;
public class customerreg {
	public static void main(String args[])throws NullPointerException  {

		Scanner ob=new Scanner(System.in);
		int r;
		String op1,op2;
		int id=1,i=0;
		customerreg1 c[]=new customerreg1[20];
		do {
			System.out.print("1.Registration\n2.View\n3.Exit\n");
			r=ob.nextInt();
			switch(r)
			{
			case 1:
				do
				{
			System.out.println("Enter your name:");
			String n=ob.next();
			System.out.println("Enter your address:");
			String a=ob.next();
			System.out.println("Contact Number:");
			String p=ob.next();
			System.out.println("Email ID:");
			String e=ob.next();
			System.out.println("Enter proof type:");
			String pt=ob.next();
			System.out.println("Enter proof id:");
			String pi=ob.next();
			c[i]=new customerreg1();
			c[i].register(id,n,a,p,e,pt,pi);
			System.out.println("Thank you for registering.Your id is :"+id);
			
			id++;
			i++;
			System.out.println("Do you want to countinue registration (yes/no)");
			op1=ob.next();
			}while(op1.equals("yes"));
			break;
			case 2:
				System.out.println("Customers list \n");
				System.out.println("The registerd customers are \n");
				System.out.println("Customer Id\tCustomer Name\n");
				for(int j=0;j<i;j++)
				{
				c[j].viewid();
				}
				break;
			case 3:
				System.exit(0);
			}
			System.out.println("Do you want to countinue (yes/no)");
			op2=ob.next();
			}
		
			while(op2.equals("yes"));
			}
		
	


}
