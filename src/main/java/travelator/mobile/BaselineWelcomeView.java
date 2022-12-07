package travelator.mobile;

public class BaselineWelcomeView extends BaselineView {

    private final BaselineUserPreferences preferences;

    public BaselineWelcomeView(BaselineUserPreferences preferences) {
        this.preferences = preferences;
    }

    public BaselineUserPreferences getPreferences() {
        return preferences;
    }
}