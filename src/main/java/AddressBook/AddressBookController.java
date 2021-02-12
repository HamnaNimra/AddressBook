/*
package AddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {

    @Autowired
    AddressBookRepository addressBookRepository;
    @Autowired
    BuddyInfoRepository buddyInfoRepository;

    @GetMapping("/createAddressBook")
    public String createAddressBook(Model model) {
        model.addAttribute("AddressBook", new AddressBook());
        return "AddressBook";
    }

    @PostMapping("/createAddressBook")
    public String display(@ModelAttribute AddressBook addressBook, Model model){
        addressBook = new AddressBook();

        for (BuddyInfo buddy:
                buddyInfoRepository.findAll()) {
            addressBook.addBuddy(buddy);

        }
        addressBookRepository.save(addressBook);

        model.addAttribute("newAddressBook",addressBook);
        return "AddressBookResult";
    }

    @GetMapping("/addressBookDisplay")
    public String displayAddressBook(Model model){
        model.addAttribute("newAddressBook",addressBookRepository.findById(1));
        return "AddressBookBuddies";
    }
}*/
