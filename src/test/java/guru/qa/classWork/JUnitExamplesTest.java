package guru.qa.classWork;

import org.junit.jupiter.api.*;

public class JUnitExamplesTest {
    @BeforeAll
    static void startUp() {
        System.out.println("Start UP");
    }

    @BeforeEach
    void startBrowser() {
        System.out.println("Start browser");
    }

    @Test
    void firstTest() {
        System.out.println(" - firstTest");
    }

    @Test
    void secondTest() {
        System.out.println(" - secondTest");
    }

    @AfterEach
    void stopBrowser() {
        System.out.println("Stop browser");
    }

    @AfterAll
    static void finishDown() {
        System.out.println("Finish Down UP");
    }
}
