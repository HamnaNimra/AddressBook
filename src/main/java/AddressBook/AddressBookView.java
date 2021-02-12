//package AddressBook;
//
//import javax.swing.*;
//import java.awt.event.ActionListener;
//
//public class AddressBookView extends JFrame {
//
//    private JTextField buddyInfoNameTxt, buddyInfoAddressTxt,buddyInfoPhoneTxt;
//
//    private DefaultListModel<BuddyInfo> model;
//
//    private JButton addBuddyBtn;
//
//    public void init() {
//       // JFrame frame=new JFrame();//creating instance of JFrame
//
//        JScrollPane listScrollPane = new JScrollPane();
//
//        model = new DefaultListModel<>();
//        JList list = new JList<>(model);
//        listScrollPane.setViewportView(list);
//
//        JLabel buddyInfoLbl = new  JLabel("AddressBook.BuddyInfo");
//
//        JLabel buddyInfoNameLbl = new  JLabel("Enter buddy name");
//        buddyInfoNameTxt = new JTextField();
//
//        JLabel buddyInfoAddressLbl = new  JLabel("Enter buddy address");
//        buddyInfoAddressTxt = new JTextField();
//
//        JLabel buddyInfoPhoneLbl = new  JLabel("Enter buddy phone number");
//        buddyInfoPhoneTxt = new JTextField();
//
//        JPanel p = new JPanel();
//        p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
//
//        addBuddyBtn = new JButton("Add");
//
//        p.add(listScrollPane);
//
//        p.add(buddyInfoLbl);
//
//        p.add(buddyInfoNameLbl);
//        p.add(buddyInfoNameTxt);
//
//        p.add(buddyInfoAddressLbl);
//        p.add(buddyInfoAddressTxt);
//
//        p.add(buddyInfoPhoneLbl);
//        p.add(buddyInfoPhoneTxt);
//
//        p.add(addBuddyBtn);
//
//        this.add(p);
//        this.pack();
//        this.setBounds(400,200,500,500);//400 width and 500 height
//        this.setVisible(true);//making the frame visible
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public void setListener(ActionListener listener){
//        addBuddyBtn.addActionListener(listener);
//    }
//
//    public void addBuddy(BuddyInfo buddyInfo){
//        model.addElement(buddyInfo);
//    }
//
//    public String getBuddyInfoName(){
//        return buddyInfoNameTxt.getText();
//    }
//
//    public String getBuddyInfoAddress(){
//        return buddyInfoAddressTxt.getText();
//    }
//    public String getBuddyInfoPhone(){
//        return buddyInfoPhoneTxt.getText();
//    }
//
//    public void clearFields(){
//        buddyInfoNameTxt.setText("");
//        buddyInfoAddressTxt.setText("");
//        buddyInfoPhoneTxt.setText("");
//    }
//
//}
