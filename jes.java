/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class jes
implements jge {
    final jcu a;
    boolean b;
    final jeu c;

    public jes(jeu jeu2, jcu jcu2) {
        this.c = jeu2;
        this.b = false;
        this.a = jcu2;
    }

    @Override
    public final void a(boolean bl2) {
        this.c.g(this.a, bl2);
    }

    @Override
    public final void b() {
        this.c.d.a(2, "READY");
        jel jel2 = new jel(this, 3);
        this.c.f.execute(jel2);
    }

    @Override
    public final void c(iyh object) {
        ivn ivn2 = this.a.c();
        String string = jeu.k((iyh)object);
        this.c.d.b(2, "{0} SHUTDOWN with {1}", ivn2, string);
        this.b = true;
        object = new jdg(this, object, 10);
        this.c.f.execute((Runnable)object);
    }

    @Override
    public final void d() {
        fxf.B(this.b, "transportShutdown() must be called before transportTerminated().");
        Object object = this.a.c();
        this.c.d.b(2, "{0} Terminated", object);
        ivk.c(this.c.c.f, this.a);
        this.c.g(this.a, false);
        object = this.c.e.iterator();
        if (!object.hasNext()) {
            object = this.c;
            jel jel2 = new jel(this, 4);
            ((jeu)object).f.execute(jel2);
            return;
        }
        object = (fvc)object.next();
        throw null;
    }

    @Override
    public final void e() {
        Iterator iterator = this.c.e.iterator();
        if (!iterator.hasNext()) {
            return;
        }
        iterator = (fvc)iterator.next();
        throw null;
    }
}

