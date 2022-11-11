public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
        // Задача 2
        for (int i = 10; i >= 1; i--)
            System.out.println("интеграция цикла " + i);
        // Задача 3
        for (int i = 0; i < 17; i += 2)
            System.out.println("интеграция цикла " + i);
        // Задача 4
        for (int i = 10; i > -10; i--)
            System.out.println("интеграция цикла " + i);
        // задача 5
        for (int i = 1904; i < 2096; i += 4)
            System.out.println(i + " год является високосным");
        // задача 6
        for (int i = 7; i <= 98; i += 7)
            System.out.println(i);
        // задача 7
        for (int i = 1; i <= 512; i *= 2)
            System.out.println(i);
        // задача 8
        int salary = 29000;
        float total = 0f;
        for (int i = 0; i <= 12; i++){
            total = total + total / 100 ;

            total += salary;


            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");}


    }
}