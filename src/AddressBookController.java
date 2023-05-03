
import java.util.Scanner;

public class AddressBookController {

    public  static Person readPersonDataFromConsole(){
        Scanner s=new Scanner(System.in);
        String fname = s.next();
        String lname = s.next();
        Person p = new Person();
        p.setFname(fname);
        p.setLname(lname);
        return p;
    }
    public static void main(String[] args) {
        AddressBookService addressBookService = new AddressBookService();
        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println(" 1.Add " + " 2.Display " + " 3.Remove " + " 4.Update " + " 5.Exit ");
            int choice=s.nextInt();
            switch (choice){

                case 1:
                    Person person =  readPersonDataFromConsole();
                    addressBookService.addPerson(person);
                    break;
                case 2:
                    addressBookService.displayPersons();
                    break;
                case 3:
                    addressBookService.deletePerson();
                    break;
                case 4:
                    addressBookService.updatePerson();

                case 5:
                    System.out.println("Thank You For Using Service: ");
                    break;
                default:
                    System.out.println("Enter Proper Input");

            }
        }
    }
}
