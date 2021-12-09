package ru.ssau.tk.dasha.practice.Zodiac;

import java.util.Scanner;

public class Compatibility {
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
//____________________________________ВСЕГДА ВЫДАЕТ 100% СОВМЕСТИМОСТЬ, ИДЕАЛЬНЫЙ ПОДКАТ_______________________________

    public void knowCompatibity(ZodiacSigns a, ZodiacSigns b) {
        System.out.println("Your compability:\n" + a + " + " + b + " = 100%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZodiacSigns signMine;
        ZodiacSigns signPartner;

        System.out.println("Please, enter you sign");
        String s = scanner.next();
        signMine = ZodiacSigns.valueOf(s);

        System.out.println("Please, enter the sign of your crush");
        String sP = scanner.next();
        signPartner = ZodiacSigns.valueOf(s);

        Compatibility compatibility = new Compatibility();
        compatibility.knowCompatibity(signMine, signPartner);

    }
}
