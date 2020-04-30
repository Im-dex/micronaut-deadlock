package deadlock.example;

import io.micronaut.test.annotation.MicronautTest;

import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class DeadlockTest {
    @Inject
    DeadlockProducer deadlockProducer;

    @Test
    void test() {
        assert !deadlockProducer.method().isBlank();
    }
}
