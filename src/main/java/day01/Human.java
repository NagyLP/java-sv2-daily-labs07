package day01;

public class Human {

    private String name;
    private int yearOfBirth;

    public Human(String firstname, String lastname, int yearOfBirth) {
        this.name = firstname+ " " +lastname;
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth>120) {
            throw new IllegalArgumentException("120 évesnél idősebb:" +yearOfBirth+ " éves, ez hiba.");
        }
    }
}
