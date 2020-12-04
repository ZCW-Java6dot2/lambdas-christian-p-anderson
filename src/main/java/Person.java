import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE,
        FEMALE
    }

    private String name;
    private Integer birthday;
    private Sex gender;
    private String emailAddress;

    public Person(String name, Integer birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.println(this.name);
        System.out.println(this.birthday);
        System.out.println(this.gender);
        System.out.println(this.emailAddress);
    }
}
