/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Locale;

public abstract class bsa {
    public final Locale b;

    public bsa(String string) {
        this.b = new Locale(string);
        this.a();
    }

    public bsa(String string, String string2) {
        this.b = new Locale(string, string2);
        this.a();
    }

    public bsa(String string, String string2, String string3) {
        this.b = new Locale(string, string2, string3);
        this.a();
    }

    public bsa(Locale locale) {
        this.b = locale;
        this.a();
    }

    protected abstract void a();

    public final String c() {
        return this.b.getCountry();
    }

    public final String d() {
        return this.b.getDisplayName();
    }

    public final String e() {
        return this.b.getLanguage();
    }

    public final boolean equals(Object object) {
        if (!(object instanceof bsa)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        object = (bsa)object;
        return this.b.equals(((bsa)object).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        Serializable serializable = this.b;
        String string = ((Locale)serializable).getLanguage();
        if (((Locale)serializable).getCountry().isEmpty()) {
            return string;
        }
        String string2 = this.b.getCountry();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append("-");
        ((StringBuilder)serializable).append(string2);
        string2 = ((StringBuilder)serializable).toString();
        if (this.b.getVariant().isEmpty()) {
            return string2;
        }
        string = this.b.getVariant();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("-");
        ((StringBuilder)serializable).append(string);
        return ((StringBuilder)serializable).toString();
    }
}

