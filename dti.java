/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Collection$_EL;
import java.io.IOException;

public final class dti
implements gte {
    private final int a;

    public /* synthetic */ dti(int n2) {
        this.a = n2;
    }

    @Override
    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                return ((fgg)object).a();
            }
            case 19: {
                return new ProtoParsers$InternalDontUse(null, (fdk)object);
            }
            case 18: {
                feo feo2 = (feo)object;
                object = fcl.a;
                return fcl.a(gzx.o(feo2.b));
            }
            case 17: {
                return ((cxu)object).b;
            }
            case 16: {
                object = Collection$_EL.stream((gzx)object).filter(new fay(4));
                int n2 = gzx.d;
                return (gzx)object.collect(gye.a);
            }
            case 15: {
                object = Collection$_EL.stream((gzx)object).filter(new fay(5));
                int n3 = gzx.d;
                return (gzx)object.collect(gye.a);
            }
            case 14: {
                return fah.c((huw)object);
            }
            case 13: {
                feo feo3 = (feo)object;
                object = fac.a;
                return (hac)Collection$_EL.stream(gzx.o(feo3.b)).collect(gye.b(new fab(0), new fab(2), new faf(1)));
            }
            case 12: {
                return ((gzm)((hav)object)).f();
            }
            case 11: {
                object = Collection$_EL.stream((hav)object).filter(new fay(1));
                int n4 = gzx.d;
                return (gzx)object.collect(gye.a);
            }
            case 10: {
                ebq ebq2 = ((eas)object).c;
                object = ebq2;
                if (ebq2 == null) {
                    object = ebq.a;
                }
                return object;
            }
            case 9: {
                ebt ebt2 = ((ear)((eah)object).f()).c;
                object = ebt2;
                if (ebt2 == null) {
                    object = ebt.a;
                }
                return object;
            }
            case 8: {
                ebq ebq3 = ((ecy)object).c;
                object = ebq3;
                if (ebq3 == null) {
                    object = ebq.a;
                }
                return object;
            }
            case 7: {
                ebt ebt3 = ((ecx)((ecs)object).f()).c;
                object = ebt3;
                if (ebt3 == null) {
                    object = ebt.a;
                }
                return object;
            }
            case 6: {
                return (hyf)object;
            }
            case 5: {
                object = (Throwable)object;
                if (object instanceof ccq && ((ccq)object).a() == 31003) {
                    a.as(dzf.a.g(), "Clearcut dropped log because log cap is exceeded. Ignoring.", "com/google/android/libraries/search/appflows/transport/clearcut/ClearcutResultConverter", "handleClearcutException", '!', "ClearcutResultConverter.java", (Throwable)object);
                    return null;
                }
                throw new IllegalStateException("Clearcut logging failed.", (Throwable)object);
            }
            case 4: {
                object = (dut)object;
                if (((dut)object).a == 29514) {
                    object = dvk.a.l();
                    hyg hyg2 = dvh.b.l();
                    long l2 = System.currentTimeMillis();
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    hwv hwv2 = (dvh)((hwp)hyg2).b;
                    hwv2.c |= 8;
                    hwv2.g = l2;
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    hwv2 = (dvk)((hwp)object).b;
                    hyg2 = (dvh)((hwp)hyg2).o();
                    hyg2.getClass();
                    ((dvk)hwv2).c = hyg2;
                    ((dvk)hwv2).b |= 1;
                    return (dvk)((hwp)object).o();
                }
                throw object;
            }
            case 3: {
                return Log.w((String)"AccountRemovedRecv", (String)"Failed to remove account snapshot: ", (Throwable)((IOException)object));
            }
            case 2: {
                return ((dwc)object).a();
            }
            case 1: {
                Log.e((String)"CheckboxChecker", (String)"fetching usage reporting opt-in failed", (Throwable)((Throwable)object));
                return true;
            }
            case 0: 
        }
        return hqk.a((String)object);
    }
}

