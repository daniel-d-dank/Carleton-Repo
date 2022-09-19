import java.util.LinkedList;

public class AddressBook {
    private LinkedList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new LinkedList<BuddyInfo>();
    }

    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Dan","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove();
    }
}
