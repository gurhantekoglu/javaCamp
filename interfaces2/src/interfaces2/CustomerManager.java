package interfaces2;

public class CustomerManager {

	private CustomerDal customerDal;

	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// i� kodlar�
		customerDal.add();
	}
}
