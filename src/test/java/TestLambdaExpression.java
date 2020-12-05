import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLambdaExpression {

    @Test
    public void testLocalClass() {
        // WHEN
        Person john = new Person("John", 25, Person.Sex.MALE, "ja@gmail.com");
        Person lori = new Person("Lori", 45, Person.Sex.FEMALE, "la@gmail.com");
        Person steve = new Person("Steve", 22, Person.Sex.MALE, "sa@gmail.com");
        Person diane = new Person("Diane", 26, Person.Sex.FEMALE, null);

        AnonymousClass.AgeChecker AgeTest = new AnonymousClass.AgeChecker();

        ArrayList<Person> people = new ArrayList<>();
        people.add(john);
        people.add(lori);
        people.add(steve);
        people.add(diane);

        // GIVEN
        Integer expected = 2;
        Integer actual = AnonymousClass.printPersons(people, AgeTest);

        // Then
        Assert.assertEquals(expected, actual);

    }

}
