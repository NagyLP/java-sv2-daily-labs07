package day01;

public class Human {

    private String name;
    private int yearOfBirth;

    public Human(String firstname, String lastname, int yearOfBirth) {
        NameValidator nv = new NameValidator();
        YearOfBirthValidator yobv = new YearOfBirthValidator();

        if (yobv.isYearOfBirthValid(yearOfBirth) && nv.isNameValid(name)) {
            this.name = firstname + " " + lastname;
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
