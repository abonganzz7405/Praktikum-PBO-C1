/**
 * File     : Person.java
 * Deskripsi: Person database model
 */

public class Person {
    private int id;
    private String name;

    // Konstruktor dengan parameter nama
    public Person(String name) {
        this.name = name;
    }

    // Konstruktor dengan parameter id dan nama
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter untuk id
    public int getId() {
        return id;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }
}
