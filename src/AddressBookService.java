
public class AddressBookService {

    AddressBookRepository addressBookRepository = new AddressBookRepository();
    public void addPerson(Person person) {
        addressBookRepository.addPerson(person);
    }
    public void displayPersons()
    {
        addressBookRepository.displayPersons();
    }

    public void deletePerson(){
        addressBookRepository.deletePerson();
    }
    public  void updatePerson(){
        addressBookRepository.updatePerson();
    }

}