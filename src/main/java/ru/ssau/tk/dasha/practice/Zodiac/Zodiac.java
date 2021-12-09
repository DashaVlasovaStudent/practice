package ru.ssau.tk.dasha.practice.Zodiac;

import java.util.Scanner;

public class Zodiac {
    ZodiacSigns sign;
    DaysOfWeek day;

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

    public Zodiac(ZodiacSigns sign, DaysOfWeek day) {
        this.sign = sign;
        this.day = day;
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

        Zodiac user = new Zodiac(sign, day);

        System.out.println("Your zodiac sign is "+ sign+"\n Today is (day of week) "+day);
    }
}
