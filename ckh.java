/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class ckh
implements cco {
    public static final ckh b = new ckh();
    private final boolean c;
    private final boolean d;
    private final String e;
    private final boolean f;
    private final String g;
    private final String h;
    private final boolean i;
    private final Long j = null;
    private final Long k = null;

    private ckh() {
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = false;
        this.i = false;
        this.g = null;
        this.h = null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ckh)) {
            return false;
        }
        object = (ckh)object;
        boolean bl2 = ((ckh)object).c;
        bl2 = ((ckh)object).d;
        Object object2 = ((ckh)object).e;
        if (a.k(null, null)) {
            bl2 = ((ckh)object).f;
            bl2 = ((ckh)object).i;
            object2 = ((ckh)object).g;
            if (a.k(null, null)) {
                object2 = ((ckh)object).h;
                if (a.k(null, null)) {
                    object2 = ((ckh)object).j;
                    if (a.k(null, null)) {
                        object = ((ckh)object).k;
                        if (a.k(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bl2 = false;
        return Arrays.hashCode(new Object[]{bl2, bl2, null, bl2, bl2, null, null, null, null});
    }
}

