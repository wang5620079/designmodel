package decoratorpattern;

/**
 * Created by wp-pc on 2018/9/15.
 */
public abstract class Beverage {
    String description="不知道什么配方";
    public static final String tallsize="tall";
    public static final String grandesize="grand";
    public static final String ventisize="venti";

    public String size="grand";

    public String getDescription(){
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double cost();
}
