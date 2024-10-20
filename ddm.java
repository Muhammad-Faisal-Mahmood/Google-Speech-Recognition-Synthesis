/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class ddm {
    public static final ddm a = new ddl().a();
    public final hac b;

    public ddm() {
        throw null;
    }

    public ddm(hac hac2) {
        this.b = hac2;
    }

    public static void c(String string, String string2, ClassCastException classCastException) {
        ((hfk)((hfk)((hfk)ddd.a.h()).i(classCastException)).j("com/google/android/libraries/micore/superpacks/base/PropertyBag", "logTypeWarning", 127, "PropertyBag.java")).C("Failed to find a property for name %s with type %s, returning default value", string, string2);
    }

    public final Object a(String string) {
        return this.b.get(string);
    }

    public final Set b() {
        return this.b.l();
    }

    public final String d(String string) {
        Object object = this.b.get(string);
        if (object == null) {
            return null;
        }
        try {
            object = (String)object;
            return object;
        }
        catch (ClassCastException classCastException) {
            ddm.c(string, "String", classCastException);
            return null;
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ddm) {
            object = (ddm)object;
            return fvd.s(this.b, ((ddm)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 0xF4243;
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("PropertyBag{map=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

