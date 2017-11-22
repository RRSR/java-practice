package com.company;

import java.util.ArrayList;

/**
 * Created by Raj Rathore on 21-Nov-17
 */
class MobilePhone {

  private ArrayList<Contact> contactList = new ArrayList<>();

  ArrayList<Contact> getContacts() {
    return contactList;
  }

  void addContact(Contact contact) {
    if (contactList.contains(contact)) {
      System.out.println("Contact already exists!");
    } else {
      contactList.add(contact);
      System.out.println("Added contact " + contact.getName() + " successfully.");
    }
  }

  void updateContact(Contact oldContact, Contact newContact) {
    if (!contactList.contains(oldContact)) {
      System.out.println("Contact does not exists!");
    } else {
      contactList.set(contactList.indexOf(oldContact), newContact);
      System.out.println("Modified contact " + oldContact.getName() + " to " + newContact.getName()
          + " successfully.");
    }
  }

  void removeContact(Contact contact) {
    if (!contactList.contains(contact)) {
      System.out.println("Contact does not exist!");
    } else {
      contactList.remove(contact);
      System.out.println("Removed contact " + contact.getName());
    }
  }

  Contact findContact(String name) {
    for(Contact contact : contactList){
      if(contact.getName().equalsIgnoreCase(name)){
        return contact;
      }
    }
    return null;
  }

  void printContacts() {
    System.out.println("Contact List ::");
    for (Contact contact : contactList){
      System.out.println(contact.toString());
    }
  }
}
