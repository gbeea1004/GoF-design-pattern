package geon.hee.gofdesignpattern.abstractfactory._01_before;

import geon.hee.gofdesignpattern.abstractfactory._02_after.Ship;
import geon.hee.gofdesignpattern.abstractfactory._02_after.white.normal.WhiteAnchor;
import geon.hee.gofdesignpattern.abstractfactory._02_after.white.normal.WhiteWheel;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
