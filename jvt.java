/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.LockSupport;

public abstract class jvt
extends juy {
    private long a;
    public joy d;
    private boolean e;

    private static final long bz(boolean bl2) {
        if (bl2) {
            return 0x100000000L;
        }
        return 1L;
    }

    public static /* synthetic */ void s(jvt jvt2) {
        jvt2.l(false);
    }

    public static /* synthetic */ void t(jvt jvt2) {
        jvt2.n(false);
    }

    protected abstract Thread e();

    protected void i(long l2, jvw jvw2) {
        jvg.a.v(l2, jvw2);
    }

    public void j() {
        throw null;
    }

    public long k() {
        throw null;
    }

    public final void l(boolean bl2) {
        long l2;
        this.a = l2 = this.a - jvt.bz(bl2);
        if (l2 <= 0L) {
            bl2 = jve.a;
            if (this.e) {
                this.j();
            }
        }
    }

    public final void m(jvm jvm2) {
        joy joy2;
        joy joy3 = joy2 = this.d;
        if (joy2 == null) {
            this.d = joy3 = new joy();
        }
        joy3.addLast(jvm2);
    }

    public final void n(boolean bl2) {
        this.a += jvt.bz(bl2);
        if (!bl2) {
            this.e = true;
        }
    }

    public final boolean o() {
        return this.a >= jvt.bz(true);
    }

    public final boolean p() {
        joy joy2 = this.d;
        if (joy2 != null) {
            return joy2.isEmpty();
        }
        return true;
    }

    public final boolean q() {
        Object object = this.d;
        if (object != null && (object = (jvm)((joy)object).c()) != null) {
            ((jvm)object).run();
            return true;
        }
        return false;
    }

    protected final void r() {
        Thread thread = this.e();
        if (Thread.currentThread() != thread) {
            LockSupport.unpark(thread);
        }
    }
}

