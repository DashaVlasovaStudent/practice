package ru.ssau.tk.dasha.practice.Zodiac;

import java.util.Scanner;

public class Zodiac {

    public enum ZodiacSigns {
        ARIES, //овен
        TAURUS, //телец
        GEMINI, // близнецы
        CANCER, //рак
        LEO, //лев
        VIRGO,//дева
        LIBRA,//весы
        SCORPIO,//скорпион
        SAGITTARIUS,//стрелец
        CAPRICORN,//козерог
        AQUARIUS,//водолей
        PISCES//рыбы

    }

    public enum DaysOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public Zodiac() {

    }

    public void createHoroscope(ZodiacSigns sign, DaysOfWeek day) {
        switch (sign) {
            case ARIES:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Stars are telling you to buy a christmas tree");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");

                }
                break;
            case TAURUS:
                switch (day) {
                    case MONDAY -> System.out.println("bd");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Today is not a good to meet Yeti");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
            case GEMINI:
                switch (day) {
                    case MONDAY -> System.out.println("bq");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Today is good day to take sunbathing");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
            case CANCER:
                switch (day) {
                    case MONDAY -> System.out.println("bdd");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Be careful! Stars know there's a danger to stand on your cat");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
            case LEO:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("aabs");
                    case THURSDAY -> System.out.println("HAha just have a nice day");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
            case VIRGO:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Time to buy New Year presents");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
            case LIBRA:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("You're so cool guy, just be happy and do what yo want");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
            case SCORPIO:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("High time to close deadlines");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
            case SAGITTARIUS:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("December is best month for you");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }break;

            case AQUARIUS:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Keep pouring water(aqua)");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("xbo");
                }break;
            case CAPRICORN:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Christmas lights! Put them on the wall");
                    case FRIDAY -> System.out.println("br");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }break;
            case PISCES:
                switch (day) {
                    case MONDAY -> System.out.println("b");
                    case TUESDAY -> System.out.println("bf");
                    case WEDNESDAY -> System.out.println("bs");
                    case THURSDAY -> System.out.println("Eat some fish");
                    case FRIDAY -> System.out.println("bwwwr");
                    case SATURDAY -> System.out.println("by");
                    case SUNDAY -> System.out.println("bo");
                }
                break;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zodiacSign;
        String dayOfWeek;

        System.out.println("Your zodiac sign is ");
        zodiacSign = scanner.next();
        ZodiacSigns sign = ZodiacSigns.valueOf(zodiacSign);

        System.out.println("Today is (day of week)");
        dayOfWeek = scanner.next();
        DaysOfWeek day = DaysOfWeek.valueOf(dayOfWeek);

        Zodiac user = new Zodiac();

        System.out.println("Your horoscope:");

        //System.out.println("You entered:\n zodiac sign is " + sign + "\n Today is (day of week) " + day + "\n\n");
        user.createHoroscope(sign, day);

    }
}
