/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 */
import android.os.LocaleList;
import java.util.Locale;

public final class tw {
    public static final tw a = tw.b(new Locale[0]);
    private final tx b;

    private tw(tx tx2) {
        this.b = tx2;
    }

    public static tw b(Locale ... localeArray) {
        return tw.d(new LocaleList(localeArray));
    }

    public static tw c(String stringArray) {
        if (stringArray != null && !stringArray.isEmpty()) {
            stringArray = stringArray.split(",", -1);
            int n2 = stringArray.length;
            Locale[] localeArray = new Locale[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                localeArray[i2] = Locale.forLanguageTag(stringArray[i2]);
            }
            return tw.b(localeArray);
        }
        return a;
    }

    public static tw d(LocaleList localeList) {
        return new tw(new tx(localeList));
    }

    public final int a() {
        return ag$$ExternalSyntheticApiModelOutline1.m(this.b.a);
    }

    public final String e() {
        return ag$$ExternalSyntheticApiModelOutline1.m(this.b.a);
    }

    public final boolean equals(Object object) {
        return object instanceof tw && this.b.equals(((tw)object).b);
    }

    public final Locale f(int n2) {
        return ag$$ExternalSyntheticApiModelOutline1.m(this.b.a, n2);
    }

    public final boolean g() {
        return ag$$ExternalSyntheticApiModelOutline1.m(this.b.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}

