/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fiz
implements gte {
    private final int a;

    public /* synthetic */ fiz(int n2) {
        this.a = n2;
    }

    @Override
    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                return ((iye)((Object)object)).name();
            }
            case 18: {
                object = (Throwable)object;
                return new bbf();
            }
            case 17: {
                return new bbg();
            }
            case 16: {
                return new bbg();
            }
            case 15: {
                object = (Set)object;
                return null;
            }
            case 14: {
                Object object2 = (List)object;
                object = new HashSet();
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    object2 = (fzd)iterator.next();
                    if (((fzd)object2).b.i.equals("incognito")) continue;
                    ((HashSet)object).add(((fzd)object2).a);
                }
                return object;
            }
            case 13: {
                return new gfb(true);
            }
            case 12: {
                ((ivu)object).j();
                return null;
            }
            case 11: {
                object = ((bzb)object).a;
                return null;
            }
            case 10: {
                Object object3 = (List)object;
                object = new gzs();
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    bbw bbw2 = (bbw)object3.next();
                    if (bbw2.c.contains("tiktok_account_work")) continue;
                    ((gzs)object).h(bbw2);
                }
                return ((gzs)object).g();
            }
            case 9: {
                object = (bbo)object;
                return null;
            }
            case 8: {
                return new ProtoParsers$InternalDontUse(null, (hyf)object);
            }
            case 7: {
                object = (gam)object;
                gzs gzs2 = new gzs();
                for (gap gap2 : DesugarCollections.unmodifiableMap(((gam)object).d).values()) {
                    int n2;
                    int n3 = a.t(gap2.e);
                    if (n3 == 0 || n3 != 2) continue;
                    fym fym2 = fym.a(gap2.c, gda.a);
                    fze fze2 = gap2.d;
                    object = fze2;
                    if (fze2 == null) {
                        object = fze.a;
                    }
                    n3 = n2 = a.t(gap2.e);
                    if (n2 == 0) {
                        n3 = 1;
                    }
                    gzs2.h(fzd.a(fym2, (fze)object, n3, gda.a));
                }
                return gzs2.g();
            }
            case 6: {
                fzq fzq2 = (fzq)object;
                object = (hwp)fzq2.C(5);
                ((hwp)object).x(fzq2);
                if (!((hwp)object).a.B()) {
                    ((hwp)object).b = ((hwp)object).q();
                    long l2 = cgw.p().toEpochMilli();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    fzq2 = (fzq)((hwp)object).b;
                    fzq fzq3 = fzq.a;
                    fzq2.b = 2 | fzq2.b;
                    fzq2.d = l2;
                    return (fzq)((hwp)object).o();
                }
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            case 5: {
                object = new fhc((fhd)object);
                ((fhc)object).c(true);
                return ((fhc)object).a();
            }
            case 4: {
                object = new fhc((fhd)object);
                ((fhc)object).b(true);
                return ((fhc)object).a();
            }
            case 3: {
                object = new fhc((fhd)object);
                ((fhc)object).d = false;
                return ((fhc)object).a();
            }
            case 2: {
                object = new fhc((fhd)object);
                ((fhc)object).d = true;
                return ((fhc)object).a();
            }
            case 1: {
                return (cnl)((jnu)object).b();
            }
            case 0: 
        }
        return Optional.ofNullable((fjm)((hac)object).get("ag-AG"));
    }
}

