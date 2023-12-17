public class WirelessHeadphone <T> extends Headphone {
    protected int batteryCapacity;
    protected T model;
    public WirelessHeadphone() {
        super();
        this.batteryCapacity = 0;
        System.out.println("Создан товар типа WirelessHeadphone");
    }

    public WirelessHeadphone(int id) {
        this.id = id;
        this.brand = "NONE";
        this.name = "NONE";
        this.coloring = "NONE";
        this.price = 0;
        this.batteryCapacity = 0;
        System.out.println("Создан товар типа WirelessHeadphone");
    }

    public WirelessHeadphone(int id, String brand, String name, String coloring, int price, int batteryCapacity) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.coloring = coloring;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        System.out.println("Создан товар типа WirelessHeadphone");
    }

    public int batteryCapacityDifferenceHeadphone(WirelessHeadphone b) {

        if (this.batteryCapacity - b.batteryCapacity> 0) System.out.println("Аккумулятор первого больше второго на: " + (this.batteryCapacity - b.batteryCapacity));
        else if (this.batteryCapacity - b.batteryCapacity < 0)System.out.println("Аккумулятор второго больше первого на: " + (-(this.batteryCapacity - b.batteryCapacity)));
        else System.out.println("По объему аккумуляторы равны");
        return this.batteryCapacity - b.batteryCapacity;
    }

    public void outputWirelessHeadphone() {
        System.out.println("Характеристики товара");
        System.out.println(this.id);
        System.out.println(this.brand);
        System.out.println(this.name);
        System.out.println(this.coloring);
        System.out.println(this.price);
        System.out.println(this.batteryCapacity);
    }
    public WirelessHeadphone clone() throws CloneNotSupportedException {
        return (WirelessHeadphone) super.clone();
    }
}
