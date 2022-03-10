package geon.hee.gofdesignpattern._04_builder._03_java;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class LombokExample {

    private String title;
    private int nights;
    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                                          .title("여행")
                                          .nights(2)
                                          .days(3)
                                          .build();

        System.out.println("trip = " + trip);
    }
}
