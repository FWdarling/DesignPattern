package entity;

import transferobject.PersonalInformation;
import transferobject.QuerySystem;
import transferobject.Response;

/**
 * Cat作为运动员之一 存储个人信息
 */
public class Cat {
    PersonalInformation personalInformation;

    public Cat(){}
    public Cat(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }
}
