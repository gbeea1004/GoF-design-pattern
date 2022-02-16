package geon.hee.gofdesignpattern.singleton.step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @DisplayName("Double-checked locking 방식으로 싱글턴 구현")
    @Test
    void sameInstanceTest() {
        Settings instance1 = Settings.getInstance();
        Settings instance2 = Settings.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }
}
