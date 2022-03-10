package geon.hee.gofdesignpattern._01_singleton.step2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Settings1 {

    /**
     * static inner 클래스 방식 (holder idiom : https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom)
     *
     * getInstance() 로 호출 될 때 SettingsHolder 의 INSTANCE 가 만들어지므로 효율적이고 멀티 쓰레드에 안전
     */
    private static class SettingsHolder {
        private static final Settings1 INSTANCE = new Settings1();
    }

    public static Settings1 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
