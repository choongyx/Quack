import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadlineTest {
    @Test
    public void dummyTest(){
        Deadline test = new Deadline("Return book", "12/12/2019 1200");
        assertEquals("[D][" + "\u2718" + "] Return book (by: 12/12/2019 1200)", test.toString());
        assertEquals("D | " + "\u2718" + " | Return book | 12/12/2019 1200", test.stringForAppend());
    }
}