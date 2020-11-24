package transferobject;

import java.util.ArrayList;

/**
 * 数据传输POJO
 */
public class PersonalInformation {
    private String name;
    private Integer age;
    private String gender;
    private Integer entryNumber;

    public ArrayList<String> getSportEvents() {
        return sportEvents;
    }

    public void setSportEvents(ArrayList<String> sportEvents) {
        this.sportEvents = sportEvents;
    }

    private ArrayList<String> sportEvents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }
}
