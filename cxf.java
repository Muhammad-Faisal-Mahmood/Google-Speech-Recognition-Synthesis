/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;

public final class cxf
implements hny {
    public final hpn a;
    public final hpn b;
    public final hpn c;
    public final hpn d;
    public final hpn e;
    public final ctf f;
    public final ctq g;
    public final ctt h;
    public final ctj i;
    public final int j;
    public final List k;
    public final hvi l;
    public final egg m;

    public /* synthetic */ cxf(egg egg2, hpn hpn2, hpn hpn3, hpn hpn4, hpn hpn5, hpn hpn6, ctf ctf2, ctq ctq2, ctt ctt2, ctj ctj2, int n2, List list, hvi hvi2) {
        this.m = egg2;
        this.a = hpn2;
        this.b = hpn3;
        this.c = hpn4;
        this.d = hpn5;
        this.e = hpn6;
        this.f = ctf2;
        this.g = ctq2;
        this.h = ctt2;
        this.i = ctj2;
        this.j = n2;
        this.k = list;
        this.l = hvi2;
    }

    @Override
    public final hpn a(Object object) {
        Object object2;
        object = (Void)object;
        hwv hwv2 = (ctv)hhk.S(this.a);
        cti cti2 = (cti)hhk.S(this.b);
        String string = (String)hhk.S(this.c);
        Uri uri = (Uri)hhk.S(this.d);
        cth cth2 = (cth)hhk.S(this.e);
        object = object2 = ctp.b(hwv2.d);
        if (object2 == null) {
            object = ctp.a;
        }
        ctf ctf2 = this.f;
        cyr.e("%s: startDownload status %s for %s", "SharedFileManager", object, ctf2.d);
        int n2 = hwv2.d;
        object = object2 = ctp.b(n2);
        if (object2 == null) {
            object = ctp.a;
        }
        hwv2 = this.g;
        egg egg2 = this.m;
        if (object == ctp.e) {
            if (((gto)egg2.i).g()) {
                ((daa)((gto)egg2.i).c()).h(((ctq)hwv2).c, ctf2.e);
            }
            object = hpj.a;
        } else {
            object = object2 = ctp.b(n2);
            if (object2 == null) {
                object = ctp.a;
            }
            object2 = this.l;
            List list = this.k;
            n2 = this.j;
            ctj ctj2 = this.i;
            ctt ctt2 = this.h;
            if (object == ctp.c) {
                object = egg2.m;
                String string2 = ctt2.e;
                object = fxf.ak(((dmu)object).b(string2, uri), new cxj(egg2, (ctq)hwv2, uri, ctt2, string, cth2, ctf2, cti2, ctj2, n2, list, (hvi)object2), (Executor)egg2.a);
            } else {
                object = egg2.l(ctt2, string, cth2.f, cth2.s, cth2.t, (ctq)hwv2, ctf2, cti2, ctj2, n2, list, (hvi)object2);
            }
        }
        return object;
    }
}

