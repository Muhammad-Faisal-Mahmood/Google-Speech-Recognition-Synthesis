/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;

public final class bla
extends blf {
    public Drawable a;
    public bjh b;
    public final bkx c;
    public final bky d;
    public boolean e;
    public boolean f = true;
    public boolean g;
    public bkz h;
    public eky i;

    public bla(bkx bkx2) {
        this.c = bkx2;
        this.d = bky.b;
    }

    public final void a(boolean bl2) {
        Object object;
        if (bl2 != this.e && ((object = this.c) == bkx.c || object == bkx.b || object == bkx.d)) {
            this.e = bl2;
            object = this.h;
            if (object != null) {
                object.a(this, bl2);
            }
        }
    }

    public final void b(CharSequence charSequence) {
        this.b = new bjh(new bzb(charSequence));
    }
}

