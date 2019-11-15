import java.util.Scanner;

public class Headquarters {
	
	int totalemployee;
	String cityName;
	Scanner input = new Scanner(System.in);
	void getDetails() {
		
		System.out.println("Entet a city where Headquarters is situaited : ");
		cityName = input.nextLine();
		
		System.out.println("Enter a total number of employee in Headquarters : ");
		totalemployee = input.nextInt();
	}
	void showDetails() {
		System.out.println("Headquarters situated in : " + cityName + "and has " + totalemployee + "Emploees" );
	}

}
