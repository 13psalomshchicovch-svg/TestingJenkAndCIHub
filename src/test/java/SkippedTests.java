import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simply")
public class SkippedTests {

    @Disabled
    @Test
    void test1(){
        assertTrue(true);
    }

    @Disabled("Some reason")
    @Test
    void test2(){
        assertTrue(true);
    }

}
