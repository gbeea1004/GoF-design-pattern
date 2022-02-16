package geon.hee.gofdesignpattern.singleton.step2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @DisplayName("static inner 클래스 방식으로 싱글턴 구현")
    @Test
    void sameInstanceTest() {
        Settings1 instance1 = Settings1.getInstance();
        Settings1 instance2 = Settings1.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }

    @DisplayName("리플랙션으로 싱글턴을 깨트릴 수 있다")
    @Test
    void reflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings1 instance = Settings1.getInstance();

        Constructor<Settings1> constructor = Settings1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings1 reflectionInstance = constructor.newInstance();

        assertThat(instance).isNotSameAs(reflectionInstance);
    }

    @DisplayName("Enum 은 리플렉션으로 만들 수 없다")
    @Test
    void reflectionSame() {
        Settings4 instance = Settings4.INSTANCE;
        AtomicReference<Settings4> instanceNew = null;

        Constructor<?>[] declaredConstructors = Settings4.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            // enum 은 리플렉션으로 만들 수 없도록 막아놨다
            // 따라서 안전하지만 단점은 인스턴스가 미리 만들어진다는 것이다, 상속 불가 (Enum 끼리는 상속 가능)
            assertThrows(IllegalAccessException.class, () -> instanceNew.set((Settings4) constructor.newInstance("INSTANCE")));
        }

        assertThat(instance).isNotSameAs(instanceNew);
    }

    @DisplayName("직렬화, 역직렬화로 싱글턴을 깨트릴 수 있다")
    @Test
    void serialization() throws IOException, ClassNotFoundException {
        Settings2 instance = Settings2.getInstance();
        Settings2 serializationInstance = null;

        // 직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(instance);
        }

        // 역직렬화
        // 역직렬화 시에는 생성자를 통해서 만들어 줌
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            serializationInstance = (Settings2) in.readObject();
        }

        assertThat(instance).isNotSameAs(serializationInstance);
    }

    @DisplayName("직렬화, 역직렬화 시 readResolve 를 구현하여 싱글턴 깨짐을 대응할 수 있다")
    @Test
    void serializationSameInstance() throws IOException, ClassNotFoundException {
        Settings3 instance = Settings3.getInstance();
        Settings3 serializationInstance = null;

        // 직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(instance);
        }

        // 역직렬화
        // 역직렬화 시에는 생성자를 통해서 만들어 줌
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            serializationInstance = (Settings3) in.readObject();
        }

        assertThat(instance).isSameAs(serializationInstance);
    }
}
