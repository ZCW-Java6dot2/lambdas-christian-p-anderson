import java.util.List;

public class LocalClass {

    public static class EmailChecker implements CheckPerson {
        @Override
        public boolean test(Person person) {
            return person.getEmailAddress() != null;
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

    /**
     * This method checks each Person instance contained in the List parameter whether it satisfies the search criteria
     * specified in the CheckPerson parameter tester by invoking the method tester.test. If the method tester.test
     * returns a true value, then the method PrintPersons is invoked on the Person instance.
     *
     * Although this approach is less brittle - you don't have to rewrite methods if you change the structure of the
     * Person. You still have additional code: a new interface and a local class for each search you plan to perform
     * in your application.
     */



}
