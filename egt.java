/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class egt
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final int d;

    public egt(jnu jnu2, jnu jnu3, jnu jnu4, int n2) {
        this.d = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public egt(jnu jnu2, jnu jnu3, jnu jnu4, int n2, char[] cArray) {
        this.d = n2;
        this.c = jnu2;
        this.a = jnu3;
        this.b = jnu4;
    }

    public egt(jnu jnu2, jnu jnu3, jnu jnu4, int n2, float[] fArray) {
        this.d = n2;
        this.c = jnu2;
        this.b = jnu3;
        this.a = jnu4;
    }

    public egt(jnu jnu2, jnu jnu3, jnu jnu4, int n2, byte[][] byArray) {
        this.d = n2;
        this.a = jnu2;
        this.c = jnu3;
        this.b = jnu4;
    }

    public egt(jnu jnu2, jnu jnu3, jnu jnu4, int n2, float[][] fArray) {
        this.d = n2;
        this.b = jnu2;
        this.a = jnu3;
        this.c = jnu4;
    }

    public egt(jnu jnu2, jnu jnu3, jnu jnu4, int n2, boolean[][] blArray) {
        this.d = n2;
        this.b = jnu2;
        this.c = jnu3;
        this.a = jnu4;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.d;
        boolean bl2 = false;
        Object object = true;
        switch (n2) {
            default: {
                return new gnu(ima.c(this.a), 2);
            }
            case 19: {
                Object object2 = this.a;
                object = this.c.b();
                Set set = (Set)object2.b();
                object2 = gql.b;
                idi.m(object2);
                return new gpm((gqa)object, this.b, set, (gql)object2);
            }
            case 18: {
                object = this.b;
                return new giv(((ilt)this.a).a(), ((ims)object).a(), this.c);
            }
            case 17: {
                object = (cgw)this.b.b();
                Object object3 = this.a;
                Object object4 = this.c;
                object3 = object3.b();
                object4 = (Executor)object4.b();
                return new gel((cgw)object, (bmu)object3, (Executor)object4);
            }
            case 16: {
                object = (gto)((imc)this.b).a;
                object = ((gto)object).g() && ((gcf)((gto)object).c()).i() ? (gcp)this.a.b() : (gcp)this.c.b();
                idi.m(object);
                return object;
            }
            case 15: {
                abw abw2 = (abw)((imc)this.a).a;
                object = this.c;
                return new gby(abw2, ((ilt)this.b).a(), (Executor)object.b());
            }
            case 14: {
                object = this.c;
                jnu jnu2 = this.a;
                gkf gkf2 = ((gaf)this.b).a();
                return ((gkg)jnu2).a().s(gkf2, (bmu)object.b());
            }
            case 13: {
                jnu jnu3 = this.c;
                jnu jnu4 = this.a;
                object = ((czf)this.b).a();
                return ((gkg)jnu4).a().s((gkf)object, (bmu)jnu3.b());
            }
            case 12: {
                ((fyo)this.b).a();
                return new fyq((gto)((imc)this.a).a, (hpq)this.c.b());
            }
            case 11: {
                Object object5 = this.a;
                Object object6 = this.c;
                object = ((imj)this.b).a();
                object6 = ((imj)object6).a();
                object5 = ((imj)object5).a();
                return new bmu(gzx.o((Collection)object), gzx.o((Collection)object6), (List)gzx.o((Collection)object5));
            }
            case 10: {
                return new fma((hpr)this.a.b(), (flr)this.c.b(), ((ilt)this.b).a());
            }
            case 9: {
                jnu jnu5 = this.a;
                object = this.b;
                return new bmu(((fgp)this.c).a(), ((ffh)object).a(), ((ffs)jnu5).a());
            }
            case 8: {
                frr frr2 = (frr)this.a.b();
                Optional optional = (Optional)((imc)this.c).a;
                return new ezu(frr2, (hpq)this.b.b(), "ZipfileRequests", false, (Boolean)optional.orElse(object));
            }
            case 7: {
                frr frr3 = (frr)this.a.b();
                Optional optional = (Optional)((imc)this.c).a;
                return new ezu(frr3, (hpq)this.b.b(), "ManagerRequests", true, (Boolean)optional.orElse(object));
            }
            case 6: {
                object = ((ezx)this.c).a();
                Object object7 = ((iqw)this.b).a();
                Object object8 = ((iqw)this.a).a();
                long l2 = TimeUnit.MILLISECONDS.convert(3L, TimeUnit.MINUTES);
                Object object9 = new ArrayList<gki>();
                long l3 = fvc.aq((hwg)object7).toHours();
                object7 = TimeUnit.HOURS;
                l3 = TimeUnit.MILLISECONDS.convert(l3, (TimeUnit)((Object)object7));
                object7 = gkj.a;
                long l4 = fvc.aq((hwg)object8).toHours();
                object8 = TimeUnit.HOURS;
                boolean bl3 = l4 > 0L;
                fxf.q(bl3);
                object9.add(new gki((gkj)((Object)object7), TimeUnit.MILLISECONDS.convert(l4, (TimeUnit)((Object)object8))));
                bl3 = bl2;
                if (l3 != 0L) {
                    bl3 = true;
                }
                fxf.B(bl3, "You must specify a minimum sync interval for all syncs.");
                object8 = new gzy();
                object7 = object9.iterator();
                while (object7.hasNext()) {
                    object9 = (gki)object7.next();
                    ((gzy)object8).d((Object)((gki)object9).a, object9);
                }
                object8 = new gkh(l3, l2, ((gzy)object8).b());
                object9 = gkk.a("LanguagePackAutoUpdateSynclet");
                object = new dan(object, 7);
                fxf.B(true, "Every SyncletBinding must have a non-null SyncKey.");
                fxf.B(true, "Every SyncletBinding must have a non-null SyncConfig.");
                fxf.B(true, "Every SyncletBinding must have a non-null Synclet.");
                return new gkl((gkk)object9, (gkh)object8, (jnu)object);
            }
            case 5: {
                boolean bl4 = ((imr)this.c).a();
                bl2 = ((imr)this.a).a();
                if (dww.a(((ilt)this.b).a()) == null) {
                    object = dyb.b();
                } else {
                    object = dyb.a();
                    ((dya)object).e(true);
                    ((dya)object).d(bl4);
                    ((dya)object).b(bl2);
                    ((dya)object).c(true);
                    object = ((dya)object).a();
                }
                return object;
            }
            case 4: {
                return new evw((dtu)this.c.b(), (jvb)this.a.b(), (hpr)this.b.b());
            }
            case 3: {
                gto gto2 = (gto)((imc)this.c).a;
                Executor executor = (Executor)this.a.b();
                object = (Executor)this.b.b();
                jse.e(gto2, "useAudioReadNonTerminatingExecutor");
                jse.e(executor, "nonTerminatingExecutor");
                jse.e(object, "executor");
                if (((Boolean)gto2.e(false)).booleanValue()) {
                    object = executor;
                }
                idi.m(object);
                return object;
            }
            case 2: {
                object = this.a;
                return new eil(((ilt)this.c).a(), (eie)object.b(), ((ehf)this.b).a());
            }
            case 1: {
                jnu jnu6 = this.c;
                object = this.b;
                return new edj(((ilt)this.a).a(), ((gdb)object).a(), ((imr)jnu6).a());
            }
            case 0: 
        }
        return new egs((Optional)((imc)this.a).a, (Optional)((imc)this.b).a, ((ewk)this.c).a());
    }
}

