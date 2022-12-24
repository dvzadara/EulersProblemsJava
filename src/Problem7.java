import java.util.Arrays;

// Решение 7 задачи Эйлера
public class Problem7 {
    public static void main(String[] args) {
        int n = 1000001;
        System.out.println(findFirstPrimeNums(n)[n-1]);
    }
    // Поиск первых n простых чисел
    public static int[] findFirstPrimeNums(int n){
        // Массив простых чисел
        int[] primeNums = new int[n];
        primeNums[0] = 2;
        // Заполнение массива простых чисел
        // Пока не заполним массив на каждой итерации увеличиваем a на 1 и проверяем на простоту
        for(int i=1,a=3;i<n;a++){
            // если оно простое добавляем в массив и увеличиваем i на 1
            if (isPrime(a, Arrays.copyOfRange(primeNums, 0, i))){
                primeNums[i] = a;
                i++;
            }
        }
        return  primeNums;
    }
    // Функция проверяет число на простоту используя список простых чисел наденых раньше
    public static boolean isPrime(int num, int[] primeNums){
        // Проверяем все простые числа наденые раньше
        for(int primeNum : primeNums) {
            // Если число делится нацело на другое число то оно не простое
            if (num % primeNum == 0)
                return false;
            // Делителем числа num не могут быть числа квадрат которых больше чем num их можно не проверять
            if (primeNum * primeNum > num)
                break;
        }
        return true;
    }
}