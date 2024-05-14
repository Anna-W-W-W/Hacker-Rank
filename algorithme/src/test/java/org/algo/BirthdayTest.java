package org.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class BirthdayTest {
    @Test
    public void testBirthday() {
        Birthday birthday = new Birthday();
        List<Integer> chocolate = new ArrayList<>(List.of(2, 2, 1, 3, 2));
        assertEquals(1, birthday.birthday(chocolate, 3, 2), "Should find 2 valid segments");
    }
}
