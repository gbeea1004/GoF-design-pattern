package geon.hee.gofdesignpattern._03_abstract_factory._02_after.white.normal;

import geon.hee.gofdesignpattern._03_abstract_factory._02_after.Anchor;
import geon.hee.gofdesignpattern._03_abstract_factory._02_after.ShipPartsFactory;
import geon.hee.gofdesignpattern._03_abstract_factory._02_after.Wheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
