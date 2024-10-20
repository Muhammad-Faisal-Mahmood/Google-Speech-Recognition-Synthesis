/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 */
import android.content.pm.PackageManager;
import android.content.res.Resources;

public final class dwv {
    public final String a;
    final gui b;
    final gui c;
    Resources d;
    public final htf e;

    public dwv(htf htf2, String string, gui gui2) {
        this.e = htf2;
        this.a = string;
        this.b = new dws(new dwt(this, htf2, string, 0));
        this.c = gui2;
    }

    public final Resources a() {
        Object object;
        Object object2 = object = this.d;
        if (object == null) {
            object2 = this.e;
            object = this.a;
            this.d = object2 = ((PackageManager)object2.a).getResourcesForApplication((String)object);
        }
        return object2;
    }
}

