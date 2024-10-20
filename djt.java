/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class djt {
    public final String a;

    public djt(String string) {
        this.a = string;
    }

    public static djt a(djt djt2, djt ... object) {
        object = new gtk("").d(fvd.y(Arrays.asList(object), new cxc(14)));
        return new djt(String.valueOf(djt2.a).concat((String)object));
    }

    public static djt b(Class object) {
        object = !fxf.P(null) ? new djt("null".concat(String.valueOf(((Class)object).getSimpleName()))) : new djt(((Class)object).getSimpleName());
        return object;
    }

    public static String c(djt djt2) {
        if (djt2 == null) {
            return null;
        }
        return djt2.a;
    }

    public final boolean equals(Object object) {
        if (object instanceof djt) {
            object = (djt)object;
            return this.a.equals(((djt)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

