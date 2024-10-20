/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class my {
    public boolean b = false;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public jqz d;

    public void a() {
    }

    public abstract void b();

    public void c(mk mk2) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public final void e(ml ml2) {
        this.c.add(ml2);
    }

    public final void f(ml ml2) {
        this.c.remove(ml2);
    }

    public final void g(boolean bl2) {
        this.b = bl2;
        jqz jqz2 = this.d;
        if (jqz2 != null) {
            jqz2.a();
        }
    }
}

