package geon.hee.gofdesignpattern._07_bridge._01_before;

public class 정복자아리 implements Champion {

    @Override
    public void move() {
        System.out.println("정복자 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("정복자 아리 skillQ");
    }

    @Override
    public void skillW() {
        System.out.println("정복자 아리 skillW");
    }

    @Override
    public void skillE() {
        System.out.println("정복자 아리 skillE");
    }

    @Override
    public void skillR() {
        System.out.println("정복자 아리 skillR");
    }
}
