/*
 * Decompiled with CFR 0.152.
 */
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class guj
implements Serializable,
gui {
    private static final long serialVersionUID = 0L;
    final gui a;
    volatile transient boolean b;
    transient Object c;
    private transient jrw d = new jrw();

    public guj(gui gui2) {
        fxf.K(gui2);
        this.a = gui2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = new jrw();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        if (this.b) return this.c;
        jrw jrw2 = this.d;
        synchronized (jrw2) {
            Object object;
            if (this.b) return this.c;
            this.c = object = this.a.a();
            this.b = true;
            return object;
        }
    }

    public final String toString() {
        Object object;
        if (this.b) {
            object = String.valueOf(this.c);
            StringBuilder stringBuilder = new StringBuilder("<supplier that returned ");
            stringBuilder.append((String)object);
            stringBuilder.append(">");
            object = stringBuilder.toString();
        } else {
            object = this.a;
        }
        return a.ar(object, "Suppliers.memoize(", ")");
    }
}

