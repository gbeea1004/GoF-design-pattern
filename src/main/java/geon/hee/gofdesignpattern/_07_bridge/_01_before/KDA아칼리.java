package geon.hee.gofdesignpattern._07_bridge._01_before;

public class KDA아칼리 implements Champion {

    @Override
    public void move() {
        System.out.println("KDA 아칼리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 아칼리 skillQ");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 아칼리 skillW");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 아칼리 skillE");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 아칼리 skillR");
    }
}
