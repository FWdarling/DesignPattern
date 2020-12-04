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

    /**
     * 获取sportEvents
     * @return
     */
    public ArrayList<String> getSportEvents() {
        return sportEvents;
    }

    /**
     * 设置sportEvents
     * @param sportEvents
     */
    public void setSportEvents(ArrayList<String> sportEvents) {
        this.sportEvents = sportEvents;
    }

    private ArrayList<String> sportEvents;

    /**
     * 获取name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄
     * @return
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取编号
     * @return
     */
    public Integer getEntryNumber() {
        return entryNumber;
    }

    /**
     * 设置编号
     * @param entryNumber
     */
    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }
}
