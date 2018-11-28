package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void start(){
        System.out.println("START!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");

        greeting = new Greeting();
    }

    @Test
    void helloWorld() {

        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {

        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void helloWorld2() {

        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown(){
        System.out.println("In After Each...");
    }

    @AfterAll
    public static void end(){
        System.out.println("FINISH!");
    }

}