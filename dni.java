/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;

final class dni
implements gui {
    private final Context a;
    private final int b;

    public dni(Context context, int n2) {
        this.b = n2;
        this.a = context;
    }

    @Override
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            return gto.h(dww.a(this.a));
        }
        gto gto2 = crt.d(this.a) ? gsl.a : gto.i(new File(this.a.getFilesDir(), "primes/crash"));
        return gto2;
    }
}

