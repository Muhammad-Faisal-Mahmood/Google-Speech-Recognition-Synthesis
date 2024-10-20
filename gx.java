/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;

public final class gx
extends gc {
    final gy d;

    public gx(gy gy2, Context context, fs fs2, View view) {
        this.d = gy2;
        super(context, fs2, view, true);
        this.b = 0x800005;
        this.e(gy2.l);
    }

    @Override
    protected final void c() {
        fs fs2 = this.d.c;
        if (fs2 != null) {
            fs2.close();
        }
        this.d.i = null;
        super.c();
    }
}

