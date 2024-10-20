/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class cew {
    public Object d;
    public boolean e;
    final cfc f;

    public cew(cfc cfc2, Object object) {
        this.f = cfc2;
        this.d = object;
        this.e = false;
    }

    protected abstract void b();

    protected abstract void d();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            this.d = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        this.e();
        ArrayList arrayList = this.f.g;
        synchronized (arrayList) {
            this.f.g.remove(this);
            return;
        }
    }
}

