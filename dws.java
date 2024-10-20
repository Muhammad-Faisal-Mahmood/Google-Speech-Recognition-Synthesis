/*
 * Decompiled with CFR 0.152.
 */
public final class dws
implements gui {
    boolean a;
    Object b;
    final gui c;

    public dws(gui gui2) {
        this.c = gui2;
    }

    @Override
    public final Object a() {
        Object object;
        if (this.a) {
            return this.b;
        }
        this.b = object = this.c.a();
        this.a = true;
        return object;
    }
}

