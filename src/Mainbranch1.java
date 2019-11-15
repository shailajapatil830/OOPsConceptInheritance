
public class Mainbranch1 extends Headquarters {
	
	void getDetails() {
		
		System.out.println("Enter the city where Mainbranch1 is situated");
		cityName = input.nextLine();
		 System.out.println("Enter the totalNumber of employee in Mainbranch1");
		 totalemployee = input.nextInt();
	}		
	    public void printDetails() {
	 System.out.println("Company Mainbranch1 is situated in : " + cityName + " and has " + totalemployee + "Employee");
	    	
	    }

}
