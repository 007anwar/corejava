package hospital;

import bill.Bill;
import manage.Mangement;

public class Test {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.createBill();
        Mangement mangement = new Mangement();
        mangement.manage();
    }
    public void test()
    {
        System.out.println("Testing transitive dependency");
    }
}
