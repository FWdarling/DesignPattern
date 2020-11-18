package memento.entity;

/**
 * description: 运动员类，物种属性的载体
 * data: 11/13/20 17:25 PM
 * author: cjsmt
 */
public class Athlete {
    private String name;
    private Species species;
    public Athlete(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public Species getSpecies() {
        return species;
    }
}
