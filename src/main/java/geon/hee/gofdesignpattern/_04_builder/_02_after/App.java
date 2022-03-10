package geon.hee.gofdesignpattern._04_builder._02_after;

import geon.hee.gofdesignpattern._04_builder._01_before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.ulleungdoTrip();
        System.out.println("tourPlan = " + tourPlan);
    }
}
