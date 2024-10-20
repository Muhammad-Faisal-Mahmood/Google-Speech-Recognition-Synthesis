/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public final class jjc
extends kmp {
    public static final Logger a = Logger.getLogger(jjc.class.getName());
    public static final jgp b = new jjn(jeb.o, 0);
    public static final ive c = new jjb();
    private static final iuw t = iuw.b;
    private static final iug u = iug.a;
    private static final long v = TimeUnit.SECONDS.toMillis(120L);
    final List d;
    public final List e;
    public final List f;
    public ive g;
    public jgp h;
    public iuw i;
    public iug j;
    long k;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    ivk p;
    public final jeq q;
    public final dml r = new dml(null, null);
    kmp s;

    public jjc(jeq object) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = c;
        this.h = b;
        this.i = t;
        this.j = u;
        this.k = v;
        this.s = iut.c;
        this.p = ivk.b;
        this.q = object;
        object = dml.Q().E().iterator();
        while (object.hasNext()) {
            ((iuh)object.next()).b();
        }
    }
}

