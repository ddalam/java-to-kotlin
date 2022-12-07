package travelator.mobile;

import java.util.Currency;
import java.util.Locale;

public class BaselinePreferencesView extends BaselineView {

    private final BaselineUserPreferences preferences;
    private final BaselineGreetingPicker greetingPicker = new BaselineGreetingPicker();
    private final BaselineLocalePicker localePicker = new BaselineLocalePicker();
    private final BaselineCurrencyPicker currencyPicker = new BaselineCurrencyPicker();

    public BaselinePreferencesView(BaselineUserPreferences preferences) {
        this.preferences = preferences;
    }

    public BaselineUserPreferences getPreferences() {
        return preferences;
    }

    public void show() {
        greetingPicker.setGreeting(preferences.getGreeting());
        localePicker.setLocale(preferences.getLocale());
        currencyPicker.setCurrency(preferences.getCurrency());
        super.show();
    }

    protected void onGreetingChange() {
        preferences.setGreeting(greetingPicker.getGreeting());
    }

    protected void onLocaleChange() {
        preferences.setLocale(localePicker.getLocale());
    }

    protected void onCurrencyChange() {
        preferences.setCurrency(currencyPicker.getCurrency());
    }
}

class BaselineGreetingPicker {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}

class BaselineLocalePicker {
    private Locale locale;

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}

class BaselineCurrencyPicker {
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}