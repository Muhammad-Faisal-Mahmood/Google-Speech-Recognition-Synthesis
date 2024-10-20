/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public final class cuz {
    public static final cuz a;
    public static final cuz b;
    public static final cuz c;
    private final boolean d;
    private final hav e;

    static {
        ddt ddt2 = cuz.a();
        ddt2.e(EnumSet.noneOf(cuy.class));
        ddt2.d(false);
        a = ddt2.c();
        ddt2 = cuz.a();
        ddt2.e(EnumSet.of(cuy.a));
        ddt2.d(true);
        b = ddt2.c();
        ddt2 = cuz.a();
        ddt2.e(EnumSet.of(cuy.a));
        ddt2.d(false);
        c = ddt2.c();
    }

    public cuz() {
        throw null;
    }

    public cuz(boolean bl2, hav hav2) {
        this.d = bl2;
        this.e = hav2;
    }

    public static ddt a() {
        ddt ddt2 = new ddt();
        ddt2.d(false);
        return ddt2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cuz) {
            object = (cuz)object;
            if (this.d == ((cuz)object).d && this.e.equals(((cuz)object).e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = true != this.d ? 1237 : 1231;
        return (n2 ^ 0xF4243) * 1000003 ^ this.e.hashCode();
    }

    public final String toString() {
        String string = String.valueOf(this.e);
        StringBuilder stringBuilder = new StringBuilder("DownloadConstraints{requireUnmeteredNetwork=");
        stringBuilder.append(this.d);
        stringBuilder.append(", requiredNetworkTypes=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

