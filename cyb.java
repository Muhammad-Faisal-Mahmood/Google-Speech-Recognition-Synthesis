/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class cyb
implements cyh {
    public final Context a;
    public final cxl b;
    public final cuv c;
    public final ctf d;
    public final cux e;
    public final cti f;
    public final ctq g;
    public final int h;
    public final long i;
    public final String j;
    public final gto k;
    public final Executor l;
    public final cyu m;
    public final int n;
    public final bmu o;
    private final cqq p;

    public cyb(Context context, cxl cxl2, bmu bmu2, cuv cuv2, ctf ctf2, int n2, cux cux2, cti cti2, cyu cyu2, ctq ctq2, int n3, long l2, String string, gto gto2, cqq cqq2, Executor executor) {
        this.a = context;
        this.b = cxl2;
        this.o = bmu2;
        this.c = cuv2;
        this.d = ctf2;
        this.n = n2;
        this.e = cux2;
        this.f = cti2;
        this.m = cyu2;
        this.g = ctq2;
        this.h = n3;
        this.i = l2;
        this.j = string;
        this.k = gto2;
        this.p = cqq2;
        this.l = executor;
    }

    @Override
    public final hpn a(Uri uri) {
        cyr.d("%s: Successfully downloaded delta file %s", "DeltaFileDownloaderCallbackImpl", uri);
        if (!cye.d(this.o, uri, this.f.e)) {
            cyr.i("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, this.f.e);
            Object object = css.a();
            ((kqr)object).b = csr.B;
            css css2 = ((kqr)object).a();
            object = this.b;
            ctf ctf2 = this.d;
            int n2 = this.n;
            bmu bmu2 = this.o;
            cti cti2 = this.f;
            cyu cyu2 = this.m;
            Executor executor = this.l;
            return dah.e(cyd.d((cxl)object, ctf2, n2, bmu2, uri, cti2.e, cyu2, executor)).d(IOException.class, new cwu(css2, 17), this.l).g(new cwu(css2, 18), this.l);
        }
        Uri uri2 = crh.j(uri);
        hwp hwp2 = ctt.a.l();
        Object object = this.f.g;
        hwv hwv2 = object;
        if (object == null) {
            hwv2 = cte.a;
        }
        object = ((cte)hwv2).b;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        ctt ctt2 = (ctt)hwv2;
        object.getClass();
        ctt2.b |= 4;
        ctt2.e = object;
        int n3 = this.n;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = (ctt)hwp2.b;
        ((ctt)hwv2).f = n3 - 1;
        ((ctt)hwv2).b |= 8;
        hwv2 = (ctt)hwp2.o();
        return fxf.ak(fxf.ak(this.b.e((ctt)hwv2), new cvq((Object)this, (Object)hwv2, (Object)uri2, (Object)uri, 15, null), this.l), new cww(this, uri2, 11, null), this.l);
    }

    @Override
    public final hpn b(css object) {
        cyr.d("%s: Failed to download file(delta) %s", "DeltaFileDownloaderCallbackImpl", this.d.g);
        if (((css)object).a.equals((Object)csr.B)) {
            ctf ctf2 = this.d;
            int n2 = this.n;
            cxl cxl2 = this.b;
            object = this.l;
            return cyd.c(ctp.f, ctf2, n2, cxl2, (Executor)object);
        }
        ctf ctf3 = this.d;
        int n3 = this.n;
        object = this.b;
        Executor executor = this.l;
        return cyd.c(ctp.d, ctf3, n3, (cxl)object, executor);
    }
}

