/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class gab {
    public final Object a;
    public final gam b;

    public gab() {
        throw null;
    }

    public gab(Object object, gam gam2) {
        this.a = object;
        if (gam2 != null) {
            this.b = gam2;
            return;
        }
        throw new NullPointerException("Null accountData");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gab) {
            object = (gab)object;
            if (fvd.s((Map)this.a, ((gab)object).a) && this.b.equals(((gab)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        gam gam2 = this.b;
        if (gam2.B()) {
            n2 = gam2.i();
        } else {
            int n4;
            n2 = n4 = gam2.memoizedHashCode;
            if (n4 == 0) {
                gam2.memoizedHashCode = n2 = gam2.i();
            }
        }
        return (n3 ^ 0xF4243) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.b;
        String string = String.valueOf(this.a);
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("ResultAndAccountData{result=");
        stringBuilder.append(string);
        stringBuilder.append(", accountData=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

