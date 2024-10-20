/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 */
import android.app.Dialog;

public final class eky {
    public final Object a;
    public final Object b;

    public eky() {
        throw null;
    }

    public eky(cdn cdn2, Dialog dialog) {
        this.b = dialog;
        this.a = cdn2;
    }

    public eky(Object object, Object object2) {
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ eky(Object object, Object object2, byte[] byArray) {
        this.a = object;
        this.b = object2;
    }

    public final void a() {
        ((cdo)((cdn)this.a).b).b();
        if (((Dialog)this.b).isShowing()) {
            ((Dialog)this.b).dismiss();
        }
    }

    public final void b() {
        ((bml)this.b).a();
        ((bnu)this.a).i.hide();
    }
}

