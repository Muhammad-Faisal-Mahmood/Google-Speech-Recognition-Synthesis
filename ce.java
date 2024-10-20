/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class ce {
    final ArrayList d = new ArrayList();
    public int e;
    public int f;
    public int g;
    public int h;
    int i;
    boolean j;
    boolean k = true;
    String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    boolean s = false;
    ArrayList t;

    public abstract void b();

    public void c(int n2, be be2, String string, int n3) {
        throw null;
    }

    public boolean g() {
        throw null;
    }

    public abstract void h();

    public abstract void i();

    public void j(be be2) {
        throw null;
    }

    final void l(cd cd2) {
        this.d.add(cd2);
        cd2.d = this.e;
        cd2.e = this.f;
        cd2.f = this.g;
        cd2.g = this.h;
    }

    public final void m(be be2, String string) {
        this.c(0, be2, string, 1);
    }

    public final void n() {
        if (this.k) {
            this.j = true;
            this.l = null;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void o() {
        if (!this.j) {
            this.k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void p(int n2, be be2, String string) {
        if (n2 != 0) {
            this.c(n2, be2, string, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void q() {
        this.s = true;
    }

    public final void r(int n2, be be2) {
        this.p(n2, be2, null);
    }
}

