/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class gei {
    public static final geg a = new geh();
    public final long b;
    public final geg c;
    public final boolean d;
    public final gto e;
    public final gto f;

    public gei() {
        throw null;
    }

    public gei(long l2, geg geg2, boolean bl2, gto gto2, gto gto3) {
        this.b = l2;
        if (geg2 != null) {
            this.c = geg2;
            this.d = bl2;
            if (gto2 != null) {
                this.e = gto2;
                if (gto3 != null) {
                    this.f = gto3;
                    return;
                }
                throw new NullPointerException("Null maybeInstanceData");
            }
            throw new NullPointerException("Null maybeTopicData");
        }
        throw new NullPointerException("Null callbacks");
    }

    public final gei a(boolean bl2) {
        fxf.B(this.c instanceof gdn, "Non-BackgroundFetchCallbacks shouldn't be mutating around background fetch callbacks.");
        boolean bl3 = bl2 != this.d;
        fxf.B(bl3, "Double-open or double-close on background fetch callbacks.");
        gto gto2 = this.f;
        gto gto3 = this.e;
        geg geg2 = this.c;
        return new gei(this.b, geg2, bl2, gto3, gto2);
    }

    final gei b(ivu ivu2) {
        return new gei(this.b, this.c, this.d, gto.i(ivu2), gto.i(ivu2));
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gei) {
            object = (gei)object;
            if (this.b == ((gei)object).b && this.c.equals(((gei)object).c) && this.d == ((gei)object).d && this.e.equals(((gei)object).e) && this.f.equals(((gei)object).f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.b;
        int n2 = (int)(l2 ^ l2 >>> 32);
        int n3 = this.c.hashCode();
        int n4 = true != this.d ? 1237 : 1231;
        return ((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode();
    }

    public final String toString() {
        Serializable serializable = this.f;
        Object object = this.e;
        String string = this.c.toString();
        object = String.valueOf(object);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("SubscriptionCallbacksState{index=");
        ((StringBuilder)serializable).append(this.b);
        ((StringBuilder)serializable).append(", callbacks=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", openBackgroundFetch=");
        ((StringBuilder)serializable).append(this.d);
        ((StringBuilder)serializable).append(", maybeTopicData=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", maybeInstanceData=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

