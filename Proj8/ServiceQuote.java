/**
 * ServiceQuote.java
 *
 *
 * <This class initializes the ServiceQuote  objects with its
 *properties.This class has methods that calculate the taxes and total charges. >
 */
import java.text.DecimalFormat;  
import java.util.*;
public class ServiceQuote{
	
	private String quoteNum;
	private double partsCharges;
	private double  laborCharges;
	private double tax;
	private final double RATE =0.0755;
	private String num="";
	private String c="";
	private String  taxes;
	  
        String patt="$#,###.00";    
        DecimalFormat df=new DecimalFormat(patt);   
    

	
	Random r= new Random();
	
	/**
 * returns the quotenum
*@return quotenum
 */	
	public String getQuoteNum(){
			return quoteNum;
		}
		
	/** 
* creates a customer's quoteNum using randomly generated numbers and letters 
*/
		public  void setquoteNum(){
		for (int i=0;i<4;i++){
		int rand= r.nextInt(9);
		num+=String.valueOf(rand);
		}
		for (int i=0;i<2;i++){
		c+= (char)('A' + r.nextInt(26));
		}
		quoteNum=c+num;	
		}
	
	/**
     * Car constructor
     * @param parts- the charge for the car parts
     * @param laboro- the charge for the labor
     */
	public ServiceQuote(double parts, double labor){
		partsCharges=parts;
		laborCharges=labor;		
	}
	/**
     * dummy constructor
     */
	public ServiceQuote(){
		partsCharges=0;
		laborCharges=0;
	}

/**
     * returns a string 
	 *param@ double-the labor cost
	 @return String-  a statement that there are no sales taxes
     */

private String getSalesTax(String labor){
	if(labor.equals("0")){
		return "No charges";
	}
	else{
	return "$0 (Labor only - no sales tax)";
	}
}
/**
     * calculates the tax
	 *@return String -the tax to be charged
     */
private String  getSalesTax(){
	tax=(RATE*(partsCharges+laborCharges));
	return String.valueOf(tax);	
}


 /**
	 * two quotes are equal if they have the same quoteNum
     * @param service being compared to  
	 *@return true if the quotes are equal, otherwise false
     */
public boolean equals(ServiceQuote service){
	if(quoteNum.equals(service.quoteNum)){
	return true;}
	else{
				
return false;}}

 /**
	 * calls the getSalesTax method
     */
public void getTax(){
	   if(partsCharges==0){
		   
		taxes=getSalesTax(String.valueOf(laborCharges));
		}
		else{
		taxes=df.format(Double.parseDouble(getSalesTax()));
		}
}

 /**
	 * calculates the total cost of service
	 *@return double- the total cost
     */
private double  getTotalCharges(){
	return partsCharges+laborCharges+tax;
}

/** 
	 * Converts required attributes to a Formatted String
	 * 
	 * @param no parameters are passed in 
	 * @return a Formatted String using for display 
	 */ 
	public String tocString(){
		return "	Quote Number: "+ quoteNum+ "\n	Parts: " +df.format(partsCharges)+ "\n	Labor: " +df.format(laborCharges)+"\n	Sales Tax: "+ taxes+"\n	Total Estimated Charges: "+df.format(getTotalCharges());
	
}
	

}