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
import java.util.List;
import java.util.concurrent.Executor;

public final class dmt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public dmt(Context context, cwk cwk2, egg egg2, cxl cxl2, cyu cyu2, cqq cqq2, bmu bmu2, gto gto2, cuv cuv2, Executor executor) {
        this.a = context;
        this.i = cwk2;
        this.d = egg2;
        this.h = cxl2;
        this.g = cyu2;
        this.e = cqq2;
        this.j = bmu2;
        this.f = gto2;
        this.b = cuv2;
        this.c = executor;
    }

    public dmt(dmr object, jnu object2, dkf dkf2, cya object3, jnu jnu2, gto gto2, gto gto3, gto gto4, jnu jnu3, Executor executor, iku iku2, jnu jnu4) {
        this.b = object;
        this.a = dkf2;
        this.c = object2;
        this.d = executor;
        this.f = new dan(jnu2, 2);
        dkf2 = ((ilt)((cya)object3).a).a();
        object = (Executor)((cya)object3).d.b();
        object.getClass();
        object2 = (dss)((cya)object3).e.b();
        object2.getClass();
        ((Boolean)((cya)object3).c.b()).booleanValue();
        object3 = (gto)((imc)((cya)object3).b).a;
        object3.getClass();
        this.e = new dsp((Context)dkf2, (Executor)object, (dss)object2, iku2, true, (gto)object3, jnu4);
        this.g = gto2;
        this.h = gto3;
        this.i = gto4;
        this.j = jnu3;
    }

    public final long a(String string) {
        long l2;
        boolean bl2 = ((dkf)this.a).a;
        long l3 = l2 = -1L;
        if (!bl2) {
            Object object = (dsp)this.e;
            if (((dsp)object).c.c()) {
                l3 = l2;
            } else {
                bl2 = ((dsp)object).b;
                object = ((dsp)object).a;
                l3 = l2;
                if (bl2) {
                    l3 = ((dst)object).a(string);
                }
            }
        }
        return l3;
    }

    public final hpn b(dmq dmq2) {
        if (((dkf)this.a).a) {
            return hhk.I();
        }
        return hhk.P(new dms(this, dmq2), (Executor)this.d);
    }

    public final boolean c(String string) {
        return this.a(string) != -1L;
    }

    public final boolean d() {
        Object object = (dsp)this.e;
        boolean bl2 = ((dsp)object).b;
        object = ((dsp)object).a;
        return bl2 && ((dst)object).d();
    }

    /*
     * WARNING - void declaration
     */
    public final int e(Uri object, List list) {
        int n2;
        block12: {
            void var1_4;
            int n3;
            block11: {
                if (((bmu)this.j).B((Uri)object)) break block11;
                return 0;
            }
            try {
                object = ((bmu)this.j).v((Uri)object).iterator();
                n3 = 0;
            }
            catch (IOException iOException) {
                n3 = 0;
            }
            block9: while (true) {
                Uri uri;
                block13: {
                    n2 = ++n3;
                    if (!object.hasNext()) break block12;
                    uri = (Uri)object.next();
                    try {
                        for (Uri uri2 : list) {
                            if (!uri.toString().startsWith(uri2.toString())) continue;
                            continue block9;
                        }
                        if (!((bmu)this.j).C(uri)) break block13;
                        n3 = n2 = n3 + this.e(uri, list);
                        continue;
                    }
                    catch (IOException iOException) {
                        try {
                            ((cyu)this.g).d(1059);
                            cyr.j(iOException, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                            continue;
                        }
                        catch (IOException iOException2) {
                            break;
                        }
                    }
                }
                cyr.d("%s: Deleted unaccounted file with uri %s!", "ExpirationHandler", uri.getPath());
                ((bmu)this.j).z(uri);
                continue;
                break;
            }
            ((cyu)this.g).d(1059);
            cyr.j((Throwable)var1_4, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
            n2 = n3;
        }
        return n2;
    }
}

