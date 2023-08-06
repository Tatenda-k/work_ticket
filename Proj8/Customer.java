/**
 * Customer.java
 *
 *
 * <This class initializes customer objects with its
 *properties.This class has me>
*/

import java.util.*;

public class Customer {
	
	Random r=new Random();

private String  name;
private String address;
private String city;
private String state;
private String  zip;
private String  phone;
		

    /**
     * Dummy Constructor
     */
	public Customer(){
		name="";
		address="";
		city="";
		state="";
		zip="";
		phone="";
	
	}
	
	
//**STUDENTS COMPLETE THIS CONSTRUCTOR	
    /**
     * Contructs a customer object
     * @param name - the customer's name
     * @param address : the customer's address
     * @param city -the customer's city
     * @param state - the customer's state
     * @param zip - the customer's zip
     * @param phone- the customer's  phone
     */
	 public Customer(String name, String address, String city, String state, String zip, String phone){
							this.name=name;
							this.address=address;
							this.city=city;
							this.state=state;
							this.zip=zip;
							this.phone=phone;
    }
	
	
	private	String id="";
	private String custId;
	
	
	

	/** 
* creates a customer's ID using randomly generated numbers
*/	
	public  void setID(){
		for (int i=0;i<4;i++){
		int rand= r.nextInt(9);
		
		id+=String.valueOf(rand);
		}
	
		String splits[]=name.split(" ");
		name=splits[1];
		String sub1=(name.substring(0,4)).toLowerCase();
		custId=sub1+id;	
        	
	}
		/** 
* returns the custID
*/	
		public String getID(){
			return custId;
		}
		
		
		
		
		

//**STUDENTS COMPLETE THE TWO METHODS BELOW	
    /**
     * Two customers are equal if they have the same custID.
     * @param customer- the other customer
     * @return TRUE if the ids are the same else FALSE
     */
	public boolean equals(Customer customer){
		
		if(customer.custId.equals(custId)){
			
		return true;
		
		}
		else{
			
			return false;
		}
	}

	
	/** 
	 * Converts required attributes to a Formatted String
	 * 
	 * @return a Formatted String using for display 
	 */    
    public String tocString(){
		return  "\n"+"	Customer ID: "+custId+"\n	" + name+"\n"+"	" +address+ "\n"+"	"+state+","+city+","+zip+"\n"+"	"+phone+"\n";

    }

}
