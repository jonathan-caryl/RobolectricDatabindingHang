package org.jonathancaryl.binding;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;
import static org.robolectric.Robolectric.buildActivity;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    @Before
    public void setup() {
        final ActivityController<MainActivity> activityController = buildActivity(MainActivity.class);
        activityController.setup();
    }

    @Test
    public void aTest() {
        assertTrue(true);
    }
}
