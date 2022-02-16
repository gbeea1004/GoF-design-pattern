package geon.hee.gofdesignpattern.singleton.step2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 직렬화, 역직렬화
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Settings2 implements Serializable {

    private static class SettingsHolder {
        private static final Settings2 INSTANCE = new Settings2();
    }

    public static Settings2 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
