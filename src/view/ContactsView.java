package view;

import model.Contacts;

import java.util.Scanner;

public class ContactsView {

    public static Contacts createNewContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fullName Contacts: ");
        String fullName = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a phoneNumber: ");
        int phoneNumber = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a address: ");
        String address = scanner2.nextLine();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a email: ");
        String email = scanner3.nextLine();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter a facebook: ");
        String facebook = scanner4.nextLine();

        return new Contacts(fullName,phoneNumber,address,email,facebook);
    }
}
