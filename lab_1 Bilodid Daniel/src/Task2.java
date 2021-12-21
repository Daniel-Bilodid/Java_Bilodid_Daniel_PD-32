import java.util.Scanner;

public class Task2 { //класс

    public static void main(String[] args) {  //создание публичного метода
        Scanner scanner = new Scanner(System.in);//обьявляем сканнер
        int begin, end, step;//инициализируем переменные
        System.out.print("Array begin --> ");
        begin = scanner.nextInt();//сканер считывает введённое число и присваивает его к begin
        System.out.print("Array end --> ");
        end = scanner.nextInt();//сканер считывает введённое число и присваивает его к end
        System.out.print("Step --> ");
        step = scanner.nextInt();//сканер считывает введённое число и присваивает его к step

        for (int i : fillArray(begin, end, step)) {
            System.out.print(i + " "); // инициализатор, заполнения массива
        }
    }

    private static int[] fillArray(int begin, int end, int step){
        int size = Math.abs((end - begin) / step + 1);//уравнение для подготовки к шагам
        int[] array = new int[size];

        int currentNum = begin;
        for (int i = 0; i < size; i++) {
            array[i] = currentNum; //просчитываем шаги
            currentNum += step;
        }
        return array;//возвращаем массив
    }
}

