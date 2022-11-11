
public class BasePlusCommissionEmployeeInheritance extends ComissionEmployee{

	private double baseSalary;
	public BasePlusCommissionEmployeeInheritance( String first, String last, String ssn, double sales, double rate,double base)
	{
		super(first,last,ssn,sales,rate);
		setBaseSalary(base);
	}
	
	 public double earnings1()
	 {
		 return getBaseSalary()+super.earnings();
	 }
	 public double getBaseSalary()
	 {
		 return baseSalary;
	 }
	 public void setBaseSalary(double base)
	  {
		  if(base>=0.0)
			  baseSalary=base;
		  else
			  throw new IllegalArgumentException("Base Salary never be less or equal to 0.0");
	  }
	 
	 public String toString()
	 {
		 return String.format(super.toString()+"\nBase Salary: "+getBaseSalary() );
	 }
	
}
