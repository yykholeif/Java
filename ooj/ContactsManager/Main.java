public class Main {

    public static void main(String [] args){

        ContactsManager myContactsManager = new ContactsManager();

        Contact friendMikey = new Contact();
        friendMikey.name = "Mikey";
        friendMikey.phoneNumber = "123456789";
        myContactsManager.addContact(friendMikey);

        Contact friendMichelle = new Contact();
        friendMichelle.name = "Michelle";
        friendMichelle.phoneNumber = "987654321";
        myContactsManager.addContact(friendMichelle);

        Contact friendZiyad = new Contact();
        friendZiyad.name = "Ziyad";
        friendZiyad.phoneNumber = "510541438";
        myContactsManager.addContact(friendZiyad);

        Contact friendDa3our = new Contact();
        friendDa3our.name = "Da3our";
        friendDa3our.phoneNumber = "793373398";
        myContactsManager.addContact(friendDa3our);

        Contact friendBruce = new Contact();
        friendBruce.name = "Bruce";
        friendBruce.phoneNumber = "374559589";
        myContactsManager.addContact(friendBruce);

        Contact result = myContactsManager.searchContact("Bruce");
        System.out.println(result.phoneNumber);


    }

}