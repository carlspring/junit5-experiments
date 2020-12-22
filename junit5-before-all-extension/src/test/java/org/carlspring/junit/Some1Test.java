package org.carlspring.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author carlspring
 */
@Tag("foo")
@ExtendWith({ ExampleExtension.class })
public class Some1Test
{

    @Test
    public void testThis()
    {
        // The best test. EVER.
        assertEquals(1, 1);
    }

}
