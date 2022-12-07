package travelator.mobile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaselineApplicationTest {

    @Test
    void sdfsdf() {
        // given
        final BaselineUserPreferences baselineUserPreferences = new BaselineUserPreferences();
        final BaselineApplication baselineApplication = new BaselineApplication(baselineUserPreferences);

        baselineApplication.showWelcome();
        baselineApplication.editPreferences();

        // when
        baselineUserPreferences.setGreeting("change greeting");
        baselineApplication.showWelcome();
        baselineApplication.editPreferences();

        // then

    }

}