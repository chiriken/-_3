public class Main {
    public static void main(String[] args) {
        byte bicycle = 7;
        short book = -45;
        int catMan = 166;
        long skyPro = 837376587;
        float sugar = 44.44F;
        double salt = -276.999;
        System.out.println("Значение переменной bicycle c типом byte равно " + bicycle + "шт!");
        System.out.println("Значение переменной book c типом short равно " + book + "шт!");
        System.out.println("Значение переменной catMan c типом int равно " + catMan + "шт!");
        System.out.println("Значение переменной skyPro c типом long равно " + skyPro + " пройденных курсов!");
        System.out.println("Значение переменной sugar c типом float равно " + sugar + "кг!");
        System.out.println("Значение переменной salt c типом double равно " + salt + "кг!");
        System.out.println();

        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short g = -159;
        short j = 27897;
        byte h = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);
        System.out.println(j);
        System.out.println(h);
        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short paper = 480;
        int studentSheets = paper / ( classA + classB + classC  );
        System.out.println("На каждого ученика рассчитано " + studentSheets + " листов бумаги!");
        System.out.println();

        byte minutes = 20;
        short day = 1440;
        short threeDay = (short) (day * 3);
        int month = day * 30;
        byte bottlesMinutes = 8;
        int productivityMinutes = minutes * bottlesMinutes;
        int productivityDay = day * bottlesMinutes;
        int productivityThreeday = threeDay * bottlesMinutes;
        int productivityMonth = month * bottlesMinutes;
        System.out.println("За 20 минут машина произвела " + productivityMinutes + " штук");
        System.out.println("За 1 день машина произвела " + productivityDay + " штук");
        System.out.println("За 3 дня машина произвела " + productivityThreeday + " штук");
        System.out.println("За 1 месяц машина произвела " + productivityMonth + " штук");
        System.out.println();

        byte allPots = 120;
        byte consumptionWhite = 2;
        byte consumptionBrown = 4;
        int allClass = allPots / (consumptionWhite + consumptionBrown );
        System.out.println("Всего классов " + allClass);
        int allWhite = allClass * consumptionWhite;
        int allBrown = consumptionBrown * allClass;
        System.out.println("В школе где " + allClass + " классов, нужно " + allWhite + " банок белой краски " + allBrown + " банок коричневой краски!" );
        System.out.println();

        byte banana = 5;
        short milk = 200;
        byte iceСream = 2;
        byte egg = 4;
        System.out.println("Вес измеряется в количестве 1 шт(граммах) или же 100 мл");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte icecreamWeight = 100;
        byte eggWeight = 70;
        int allweightBanana = banana * bananaWeight;
        int allweightMilk = (milk / 100) * milkWeight;
        int allweightIcecream = iceСream * icecreamWeight;
        int allweightEgg = egg * eggWeight;
        int generalGramming = allweightEgg + allweightBanana + allweightIcecream + allweightMilk;
        float inKilograms =(float) generalGramming / 1000;
        System.out.println("Всего выходит " + generalGramming + " грамм, или же " + inKilograms + " кг!" );
        System.out.println();

        short dietOne = 250;
        short dietTwo = 500;
        int purpose = 7 * 1000;
        int resultOne = purpose / dietOne;
        int resultTwo = purpose / dietTwo;
        int currentValue = (resultTwo + resultOne) / 2;
        System.out.println("Если нужно похудеть на 7 килограмм, а это " + purpose + " грамм. На диету 1 уйдет " + resultOne + " дней, а на диету 2 уйдет " + resultTwo + " дней! Среднее количество дней составит " + currentValue );
        System.out.println();

        float masha = 67.760f;
        float denis = 83.690f;
        float kris = 76.230f;
        double oneyearMasha = masha * 12;
        double oneyearDenis = denis * 12;
        double oneyearKris = kris * 12;
        double raisingMasha = masha * 1.1;
        double raisingDenis = denis * 1.1;
        double raisingKris = kris * 1.1;
        double oneyearraisingMasha = raisingMasha * 12;
        double oneyearraisingDenis = raisingDenis * 12;
        double oneyearraisingKris = raisingKris * 12;
        double differenceMasha = raisingMasha - masha;
        double differenceDenis = raisingDenis - denis;
        double differenceKris = raisingKris - kris;
        double differenceintheyearMasha = oneyearraisingMasha - oneyearMasha;
        double differenceintheyearDenis = oneyearraisingDenis - oneyearDenis;
        double differenceintheyearKris = oneyearraisingKris - oneyearKris;
        System.out.println("Маша теперь получает " + raisingMasha + " руб в месяц, ее доход увеличился на " + differenceMasha + " рублей в месяц, или же на " + differenceintheyearMasha + " рублей в год!");
        System.out.println("Данис теперь получает " + raisingDenis + " руб в месяц, его доход увеличился на " + differenceDenis + " рублей в месяц, или же на " + differenceintheyearDenis + " рублей в год!" );
        System.out.println("Кристина теперь получает " + raisingKris + " руб в месяц, ее доход увеличился на " + differenceKris + " рублей в месяц, или же на " + differenceintheyearKris + " рублей в год!" );

    }
}