
public class Phone extends ScreenSettings{
    protected int ROM;
    public Phone() {
        this.id = 0;
        this.brand = "NONE";
        this.name = "NONE";
        this.coloring = "NONE";
        this.price = 0;
        this.x = 0;
        this.y = 0;
        this.screenDiagonal = 0;
        this.ROM = 0;
        System.out.println("Создан товар типа phone");
    }

    public Phone(int id) {
        this.id = id;
        this.brand = "NONE";
        this.name = "NONE";
        this.coloring = "NONE";
        this.price = 0;
        this.x = 0;
        this.y = 0;
        this.screenDiagonal = 0;
        this.ROM = 0;
        System.out.println("Создан товар типа phone");
    }

    public Phone(int id, String brand, String name, String coloring, int price, int x, int y, int screenDiagonal, int ROM) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.coloring = coloring;
        this.price = price;
        this.x = x;
        this.y = y;
        this.screenDiagonal = screenDiagonal;
        this.ROM = ROM;
        System.out.println("Создан товар типа phone");
    }

    public void outputPhone() {
        System.out.println("Характеристики товара");
        System.out.println(this.id);
        System.out.println(this.brand);
        System.out.println(this.name);
        System.out.println(this.ROM);
        System.out.println(this.price);
        System.out.println(this.coloring);
        System.out.println(this.screenDiagonal);
        System.out.println(this.x + "X" + this.y);
    }
    
    public void turnon() {
        System.out.println("Телефон включен");
    }

    public void turnoff() {
        System.out.println("Телефон выключен");
    }
}