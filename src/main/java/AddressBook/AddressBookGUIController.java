//package AddressBook;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class AddressBookGUIController implements  ActionListener {
//
//    private AddressBookView view;
//    private AddressBook addressBook;
//
//    public AddressBookGUIController() {
//    }
//
//    public void init (){
//        view.setListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String name = view.getBuddyInfoName();
//        String address = view.getBuddyInfoAddress();
//        String phoneNum = view.getBuddyInfoPhone();
//
//        if(!name.isEmpty() && !address.isEmpty() && !phoneNum.isEmpty()) {
//            BuddyInfo newBuddy = new BuddyInfo(name,address,phoneNum);
//            addressBook.addBuddy(newBuddy);
//            view.addBuddy(newBuddy);
//        }
//        view.clearFields();
//    }
//
//    public void setView(AddressBookView view) {
//        this.view = view;
//    }
//
//    public void setAddressBook(AddressBook addressBook) {
//        this.addressBook = addressBook;
//    }
//}
