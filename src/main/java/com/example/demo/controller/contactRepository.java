package com.example.demo.controller;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class contactRepository {
    private List<Contact> contactsList = new ArrayList<>();

    public List<Contact> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public boolean isEmpty(){
        return contactsList.isEmpty();
    }

    public void addContact(Contact contact) {
        contactsList.add(contact);
    }

    public Contact getContact(String name){
        for (Contact oneContact : contactsList){
            if(oneContact.getName().equals(name)){
                return oneContact;
            }
        }
        return null;
    }

}
