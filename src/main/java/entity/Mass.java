/**
 * 运动员的体重属性
 */
package entity;

public class Mass {

    private final double value;
    private final String title;

    public Mass(double value) {
        this.value = value;
        this.title = value + "kg"; // Implicit call to Double.toString(value)
    }

    /**
     * 判断运动员的体重是否符合标准
     */

    public final boolean greaterThan(Mass other) {
        return this.value > other.value;
    }

    public final boolean smallerThan(Mass other) {
        return this.value < other.value;
    }

    public final boolean greaterThanOrEq(Mass other) {
        return this.value >= other.value;
    }

    public final boolean smallerThanOrEq(Mass other) {
        return this.value <= other.value;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof Mass)) {
            return false;
        }
        return ((Mass) obj).value == this.value;
    }
}