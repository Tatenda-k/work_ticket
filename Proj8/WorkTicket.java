
  /**
 * WorkTicket.java 
 *
 *
 * <This class initializes the ticket objects with its
 *properties.This class has fields which are objects. This class calls the respective equals methods for each of these specific objects. >
 */
public class WorkTicket {

    private String ticketNum="o";
    private Customer customer;
    private Car car;
    private ServiceQuote quote;
	
	
	//first 2 letters and first2 digits of custid, + quote num
	
	private String add;
	private String one;
	
	/** 
	 * Creates the ticketNum from the customer id and the quotenum
	 */   
	public void creatid(){
		add=quote.getQuoteNum();
		
		 add=add.substring(2,6);
		 one=customer.getID();
		 one=(one.substring(0,2)).toLowerCase()+(one.substring(4,6));
		 

		 
		ticketNum=one+add;
		
	}
	/** 
* returns the ticket number
*@return ticketNum- the ticket number
*/
	public String getTicket(){
		return ticketNum;
	}

    /**
     * Dummy Constructor
     */
    public WorkTicket(){
        this(null,null,null);
    }

// d the first two digits of the custID and the 
// 4-digits of the quoteNum. (Ex: sm089950)
    /**
     * constructs a work ticket using the objects passed in 
     * @param customer-the customer
     * @param car-the car
     * @param quote-the quote
     */
    public WorkTicket(Customer customer, Car car, ServiceQuote quote){
		this.customer=customer;
		this.car=car;	
		this.quote=quote;
		
    }

    /**
     * Two worktickets are equal if they have the same ticketNum
     * OR Customer ID OR Car VIN OR Service Quote Number.
	 * Calls the equals method in each of these classes
     * @param ticket ticket being compared to.
     * @return true if the two tickets are the same or false if they are different
     */
    public boolean equals(WorkTicket ticket){
		
		if((ticket.customer.equals(customer)==true)||(ticket.car.equals(car)==true)||(ticket.quote.equals(quote)==true)||(ticket.ticketNum.equals(ticketNum))){
			return true;
		}
		else{
		return false;
		}
			

    }

	/** 
	 * Converts required attributes to a Formatted String
	 * 
	 * @param no parameters are passed in 
	 * @return a Formatted String using for display 
	 */     
    public String tocString(){
		
		return "Ticket number:"+ ticketNum+customer.tocString()+"\n"+ car.tocString()+ "\n"+ quote.tocString();
		
		

    }
}
 