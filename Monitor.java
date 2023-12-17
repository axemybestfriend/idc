
public class Monitor extends ScreenSettings implements turn {
    public Monitor() {
        this.id = 0;
        this.brand = "NONE";
        this.name = "NONE";
        this.coloring = "NONE";
        this.price = 0;
        this.x = 0;
        this.y = 0;
        this.screenDiagonal = 0;
        System.out.println("Создан товар типа monitor");
    }

    public Monitor(int id, String brand, String name, String coloring, int price, int x, int y, int screenDiagonal) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.coloring = coloring;
        this.price = price;
        this.x = x;
        this.y = y;
        this.screenDiagonal = screenDiagonal;
        System.out.println("Создан товар типа monitor");
    }

    public Monitor(int id) {
        this.id = id;
        this.brand = "NONE";
        this.name = "NONE";
        this.coloring = "NONE";
        this.price = 0;
        this.x = 0;
        this.y = 0;
        this.screenDiagonal = 0;
        System.out.println("Создан товар типа monitor");
    }

    public void output() {
        System.out.println("Характеристики товара");
        System.out.println(this.id);
        System.out.println(this.brand);
        System.out.println(this.name);
        System.out.println(this.coloring);
        System.out.println(this.price);
        System.out.println(this.screenDiagonal);
        System.out.println(this.x + "X" + this.y);
    }

    public void turnOn() {
        System.out.println("Монитор запущен");
    }

    public void turnOff() {
        System.out.println("Монитор выключен");
    }
}

