import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Dan","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }

    //added note for git
}
