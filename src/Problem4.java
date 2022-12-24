// Решение 4 задачи Эйлера
public class Problem4 {
    public static void main(String[] args) {
        // Два трехзначных числа
        int num1 = 999;
        int num2 = 999;
        // Переменная для хранения максимального палиндрома
        int maxPalindrom = 0;

        // Перебор всех возможных пар трехзначных чисел
        while (num1 > 99) {
            // Если произведение чисел является палиндромом и больше чем maxPalindrom, то записываем его в maxPalindrom
            if (isPalindrom(num1 * num2) && (num1*num2 > maxPalindrom))
                maxPalindrom = num1 * num2;
            // Новая пара чисел
            if (num1 > num2) {
                num1--;
                num2 = 999;
            } else
                num2--;
        }
        System.out.println(maxPalindrom);
    }

    // Проверяет является ли число палиндромом
    public static boolean isPalindrom(int num) {
        // Получаем количество цифр в числе
        int numLength = getNumLength(num);
        // Проверяем пары цифр на одинаковом расстоянии от центральной цифры
        for(int i=0; i<=numLength/2; i++){
            // если хотя бы одна пара цифр отличается число не является палиндромом
            if (getDigitNum(num, i) != getDigitNum(num, numLength-i-1))
                return false;
        }
        return true;
    }

    // Возращает количество цифр в числе num
    public static int getNumLength(int num) {
        int length = 0;
        // будем делить num на 10 пока оно не равно 0 и увеличивать length на 1
        while (num > 0){
            num /= 10;
            length++;
        }
        return length;
    }

    // Возращает i-тую цифру в числе n
    public static int getDigitNum(int num, int i) {
        return (num / intPower(10, i)) % 10;
    }

    // Целочисленное быстрое возведение в степень
    public static int intPower(int base, int exponent) {
        // При вовзедении в 0 степень результат 1
        if (exponent == 0) return 1;
        // При вовзедении в 1 степень результат число base
        if (exponent == 1) return base;
        // Если степень четная то считаем base^(exponent/2) и возводим в квадрат
        // a^b=a^(b/2)*a^(b/2), если b четное число
        if (exponent % 2 == 0) {
            int half = intPower(base, exponent / 2);
            return half * half;
        // Если степень не четная то считаем base^((exponent-1)/2), возводим в квадрат и умножаем на base
        // a^b=a^((b-1)/2)*a^((b-1)/2)*a, если b нечетное число
        } else {
            int half = intPower(base, (exponent - 1) / 2);
            return base * half * half;
        }
    }
}