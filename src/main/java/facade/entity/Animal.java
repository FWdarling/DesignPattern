package facade.entity;

/**
 * description: 动物类，父类，用于储存信息：名字、预报名项目
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public abstract class Animal {
    private String name;
    private Event eventToSignUp;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Event getEventToSignUp() {
        return eventToSignUp;
    }

    public void setEventToSignUp(Event eventToSignUp) {
        this.eventToSignUp = eventToSignUp;
    }
}
