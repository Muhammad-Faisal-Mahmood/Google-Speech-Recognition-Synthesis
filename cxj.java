/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.List;

public final class cxj
implements hny {
    public final ctq a;
    public final Uri b;
    public final ctt c;
    public final String d;
    public final cth e;
    public final ctf f;
    public final cti g;
    public final ctj h;
    public final int i;
    public final List j;
    public final hvi k;
    public final egg l;

    public /* synthetic */ cxj(egg egg2, ctq ctq2, Uri uri, ctt ctt2, String string, cth cth2, ctf ctf2, cti cti2, ctj ctj2, int n2, List list, hvi hvi2) {
        this.l = egg2;
        this.a = ctq2;
        this.b = uri;
        this.c = ctt2;
        this.d = string;
        this.e = cth2;
        this.f = ctf2;
        this.g = cti2;
        this.h = ctj2;
        this.i = n2;
        this.j = list;
        this.k = hvi2;
    }

    @Override
    public final hpn a(Object object) {
        Object object2 = (gto)object;
        boolean bl2 = ((gto)object2).g();
        egg egg2 = this.l;
        object = this.a;
        if (bl2) {
            egg2.q((ctq)object, this.b);
            object = (hpn)((gto)object2).c();
        } else {
            hvi hvi2 = this.k;
            List list = this.j;
            int n2 = this.i;
            ctj ctj2 = this.h;
            cti cti2 = this.g;
            object2 = this.f;
            cth cth2 = this.e;
            String string = this.d;
            object = egg2.l(this.c, string, cth2.f, cth2.s, cth2.t, (ctq)object, (ctf)object2, cti2, ctj2, n2, list, hvi2);
        }
        return object;
    }
}

