import java.util.ArrayList;
import java.util.List;

// Решение 10 задачи Эйлера
public class Problem10 {
    public static void main(String[] args) {
        int n = 2000000;
        // Переменная хранящая сумму простых чисел
        long sum = 0;
        // Получаем простые числа от 2 до n с помощью решета Эратосфена
        List<Integer> primeNums = eratosthenesSieve(n);
        // Суммируем
        for(int primeNum: primeNums)
            sum += primeNum;
        System.out.println(sum);
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