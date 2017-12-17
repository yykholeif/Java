public class ContactsManager {
    Contact [] myFriends;
    int friendsCount;

    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact) {
        myFreinds[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFreinds[i];
            }
        }
        return null;
    }
    
}