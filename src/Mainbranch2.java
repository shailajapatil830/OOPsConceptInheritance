
public class Mainbranch2 extends Headquarters{
	
	public void getDetails() {
		System.out.println("Enter the city where Mainbranch2 is situated");
		cityName = input.nextLine();
		 System.out.println("Enter the totalNumber of employee in Mainbranch2");
		 totalemployee = input.nextInt();
	}
    public void printDetails() {
    	
	  System.out.println("Company Mainbranch2 is situated in : " + cityName + " and has " + totalemployee + " employee");
	    	
    }
}
