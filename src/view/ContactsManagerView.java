package view;

import controller.ContactsManager;
import model.Contacts;

import java.util.Scanner;

public class ContactsManagerView {
    public static void addContacts(ContactsManager contactsManager) {
        Contacts newContacts = ContactsView.createNewContacts();
        boolean checkAdd = contactsManager.addContacts(newContacts);
        if (checkAdd) {
            System.out.println("WELL DONE");
        }else{
            System.out.println("Contacts already exists! - Danh bạ đã tồn tại");
        }
    }
    public static void editUpdate(ContactsManager contactsManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullName of Contacts your want to Edit: ");
        String fullName = scanner.nextLine();
        int index = contactsManager.searchById(fullName);
        if (index == -1) {
            System.out.println("Not Found Contacts");
        } else {
            Contacts newContacts = ContactsView.createNewContacts();
            contactsManager.editUpdate(index, newContacts);
            System.out.println("Finish");
        }
    }
    public static void deleteContacts(ContactsManager contactsManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullName of Contact your want to Delete: ");
        String fullName = scanner.nextLine();
        int index = contactsManager.searchById(fullName);
        if (index == -1) {
            System.out.println("Not Found Contacts");
        } else {
            contactsManager.deleteContacts(index);
            System.out.println("Finish");
        }
    }

    public static void searchContacts(ContactsManager contactsManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullName you are want to Search: ");
        String fullName = scanner.nextLine();
        int index = contactsManager.searchById(fullName);
        if (index == -1) {
            System.out.println("Not Found Contacts");
        } else {
            System.out.println(contactsManager.getContactsList().get(index));
        }
    }
}
