package geon.hee.gofdesignpattern._03_abstract_factory._01_before;

import geon.hee.gofdesignpattern._03_abstract_factory._02_after.Ship;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory();
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
