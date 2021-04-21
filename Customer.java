
class MobilePhone {

	private String brand;

	public MobilePhone(String brand) {
		this.brand = brand;
	}

	public int identifyBasicCost() {

		if (this.brand.equals("Nokia"))

			return 5000;

		else if (this.brand.equals("Samsung"))

			return 15000;

		else {
			return 0;
		}
	}
}

class SmartPhone extends MobilePhone {

	private String displayType;

	public SmartPhone(String brand, String displayType) {

		super(brand);

		this.displayType = displayType;
	}

	public int identifyBasicCost() {
		int basicCost = super.identifyBasicCost();

		if (this.displayType.equals("LED")) {
			basicCost += 20000;

		}

		else if (this.displayType.equals("AMOLED")) {
			basicCost += 25000;

		}
		return basicCost;
	}
}

	public class Customer {

		private int counter = 100;

		private int customerId;

		public Customer() {
			this.customerId = 0;
		}

		public int getCustomerId() {

			return this.customerId;
		}

		public int purchasePhone (MobilePhone phone) {

					this.counter +=1;
					
					this.customerId=this.counter;
					
					return phone.identifyBasicCost ();
	}

		public static void main(String[] args) {

					MobilePhone mobObj = new SmartPhone ("Samsung", "LED");

					Customer customer1 = new Customer ();

					int basicCost =customer1.purchasePhone(mobObj);
					
					System.out.println (customer1.getCustomerId()+" "+basicCost);
					
					mobObj= new MobilePhone ("Nokia");

					Customer customer2 = new Customer ();
					
					basicCost= customer2.purchasePhone (mobObj);

					System.out.println (customer2.getCustomerId()+""+basicCost);
	

}
	}
