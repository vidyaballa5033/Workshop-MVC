import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookRepository {
    ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }
    public void displayPersons() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(i+ " " +personList.get(i).getFname() + " " +personList.get(i).getLname());

        }
//        for (Person p :personList) {
//            System.out.println(p.getFname()+" " +p.getLname());
//        }
    }
    public void deletePerson() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Index Number Which You Want Delete : ");
        int a=s.nextInt();
        personList.remove(a);

    }
    public void updatePerson(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index Which you want to update : ");
        int b=s.nextInt();
        System.out.println("Enter New First Name : ");
        String str=s.next();
        System.out.println("Enter New Last Name : ");
        String str1=s.next();
        for (int i = 0;i < personList.size();i++) {
            if(i==b){
                personList.get(i).setFname(str);
                personList.get(i).setLname(str1);
            }
            break;
        }
    }
}
