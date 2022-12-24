// Решение 9 задачи Эйлера
public class Problem9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        /*
        в условии есть 2 равенства:
        a + b + c = 1000
        a ^ 2 + b ^ 2 = c ^ 2
        из которых следует:
        c = 1000 - a - b
        a ^ 2 + b ^ 2 = (1000 - a - b) ^ 2
        Будем перебирать все возможные a и b сумма которых меньше 1000 и проверять равенство
        */
        while (a * a + b * b != (1000 - a - b) * (1000 - a - b)){
            if ((a < b) && (a + b < 1000))
                a++;
            else {
                b++;
                a = 1;
            }
        }
        System.out.println(a * b * (1000 - a - b));
    }
}