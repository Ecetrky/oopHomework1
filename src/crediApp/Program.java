package crediApp;

public class Program {
    public static void main(String[] args) {

        CreditManager creditManager           = new CreditManager();
        //buraya kadarki kısım stackte oluşur. newleyince heapte bir referans oluşuyor.

        creditManager.calculate();
        creditManager.save();


        Customer customer = new Customer();
        //instance oluşturmak, örnek oluşturmak. onun heapte bir ref no sunu oluşturmak.
        // referans numarasının tuttuğu şey  alttaki customer nesnesinin bütün özellikleridir (id,name,vs.)
        customer.id=1;
        customer.firstName="Ece";
        customer.lastName="Türkay";
        customer.NationalIdentity="123456";

        System.out.println();

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();



    }
}
