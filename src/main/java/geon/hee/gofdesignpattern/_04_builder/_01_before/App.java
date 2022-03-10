package geon.hee.gofdesignpattern._04_builder._01_before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("울릉도 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2022, 5, 5));
        tourPlan.setWhereToStay("펜션");
        tourPlan.addPlan(0, "체크인 및 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식");
        tourPlan.addPlan(1, "해변 산책");
        tourPlan.addPlan(1, "점심 바베큐");
        tourPlan.addPlan(1, "리조트에서 수영");
        tourPlan.addPlan(2, "체크아웃");
    }
}
