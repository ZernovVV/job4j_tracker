package ru.job4j.inheritance;

public class Builder extends Engineer {
    public Builder(
            String name, String surname, String education, long birthday, int yearsOfExperience) {
        super(name, surname, education, birthday, yearsOfExperience);
    }
}