package geon.hee.gofdesignpattern._07_bridge._02_after;

import geon.hee.gofdesignpattern._07_bridge._01_before.Champion;
import geon.hee.gofdesignpattern._07_bridge._02_after.champion.아리;
import geon.hee.gofdesignpattern._07_bridge._02_after.skin.KDA;

/**
 * 브릿지 패턴
 * - 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴
 * 장점
 * - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다.
 * - 추상적인 코드와 구체적인 코드를 분리할 수 있다.
 * 단점
 * - 계층 구조가 늘어나 복잡도가 증가할 수 있다.
 */
public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();
    }
}
