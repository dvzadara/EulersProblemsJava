// Решение 3 задачи Эйлера
public class Problem3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        System.out.println(maxPrimeDivisor(num));
    }

    // Самый большой простой делитель числа
    public static long maxPrimeDivisor(long num) {
        // Если число меньше 2 - оно не имеет простых делителей
        if (num < 2) {
            System.out.println("maxPrimeDivisor принимает только числа больше 1");
            System.exit(0);
        }

        // Если число простое то оно является своим наибольшим простым делителем
        if (isPrime(num))
            return num;

        // Максимальный потенциальный делитель числа num это его корень округленный в меньшую сторону
        long MaxPotentialDivisor = (long)Math.sqrt(num);
        // Проверим все делители числа num на простоту, самое большое запишем в переменную maxPrimeDivisor
        long maxPrimeDivisor = 2;
        for(long i=2;i<=MaxPotentialDivisor;i++) {
            if (isPrime(i) && (num % i == 0)){
                maxPrimeDivisor = i;
            }
        }
        return maxPrimeDivisor;
    }

    // Проверка целого положительного числа на простоту
    public static boolean isPrime(long num) {
        // если число меньше 2 оно не простое, если 2 - простое, больше - проверяем все потенциальные делители
        if (num < 2)
            return false;
        else if (num == 2)
            return true;
        else {
            // Максимальный потенциальный делитель числа n это его корень округленный в меньшую сторону
            long MaxPotentialDivisor = (long)Math.sqrt(num);
            // Проверка всех потенциальный делителей, если число делится нацело хотя бы на 1 из них то число не простое
            for(long i=2;i<=MaxPotentialDivisor;i++) {
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}