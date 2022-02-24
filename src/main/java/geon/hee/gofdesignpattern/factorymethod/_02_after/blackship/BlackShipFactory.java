package geon.hee.gofdesignpattern.factorymethod._02_after.blackship;

import geon.hee.gofdesignpattern.factorymethod._02_after.Ship;
import geon.hee.gofdesignpattern.factorymethod._02_after.ShipFactory;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
