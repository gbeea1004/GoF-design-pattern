package geon.hee.gofdesignpattern._07_bridge._01_before;

public class KDA카이사 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 카이사 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 카이사 skillQ");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 카이사 skillW");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 카이사 skillE");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 카이사 skillR");
    }
}
