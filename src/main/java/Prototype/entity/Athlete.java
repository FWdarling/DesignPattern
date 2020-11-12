package main.Prototype.entity;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,11:37
 * @Version: 1.0
 */
public class Athlete {
    protected final String name;
    protected final String sportsType;
    protected final AnimalType animalType;


    public Athlete(String _name, AnimalType _animalType,String _sportsType){
        name = _name;
        animalType = _animalType;
        sportsType = _sportsType;
    }

    public String getName() {
        return name;
    }

    public String getSportsType(){
        return sportsType;
    }
}
