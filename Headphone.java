import java.util.HashMap;

public class Headphone extends Product implements Cloneable
{
    public Headphone()
    {
    this.id = 0;
    this.brand = "NONE";
    this.name = "NONE";
    this.coloring = "NONE";
    this.price = 0;
    //System.out.println("Создан товар типа Headphone\n");
    }
    public Headphone(int id) {
    this.id = id;
    this.brand = "NONE";
    this.name = "NONE";
    this.coloring = "NONE";
    this.price = 0;
    System.out.println("Создан товар типа Headphone\n");
    }
    public Headphone clone() throws CloneNotSupportedException {
        return (Headphone) super.clone();
    }
}
