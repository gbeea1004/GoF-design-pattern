package geon.hee.gofdesignpattern.abstractfactory._02_after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class Ship {

    private Anchor anchor;
    private Wheel wheel;
}
