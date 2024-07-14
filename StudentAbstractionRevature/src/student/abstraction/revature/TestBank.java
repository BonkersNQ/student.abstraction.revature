package student.abstraction.revature;

public class TestBank {
	public static void main(String[] args) {
		Bank sbi = new SBI();
		Bank pnb = new PNB();
		
		System.out.println("SBI Rate of Interest:  " + sbi.getRateOfInterest() + "%");
		System.out.println("PNB Rate of Interest:  " + pnb.getRateOfInterest() + "%");
		
	}

}
