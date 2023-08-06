/**"
* <Proj8>
* <Tatenda sekabanja > 
* <This is a project that collects information about a workticket using the customer information, car information and the service fees information, it then prints out 
* the work ticket infomration. It also aks the user to search for a ticket using the ticket number.
*/
import java.util.*;
public class Proj8{
		/** 
* searches the ticket numbers of each ticket in the WorkTicket array and returns the position when the same ticket number is found.
* if no same ticket number is found, returns -1 
* @param ans - a string representing the ticket number we are searching for
* @param ticket - the array of WorkTicket objects
*@param x- the number of tickets currently in the WorkTicket array
* @return int - return the position of the matching ticket in the array of WorkTickets, otherwise return -1 if not found
*/
		public static int search(String ans, WorkTicket ticket [],int x){
				for(int i=0;i<x;i++){
					if(ans.equals(ticket[i].getTicket())){
						System.out.print("found");
						return i;
					}
				}
				return -1;
			}
			
/** 
* main: starting point of the program
* @param args- array entered from the command line
*/


public static void main(String args[]){
	
	WorkTicket [] tickets = new WorkTicket[50];
	String ans="yes";
	Scanner s= new Scanner(System.in);
	Customer [] customer= new Customer[50];
	Car[] car=new Car[50];
	ServiceQuote[] quote=new ServiceQuote[50];
	int x=0;
	
	
	
	
	while ((ans.equalsIgnoreCase("y")||ans.equalsIgnoreCase("yes"))&&(x<50)){
		
		
		System.out.print("Enter in customer name: ");
			String name=s.nextLine();
		System.out.print("Enter in customer address: ");
			String address=s.nextLine();
		System.out.print("Enter in customer city: ");
			String city=s.nextLine();
		System.out.print("Enter in customer state: ");
			String state=s.nextLine();
		System.out.print("Enter in customer zip: ");
			String zip=s.nextLine();
		System.out.print("Enter in customer phone: ");
		String phone=s.nextLine();
		
		
		customer[x]=new Customer( name, address, state,city, zip, phone);
		customer[x].setID();
		

		System.out.println();
		
		System.out.print("Enter in car VIN: ");
		String vin=s.nextLine();
		System.out.print("Enter in car make: ");
		String make=s.nextLine();
		System.out.print("Enter in car model: ");
		String model=s.nextLine();
		System.out.print("Enter in car year: ");			
		int year=Integer.parseInt(s.nextLine());
		
	   car[x] =new Car( vin,  make,  model, year);	
	  

		System.out.println();
		System.out.print("Enter in part charges: ");
		double parts=Double.parseDouble(s.nextLine());
		System.out.print("Enter in labor charges: ");
		double labor=Double.parseDouble(s.nextLine());
		System.out.println();

		
		quote[x]=new ServiceQuote(parts,labor);
		quote[x].setquoteNum();
				
		
		WorkTicket ticket=new WorkTicket(customer[x], car[x],quote[x]);
		ticket.creatid();
		
		
		boolean check=false;
		if(x>0){
		for(int i=0;i<x;i++){
			if(ticket.equals(tickets[i])){
		System.out.println("Work Ticket already exists");
		}
		}
		if(!check){
			tickets[x]=ticket;
			x+=1;
		}
		
		}
		else{
		tickets[x]=	ticket;
				x+=1;
				
		}
		System.out.println();	
		System.out.print("Create another work ticket? Y)es or N)o: ");
		ans= s.nextLine();
	}
	
	for(int p=0;p<x;p++){
		
				quote[p].getTax();

		System.out.println(tickets[p].tocString());
		System.out.println();
	}
		
		
			System.out.println("Search for work Tickets by enterning a work ticket number");
			System.out.println("Or enter \"exit\" to exit the program");


String ans1;
		do{
			System.out.print("Input ticket number (or \" exit\"):");
			 ans1=s.nextLine();
			 if(ans1.equals("exit")){
			 break;}
			int position=search(ans1, tickets,x);
			if(ans1.length()==0){
				System.out.println("Nothing entered");
			}
	
			else if(position==-1){
				System.out.println("Ticket not found");
			}
			else{
				System.out.println(tickets[position].tocString());
			}
		}
		
		while(!ans1.equalsIgnoreCase("exit"));
			
		



		
	}
}