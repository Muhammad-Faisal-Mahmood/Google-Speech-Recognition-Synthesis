/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;

public class ile
implements ilw {
    protected final Activity a;
    private volatile Object b;
    private final Object c = new Object();
    private final ilw d;

    public ile(Activity activity) {
        this.a = activity;
        this.d = new ilj((mr)activity);
    }

    protected Object a() {
        if (!(this.a.getApplication() instanceof ilw)) {
            String string = Application.class.equals(this.a.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(String.valueOf(String.valueOf(this.a.getApplication().getClass())));
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(string));
        }
        bqu bqu2 = ((ild)idi.e(this.d, ild.class)).b();
        bqu2.a = this.a;
        return bqu2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.b != null) return this.b;
        Object object = this.c;
        synchronized (object) {
            if (this.b != null) return this.b;
            this.b = this.a();
            return this.b;
        }
    }

    public final ilo c() {
        ilj ilj2 = (ilj)this.d;
        Context context = ilj2.b;
        return ((ilh)ilj.a((aco)ilj2.a, (Context)context).a(ilh.class)).a;
    }
}

