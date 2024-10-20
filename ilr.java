/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public class ilr
extends ContextWrapper {
    public be a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final abc d;

    public ilr(Context object, be be2) {
        fvc.al(object);
        super(object);
        object = new mm((Object)this, 4, null);
        this.d = object;
        this.b = null;
        this.a = be2;
        be2.getLifecycle().b((abd)object);
    }

    public ilr(LayoutInflater layoutInflater, be be2) {
        fvc.al(layoutInflater);
        Object object = layoutInflater.getContext();
        fvc.al(object);
        super(object);
        object = new mm((Object)this, 4, null);
        this.d = object;
        this.b = layoutInflater;
        this.a = be2;
        be2.getLifecycle().b((abd)object);
    }

    public final be a() {
        a.r(this.a, "The fragment has already been destroyed.");
        return this.a;
    }

    public final Object getSystemService(String string) {
        if (!"layout_inflater".equals(string)) {
            return this.getBaseContext().getSystemService(string);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater)this.getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext((Context)this);
        }
        return this.c;
    }
}

