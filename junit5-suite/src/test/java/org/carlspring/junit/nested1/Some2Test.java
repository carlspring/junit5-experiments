package org.carlspring.junit.nested1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author carlspring
 */
@Tag("foo")
public class Some2Test
{

    @Test
    public void testThis()
    {
        // The best test. EVER.
        assertEquals(1, 1);
    }

}
