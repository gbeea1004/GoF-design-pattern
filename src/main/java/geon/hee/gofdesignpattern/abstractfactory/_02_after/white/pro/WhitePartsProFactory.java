package geon.hee.gofdesignpattern.abstractfactory._02_after.white.pro;

import geon.hee.gofdesignpattern.abstractfactory._02_after.Anchor;
import geon.hee.gofdesignpattern.abstractfactory._02_after.ShipPartsFactory;
import geon.hee.gofdesignpattern.abstractfactory._02_after.Wheel;

public class WhitePartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
