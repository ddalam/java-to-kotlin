package travelator.mobile;

import java.util.Currency;
import java.util.Locale;

public class BaselineUserPreferences {

    private String greeting;
    private Locale locale;
    private Currency currency;

    public BaselineUserPreferences() {
        this("Hello", Locale.UK, Currency.getInstance(Locale.UK));
    }

    public BaselineUserPreferences(String greeting, Locale locale, Currency currency) {
        this.greeting = greeting;
        this.locale = locale;
        this.currency = currency;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}