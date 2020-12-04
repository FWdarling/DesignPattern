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

    /**
     Constructor for the stuff.

     Args:
        String name
        String sex
        int id
        int phone

     Return：
     **/
    public Stuff(String name, String sex, int id, int phone) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.phone = phone;
    }

    /**
     Getter for stuff's name.

     Args:

     Return:
        String: name.
     **/
    public String getName() {
        return name;
    }

    /**
     Setter for stuff's name.

     Args:
        String: name.

     Return:
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     Getter for stuff's sex information.

     Args:

     Return:
        String: sex
     **/
    public String getSex() {
        return sex;
    }

    /**
     Setter for stuff's sex information.

     Args:
        String: sex

     Return:

     **/
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     Getter for stuff's id.

     Args:

     Return:
        int: id
     **/
    public int getId() {
        return id;
    }

    /**
     Setter for stuff's id.

     Args:
        int: id

     Return:
     **/
    public void setId(int id) {
        this.id = id;
    }

    /**
     Getter for stuff's phone number.

     Args:

     Return:
         int: phone.
     **/
    public int getPhone() {
        return phone;
    }

    /**
     Setter for stuff's phone number.

     Args:
        int: phone

     Return:
     **/
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
