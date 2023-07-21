package crediApp;

public class CustomerManager {

    private Customer _customer;
    public CustomerManager(Customer customer) {  //beni çalıştırabilmek için bana bir tane müşteri ver
        _customer=customer;
    }

    public void save() {
        //parametredeki küçük customera erişemediğimiz için  parametremiz olan customerı _customer'a atarız
        System.out.println("Müşteri veritabanına kaydedildi: " + _customer.getFirstName());
    }

    public void delete() {
        System.out.println("Müşteri silindi: " + _customer.getFirstName());
    }
}
