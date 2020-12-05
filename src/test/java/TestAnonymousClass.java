import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestAnonymousClass {

    @Test
    public void testLocalClass() {
        // WHEN
        Person john = new Person("John", 15, Person.Sex.MALE, "ja@gmail.com");
        Person lori = new Person("Lori", 45, Person.Sex.FEMALE, "la@gmail.com");
        Person steve = new Person("Steve", 24, Person.Sex.MALE, "sa@gmail.com");
        Person diane = new Person("Diane", 26, Person.Sex.FEMALE, null);

        Anonymous.AgeChecker AgeTest = new Anonymous.AgeChecker();

        ArrayList<Person> people = new ArrayList<>();
        people.add(john);
        people.add(lori);
        people.add(steve);
        people.add(diane);

        // GIVEN
        Integer expected = 1;
        Integer actual = Anonymous.printPersons(people, AgeTest);

        // Then
        Assert.assertEquals(expected, actual);

    }
}
