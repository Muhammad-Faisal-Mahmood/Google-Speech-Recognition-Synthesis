/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class izj
implements ixz {
    @Override
    public final kmp a(ixx ixx2, iwx iwx2, ixy ixy2) {
        Object object;
        block12: {
            Object object2;
            Object object3;
            izk izk2;
            block14: {
                boolean bl2;
                block13: {
                    izk2 = (izk)ixx2.c().a(izl.a);
                    object = ixx2.e();
                    object3 = ((ixb)object).c;
                    bl2 = ((ixb)object).f;
                    if (!bl2) break block13;
                    object2 = object = (hpn)((ConcurrentHashMap)izk2.b).get(object3);
                    if (object != null) break block14;
                }
                object = izk2.d;
                int n2 = izk2.a;
                object = (ksb)((AmbientModeSupport$AmbientController)object).a;
                object2 = ((ksb)object).a;
                object = (iyx)((hac)((ksb)object).b).getOrDefault(object3, object2);
                if (object instanceof iyq) {
                    object = ((iyq)object).b(n2);
                } else {
                    try {
                        object = hhk.K(((iyx)object).a(n2));
                    }
                    catch (Exception exception) {
                        object = hhk.J(exception);
                    }
                }
                object2 = object;
                if (bl2) {
                    ((ConcurrentHashMap)izk2.b).putIfAbsent(object3, object);
                    hhk.T((hpn)object, new enb((Object)izk2, object3, object, 8), (Executor)hom.a);
                    object2 = object;
                }
            }
            if (!object2.isDone()) {
                object = izk2.c;
                object3 = new jam();
                hhk.T((hpn)object2, new emz(ixx2, (jam)object3, iwx2, ixy2, 5), (Executor)object);
                return object3;
            }
            try {
                object = (iyh)hhk.S((Future)object2);
                break block12;
            }
            catch (CancellationException cancellationException) {
            }
            catch (ExecutionException executionException) {
                // empty catch block
            }
            object2 = iyh.j.d((Throwable)object);
            object = ((Throwable)object).getMessage();
            object = object != null ? ((iyh)object2).e((String)object) : object2;
        }
        if (((iyh)object).g()) {
            return ixy2.a(ixx2, iwx2);
        }
        ixx2.a((iyh)object, new iwx());
        return new kmp(null);
    }
}

