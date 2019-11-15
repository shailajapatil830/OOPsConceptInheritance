
public class MainCompany {
	public static void main(String[] args) {
		
		Headquarters H = new Headquarters();
		H.getDetails();
		H.showDetails();
		
		Mainbranch1 m1 = new Mainbranch1();
		m1.getDetails();
		m1.printDetails();
		
		Mainbranch2 m2 = new Mainbranch2();
		m2.printDetails();
		m2.printDetails();
		
	}

}
