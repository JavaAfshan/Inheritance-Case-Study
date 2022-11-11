import javax.swing.JOptionPane;
public class DemoClass {

	public static void main(String args[])
	{
		
		
		
		ComissionEmployee employee=new ComissionEmployee("Afshan","Yasmeen", "4228", 1000000,0.09);
		
		JOptionPane.showMessageDialog(null,"Demo of Commission Employee");
		//get Comissioned Employee data
		JOptionPane.showMessageDialog(null, "The first name of Employee is:  "+employee.getFirstName()+"\nThe last name of the employee is: "+employee.getLastName()+"\nThe Social Security Number is : "+employee.getSocialSecurityNumber()+"\nThe Commission Rate of this employee is: "+employee.getComissionRate()+"\nThe Gross Sale is : "+employee.getGrossSale()+"\nThe earning is  : "+employee.earnings());
		
		
		//Update the employee
		employee.setFirstName("Muhammad");
		employee.setLastName(" Arslan");
		employee.setSocialSecurityNumber("38104");
		employee.setCommissionRate(0.08);
		employee.setGrossSales(900000);
		
		
		JOptionPane.showMessageDialog(null,"Update information of the new employee is : \n "+ employee);
		
		
		
		
		
	BasePlusCommissionEmployee employee1=new BasePlusCommissionEmployee("Muhammad","Ijaz", "2345", 1000000,0.09,300);
		
	JOptionPane.showMessageDialog(null,"Demo of Base Plus Commission Employee");
		//get Comissioned Employee data
		JOptionPane.showMessageDialog(null, "The first name of Employee is:  "+employee1.getFirstName()+"\nThe last name of the employee is: "+employee1.getLastName()+"\nThe Social Security Number is : "+employee1.getSocialSecurityNumber()+"\nThe Commission Rate of this employee is: "+employee1.getComissionRate()+"\nThe Gross Sale is : "+employee1.getGrossSale()+"\nThe base salary is : "+employee1.getBaseSalary()+"\nThe earning is  : "+employee1.earnings());
		
		
		//Update the employee
		employee1.setFirstName("Nasreen");
		employee1.setLastName(" Ijaz");
		employee1.setSocialSecurityNumber("12567");
		employee1.setCommissionRate(0.07);
		employee1.setGrossSales(800000);
		employee1.setBaseSalary(400);
		
		
		JOptionPane.showMessageDialog(null,"Update information of the new employee is : \n "+ employee1);
		
		
		
		BasePlusCommissionEmployeeInheritance employee2=new BasePlusCommissionEmployeeInheritance("Muhammad","Ijaz", "2345", 1000000,0.09,300);
		
		JOptionPane.showMessageDialog(null,"Demo of Base Plus Commission Employee that is extends the Commission Employee");
			//get Comissioned Employee data
			JOptionPane.showMessageDialog(null, "The first name of Employee is:  "+employee2.getFirstName()+"\nThe last name of the employee is: "+employee2.getLastName()+"\nThe Social Security Number is : "+employee2.getSocialSecurityNumber()+"\nThe Commission Rate of this employee is: "+employee2.getComissionRate()+"\nThe Gross Sale is : "+employee2.getGrossSale()+"\nThe base salary is : "+employee2.getBaseSalary()+"\nThe earning is  : "+employee2.earnings());
			
			
			//Update the employee
			employee2.setFirstName("Maryam");
			employee2.setLastName(" Ahmed");
			employee2.setSocialSecurityNumber("12567");
			employee2.setCommissionRate(0.07);
			employee2.setGrossSales(800000);
			employee2.setBaseSalary(400);
			
			
			JOptionPane.showMessageDialog(null,"Update information of the new employee is : \n "+ employee2);
			
		
			
			
			
		
	}
}
