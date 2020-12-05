
import java.util.List;

public class AnonymousClass {

    public static class AgeChecker implements CheckPerson {

        @Override
        public boolean test(Person person) {
            return person.getGender() == Person.Sex.MALE
                && person.getBirthday() >= 18
                && person.getBirthday() <= 25;

        }
    }

    public static Integer printPersons(List<Person> roster, CheckPerson testPerson) {
        Integer counter = 0;
        for (Person p : roster) {
            if (testPerson.test(p)) {
                p.printPerson();
                counter++;
            }
        }
        return counter;
    }

    /*
     * This approach reduces the amount of code required because you don't have to create a new class for each search
     * that you want to perform. However, the syntax of anonymous classes is bulky considering that the CheckPerson
     * interface contains only one method.
     */

}
