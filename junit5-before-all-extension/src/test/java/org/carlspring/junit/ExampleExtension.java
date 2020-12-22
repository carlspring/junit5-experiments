package org.carlspring.junit;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.extension.ExtensionContext.Namespace.GLOBAL;

/**
 * @author carlspring
 */
public class ExampleExtension
        implements BeforeAllCallback,
                   ExtensionContext.Store.CloseableResource
{

    private final Logger LOGGER = LoggerFactory.getLogger(ExampleExtension.class);

    private static boolean started = false;


    @Override
    public void beforeAll(ExtensionContext context)
    {
        if (!started)
        {
            started = true;
            // Your "before all tests" startup logic goes here
            // The following line registers a callback hook when the root test context is shut down
            context.getRoot().getStore(GLOBAL).put("any unique name", this);

            LOGGER.error("Lift-off!!!");
        }
    }

    @Override
    public void close()
    {
        // Your "after all tests" logic goes here
    }

}
