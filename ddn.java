/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class ddn
implements Comparable {
    private static final guf a = guf.b(':').d().a();

    public static ddn d(String string) {
        List list = a.g(string);
        if (list.size() == 2) {
            return new dco((String)list.get(0), (String)list.get(1));
        }
        throw new ddj("Invalid input: ".concat(String.valueOf(string)));
    }

    public static final String g(String string, String string2) {
        return a.ao(string2, string, ":");
    }

    public abstract String a();

    public abstract String b();

    public final int c(ddn ddn2) {
        int n2 = this.b().compareTo(ddn2.b());
        if (n2 == 0) {
            return this.a().compareTo(ddn2.a());
        }
        return n2;
    }

    public final String e() {
        return this.f(true);
    }

    public final String f(boolean bl2) {
        String string = this.b();
        String string2 = dec.m(string) ? "redacted" : this.a();
        if (bl2) {
            return ddn.g(string, string2);
        }
        return string2;
    }

    public String toString() {
        return ddn.g(this.b(), this.a());
    }
}

