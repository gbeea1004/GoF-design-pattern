package geon.hee.gofdesignpattern.factorymethod._03_java;

import java.util.Calendar;
import java.util.Locale;

/**
 * Simple Factory Pattern
 * 구현체 하나에서 여러 Product 를 만들어 줌
 */
public class CalendarExample {

    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
    }
}
