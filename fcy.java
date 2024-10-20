/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import java.util.Collection;

public final class fcy
implements gje {
    public static final hei a = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/legacy/LanguagePackDetailsReceiver");
    public final fbt b;
    public final dxi c;
    public final hpq d;
    public final hav e;
    public final bqs f;

    public fcy(fbt fbt2, dxi dxi2, hpq hpq2, iah iah2, bqs bqs2) {
        this.b = fbt2;
        this.c = dxi2;
        this.d = hpq2;
        this.e = hav.n(iah2.b);
        this.f = bqs2;
    }

    public static gzx c(idx object) {
        object = Collection$_EL.stream(((idx)object).b).map(new fcx(1));
        int n2 = gzx.d;
        return (gzx)object.collect(gye.a);
    }

    public static idx d(hav object) {
        object = Collection$_EL.stream((Collection)object).map(new fcx(0));
        int n2 = gzx.d;
        gzx gzx2 = (gzx)object.collect(gye.a);
        hwp hwp2 = idx.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        idx idx2 = (idx)hwp2.b;
        object = idx2.b;
        if (!object.c()) {
            idx2.b = hwv.s((hxk)object);
        }
        hvc.g(gzx2, idx2.b);
        return (idx)hwp2.o();
    }

    @Override
    public final long b() {
        return 5000L;
    }

    @Override
    public final long ba() {
        return 50000L;
    }
}

