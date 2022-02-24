package geon.hee.gofdesignpattern.factorymethod._02_after;

import geon.hee.gofdesignpattern.factorymethod._02_after.blackship.BlackShipFactory;
import geon.hee.gofdesignpattern.factorymethod._02_after.whiteship.WhiteShipFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        client.print(new WhiteShipFactory(), "WhiteShip", "aa@gmail.com");
        client.print(new BlackShipFactory(), "BlackShip", "bb@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        Ship ship = shipFactory.orderShip(name, email);
        System.out.println("ship = " + ship);
    }
}
