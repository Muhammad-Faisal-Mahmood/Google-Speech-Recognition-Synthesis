/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

public class iln
implements ilw {
    private volatile Object a;
    private final Object b = new Object();
    private final be c;

    public iln(be be2) {
        this.c = be2;
    }

    public static final Context d(Context context) {
        while (context instanceof ContextWrapper && !(context instanceof Activity)) {
            context = ((ContextWrapper)context).getBaseContext();
        }
        return context;
    }

    public static final void e(be be2) {
        if (be2.l == null) {
            be2.setArguments(new Bundle());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.a != null) return this.a;
        Object object = this.b;
        synchronized (object) {
            if (this.a != null) return this.a;
            a.r(this.c.getHost(), "Hilt Fragments must be attached before creating the component.");
            Object object2 = this.c;
            fvc.ak(((be)object2).getHost() instanceof ilw, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", ((be)object2).getHost().getClass());
            this.c(this.c);
            object2 = ((ilm)idi.e(this.c.getHost(), ilm.class)).e();
            ((bqv)object2).a = this.c;
            this.a = ((bqv)object2).a();
            return this.a;
        }
    }

    protected void c(be be2) {
    }
}

