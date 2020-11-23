package entity;

import org.junit.jupiter.api.DynamicTest;
import transferobject.PersonalInformation;
import transferobject.QuerySystem;
import transferobject.Response;

public class Cat {
    PersonalInformation personalInformation;
    QuerySystem querySystem;

    public Cat(){}
    public Cat(PersonalInformation personalInformation, QuerySystem querySystem) {
        this.personalInformation = personalInformation;
        this.querySystem = querySystem;
    }

    public void query() {
        Response result = querySystem.query(personalInformation);
        PersonalInformation obj = (PersonalInformation)result.getObj();
        System.out.println("===================");
        if(result.getMsg().equals("found")) {
            System.out.printf("%s : %d has already been saved!\n", obj.getName(), obj.getEntryNumber());
        } else {
            System.out.printf("%s : %d has been created!\n", obj.getName(), obj.getEntryNumber());
            System.out.printf("Gge : %d\n", obj.getAge());
            System.out.printf("Gender : %s\n", obj.getGender());
            System.out.printf("EntryNumber : %d\n", obj.getEntryNumber());
            System.out.printf("SportEvents : %s\n", obj.getSportEvents().toString());
        }
        System.out.println("===================");
    }
}
