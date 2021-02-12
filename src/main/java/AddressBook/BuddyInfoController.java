//package AddressBook;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class BuddyInfoController {
//
//    @Autowired
//    BuddyInfoRepository buddyInfoRepository;
//
//    @Autowired
//    AddressBookRepository addressBookRepository;
//
//
//    @GetMapping("/buddyInfo")
//    public String addBuddy(Model model) {
//        model.addAttribute("buddyInfo", new BuddyInfo());
//        return "buddyInfo";
//    }
//
//    @PostMapping("/buddyInfo")
//    public String buddyDisplay(@ModelAttribute BuddyInfo buddyInfo, Model model) {
//
//        BuddyInfo buddy = new BuddyInfo(buddyInfo.getName(),buddyInfo.getAddress(),buddyInfo.getPhoneNumber());
//        buddyInfoRepository.save(buddy);
//
//        model.addAttribute("buddyInfo", buddy);
//        return "displayBuddy";
//    }
//
//    @GetMapping("/allBuddies")
//    public String displayAllBuddies(Model model){
//        model.addAttribute("buddyInfo", buddyInfoRepository.findAll());
//        return "BuddiesList";
//    }
//
//
//
//}
