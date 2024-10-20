/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public abstract class hvf
implements hym {
    private static final hwj a;

    static {
        Object object = hwj.a;
        object = hyo.a;
        a = hwj.a;
    }

    private static final void j(hyf hyf2) {
        if (hyf2 != null && !hyf2.v()) {
            throw new hzc().a();
        }
    }

    public final hyf a(InputStream object, hwj object2) {
        object = hvy.K((InputStream)object);
        object2 = this.i((hvy)object, (hwj)object2);
        ((hvy)object).z(0);
        hvf.j((hyf)object2);
        return object2;
    }

    public final hyf b(byte[] object, int n2, int n3, hwj hwj2) {
        object = this.c((byte[])object, n2, n3, hwj2);
        hvf.j((hyf)object);
        return object;
    }

    public hyf c(byte[] byArray, int n2, int n3, hwj hwj2) {
        throw null;
    }
}

