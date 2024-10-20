/*
 * Decompiled with CFR 0.152.
 */
public final class gul
implements gui {
    private static final gui a = new guk(0);
    private volatile gui b;
    private Object c;
    private final jrw d = new jrw();

    public gul(gui gui2) {
        fxf.K(gui2);
        this.b = gui2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        Object object = this.b;
        gui gui2 = a;
        if (object == gui2) return this.c;
        object = this.d;
        synchronized (object) {
            Object object2;
            if (this.b == gui2) return this.c;
            this.c = object2 = this.b.a();
            this.b = gui2;
            return object2;
        }
    }

    public final String toString() {
        Object object;
        Object object2 = object = this.b;
        if (object == a) {
            object = String.valueOf(this.c);
            object2 = new StringBuilder("<supplier that returned ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(">");
            object2 = ((StringBuilder)object2).toString();
        }
        return a.av(object2, "Suppliers.memoize(", ")");
    }
}

