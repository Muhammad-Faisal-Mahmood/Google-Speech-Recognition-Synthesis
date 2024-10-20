/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

final class jzz
extends jqs
implements jro {
    int a;
    final jyx[] b;
    final int c;
    final AtomicInteger d;
    final jxy e;

    public jzz(jyx[] jyxArray, int n2, AtomicInteger atomicInteger, jxy jxy2, jqb jqb2) {
        this.b = jyxArray;
        this.c = n2;
        this.d = atomicInteger;
        this.e = jxy2;
        super(2, jqb2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        Throwable throwable2;
        block7: {
            block6: {
                int n2;
                jqh jqh2 = jqh.a;
                if (this.a != 0) {
                    try {
                        jns.ak(object);
                        break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                jns.ak(object);
                {
                    object = this.b;
                    n2 = this.c;
                }
                object = object[n2];
                {
                    jzy jzy2 = new jzy(this.e, n2);
                    this.a = 1;
                    object = object.a(jzy2, this);
                    if (object != jqh2) break block6;
                    return jqh2;
                }
            }
            if (this.d.decrementAndGet() != 0) return jon.a;
            jns.al(this.e);
            return jon.a;
        }
        if (this.d.decrementAndGet() != 0) {
            throw throwable2;
        }
        jns.al(this.e);
        throw throwable2;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new jzz(this.b, this.c, this.d, this.e, jqb2);
    }
}

