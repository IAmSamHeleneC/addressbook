# Address Book Overview
This repo features an address book java application using spring boot.
The following features are found...
 Allows the user to perform the following actions:
	 - Add an entry
	 - Remove and entry
	 - Search for a specific entry
	 - Print the contents of the address book
	 - Delete the contents of the address book
	 - Quit the program
   #Entries
   Entries are contained in a class and has the following properties
  -First name
 - Last name
 - Phone number
 - Email address
 *Variables are private and accessible via getters and setters.
 
 #Book Structure 
 Address book is shown in an ArrayList of Entry instances. This ArrayList can be accessed and modified using methods that accomplish the following:

 *Adding entries
	 - New entries contain all of the properties required by an entry, email addresses are unique.
 - Remove an entry
	 - An entry can be removed by searching the database for an email address and then removing the entry with that unique email address.
 *Search for an entry
	 - Users can pick which methods they will search by (first name, last name, phone number, or email address). The program will then take in a search query and search the address book for an entry that contains the search as a substring (e.g. if a first name search is conducted with 'a,' all entries that have a first name starting with 'a' will be returned).
 *Printing the address book
	 - All of the entries will be printed out
 - Deleting the book
	 - The address book will be cleared
 *Quit
 -The program will stop running

