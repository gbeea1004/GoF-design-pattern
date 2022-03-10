package geon.hee.gofdesignpattern._02_factory_method._02_after.blackship;

import geon.hee.gofdesignpattern._02_factory_method._02_after.Ship;
import geon.hee.gofdesignpattern._02_factory_method._02_after.ShipFactory;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
