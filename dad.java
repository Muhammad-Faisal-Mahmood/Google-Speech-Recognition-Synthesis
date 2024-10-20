/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

public final class dad
implements fqz {
    public final Context a;
    public final Object b;
    public final HashMap c;
    public final HashMap d;
    public final cqq e;

    public dad(Context context) {
        cqq cqq2 = new cqq();
        this.b = new Object();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = context;
        this.e = cqq2;
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
        Object object2 = this.b;
        synchronized (object2) {
            return (fqy)this.d.get(object);
        }
    }

    @Override
    public final void f() {
    }
}

