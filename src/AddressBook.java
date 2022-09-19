import java.util.LinkedList;

public class AddressBook {
    private LinkedList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new LinkedList<BuddyInfo>();
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy() {
        buddies.remove();
    }
}
