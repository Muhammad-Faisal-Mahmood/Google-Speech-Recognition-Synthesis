/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class kgb {
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String e;
    public final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public kgb(String string, String string2, long l2, String string3, String string4, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.e = string;
        this.f = string2;
        this.g = l2;
        this.h = string3;
        this.i = string4;
        this.j = bl2;
        this.k = bl3;
        this.l = bl4;
        this.m = bl5;
    }

    public final boolean equals(Object object) {
        if (object instanceof kgb) {
            object = (kgb)object;
            if (jse.i(((kgb)object).e, this.e) && jse.i(((kgb)object).f, this.f) && ((kgb)object).g == this.g && jse.i(((kgb)object).h, this.h) && jse.i(((kgb)object).i, this.i) && ((kgb)object).j == this.j && ((kgb)object).k == this.k && ((kgb)object).l == this.l && ((kgb)object).m == this.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.e.hashCode();
        int n3 = this.f.hashCode();
        long l2 = this.g;
        String string = this.h;
        int n4 = (int)(l2 ^ l2 >>> 32);
        int n5 = string.hashCode();
        int n6 = this.i.hashCode();
        boolean bl2 = this.m;
        boolean bl3 = this.l;
        boolean bl4 = this.k;
        return ((((((((n2 + 527) * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + a.f(this.j)) * 31 + a.f(bl4)) * 31 + a.f(bl3)) * 31 + a.f(bl2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e);
        stringBuilder.append('=');
        stringBuilder.append(this.f);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                stringBuilder.append("; max-age=0");
            } else {
                stringBuilder.append("; expires=");
                Object object = new Date(this.g);
                object = ((DateFormat)kia.a.get()).format((Date)object);
                jse.d(object, "format(...)");
                stringBuilder.append((String)object);
            }
        }
        if (!this.m) {
            stringBuilder.append("; domain=");
            stringBuilder.append(this.h);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.i);
        if (this.j) {
            stringBuilder.append("; secure");
        }
        if (this.k) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }
}

