package geon.hee.gofdesignpattern._04_builder._02_after;

import geon.hee.gofdesignpattern._04_builder._01_before.TourPlan;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class TourDirector {

    private final TourPlanBuilder tourPlanBuilder;

    public TourPlan ulleungdoTrip() {
        return tourPlanBuilder.title("울릉도 여행")
                              .nightsAndDays(2, 3)
                              .startDate(LocalDate.of(2022, 5, 5))
                              .whereToStay("펜션")
                              .addPlan(0, "체크인 및 짐풀기")
                              .addPlan(1, "조식")
                              .getPlan();
    }
}
