/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class cxh
implements hny {
    public final cti a;
    public final ctf b;
    public final ctt c;
    public final ctq d;
    public final int e;
    public final long f;
    public final String g;
    public final ctj h;
    public final int i;
    public final List j;
    public final Object k;
    public final Object l;
    public final egg m;
    private final int n;

    public /* synthetic */ cxh(egg egg2, ctt ctt2, String string, ctf ctf2, cti cti2, ctq ctq2, int n2, long l2, String string2, ctj ctj2, int n3, List list, hvi hvi2, int n4) {
        this.n = n4;
        this.m = egg2;
        this.c = ctt2;
        this.l = string;
        this.b = ctf2;
        this.a = cti2;
        this.d = ctq2;
        this.e = n2;
        this.f = l2;
        this.g = string2;
        this.h = ctj2;
        this.i = n3;
        this.j = list;
        this.k = hvi2;
    }

    public /* synthetic */ cxh(egg egg2, hpn hpn2, cti cti2, ctf ctf2, ctt ctt2, ctq ctq2, int n2, long l2, String string, ctj ctj2, int n3, List list, hvi hvi2, int n4) {
        this.n = n4;
        this.m = egg2;
        this.k = hpn2;
        this.a = cti2;
        this.b = ctf2;
        this.c = ctt2;
        this.d = ctq2;
        this.e = n2;
        this.f = l2;
        this.g = string;
        this.h = ctj2;
        this.i = n3;
        this.j = list;
        this.l = hvi2;
    }

    @Override
    public final hpn a(Object object) {
        Object object2;
        if (this.n != 0) {
            Object object3;
            hwv hwv2 = (ctv)object;
            object = object3 = ctp.b(hwv2.d);
            if (object3 == null) {
                object = ctp.a;
            }
            if (object == ctp.e) {
                object = hpj.a;
            } else {
                object3 = this.c;
                object = (hwp)hwv2.C(5);
                ((hwp)object).x(hwv2);
                int n2 = a.t(((ctt)object3).f);
                if (n2 == 0) {
                    n2 = 1;
                }
                Object object4 = this.k;
                List list = this.j;
                int n3 = this.i;
                hwv2 = this.h;
                String string = this.g;
                long l2 = this.f;
                int n4 = this.e;
                ctq ctq2 = this.d;
                cti cti2 = this.a;
                ctf ctf2 = this.b;
                Object object5 = this.l;
                egg egg2 = this.m;
                String string2 = ctf2.g;
                object5 = egg2.s(n2, (String)object5, string2);
                object = dah.e((hpn)object5).g(new cxe((Object)egg2, object, object3, 4, null), (Executor)egg2.a).g(new cxh(egg2, (hpn)object5, cti2, ctf2, (ctt)object3, ctq2, n4, l2, string, (ctj)hwv2, n3, list, (hvi)object4, 0), (Executor)egg2.a);
            }
            return object;
        }
        object = (Boolean)object;
        Uri uri = (Uri)hhk.S((Future)this.k);
        Object object6 = this.m;
        boolean bl2 = ((gto)((egg)object6).c).g();
        Object object7 = this.b;
        Object object8 = this.c;
        object = this.d;
        int n5 = this.e;
        long l3 = this.f;
        String string = this.g;
        ctj ctj2 = this.h;
        int n6 = this.i;
        List list = this.j;
        Object object9 = this.l;
        if (bl2 && (object2 = this.a) != null) {
            Object object10 = ((egg)object6).k;
            Object object11 = ((egg)object6).f;
            Object object12 = ((egg)object6).g;
            Object object13 = ((egg)object6).d;
            int n7 = a.t(((ctt)object8).f);
            if (n7 == 0) {
                n7 = 1;
            }
            cux cux2 = (cux)((gto)((egg)object6).c).c();
            Object object14 = ((egg)object6).j;
            Object object15 = ((egg)object6).l;
            Object object16 = ((egg)object6).h;
            Object object17 = ((egg)object6).a;
            object16 = (cqq)object16;
            object15 = (gto)object15;
            object14 = (cyu)object14;
            object12 = (bmu)object12;
            object7 = new cyb((Context)object10, (cxl)object11, (bmu)object12, (cuv)object13, (ctf)object7, n7, cux2, (cti)object2, (cyu)object14, (ctq)object, n5, l3, string, (gto)object15, (cqq)object16, (Executor)object17);
            ((egg)object6).q((ctq)object, uri);
            object6 = ((egg)object6).m;
            object8 = ((ctt)object8).e;
            object13 = ((cti)object2).c;
            n7 = ((cti)object2).d;
            object = ((dmu)object6).d((String)object8, (ctq)object, n5, l3, string, uri, (String)object13, n7, ctj2, (cyh)object7, n6, list, (hvi)object9);
        } else {
            Object object18 = ((egg)object6).f;
            object2 = ((egg)object6).g;
            int n8 = a.t(((ctt)object8).f);
            if (n8 == 0) {
                n8 = 1;
            }
            Object object19 = ((egg)object6).j;
            Object object20 = ((egg)object6).h;
            Object object21 = ((egg)object6).a;
            object20 = (cqq)object20;
            object19 = (cyu)object19;
            object2 = new cyd((cxl)object18, (bmu)object2, (ctf)object7, n8, (cyu)object19, (ctq)object, n5, l3, string, (cqq)object20, (Executor)object21);
            ((egg)object6).q((ctq)object, uri);
            object6 = ((egg)object6).m;
            object21 = ((ctt)object8).e;
            object8 = ((ctf)object7).d;
            n8 = ((ctf)object7).e;
            object = ((dmu)object6).d((String)object21, (ctq)object, n5, l3, string, uri, (String)object8, n8, ctj2, (cyh)object2, n6, list, (hvi)object9);
        }
        return object;
    }
}

