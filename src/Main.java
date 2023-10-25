public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte temperatureWinter = -28;
        short moneyMonth = 31200;
        int areaAfrica = 30370000;
        long earthPopulation = 8060000000L;
        float constanta = -4.27f;
        double x = 745.249875461;
        System.out.println("Значение переменной temperatureWinter с типом byte равно "+temperatureWinter);
        System.out.println("Значение переменной moneyMonth с типом short равно "+moneyMonth);
        System.out.println("Значение переменной areaAfrica с типом int равно "+areaAfrica);
        System.out.println("Значение переменной earthPopulation с типом long равно "+earthPopulation);
        System.out.println("Значение переменной constanta с типом float равно "+constanta);
        System.out.println("Значение переменной x с типом double равно "+x);

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short f = -159;
        int k =27897;
        byte l = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(k);
        System.out.println(l);

        byte schoolKidsLudPav = 23;
        byte schoolKidsAnnSerg = 27;
        byte schoolKidsEkatAndr = 30;
        short paper = 480;
        int everyOne = paper / (schoolKidsAnnSerg+schoolKidsEkatAndr+schoolKidsLudPav);
        System.out.println("На каждого ученика рассчитано "+everyOne+" листов бумаги");

        byte bottle = 16;
        byte bottleTime = 2;
        float botlleOne = (float)bottleTime / bottle;
        byte time1 = 20;
        byte hour = 60;
        int time2 = 24 * hour;
        int time3 = 3 * time2;
        int time4 = 30 * time2;
        float capacity1 = (time1 / botlleOne);
        float capacity2 = (time2 / botlleOne);
        float capacity3 = (time3 / botlleOne);
        float capacity4 = (time4 / botlleOne);
        System.out.println("За "+time1+" минут машина произвела "+capacity1+" штук бутылок");
        System.out.println("За сутки машина произвела "+capacity2+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+capacity3+" штук бутылок");
        System.out.println("За месяц машина произвела "+capacity4+" штук бутылок");

        byte paintAll = 120;
        byte paintWhite1Room = 2;
        byte paintBrown1Room = 4;
        int room = paintAll / (paintWhite1Room + paintBrown1Room);
        int paintWhiteAll = paintWhite1Room * room;
        int paintBrownAll = paintBrown1Room * room;
        System.out.println("В школе, где "+room+" классов, нужно "+paintWhiteAll+" банок белой краски и "+paintBrownAll+" банок коричневой краски");

        byte banana = 5;
        byte bananaWeight1 = 80;
        short milkUnit = 2;
        byte milkWeightUnit = 105;
        byte iceCream = 2;
        byte iceCreamWeight1 = 100;
        byte egg = 4;
        byte eggWeught1 = 70;
        int mix = banana*bananaWeight1+milkUnit*milkWeightUnit+iceCream*iceCreamWeight1+egg*eggWeught1;
        int grPerKg = 1000;
        float mixKg = mix / (float)grPerKg;
        System.out.println(mixKg+"кг");

        byte weight = 7;
        short weightDayMin = 250;
        short weightDayMax = 500;
        int dayMin = weight*grPerKg/weightDayMin;
        int dayMax = weight*grPerKg/weightDayMax;
        int dayMiddle = (dayMax+dayMin)/2;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то ему потребуется "+dayMin+" дней");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то ему потребуется "+dayMax+" дней");
        System.out.println("При средней потере веса ему потребуется "+dayMiddle+" день");

        int moneyMasha = 67760;
        int moneyDenis = 83690;
        int moneyKristina = 76230;
        byte raise = 10;
        int moneyMashaRaise = moneyMasha + moneyMasha*raise/100;
        int moneyDenisRaise = moneyDenis + moneyDenis*raise/100;
        int moneyKristinaRaise = moneyKristina + moneyKristina*raise/100;
        int moneyMashaYear = 12*moneyMasha;
        int moneyMashaYearRaise = 12*moneyMashaRaise;
        int moneyMashaDifference = moneyMashaYearRaise-moneyMashaYear;
        int moneyDenisYear = 12*moneyDenis;
        int moneyDenisYearRaise = 12*moneyDenisRaise;
        int moneyDenisDifference = moneyDenisYearRaise-moneyDenisYear;
        int moneyKristinaYear = 12*moneyKristina;
        int moneyKristinaYearRaise = 12*moneyKristinaRaise;
        int moneyKristinaDifference = moneyKristinaYearRaise-moneyKristinaYear;
        System.out.println("Маша теперь получает "+moneyMashaRaise+" рублей. Годовой доход вырос на "+moneyMashaDifference+" рублей");
        System.out.println("Денис теперь получает "+moneyDenisRaise+" рублей. Годовой доход вырос на "+moneyDenisDifference+" рублей");
        System.out.println("Кристина теперь получает "+moneyKristinaRaise+" рублей. Годовой доход вырос на "+moneyKristinaDifference+" рублей");
    }
}