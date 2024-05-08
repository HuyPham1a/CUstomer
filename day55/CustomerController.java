package day55;

import java.util.ArrayList;
import java.util.Scanner;

// lam nhiem vu dieu huong khach hang nhap va hien thi thong tin
public class CustomerController {

    // 1.Cho phep tao moi thong tin khac hang
    ArrayList<Customer> customers = new ArrayList<>();

    public void create() {
        Scanner sc = new Scanner(System.in);
        //yeu cau nhap
        System.out.println("Vui long nhap thong tin khach hang.");
        System.out.println("Nhap id: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("nhap ten: ");
        String firstName = sc.nextLine();
        System.out.println("nhap ho: ");
        String lastName = sc.nextLine();
        System.out.println("nhap email: ");
        String email = sc.nextLine();
        System.out.println("nhap phone: ");
        String phone = sc.nextLine();
        System.out.println("nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("nhap tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLasttName(lastName);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setAddress(address);
        customer.setAge(age);

        customers.add(customer);


    }

    public void showListCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hien thi danh sach khach hang.");
        System.out.println("------------------------------.");
        System.out.printf("%-10s || %-30s || %-30s\n", "Id", "Last Name", "First Name");
        System.out.println("==================================================");
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            System.out.printf("%-10s || %-30s || %-30s\n", c.getId(), c.getLasttName(), c.getFirstName());

        }
        System.out.println("Enter de tiep tuc");
        sc.nextLine();

    }
}
    // 2.Cho phep hien thi
    // 3.Cho phep thay doi
    // 4.Cho phep xoa

