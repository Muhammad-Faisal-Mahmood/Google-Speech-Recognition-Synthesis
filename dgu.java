/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dgu
implements Closeable {
    public final den a;
    public final deh b;
    public final File c;
    public final gtq d;
    public int e;
    public hqa f;
    public hpn g;
    public final dgv h;
    public final fkg i;
    public final dwm j;
    private final Runnable k;

    public dgu(dgv object, dwm dwm2, den den2, deh deh2, File file) {
        this.h = object;
        this.j = dwm2;
        this.k = object = new ai(object, (Object)den2, (Object)dwm2, 16, null);
        ((cxv)dwm2.c).c(object);
        this.a = den2;
        this.b = deh2;
        this.c = file;
        this.d = new cyl(this, 4);
        this.e = 0;
        this.f = null;
        this.i = new fkg(this, den2, file);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a() {
        synchronized (this) {
            den den2 = this.a;
            return (String)den2.g().get(Math.min(this.e, ((hct)den2.g()).c - 1));
        }
    }

    @Override
    public final void close() {
        ((CopyOnWriteArrayList)((cxv)this.j.c).b).remove(this.k);
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        String string2 = this.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

