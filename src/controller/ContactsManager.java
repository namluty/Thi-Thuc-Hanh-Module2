package controller;

import model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactsManager {
    private List<Contacts> contactsList =  new ArrayList<>();
    private String name;


    public ContactsManager() {
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean checkInstance(String newNameContacts) {
        for (Contacts contacts : contactsList) {
            if (contacts.getFullName().equals(newNameContacts)) {
                return true;
            }
        }
        return false;
    }

    public boolean addContacts(Contacts contacts) {
        if (checkInstance(contacts.getFullName())) {
            return false;
        }else{
            contactsList.add(contacts);
            return true;
        }
    }

    public void editUpdate(int index, Contacts contacts) {
        contactsList.remove(index);
        contactsList.add(contacts);
    }

    public void deleteContacts(int index) {
        contactsList.remove(index);
    }

    public int searchById(String id) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getFullName().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Contacts findByName(String name){
        Contacts contacts = null;
        for (Contacts contact: contactsList
        ) {
            if (contact.getFullName().equals(name))
                contacts = contact;
        }
        return contacts;
    }

    public void showAll() {
        for (Contacts contacts : contactsList) {
            System.out.println(contacts);
        }
    }
}
