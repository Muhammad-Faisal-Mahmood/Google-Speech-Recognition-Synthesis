/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

public final class ciu
extends cin {
    final Context a;
    final bzo b;
    private final WeakReference c;

    public ciu(Context context, bzo bzo2) {
        this.a = context;
        this.b = bzo2;
        this.c = new WeakReference<Context>(context);
    }

    @Override
    public final void d(Status status, String string) {
        if (status.a()) {
            string = new Intent(string);
            Bundle bundle = new Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            string.putExtras(bundle);
            bundle = (Context)this.c.get();
            if (bundle != null) {
                bundle.startActivity((Intent)string);
            }
            kl.aA(status, null, this.b);
        }
    }
}

