// Решение 5 задачи Эйлера
import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        int num = 20;
        // Число которое делится на все числа от 1 до num
        int resultNumber = 1;

        // Получаем список простых чисел от 1 до num с помощью решета Эратосфена
        List<Integer> primes = eratosthenesSieve(num);
        // Перебираем все простые числа
        for (Integer prime : primes) {
            // Находим наибольшую степень простого числа которая не больше num и умножаем resultNumber на него
            int n = 1;
            while (n * prime <= num)
                n *= prime;
            resultNumber *= n;
        }
        // После цикла resultNumber будет делиться на все числа от 1 до num
        System.out.println(resultNumber);
    }
    // Решето Эратосфена
    public static List<Integer> eratosthenesSieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i=0;i<=n;i++){
            isPrime[i] = true;
        }
        for (int i=2;i*i<=n;i++){
            if (isPrime[i]) {
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i=2;i<=n;i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}