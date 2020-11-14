package main.prototype.entity;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,11:37
 * @Version: 1.0
 */
public class Athlete {
    protected final String name;
    protected final String sportsType;

    public Athlete(String _name,String _sportsType){
        name = _name;
        sportsType = _sportsType;
    }

    public String getName() {
        return name;
    }

    public String getSportsType(){
        return sportsType;
    }
}
