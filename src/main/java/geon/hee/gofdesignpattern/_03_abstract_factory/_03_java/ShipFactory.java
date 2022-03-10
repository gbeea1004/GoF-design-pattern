package geon.hee.gofdesignpattern._03_abstract_factory._03_java;

import geon.hee.gofdesignpattern._03_abstract_factory._02_after.Ship;
import geon.hee.gofdesignpattern._03_abstract_factory._02_after.white.normal.WhiteAnchor;
import geon.hee.gofdesignpattern._03_abstract_factory._02_after.white.normal.WhiteWheel;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Ship();
        ship.setWheel(new WhiteWheel());
        ship.setAnchor(new WhiteAnchor());
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
