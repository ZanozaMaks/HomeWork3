public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }

    public static void task1 () {
        System.out.println("Задача 1");

        int Water = 1200;
        System.out.println("Значение переменной Water с типом int равно " +Water);
        byte Milk = 50;
        System.out.println("Значение переменной Milk с типом byte равно " +Milk);
        short Juice = 200;
        System.out.println("Значение переменной Juice с типом short равно " +Juice);
        long Coffee = 50000;
        System.out.println("Значение переменной Coffee с типом long равно " +Coffee);
        float CocaCola = 23.61F;
        System.out.println("Значение переменной CocaCola с типом float равно " +CocaCola);
        double Cocktail = 113.729;
        System.out.println("Значение переменной Cocktail с типом double равно " +Cocktail);
        // Пишем код для задачи 1
    }

    public static void task2 () {
        System.out.println("Задача 2");

        double a = 27.12F;
        System.out.println(a+ " Тип float");
        long b = 987678965549L;
        System.out.println(b+ " Тип long");
        float c = 2.786F;
        System.out.println(c+ " Тип double");
        short d = 569;
        System.out.println(d+ " Тип short");
        short e = -159;
        System.out.println(e + " Тип short");
        int f = 27897;
        System.out.println(f+ " Тип int");
        byte g = 67;
        System.out.println(g+ " Тип byte");
        // Пишем код для задачи 2
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeyevna = 27;
        byte EkaterinaAndreevna = 30;
        short Paper = 480;
        int TotalStudents = LyudmilaPavlovna + AnnaSergeyevna + EkaterinaAndreevna;
        int SheetPerPerson = Paper / TotalStudents;
        System.out.println("23 + 27 + 30 = " +TotalStudents+ " Учеников в общей сумме");
        System.out.println("480 / 80 = " +SheetPerPerson+ " Бумаги на 1 студента");
        // Пишем код для задачи 3
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte BottleInTwoMinutes = 16;
        int BottleInOneMinutes = BottleInTwoMinutes / 2;
        int InTwentyMinutes = BottleInOneMinutes * 20;
        int PerDay = BottleInOneMinutes * 1440;
        int ForThreeDays = PerDay * 3;
        int PerMonth = ForThreeDays * 10;
        System.out.println("За 1 минут машина произвела " +BottleInOneMinutes+ " штук бутылок");
        System.out.println("За 20 минут машина произвела " +InTwentyMinutes+ " штук бутылок");
        System.out.println("За сутки машина произвела " +PerDay+ " штук бутылок");
        System.out.println("За 3 дня машина произвела " +ForThreeDays+ " штук бутылок");
        System.out.println("За месяц машина произвела " +PerMonth+ " штук бутылок");
        // Пишем код для задачи 4
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte TotalCans = 120;
        byte WhiteCans = 2;
        byte BrownCans = 4;
        int CansForOneClass = WhiteCans + BrownCans;
        int TotalClasses = TotalCans / CansForOneClass;
        int WholeBrownCans = TotalClasses * BrownCans;
        int WholeWhiteCans = TotalClasses * WhiteCans;
        System.out.println("В школе, где " +TotalClasses+ " классов, нужно " +WholeWhiteCans+ " банок белой краски и " +WholeBrownCans+ " банок коричневой краски");
        System.out.println("120 / 6 = 20 классов");
        System.out.println("20 * 4 = 80 коричневых красок");
        System.out.println("20 * 2 = 40 белых красок");

        // Пишем код для задачи 5
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short Bananas = 5 * 80;
        short Milk = 2 * 105;
        short Cream = 2 * 100;
        short Egg = 4 * 70;
        int Breakfast = Bananas + Milk + Cream + Egg;
        System.out.println ( Breakfast+ " Граммов");
        float Kilogram = Breakfast * 0.001f;
        System.out.println ( Kilogram+ " Килограммов");
        System.out.println ("5 * 80 + 2 * 105 + 2 * 100 + 4 * 70 = " +Breakfast+ "гр. * 0.001 = "  +Kilogram+  "кг");
        // Пишем код для задачи 6
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short HalfAKilogram = 500;
        short QuarterKilogram = 250;
        short ConvertingKilogramsToGrams = 7 * 1000;
        int DaysForWeightLossHalfKilogram = ConvertingKilogramsToGrams / HalfAKilogram;
        int DaysForWeightLossQuarterKilogram = ConvertingKilogramsToGrams / QuarterKilogram;
        System.out.println (DaysForWeightLossHalfKilogram+ "дней для похудения");
        System.out.println(DaysForWeightLossQuarterKilogram+ "дней для похудения");
        System.out.println ("Переводим килограммы в граммы - 7 * 1000 = " +ConvertingKilogramsToGrams+
                            " делим граммы на заданные рационы. " +ConvertingKilogramsToGrams+ "/" +HalfAKilogram+ " и " +QuarterKilogram+
                            " соответсвенно при похудении на 500 грамм в день, спортсмен похудеет на нужную массу спустя " +DaysForWeightLossHalfKilogram+
                            " дней. При похудении на 250 грамм в день, спортсмен похудеет на нужную массу спустя " +DaysForWeightLossQuarterKilogram+ " Дней");
        // Пишем код для задачи 7
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;
        byte MonthAYear = 12;
        float a = (float) .10;

        float BeforeTheIncreaseMasha = a * Masha;
        float BeforeTheIncreaseDenis = a * Denis;
        float BeforeTheIncreaseChristina = a * Christina;

        float AnnualIncomeM = BeforeTheIncreaseMasha * MonthAYear;
        float AnnualIncomeD = BeforeTheIncreaseDenis * MonthAYear;
        float AnnualIncomeC = BeforeTheIncreaseChristina * MonthAYear;


        float SalaryIncreaseM = BeforeTheIncreaseMasha + Masha;
        float SalaryIncreaseD = BeforeTheIncreaseDenis + Denis;
        float SalaryIncreaseC = BeforeTheIncreaseChristina + Christina;

        System.out.println("Маша теперь получает " +SalaryIncreaseM+ " рублей. Годовой доход вырос на " +AnnualIncomeM+ " рублей");
        System.out.println("Денис теперь получает " +SalaryIncreaseD+ " рублей. Годовой доход вырос на " +AnnualIncomeD+ " рублей");
        System.out.println("Кристина теперь получает " +SalaryIncreaseC+ " рублей. Годовой доход вырос на " +AnnualIncomeC+ " рублей");




        // Пишем код для задачи 8
    }
}