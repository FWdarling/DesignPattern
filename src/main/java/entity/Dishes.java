package entity;

/**
 * description: 菜品实体类
 * date: 11/11/20 11:06 PM
 * author: fourwood
 */
public class Dishes {
    private final String name;
    private final Taste taste;

    public Dishes(String _name, Taste _taste) {
        name = _name;
        taste = _taste;
    }

    public String getName() {
        return name;
    }

    public Taste getTaste() {
        return taste;
    }
}
