/*
 * Decompiled with CFR 0.152.
 */
import java.io.ObjectOutputStream;
import java.io.Serializable;

class hdt
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Object a;
    final Object b;

    public hdt(Object object) {
        this.a = object;
        this.b = this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object object = this.b;
        synchronized (object) {
            objectOutputStream.defaultWriteObject();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Object object = this.b;
        synchronized (object) {
            return this.a.toString();
        }
    }
}

