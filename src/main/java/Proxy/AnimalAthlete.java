package Proxy;

import java.util.concurrent.TimeUnit;

public class AnimalAthlete {
    private String name;
    private String species;

    public AnimalAthlete(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public boolean interview(String[] questions) throws InterruptedException {
        System.out.println(this.name + " is a " + this.species);
        System.out.println("The interview is start!");
        for (String question : questions
        ) {
            System.out.println(name + " answered the question: " + question);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("The interview is over!");
        return true;
    }

    public String getName() {
        return this.name;
    }
}
