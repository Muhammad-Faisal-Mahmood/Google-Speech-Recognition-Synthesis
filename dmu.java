/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

public final class dmu {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public dmu(Context context, gui gui2, bmu bmu2, dad dad2, gto gto2, cys cys2, Executor executor) {
        this.d = new HashMap();
        this.h = context;
        this.f = gui2;
        this.a = bmu2;
        this.g = dad2;
        this.b = gto2;
        this.i = cys2;
        this.c = executor;
        this.e = czh.k(executor);
    }

    public dmu(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.b = jnu3;
        jnu4.getClass();
        this.c = jnu4;
        jnu5.getClass();
        this.d = jnu5;
        jnu6.getClass();
        this.e = jnu6;
        jnu7.getClass();
        this.f = jnu7;
        jnu8.getClass();
        this.g = jnu8;
        jnu9.getClass();
        this.h = jnu9;
        jnu10.getClass();
        this.i = jnu10;
    }

    public final dmt a(Executor executor, iku iku2, jnu jnu2) {
        dmr dmr2 = (dmr)this.a.b();
        dmr2.getClass();
        dkf dkf2 = (dkf)this.c.b();
        dkf2.getClass();
        Object object = this.f;
        Object object2 = this.d.b();
        gto gto2 = ((bqw)object).a();
        object = (gto)((imc)this.g).a;
        object.getClass();
        gto gto3 = ((bqw)this.h).a();
        executor.getClass();
        iku2.getClass();
        object2 = (cya)object2;
        return new dmt(dmr2, (jnu)this.b, dkf2, (cya)object2, (jnu)this.e, gto2, (gto)object, gto3, (jnu)this.i, executor, iku2, jnu2);
    }

    public final hpn b(String string, Uri uri) {
        if (!cqq.i()) {
            return hhk.K(gto.h((hpn)((HashMap)this.d).get(uri)));
        }
        return ((czh)this.e).h(string);
    }

    public final hpn c(String object, Uri uri) {
        if (!cqq.i()) {
            object = (hpn)((HashMap)this.d).remove(uri);
            if (object != null) {
                return object;
            }
            return hpj.a;
        }
        return ((czh)this.e).i((String)object);
    }

    public final hpn d(String string, ctq ctq2, int n2, long l2, String string2, Uri uri, String string3, int n3, ctj ctj2, cyh cyh2, int n4, List list, hvi hvi2) {
        return fxf.ak(this.b(string, uri), new cyf(this, string, uri, cyh2, ctq2, n2, l2, string2, string3, n3, ctj2, n4, list, hvi2), (Executor)this.c);
    }

    public final void e(String string, Uri uri) {
        fxf.ak(this.b(string, uri), new cxe((Object)this, (Object)uri, (Object)string, 6, null), (Executor)this.c);
    }
}

