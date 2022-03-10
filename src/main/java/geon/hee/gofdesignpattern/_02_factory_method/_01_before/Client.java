package geon.hee.gofdesignpattern._02_factory_method._01_before;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "geonhee@gmail.com");
        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = ShipFactory.orderShip("BlackShip", "geonhee@gmail.com");
        System.out.println("blackShip = " + blackShip);
    }
}
