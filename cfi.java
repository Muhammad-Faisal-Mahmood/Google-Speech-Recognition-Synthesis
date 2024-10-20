/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 */
import android.app.Activity;
import android.content.Intent;

public final class cfi
extends cfk {
    final Intent a;
    final Activity b;

    public cfi(Intent intent, Activity activity) {
        this.a = intent;
        this.b = activity;
    }

    @Override
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}

