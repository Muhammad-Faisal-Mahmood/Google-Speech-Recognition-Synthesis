/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutionException;

public final class cru
implements hpb {
    final Object a;
    final Object b;
    final Object c;
    private final int d;

    public cru(bzo bzo2, hpn hpn2, bzb bzb2, int n2) {
        this.d = n2;
        this.a = bzo2;
        this.b = hpn2;
        this.c = bzb2;
    }

    public cru(giu giu2, po po2, Runnable runnable, int n2) {
        this.d = n2;
        this.c = po2;
        this.b = runnable;
        this.a = giu2;
    }

    @Override
    public final void a(Throwable object) {
        if (this.d != 0) {
            ((po)this.c).d((Throwable)object);
            object = this.b;
            ((giu)this.a).i((Runnable)object);
            return;
        }
        if (this.b.isCancelled()) {
            ((cld)((bzb)((bzb)this.c).a).a).n(null);
            return;
        }
        if (object instanceof Exception) {
            Object object2 = this.a;
            object = (Exception)object;
            ((bzo)object2).b((Exception)object);
            return;
        }
        Object object3 = this.a;
        object = new ExecutionException((Throwable)object);
        ((bzo)object3).b((Exception)object);
    }

    @Override
    public final void b(Object object) {
        if (this.d != 0) {
            ((po)this.c).c(object);
            object = this.b;
            ((giu)this.a).i((Runnable)object);
            return;
        }
        ((bzo)this.a).c(object);
    }
}

