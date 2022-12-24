// Решение 1 задачи Эйлера
public class Problem1 {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        // Проходимся по числам от 1 до n и суммируем все нацело делящиеся на 3 или 5 в переменную sum
        for(int i=1;i<n;i++)
        {
            if ((i % 3 == 0) || (i % 5 == 0))
                sum += i;
        }
        System.out.println(sum);
    }
}

/*
public class Problem1 {
    public static void main(String[] args) {
        int n = 999;
        int three_sum = (n / 3 + 1) * n / 2;
        int five_sum = (n / 5 + 1) * (n - n % 5) / 2;
        int fifteen_sum = n / 15 * (n - n % 15 + 15) / 2;
        int sum = three_sum + five_sum - fifteen_sum;
        System.out.println(sum);
    }
}
*/