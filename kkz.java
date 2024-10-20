/*
 * Decompiled with CFR 0.152.
 */
import java.io.InterruptedIOException;

final class kkz
implements kgn {
    final kla a;
    private boolean b;

    public kkz(kla kla2) {
        this.a = kla2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final kgv a(kid object) {
        kgt kgt2;
        Object object2;
        Object object3 = this.a.f;
        synchronized (object3) {
            object2 = this.a;
            ((kla)object2).h = false;
            ((kla)object2).i = ((kid)object).b().a.b;
            ((kla)object2).j = ((kid)object).b().d;
            ((kla)object2).f.notifyAll();
            try {
                while (!this.b) {
                    this.a.f.wait();
                }
                // MONITOREXIT @DISABLED, blocks:[1, 4] lbl12 : MonitorExitStatement: MONITOREXIT : var2_4
                object2 = ((kid)object).b;
                kgt2 = ((kgs)object2).d;
                object3 = object2;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                throw interruptedIOException;
            }
        }
        if (kgt2 instanceof klc) {
            object3 = ((klc)kgt2).d((kgs)object2);
        }
        object3 = ((kid)object).a((kgs)object3);
        object = this.a.f;
        synchronized (object) {
            object2 = this.a;
            ((kla)object2).g = object3;
            kla.b((kla)object2, ((kgv)object3).a.a.g());
            return object3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object = this.a.f;
        synchronized (object) {
            this.b = true;
            this.a.f.notifyAll();
            return;
        }
    }
}

