package geon.hee.gofdesignpattern._07_bridge._02_after;

import geon.hee.gofdesignpattern._07_bridge._01_before.Champion;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DefaultChampion implements Champion {

    private Skin skin;

    private String name;

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s skillQ\n", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s skillW\n", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s skillE\n", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s skillR\n", skin.getName(), this.name);
    }
}
