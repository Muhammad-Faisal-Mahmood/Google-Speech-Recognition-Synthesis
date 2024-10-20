/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class cyf
implements hny {
    public final String a;
    public final Uri b;
    public final cyh c;
    public final ctq d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final int i;
    public final ctj j;
    public final int k;
    public final List l;
    public final hvi m;
    public final dmu n;

    public /* synthetic */ cyf(dmu dmu2, String string, Uri uri, cyh cyh2, ctq ctq2, int n2, long l2, String string2, String string3, int n3, ctj ctj2, int n4, List list, hvi hvi2) {
        this.n = dmu2;
        this.a = string;
        this.b = uri;
        this.c = cyh2;
        this.d = ctq2;
        this.e = n2;
        this.f = l2;
        this.g = string2;
        this.h = string3;
        this.i = n3;
        this.j = ctj2;
        this.k = n4;
        this.l = list;
        this.m = hvi2;
    }

    @Override
    public final hpn a(Object object) {
        if (((gto)(object = (gto)object)).g()) {
            object = (hpn)((gto)object).c();
        } else {
            Object object2 = this.m;
            List list = this.l;
            int n2 = this.k;
            Object object3 = this.j;
            int n3 = this.i;
            String string = this.h;
            String string2 = this.g;
            long l2 = this.f;
            int n4 = this.e;
            ctq ctq2 = this.d;
            object = this.c;
            Uri uri = this.b;
            String string3 = this.a;
            dmu dmu2 = this.n;
            object3 = new cyg(dmu2, ctq2, n4, l2, string2, uri, string, n3, (ctj)object3, n2, list, (hvi)object2);
            object2 = new hpo((Callable)new cuh(14));
            object3 = dah.e((hpn)object2).g((hny)object3, (Executor)dmu2.c).g(new cww(object, uri, 12, null), (Executor)dmu2.c).d(Exception.class, new cww(dmu2, object, 13, null), (Executor)dmu2.c);
            if (!cqq.i()) {
                ((HashMap)dmu2.d).put(uri, object3);
                object = hpj.a;
            } else {
                object = ((czh)dmu2.e).f(string3, (hpn)object3);
            }
            object = dah.e((hpn)object).g(new cww(object2, object3, 14, null), (Executor)dmu2.c);
            ((hoy)object).c(new ai(dmu2, string3, uri, 15), (Executor)dmu2.c);
        }
        return object;
    }
}

