package crediApp;

public class Customer { //müşteri bilgilerini (özellikleri) tutn classımız

    public int id;
    public String firstName;
    public String lastName;
    public String NationalIdentity;


    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı."); //her nesneyi newlediğimizde bu blok çalışır
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return NationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        NationalIdentity = nationalIdentity;
    }
}
