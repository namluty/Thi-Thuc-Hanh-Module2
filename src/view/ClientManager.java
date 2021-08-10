package view;

import controller.ContactsManager;

import java.util.Scanner;

public class ClientManager {
    static ContactsManagerView contactsManagerView = new ContactsManagerView();
    public static ContactsManager contactsManager = new ContactsManager(contactsList, "admin");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose = -1;
        while (choose != 0)
            System.out.println("Menu");
        System.out.println("1. Creat a contacts: ");
        System.out.println("2. Display list contacts: ");
        System.out.println("3. Edit a contacts: ");
        System.out.println("4. Delete a contacts: ");
        System.out.println("5. Search a contacts: ");
        System.out.println("0. Exit!!!: ");
        System.out.println("Enter your choose: ");
        choose = input.nextInt();
        switch (choose) {
            case 1:
                contactsManagerView.createNewContacts(contactsManager);
                break;
            case 2:
                contactsManagerView.showAll(contactsManager);
                break;
            case 3:
                contactsManagerView.editUpdate(contactsManager);
                break;
            case 4:
                contactsManagerView.deleteContacts(contactsManager);
                break;
            case 5:
                contactsManagerView.searchContacts(contactsManager);
                break;
            case 0:

                break;
        }
    }
}