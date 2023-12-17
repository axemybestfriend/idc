

public class Helper
{    
    static public int calc(int a, int b)
    {
        if (a - b > 0)System.out.printf("Первый товар дороже второго на : %d\n",a - b);
        if (a - b < 0)System.out.printf("Второй товар дороже первого на : %d\n",-(a - b));
        if (a - b == 0)System.out.println("Товары стоят одинаково");
        return a-b;
    }
}
