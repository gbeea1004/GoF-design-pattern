package geon.hee.gofdesignpattern._02_factory_method._02_after;

import org.springframework.util.StringUtils;

/**
 * 기능을 확장할 때 기존 Factory 가 변경되지 않음 -> OCP 만족
 * product 와 creator 간의 느슨한 결합 (Loosely coupling)
 * 단점 : 각자의 역할을 나누다보니 클래스가 늘어남
 * 참고 : default 메소드는 자바 8, private 메소드는 자바 9 부터 지원
 *
 */
public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);

        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("이메일을 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
        System.out.println(email + " 로 메일 송신 완료");
    }
}
