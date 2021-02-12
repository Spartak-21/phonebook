package com.bdg.phonebook.service.impl;

import com.bdg.phonebook.domain.Address;
import com.bdg.phonebook.domain.Contact;
import com.bdg.phonebook.service.ContactService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContactServiceImpl implements ContactService {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Set<Contact> getByNameAndLastName(Set<Contact> contacts) {
        Set<Contact> result = new HashSet<>();
        if (contacts != null) {
            System.out.println("Please enter the name");
            String firstName = scanner.next();
            System.out.println("Please enter the last name");
            String lastName = scanner.next();
            for (Contact contact : contacts) {
                if (contact.getFirstName().equals(firstName) &&
                contact.getLastName().equals(lastName)) {
                    result.add(contact);
                }
            }
        }
        //TODO
        return result;
    }

    @Override
    public Set<Contact> getByPhoneNumber(Set<Contact> contacts) {
        //TODO
        Set<Contact> result = new HashSet<>();
        if (contacts != null) {
            System.out.println("Please enter the PhoneNumber");
            String phoneNumber = scanner.next();
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    result.add(contact);
                }
            }
        }
        return result;
    }

    @Override
    public Contact getContact(Contact contact, Set<Contact> contacts) {
        //TODO
        Contact result = new Contact();
        if (contacts != null) {
            System.out.println("Please enter the Contact");
            String getContact = scanner.next();
            for (Contact type : contacts) {
                if (type.getContactType().equals(getContact)) {
                    result = type;
                }
            }
        }
        return result;
        }

    @Override
    public boolean addContact(Set<Contact> contacts) {
        //TODO
        Contact newContact = new Contact();
        Address address = new Address();

        System.out.println("Please enter first name");
        String firstName = scanner.next();
        newContact.setFirstName(firstName);

        System.out.println("Please enter last name");
        String lastName = scanner.next();
        newContact.setLastName(lastName);

        System.out.println("Please enter phone number");
        String phoneNumber = scanner.next();
        newContact.setPhoneNumber(phoneNumber);

        System.out.println("Please enter email");
        String email = scanner.next();
        newContact.setEmail(email);

        System.out.println("Please enter contactType");
        String contactType = scanner.next();
        newContact.setContactType(contactType);

        System.out.println("Please enter country");
        String country = scanner.next();
        address.setCountry(country);

        System.out.println("Please enter city");
        String city = scanner.next();
        address.setCity(city);

        System.out.println("Please enter street");
        String street = scanner.next();
        address.setStreet(street);

        System.out.println("Please enter building");
        String building = scanner.next();
        address.setBuilding(building);

        System.out.println("Please enter apartment");
        String apartment = scanner.next();
        address.setApartment(apartment);

        newContact.setAddress(address);

        return true;
    }

    @Override
    public boolean delete(Set<Contact> contacts) {
        System.out.println("Please enter first name for deleting");
        String firstName = scanner.next();
        for (Contact contact : contacts){
            if(contact.getFirstName().equals(firstName)) {
                contacts.remove(contact);
            }
        }

        return true;
    }

    @Override
    public Contact editContact(Set<Contact> contacts) {
        System.out.println("Please enter first name for editing");
        String firstName = scanner.next();
        for(Contact contact : contacts) {
            if(contact.getFirstName().equals(firstName)) {
                contact.setFirstName(firstName);
            }
        }
        //TODO
        return null;
    }

    @Override
    public void getAllContacts(Set<Contact> contacts) {
        //TODO
    }

    @Override
    public boolean deleteContactById(Set<Contact> contacts) {
        //TODO
        return false;
    }

    private static Contact updatedContactToContact(Contact source, Contact destination) {
        //TODO
        return null;
    }

    public static Contact createContact() {
        //TODO
        return null;
    }
}
