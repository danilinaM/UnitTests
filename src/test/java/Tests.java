import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.Solution.makeStringSmall;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс с тестами на проверку")
public class Tests {

    @Test
    @DisplayName("Что-то должно произойти если....")
    public void checkOneSymbolInWord() {
        String str = makeStringSmall("Z");
        assertEquals("Z1", str);
    }

    @Test
    public void checkDuplicateSymbols() {
        String str = makeStringSmall("ZZABCDDDDDZZ");
        assertEquals("Z2A1B1C1D5Z2", str);
    }

    @Test
    public void checkSameSymbols() {
        assertEquals(makeStringSmall("ZZZ"), "Z3");
    }

    @Test
    public void checkEmptyLine() {
        String str = makeStringSmall("");
        assertEquals("", str);
    }

    @Test
    public void checkNumbers() {
        String str = makeStringSmall("123");
        assertEquals("112131", str);
    }

    @Test
    public void checkSpecSymbols() {
        String str = makeStringSmall("+~!-");
        assertEquals("+1~1!1-1", str);
    }

    @Test
    public void checkSpecSpaces() {
        String str = makeStringSmall("   ");
        assertEquals(" 3", str);
    }
}

