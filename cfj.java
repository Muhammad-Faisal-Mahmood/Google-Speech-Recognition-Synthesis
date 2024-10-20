/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;

public final class cfj
extends cfk {
    final Intent a;
    final ced b;

    public cfj(Intent intent, ced ced2) {
        this.a = intent;
        this.b = ced2;
    }

    @Override
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}

