package com.techtalentsouth.addressbookproject;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;
// com.techtalentsouth.addressbookproject.Addressbookcontroller.add(Contact, Model)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

public class Addressbookcontroller {

    @Autowired
    ClassLoaderRepository repository;

@PostMapping("/add")
public String add(@ModelAttribute Contact contact, Model m) {
System.out.println("contact to save ="+ contact.getName()); 
if (contact.getId() == 0) {
repository.save(contact);
} else {
update(contact);
}

m.addAttribute("contact", new Contact());
List<Contact> contacts = repository.findAll();
//Collections.sort(contacts);
System.out.println("contacts = "+ contacts.size());
m.addAttribute("contacts", contacts);
return "contacts";
}

@GetMapping ("/add")
public String findAllContacts(Model model) {
    System.out.println("findAllContacts in db");

    model.addAttribute("contact", new Contact());
List<Contact> contacts = repository.findAll();
    System.out.println("contacts = "+ contacts.size());
model.addAttribute("contacts", contacts);
return "contacts";
}

public void update(Contact c) {
System.out.println("Update called with ID = "+ c.getId());
repository.save©;
}

@RequestMapping("/delete") 
public String delete(@RequestParam("id") int id, Model model) {
System.out.println("Delete called with ID = "+ id ); 
Contact c = repository.findOne(id);
repository.delete©;
model.addAttribute("contact", new Contact());
List<Contact> contacts = repository.findAll();
System.out.println("contacts = "+ contacts.size());
model.addAttribute("contacts", contacts);
return "contacts";
}

}

