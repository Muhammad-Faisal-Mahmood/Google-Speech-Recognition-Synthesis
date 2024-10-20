/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

public final class fsd
implements Closeable {
    public final Object a;
    private final int b;

    public /* synthetic */ fsd(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        int n2 = this.b;
        boolean bl2 = true;
        if (n2 != 0) {
            ((fsc)this.a).d = true;
            return;
        }
        Object object = this.a;
        Object object2 = ((fsi)object).h;
        synchronized (object2) {
            n2 = ((fsi)object).k;
            if (n2 <= 0) {
                bl2 = false;
            }
            fxf.C(bl2, "Refcount went negative!", n2);
            n2 = ((fsi)object).k;
            ((fsi)object).k = n2 - 1;
            ((fsi)object).c();
            return;
        }
    }
}

