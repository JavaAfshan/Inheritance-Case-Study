
public class ComissionEmployee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales; // gross weekly sales
	private double comissionRate; // commission percentage
	
	
	// set gross sales amount
	 public void setGrossSales( double sales )
	{
	if ( sales >= 0.0 )
	grossSales = sales;
	else throw new IllegalArgumentException(
	"Gross sales must be >= 0.0" );
	 } // end method setGrossSales
	 
	
	// set commission rate
	  public void setCommissionRate( double rate )
	  {
	 if ( rate > 0.0 && rate < 1.0 )
	 comissionRate = rate;
	 else throw new IllegalArgumentException(
	 "Commission rate must be > 0.0 and < 1.0" );
	 } // end method setCommissionRate
	  
	  
	// five-argument constructor
	 public ComissionEmployee( String first, String last, String ssn, double sales, double rate )
	{
	 // implicit call to Object constructor occurs here
	 firstName = first;
	 lastName = last;
	 socialSecurityNumber = ssn;
	 setGrossSales( sales ); // validate and store gross sales
	 setCommissionRate( rate ); // validate and store commission rate
	} // end five-argument CommissionEmployee constructor
	 
	 public void setFirstName(String name)
	 {
		 firstName=name;
	 }
	 
	 public void setLastName(String last)
	 {
		 lastName=last;
	 }
	 
	 public void setSocialSecurityNumber(String ssn)
	 {
		 socialSecurityNumber=ssn;
	 }
	 
	 public String getFirstName()
	 {
		 return firstName;
	 }
	 
	 public String getLastName()
	 {
		 return lastName;
	 }
	 
	 public String getSocialSecurityNumber()
	 {
		 return socialSecurityNumber;
	 }
	 
	 public double getGrossSale()
	 {
		return grossSales;
	 }
	 
	 public double getComissionRate()
	 {
		 return comissionRate;
	 }
	 
	 public double earnings()
	 {
		 return getGrossSale()*getComissionRate();
	 }
	 
	 public String toString()
	 {
		 return String.format("\nCommission Employee: "+getFirstName()+"   "+getLastName()+"\nSocial Security Number: "+getSocialSecurityNumber()+"\nGross Rate"+getGrossSale()+"\nCommission Rate: "+getComissionRate() );
	 }
	 
	 
	 
	
}
