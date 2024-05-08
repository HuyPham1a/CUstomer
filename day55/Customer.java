package day55;
// luu tru thong tin khac hang chua cac thuoc tinh.
// phuong thuc lien quan den hanh vi khach hang

public class Customer {
    private long id ;
    private String firstName;
    private String lasttName;
    private String email;
    private String phone;
    private String address;
    private int age;

    public Customer() {

    }
    public Customer(long id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lasttName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
