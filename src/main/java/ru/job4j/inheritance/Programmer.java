package ru.job4j.inheritance;

public class Programmer extends Engineer {
    public Programmer(
            String name, String surname, String education, long birthday, int yearsOfExperience) {
        super(name, surname, education, birthday, yearsOfExperience);
    }
}