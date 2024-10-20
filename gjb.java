/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  hrg
 */
import android.app.Application;
import android.content.Context;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gjb
implements imb {
    private final jnu a;
    private final jnu b;
    private final int c;

    public gjb(jnu jnu2, jnu jnu3, int n2) {
        this.c = n2;
        this.a = jnu2;
        this.b = jnu3;
    }

    public gjb(jnu jnu2, jnu jnu3, int n2, float[] fArray) {
        this.c = n2;
        this.b = jnu2;
        this.a = jnu3;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.c;
        boolean bl2 = false;
        boolean bl3 = false;
        Object object = false;
        switch (n2) {
            default: {
                object = ((imc)this.b).a;
                return new gey(((imj)this.a).a(), (Set)object);
            }
            case 16: {
                object = ((imc)this.b).a;
                return new gey(((imj)this.a).a(), (Set)object);
            }
            case 15: {
                object = ((imc)this.b).a;
                return new gey(((imj)this.a).a(), (Set)object);
            }
            case 14: {
                object = ((imc)this.b).a;
                return new hui(((huh)this.a).a(), (gto)object);
            }
            case 13: {
                gto gto2 = ((bqw)this.a).a();
                gto gto3 = (gto)((imc)this.b).a;
                if (gto3.g()) {
                    bl2 = bl3;
                    if (((dqk)((gtt)gto2).a).b()) {
                        bl2 = bl3;
                        if (((Boolean)gto3.c()).booleanValue()) {
                            bl2 = true;
                        }
                    }
                    object = bl2;
                }
                return object;
            }
            case 12: {
                object = (gpm)this.b.b();
                gzy gzy2 = new gzy();
                for (Map.Entry entry : ((ily)this.a).a.entrySet()) {
                    gzy2.d((String)entry.getKey(), new gjm((gpm)object, entry, 3));
                }
                return new htv(gzy2.b());
            }
            case 11: {
                object = (koj)this.a.b();
                Iterator iterator = ((imj)this.b).a().iterator();
                while (iterator.hasNext()) {
                    ((koc)object).c((kpm)iterator.next());
                }
                idi.m(object);
                return object;
            }
            case 10: {
                object = this.b;
                object = idi.F(((ilt)this.a).a(), (jnu)object);
                idi.m(object);
                return object;
            }
            case 9: {
                Object object2 = ((imc)this.b).a;
                object = ((huc)this.a).a();
                object2 = gzx.o((Set)object2);
                fxf.K(hrg.a);
                return new gpm((hqw)object, (List)object2);
            }
            case 8: {
                object = ((gcy)this.a).a();
                jnu jnu2 = this.b;
                Objects.requireNonNull(jnu2);
                return new gcu(new dan(jnu2, 9), (bmu)object);
            }
            case 7: {
                object = ((gcy)this.a).a();
                jnu jnu3 = this.b;
                Objects.requireNonNull(jnu3);
                return new gcu(new dan(jnu3, 8), (bmu)object);
            }
            case 6: {
                bl2 = (Boolean)this.a.b();
                return new gln(this.b, bl2);
            }
            case 5: {
                object = (Boolean)this.a.b() == false ? hdc.a : new hdq(new fzu(this.b, 2));
                idi.m(object);
                return object;
            }
            case 4: {
                object = this.a;
                return new gkp(((ilt)this.b).a(), ((gdc)object).a(), 0);
            }
            case 3: {
                object = this.a;
                return new gkp(((ilt)this.b).a(), ((gdc)object).a(), 1, null);
            }
            case 2: {
                gto gto4 = (gto)((imc)this.a).a;
                if (((dwy)this.b).a().b() || ((Boolean)gto4.e(object)).booleanValue()) {
                    bl2 = true;
                }
                return bl2;
            }
            case 1: {
                object = (gto)((imc)this.a).a;
                hpr hpr2 = (hpr)this.b.b();
                dps dps2 = dkd.a();
                dps2.c((Boolean)((gto)object).e(true));
                dps2.e = cgw.j(hpr2);
                return dps2.b();
            }
            case 0: 
        }
        object = this.b;
        Context context = ((ilt)this.a).a();
        long l2 = ((ims)object).a();
        object = new AtomicBoolean(true);
        context = (Application)context;
        return new giy((Application)context, new giz((AtomicBoolean)object, (Application)context), (AtomicBoolean)object, l2);
    }
}

