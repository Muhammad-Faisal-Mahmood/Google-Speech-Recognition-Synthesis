/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.concurrent.Executor;

public final class cwn
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final jnu i;
    private final jnu j;

    public cwn(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
        this.j = jnu11;
    }

    public final cwm a() {
        cyu cyu2 = (cyu)this.a.b();
        cxm cxm2 = ((cxn)this.b).a();
        cxa cxa2 = (cxa)this.c.b();
        cxa cxa3 = (cxa)this.d.b();
        Uri uri = (Uri)this.e.b();
        Uri uri2 = (Uri)this.f.b();
        cxt cxt2 = ((cxb)this.g).a();
        bmu bmu2 = (bmu)this.h.b();
        Executor executor = (Executor)this.i.b();
        cqq cqq2 = (cqq)this.j.b();
        return new cwm(cyu2, cxm2, cxa2, cxa3, uri, uri2, cxt2, bmu2, executor);
    }
}

