// Решение 2 задачи Эйлера
public class Problem2 {
    public static void main(String[] args) {
        int sumEvenFebonachiNums = 0;

        // Переменные lastFebonachiNum и penultimateFebonachiNum используются для хранения 2 последних чисел Фебоначи
        int lastFebonachiNum = 1;
        int penultimateFebonachiNum = 1;

        // Считаем все числа Фебоначи до 4000000, из них все четные суммируем в переменную sumEvenFebonachiNums
        int n = 4000000;
        while (lastFebonachiNum < n)
        {
            // Если последнее число Фебоначи четное прибавляем его в сумму
            if (lastFebonachiNum % 2 == 0)
                sumEvenFebonachiNums += lastFebonachiNum;
            // Считаем новое число Фебоначи, и обновляем переменные penultimateFebonachiNum и lastFebonachiNum
            int newFebonachiNum = lastFebonachiNum + penultimateFebonachiNum;
            penultimateFebonachiNum = lastFebonachiNum;
            lastFebonachiNum = newFebonachiNum;
        }
        System.out.println(sumEvenFebonachiNums);
    }
}