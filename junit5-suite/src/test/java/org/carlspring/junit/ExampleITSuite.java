package org.carlspring.junit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * @author carlspring
 */
@RunWith(JUnitPlatform.class)
@IncludeTags({ "foo" })
@SelectPackages("org.carlspring.junit")
public class ExampleITSuite
{

}
