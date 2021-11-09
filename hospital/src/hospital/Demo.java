package hospital;

import bill.Bill;
import manage.Mangement;

public class Demo {
   public void doSomething()
    {
        Bill bill = new Bill();
        bill.createBill();
        Mangement mangement = new Mangement();
        mangement.manage();
    }

}
