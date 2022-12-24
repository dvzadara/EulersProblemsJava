// Решение 6 задачи Эйлера
public class Problem6 {
    public static void main(String[] args) {
        int n = 100;
        // Сумма чисел от 1 до n
        int sumNums = n * (n + 1) / 2;
        // Сумма квадратов чисел от 1 до n
        int sumSquaresNums = n * (n + 1) * (2 * n + 1) / 6;
        // Считаем разницу между квадратом суммы и суммой квадратов
        System.out.println(sumNums * sumNums - sumSquaresNums);
    }
}