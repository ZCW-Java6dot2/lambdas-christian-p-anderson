
//  https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#approach4

import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression {

    /*
     * The CheckPerson interface is a functional interface. A functional interface is any interface that contains only
     * one abstract method. (A functional interface may contain one or more default methods or static methods).
     * Because a functional interface contains only one abstract method, you can omit the name of that method when
     * you implement it. To do this, instead of using an anonymous class expression, you use a lambda expression.
     */

    public CheckPerson ageChecker() {

        return person -> person.getGender() == Person.Sex.MALE
                && person.getBirthday() >= 18
                && person.getBirthday() <=25;
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
