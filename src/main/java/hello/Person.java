package hello;

import org.springframework.data.annotation.Id;

public class Person {

    @Id private String id;

    private String firstName;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}