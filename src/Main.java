//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.printf("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); }
//        System.out.printf("Задача 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i); }
        System.out.println("Задача 3");
        for (int i = 0; i <=17 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >=-10; i--) {
            System.out.print(i+" ");
        }
        System.out.println("Задача 5");
        for (int i = 1906; i <=2096 ; i+=4) {
            System.out.println(i+" високосный год ");
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.println( i+ "");
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i + "");
        }
        System.out.println("Задача 8");
        int saving = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + saving;
            System.out.println( "Месяц " +  i +" сумма накоплений равна "+sum);
        }
        System.out.println("Задача 9");
        int salery = 29000;
        int sum1 = 0;
        for (int i = 1; i <=12; i++) {
            sum1 = sum1 + sum1/100;
            sum1 = sum1 + salery;
            System.out.println("Месяц " + i+ " сумма накоплений равна " + sum1 + " процент " + sum1/100);
        }

        System.out.println( "Задача 10");
        int mult = 2;
        for (int i = 1; i < 10; i++) {
            // mult = 2 * i;
            System.out.println("2*" + i + "=" + 2 * i);
        }

    }

}