public class Human {
    private String firstName = "Adam";
    private String lastName = "Adamyan";
    private int year = 1945;
    private char gender = 'm';

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public Human(String firstName, String lastName, int year, char gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setYear(year);
        setGender(gender);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1945 && year > 2020) {
            System.out.println("You aren't available for work!");
        } else
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'f')  {
            this.gender = gender;
        }
    }

    public void printInfo() {
        System.out.printf("Full name: %s %s\n", getFirstName(), getLastName());
        System.out.println("Year of birth: - " + getYear());
        System.out.println("Gender: " + getGender());
    }
}
