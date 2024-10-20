/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Arrays;

public final class dkt {
    private static final int[] g = new int[0];
    private static final String[] h = new String[0];
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    private final dks i;

    public dkt(String string, String string2, int n2, long l2, dks dks2) {
        this(string, string2, n2, l2, g, h, dks2);
    }

    public dkt(String string, String string2, int n2, long l2, int[] nArray, String[] stringArray, dks dks2) {
        this.b = string;
        this.c = string2;
        this.d = n2;
        this.a = l2;
        this.e = nArray;
        this.f = stringArray;
        this.i = dks2;
    }

    public static boolean a(Object object) {
        return object == null || object instanceof dlb;
        {
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dkt)) {
            return false;
        }
        object = (dkt)object;
        return Objects.equals(this.b, ((dkt)object).b) && Objects.equals(this.c, ((dkt)object).c) && this.d == ((dkt)object).d && this.a == ((dkt)object).a && Arrays.equals(this.e, ((dkt)object).e) && Arrays.equals(this.f, ((dkt)object).f) && Objects.equals(this.i, ((dkt)object).i);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.a, Arrays.hashCode(this.e), Arrays.hashCode(this.f), this.i);
    }
}

