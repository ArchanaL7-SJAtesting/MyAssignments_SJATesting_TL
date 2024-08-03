package week2.day4;

public class SBI implements RBI {


	public void mandatoryKYC() {
		System.out.println("License is mandatory");
		
	}


	public void withdrawalLimit() {
		System.out.println("1 Lakh");
		
	}

	public static void main(String[] args) {
		//RBI rbi =new RBI();   //cannot create object for Interface
		SBI sbi=new SBI();
		sbi.mandatoryKYC();
		sbi.withdrawalLimit();
	}

}
