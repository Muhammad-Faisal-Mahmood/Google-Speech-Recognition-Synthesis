/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;

abstract class cbw
extends cfu {
    private static final WeakReference a = new WeakReference<Object>(null);
    private WeakReference b = a;

    public cbw(byte[] byArray) {
        super(byArray);
    }

    protected abstract byte[] b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final byte[] x() {
        synchronized (this) {
            Object object;
            byte[] byArray = object = (byte[])this.b.get();
            if (object == null) {
                byArray = this.b();
                object = new WeakReference;
                object(byArray);
                this.b = object;
            }
            return byArray;
        }
    }
}

