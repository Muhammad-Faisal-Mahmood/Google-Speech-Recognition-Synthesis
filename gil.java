/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.View
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.wear.ambient.AmbientDelegate;

public final class gil
implements ilw {
    private volatile Object a;
    private final Object b = new Object();
    private final View c;

    public gil(View view) {
        this.c = view;
    }

    private final Context a(Class clazz) {
        clazz = gil.c(this.c.getContext(), clazz);
        boolean bl2 = clazz != gil.c(clazz.getApplicationContext(), ilw.class);
        fxf.E(bl2, "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.c.getClass());
        return clazz;
    }

    private static Context c(Context context, Class clazz) {
        while (context instanceof ContextWrapper && !clazz.isInstance(context)) {
            context = ((ContextWrapper)context).getBaseContext();
        }
        return context;
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
            Object object2 = this.a(ilr.class);
            if (object2 instanceof git) {
                object2 = ((gij)((ilw)((Object)((ilr)((Object)object2)).a())).bn()).a().b().a();
            } else {
                if (!(object2 instanceof ilr)) {
                    fxf.E(this.a(ilw.class) instanceof ilw ^ true, "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment.", this.c.getClass());
                    object2 = new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity.", this.c.getClass()));
                    throw object2;
                }
                AmbientDelegate ambientDelegate = ((gik)((ilw)((Object)((ilr)((Object)object2)).a())).bn()).d();
                ambientDelegate.a = this.c;
                idi.k(ambientDelegate.a, View.class);
                object2 = ambientDelegate.b;
                Object object3 = ambientDelegate.c;
                ambientDelegate = (View)ambientDelegate.a;
                object3 = (brd)object3;
                object2 = new bri((brg)object2, (brd)object3, (View)ambientDelegate);
            }
            this.a = object2;
            return this.a;
        }
    }
}

