import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private String interests;

    /**
     * Creating a constructor
     */
    public Student(String firstName, String lastName, int studentNumber, String interests) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterests(interests);
    }

    /**
     * Creating setter and getters for each field.
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Adding Interests getter and Setter..
     * @return
     */
    public String getInterests() {
        return interests;
    }

    /**
     * Validating all the interests.
     * @param interests
     */
    public void setInterests(String interests) {
        interests = interests.toLowerCase();
        List<String> validInterests = getInterest();
        if (validInterests.contains(interests))
            this.interests = interests;
        else
            throw new IllegalArgumentException(interests + "is not valid, valid Interests are: " + validInterests);
    }

    /**
     * Declaring all valid interests.
     * @return
     */
    public static List<String> getInterest() {
        return Arrays.asList("coding", "gaming", "hiking", "skiing", "reading", "playing", "writing", "singing");
    }

    /**
     * To string method.
     * @return
     */
    public String toString()
    {
        return "Your name is : " + firstName + " " + lastName + "\n" + "Your Student Number is : " + studentNumber + "\n" + "Your interest is : " + interests;
    }

}

