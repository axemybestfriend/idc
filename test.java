import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Введите id товара: ");
        int id = scanner.nextInt();
        System.out.println("Введите бренд товара: ");
        String brand = scanner.next();
        System.out.println("Введите название товара: ");
        String name = scanner.next();
        System.out.println("Введите расцветку товара: ");
        String coloring = scanner.next();
        System.out.println("Введите стоимость товара: ");
        int price = scanner.nextInt();
        System.out.println("Введите диагональ экрана: ");
        int screenDiagonal = scanner.nextInt();
        System.out.println("Введите разрешение экрана (например: 720 480): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        //ScreenSettings abstract  turn интерфейс 

        Monitor a = new Monitor(id, brand, name, coloring, price, x, y, screenDiagonal);
        Monitor b = a;
        
        a.output();
        
        int c;
        c = b.PriceDifference(a.getprice());
        
        WirelessHeadphone d = new WirelessHeadphone();
        
        WirelessHeadphone IlV = d;
        d.outputWirelessHeadphone();
        
        Headphone e = new Headphone();
        
        a.turnOn();
        a.turnOff();

        System.out.println(a.toString()); 
                
        scanner.close();
    }
}
