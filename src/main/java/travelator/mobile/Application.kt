package travelator.mobile

class Application(
    private var preferences: UserPreferences
) {
    fun showWelcome() {
        WelcomeView(preferences).show()
    }

    fun editPreferences() {
        preferences = PreferencesView().showModal(preferences) // 불변 객체에 대한 가변 참조를 공유
    }
}