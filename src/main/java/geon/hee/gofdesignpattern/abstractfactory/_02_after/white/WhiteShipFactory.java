package geon.hee.gofdesignpattern.abstractfactory._02_after.white;

import geon.hee.gofdesignpattern.abstractfactory._02_after.Ship;
import geon.hee.gofdesignpattern.abstractfactory._02_after.ShipFactory;
import geon.hee.gofdesignpattern.abstractfactory._02_after.ShipPartsFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WhiteShipFactory implements ShipFactory {

    private final ShipPartsFactory shipPartsFactory;


    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
