package geon.hee.gofdesignpattern._02_factory_method._02_after.whiteship;

import geon.hee.gofdesignpattern._02_factory_method._02_after.Ship;
import geon.hee.gofdesignpattern._02_factory_method._02_after.ShipFactory;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
