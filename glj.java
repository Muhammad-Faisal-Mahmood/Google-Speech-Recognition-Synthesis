/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public final class glj {
    public final Set a;
    public final long b;
    public final gto c;

    public glj() {
        throw null;
    }

    public glj(Set set, long l2, gto gto2) {
        this.a = set;
        this.b = l2;
        if (gto2 != null) {
            this.c = gto2;
            return;
        }
        throw new NullPointerException("Null ignoreFirstConstraintTime");
    }

    public static glj a(glj object, glj object2) {
        fxf.A(((glj)object).a.equals(((glj)object2).a));
        HashSet hashSet = new HashSet();
        Set set = ((glj)object).a;
        gsl gsl2 = gsl.a;
        fxf.n(set, hashSet);
        long l2 = Math.min(((glj)object).b, ((glj)object2).b);
        object = ((glj)object).c;
        boolean bl2 = ((gto)object).g();
        object2 = ((glj)object2).c;
        if (bl2 && ((gto)object2).g()) {
            object = gto.i(Math.min((Long)((gto)object).c(), (Long)((gto)object2).c()));
        } else if (!((gto)object).g()) {
            object = gsl2;
            if (((gto)object2).g()) {
                object = object2;
            }
        }
        return new glj(hashSet, l2, (gto)object);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof glj) {
            object = (glj)object;
            if (this.a.equals(((glj)object).a) && this.b == ((glj)object).b && this.c.equals(((glj)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        long l2 = this.b;
        gto gto2 = this.c;
        return ((n2 ^ 0xF4243) * 1000003 ^ (int)(l2 ^ l2 >>> 32)) * 1000003 ^ gto2.hashCode();
    }

    public final String toString() {
        Object object = this.c;
        String string = this.a.toString();
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("SyncSchedule{constraints=");
        stringBuilder.append(string);
        stringBuilder.append(", nextSyncTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(", ignoreFirstConstraintTime=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

