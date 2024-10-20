/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.util.Locale;

public final class brx
extends bsa {
    public static final gzx a;

    static {
        int n2 = gzx.d;
        a = gzx.j("brx", "cmn", "doi", "fil", "kok", "mai", "mni", "sat", "yue");
    }

    public brx(String string) {
        super(string);
    }

    public brx(String string, String string2) {
        super(string, string2);
    }

    public brx(String string, String string2, String string3) {
        super(string, string2, string3);
    }

    public brx(Locale locale) {
        super(locale);
    }

    @Override
    protected final void a() {
        Object object = this.b.getLanguage();
        if (((String)object).length() != 2 && !a.contains(object)) {
            throw new IllegalArgumentException("Expected an iso2 language code but got:".concat(String.valueOf(this.b.getLanguage())));
        }
        object = this.b.getCountry();
        if (((String)object).length() != 2 && ((String)object).length() != 0 && !TextUtils.isDigitsOnly((CharSequence)object)) {
            throw new IllegalArgumentException("Expected an iso2 country code but got:".concat(String.valueOf(this.b.getCountry())));
        }
        object = this.b;
        if (brz.h((Locale)object).equals(object)) {
            return;
        }
        throw new IllegalArgumentException("Expected it to be normalized :(");
    }
}

