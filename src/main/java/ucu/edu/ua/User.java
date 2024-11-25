package ucu.edu.ua;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

enum Gender {
    MALE, FEMALE
}

@Builder
@ToString
@Getter
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}