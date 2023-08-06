  /**
 * Car.java 
 *
 *
 * <This class initializes the car objects with its 
 *properties.This class has fields which are objects. This class calls the respective equals methods for each of these specific objects. >
 */

public class Car{
	
	
private String	vin;
private String make;
private String model;
private int  year;
	
	
	/**
     * Car constructor
     * @param vin -the cars vin
     * @param make- the cars make
     * @param model - thee car's model
	 *@param year- the car's year
     */
	public Car(String vin, String make, String model, int year){
		this.vin=vin;
		this.make=make;
		this.model=model;
		this.year=year;
			
	}
	
	/**
     * Dummy Constructor
     */
	public Car(){

		vin="";
		make="";
		model="";
		year=0;
	 }
	 
	
	 
	 /**
	 * two cars are equal if they have the same VIN#
     * @param the car being compared to 
	 *@return true if the cars ar equal, otherwise false
     */
	 public boolean equals(Car car){
		 
		 if(vin.equals(car.vin)){
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
		return "	VIN #: "+ vin+ "\n"+"	"+ year+" "+ make+" "+ model+"\n";
	}
	
	
}
	