package com.techtalentsouth.addressbookproject;

import java.util.ArrayList;

import net.bytebuddy.asm.Advice.Enter;

public class main {

    // array list using hashmap
    
    {

    ArrayList<Enter> list = newArrayList<Entry>();
    boolean isrunning = true; 

    while (isrunning) {
        //this allows to print out 
        System.out.println("1) Add an entry \n" + 
        "2)Remove and entry\n" + 
        "3) Search for specific entry\n" +
        "4) Print Address Book\n" +
        "5) Delete Book\n" +
        "6) Quit\n" +
        "Can only take in a number\n"); 
    Scanner myObj = new Scanner (System.in);
    int a = myObj.nextInt();

    if (a==1) {

        //Adding an entry
        System.out.println("First Name:");
        String firstName = myObj.next(); //will get first name
        System.out.println("Last Name:");
        String lastName = myObj.next(); //will get last name 
        System.out.println("Phone Number:");
        String phoneNumber = myObj.next(); //will get phone number
        System.out.println("Email Address:");
        String emailAddress = myObj.next(); //will get email address

        //take and store entry into a constructor
        Entry entry = new Entry(firstName, lastName, phoneNumber, emailAddress);
        list.add(entry);
    }

        }
    }


// Deletes everything
static void deleteAddressBook() {
    entry.clear();
    System.out.println("\nAddress book cleared!");
}
    }
