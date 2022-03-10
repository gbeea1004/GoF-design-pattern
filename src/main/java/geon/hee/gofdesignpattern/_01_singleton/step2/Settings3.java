package geon.hee.gofdesignpattern._01_singleton.step2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Settings3 implements Serializable {

    private static class SettingsHolder {
        private static final Settings3 INSTANCE = new Settings3();
    }

    public static Settings3 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * 역직렬화 시 해당 메서드를 사용하게 됨
     */
    protected Object readResolve() {
        return getInstance();
    }
}
