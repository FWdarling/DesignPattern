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

    /**
     * 构造函数 传入聚合的个人信息类
     * @param personalInformation
     */
    public Cat(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    /**
     * 获取personalInformation对象
     * @return
     */
    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    /**
     * 设置personalInformation对象
     * @param personalInformation
     */
    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }
}
