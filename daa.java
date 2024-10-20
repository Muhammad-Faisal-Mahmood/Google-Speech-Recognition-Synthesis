/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class daa
implements fqz,
djg,
czx {
    public final Executor a;
    public final HashMap b;
    public final HashMap c;
    private final czv d;
    private final cqq e;

    public daa(Executor executor) {
        cqq cqq2 = new cqq();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = cqq2;
        this.a = new hpz(executor);
        this.d = new czv(executor);
    }

    @Override
    public final fqy a(Uri uri) {
        return this.b(uri);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final fqy b(Uri object) {
        synchronized (daa.class) {
            String string = (String)this.b.get(object);
            if (string == null) {
                return this.d.b((Uri)object);
            }
            if (this.c.get(string) != null) return (fqy)this.c.get(string);
            cyr.d("%s: Can't find file group for uri: %s. DownloadListener was not added.", "DownloadProgressMonitor", object);
            return null;
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e() {
        synchronized (daa.class) {
            Iterator iterator = this.c.values().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.d.e();
                    return;
                }
                ((czz)((fqn)iterator.next()).a).a.d();
            }
        }
    }

    @Override
    public final void f() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(String string, csv object) {
        synchronized (daa.class) {
            if (!this.c.containsKey(string)) {
                HashMap hashMap = this.c;
                czz czz2 = new czz(this, string, (csv)object);
                Objects.requireNonNull(this.e);
                object = new dab(1);
                fqn fqn2 = new fqn(czz2, (fql)object, 1000L, TimeUnit.MILLISECONDS);
                hashMap.put(string, fqn2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(String string, long l2) {
        synchronized (daa.class) {
            if (this.c.containsKey(string)) {
                ((fqn)this.c.get((Object)string)).a.a((int)l2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(String string) {
        synchronized (daa.class) {
            this.c.remove(string);
            return;
        }
    }
}

