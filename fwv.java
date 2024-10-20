/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;

final class fwv
extends tb {
    final fww a;
    final giu b;

    public fwv(fww fww2, giu giu2) {
        this.b = giu2;
        this.a = fww2;
    }

    @Override
    public final void a(Typeface typeface) {
        fww fww2 = this.a;
        fww2.k = Typeface.create((Typeface)typeface, (int)fww2.c);
        fww.b(this.a);
        this.b.c(this.a.k);
    }

    @Override
    public final void b() {
        fww.b(this.a);
        this.b.d();
    }
}

