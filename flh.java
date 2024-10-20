/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 */
import android.content.res.Resources;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class flh {
    public final Object a;
    public final Object b;
    public final Object c;

    public flh(dwv dwv2, String string, int n2, int n3) {
        this.c = dwv2;
        this.b = string;
        this.a = new dws(new dwu(this, n2, n3));
    }

    public flh(gpm gpm2) {
        this.c = gpm2;
        gpm gpm3 = gpm2;
        this.a = Long.toString(((AtomicLong)gpm2.d).getAndIncrement());
        this.b = new AtomicReference<fli>(new fli(true, 0));
    }

    public final fli a() {
        flg flg2 = new flg(2);
        return (fli)DesugarAtomicReference.updateAndGet((AtomicReference)this.b, flg2);
    }

    public final void b(hye hye2, Resources object, int n2) {
        object = object.openRawResource(n2);
        try {
            Object object2 = ((dwv)this.c).e;
            ++((htf)object2).b;
            object2 = hvy.M((InputStream)object, Math.max(512, Math.min(4096, ((InputStream)object).available())));
            hwj hwj2 = hwj.a();
            ((hwp)hye2).w((hvy)object2, hwj2);
            return;
        }
        finally {
            if (object != null) {
                ((InputStream)object).close();
            }
        }
    }
}

