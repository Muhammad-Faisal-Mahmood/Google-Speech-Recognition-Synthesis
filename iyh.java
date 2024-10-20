/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public final class iyh {
    public static final List a;
    public static final iyh b;
    public static final iyh c;
    public static final iyh d;
    public static final iyh e;
    public static final iyh f;
    public static final iyh g;
    public static final iyh h;
    public static final iyh i;
    public static final iyh j;
    public static final iyh k;
    static final iws l;
    static final iws m;
    private static final iww q;
    public final iye n;
    public final String o;
    public final Throwable p;

    static {
        Object object;
        TreeMap<Integer, iyh> treeMap = new TreeMap<Integer, iyh>();
        Object object2 = iye.values();
        int n2 = ((iye[])object2).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = object2[i2];
            Object object3 = treeMap.put(object.r, new iyh((iye)((Object)object), null, null));
            if (object3 == null) {
                continue;
            }
            object2 = ((iyh)object3).n.name();
            object = object.name();
            object3 = new StringBuilder("Code value duplication between ");
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append(" & ");
            ((StringBuilder)object3).append((String)object);
            throw new IllegalStateException(((StringBuilder)object3).toString());
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = iye.a.a();
        c = iye.b.a();
        d = iye.c.a();
        iye.d.a();
        e = iye.e.a();
        iye.f.a();
        iye.g.a();
        f = iye.h.a();
        iye.q.a();
        g = iye.i.a();
        h = iye.j.a();
        iye.k.a();
        iye.l.a();
        i = iye.m.a();
        j = iye.n.a();
        k = iye.o.a();
        iye.p.a();
        l = new iwv("grpc-status", false, new iyf());
        object = new iyg();
        q = object;
        m = new iwv("grpc-message", false, (iww)object);
    }

    private iyh(iye iye2, String string, Throwable throwable) {
        a.s((Object)iye2, "code");
        this.n = iye2;
        this.o = string;
        this.p = throwable;
    }

    public static iyh b(int n2) {
        List list;
        if (n2 >= 0 && n2 < (list = a).size()) {
            return (iyh)list.get(n2);
        }
        return d.e(a.af(n2, "Unknown code "));
    }

    public static iyh c(Throwable throwable) {
        a.s(throwable, "t");
        for (Throwable throwable2 = throwable; throwable2 != null; throwable2 = throwable2.getCause()) {
            if (throwable2 instanceof iyi) {
                return ((iyi)throwable2).a;
            }
            if (!(throwable2 instanceof iyj)) continue;
            return ((iyj)throwable2).a;
        }
        return d.d(throwable);
    }

    static String f(iyh object) {
        if (((iyh)object).o == null) {
            return ((iyh)object).n.toString();
        }
        String string = ((Object)((Object)((iyh)object).n)).toString();
        String string2 = ((iyh)object).o;
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    public final iyh a(String string) {
        String string2 = this.o;
        if (string2 == null) {
            return new iyh(this.n, string, this.p);
        }
        return new iyh(this.n, a.ao(string, string2, "\n"), this.p);
    }

    public final iyh d(Throwable throwable) {
        if (a.k(this.p, throwable)) {
            return this;
        }
        return new iyh(this.n, this.o, throwable);
    }

    public final iyh e(String string) {
        if (a.k(this.o, string)) {
            return this;
        }
        return new iyh(this.n, string, this.p);
    }

    public final boolean g() {
        return iye.a == this.n;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("code", this.n.name());
        gtn2.b("description", this.o);
        Throwable throwable = this.p;
        Object object = throwable;
        if (throwable != null) {
            object = new StringWriter();
            throwable.printStackTrace(new PrintWriter((Writer)object));
            object = ((StringWriter)object).toString();
        }
        gtn2.b("cause", object);
        return gtn2.toString();
    }
}

