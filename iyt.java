/*
 * Decompiled with CFR 0.152.
 */
public final class iyt {
    public boolean a;
    private boolean b;

    public iyt() {
        iyu iyu2 = iyu.a;
        this.b = iyu2.b;
        this.a = iyu2.c;
    }

    public final iyu a() {
        return new iyu(this.b, this.a);
    }

    public final void b() {
        this.b = true;
    }
}

