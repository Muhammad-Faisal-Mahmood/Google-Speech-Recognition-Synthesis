/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class czv
implements fqz,
djg,
czx {
    private final HashMap a = new HashMap();

    public czv(Executor executor) {
        new hpz(executor);
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
        synchronized (czv.class) {
            if (this.a.get(object) != null) return (fqy)this.a.get(object);
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
        synchronized (czv.class) {
            Object object = this.a.values().iterator();
            if (!object.hasNext()) {
                return;
            }
            object = (czu)object.next();
            throw null;
        }
    }

    @Override
    public final void f() {
    }
}

