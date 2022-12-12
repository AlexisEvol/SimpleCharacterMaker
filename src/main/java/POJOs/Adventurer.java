package POJOs;

public class Adventurer {
    private final String name;
    private final int age;
    private final String race;
    private final String gender;

    public Adventurer(String name, int age, String race, String gender) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + ", the " + race + " adventurer.";
    }
}
