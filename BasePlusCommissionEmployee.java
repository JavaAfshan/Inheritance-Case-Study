
public class BasePlusCommissionEmployee {


	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales; // gross weekly sales
	private double comissionRate; // commission percentage
	private double baseSalary;
	
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
	  
	  public void setBaseSalary(double base)
	  {
		  if(base>=0.0)
			  baseSalary=base;
		  else
			  throw new IllegalArgumentException("Base Salary never be less or equal to 0.0");
	  }
	  
	// five-argument constructor
	 public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double base )
	{
	 // implicit call to Object constructor occurs here
	 firstName = first;
	 lastName = last;
	 socialSecurityNumber = ssn;
	 setGrossSales( sales ); // validate and store gross sales
	 setCommissionRate( rate ); // validate and store commission rate
	 setBaseSalary(base);
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
	 
	 public double getBaseSalary()
	 {
		 return baseSalary;
	 }
	 public double earnings()
	 {
		 return getBaseSalary()+(getGrossSale()*getComissionRate());
	 }
	 
	 public String toString()
	 {
		 return String.format("\nCommission Employee: "+getFirstName()+"   "+getLastName()+"\nSocial Security Number: "+getSocialSecurityNumber()+"\nGross Rate"+getGrossSale()+"\nCommission Rate: "+getComissionRate()+"\nBase Salary: "+getBaseSalary() );
	 }
	 
	 
	 
	


}
