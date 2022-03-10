package geon.hee.gofdesignpattern._01_singleton.step1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Settings {

    /**
     * volatile : 변수를 메인 메모리에 저장, cpu 캐시를 쓰지 않는다.
     */
    private static volatile Settings instance;

    /**
     * Double-checked locking
     */
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
