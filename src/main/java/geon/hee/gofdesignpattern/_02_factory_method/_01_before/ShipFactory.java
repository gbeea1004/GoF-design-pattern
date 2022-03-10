package geon.hee.gofdesignpattern._02_factory_method._01_before;

import org.springframework.util.StringUtils;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("이메일을 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("⚓️");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("🛳");
        }

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
        System.out.println(email + " 로 메일 송신 완료");
    }
}
