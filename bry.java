/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.MissingResourceException;

public final class bry
extends bsa {
    public bry(Locale locale) {
        super(locale);
    }

    public static gto b(Locale locale) {
        try {
            locale = new Locale(locale.getISO3Language(), locale.getISO3Country());
        }
        catch (MissingResourceException missingResourceException) {
            return gsl.a;
        }
        return gto.i(new bry(locale));
    }

    @Override
    protected final void a() {
        if (this.b.getLanguage().length() == 3) {
            String string = this.b.getCountry();
            if (string.length() != 3 && string.length() != 0) {
                throw new IllegalArgumentException("Expected an iso3 country code but got:".concat(String.valueOf(this.b.getCountry())));
            }
            return;
        }
        throw new IllegalArgumentException("Expected an iso3 language code but got:".concat(String.valueOf(this.b.getLanguage())));
    }
}

