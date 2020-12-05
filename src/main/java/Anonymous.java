import java.util.List;

public class Anonymous {

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

}
