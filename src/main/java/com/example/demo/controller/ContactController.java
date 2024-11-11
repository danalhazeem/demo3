package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    contactRepository contactsList = new contactRepository();

    @PostMapping("/addContact")
    String addContact(@RequestBody Contact contact){
        contactsList.addContact(contact);
        return "Contact added successfully!";
    }
    @GetMapping("/getContactDetails")
    String getContactDetails(@RequestParam String name){
        Contact contact = contactsList.getContact(name);
        return "Contact " +contact.getName() +" details: Email: "+contact.getEmail()+ ", Phone Number: "+contact.getPhone();

    }
}
