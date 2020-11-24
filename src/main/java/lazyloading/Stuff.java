package lazyloading;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:11 2020/11/23
 * @Modified By:
 **/
public class Stuff {
    String name;
    String sex;
    int id;
    int phone;

    public Stuff(String name, String sex, int id, int phone) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", sex=" + sex +
                ", id=" + id +
                ", phone=" + phone;
    }
}
