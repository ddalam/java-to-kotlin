package travelator.mobile;

public class BaselineApplication {

    private final BaselineUserPreferences preferences;

    public BaselineApplication(BaselineUserPreferences preferences) {
        this.preferences = preferences;
    }

    public void showWelcome() {
        final BaselineWelcomeView baselineWelcomeView = new BaselineWelcomeView(preferences);
        System.out.println("baselineWelcomeView.getPreferences : " + baselineWelcomeView.getPreferences());
        System.out.println("baselineWelcomeView.getPreferences 22 : " + System.identityHashCode(baselineWelcomeView.getPreferences()));
        baselineWelcomeView.show();
    }

    public void editPreferences() {
        final BaselinePreferencesView baselinePreferencesView = new BaselinePreferencesView(preferences);
        System.out.println("baselinePreferencesView.getPreferences : " + baselinePreferencesView.getPreferences());
        System.out.println("baselinePreferencesView.getPreferences : " + System.identityHashCode(baselinePreferencesView.getPreferences()));
        baselinePreferencesView.show();
    }
}