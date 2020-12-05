import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocalClass {

    @Test
    public void testLocalClass() {
        // WHEN
        Person john = new Person("John", 23, Person.Sex.MALE, "ja@gmail.com");
        Person lori = new Person("Lori", 45, Person.Sex.FEMALE, "la@gmail.com");
        Person steve = new Person("Steve", 31, Person.Sex.MALE, "sa@gmail.com");
        Person diane = new Person("Diane", 24, Person.Sex.FEMALE, null);

        LocalClass.EmailChecker checkEmailTest = new LocalClass.EmailChecker();

        ArrayList<Person> people = new ArrayList<>();
        people.add(john);
        people.add(lori);
        people.add(steve);
        people.add(diane);

        // GIVEN
        Integer expected = 3;
        Integer actual = LocalClass.printPersons(people, checkEmailTest);

        // Then
        Assert.assertEquals(expected, actual);

    }
}
