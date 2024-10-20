/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Collection$_EL;
import java.util.List;
import java.util.Map;

public final class ain
implements gte {
    private final int a;

    public /* synthetic */ ain(int n2) {
        this.a = n2;
    }

    @Override
    public final Object apply(Object object) {
        hdx hdx2;
        gzy gzy2;
        int n2 = this.a;
        Uri uri = Boolean.valueOf(true);
        switch (n2) {
            default: {
                object = (hac)object;
                gzy2 = new gzy();
                hdx2 = ((hac)object).k().k();
                break;
            }
            case 19: {
                return new czp(false, null, (Exception)object);
            }
            case 18: {
                return new czp(true, object, null);
            }
            case 17: {
                return new czp(false, null, (Exception)object);
            }
            case 16: {
                return new czp(true, object, null);
            }
            case 15: {
                return gto.h((cth)object);
            }
            case 14: {
                object = (Boolean)object != false ? cwh.d : cwh.e;
                return object;
            }
            case 13: {
                object = (css)object;
                return null;
            }
            case 12: {
                object = (csg)object;
                fxf.K(object);
                return object;
            }
            case 11: {
                object = (Void)object;
                return uri;
            }
            case 10: {
                return ((gzs)object).g();
            }
            case 9: {
                return new cvj((csg)object);
            }
            case 8: {
                return ((cmu)object).a();
            }
            case 7: {
                return (hac)Collection$_EL.stream((List)object).collect(gye.a(new bpf(10), new bpf(11)));
            }
            case 6: {
                object = (feo)object;
                uri = byu.a;
                return fcl.a(gzx.o(((feo)object).b));
            }
            case 5: {
                object = (Void)object;
                return uri;
            }
            case 4: {
                int n3;
                uri = (boz)object;
                object = bqb.a;
                object = new gzs();
                Object object2 = uri.b(2, uri.a());
                uri = (boy[])object2.createTypedArray(boy.CREATOR);
                object2.recycle();
                for (Object object3 : uri) {
                    String string = ((boy)object3).a;
                    object2 = ((boy)object3).b;
                    int n4 = ((boy)object3).c;
                    int n5 = ((boy)object3).d;
                    int n6 = ((boy)object3).e;
                    int n7 = ((boy)object3).f;
                    object3 = new bpq(string, (String)object2, n4, n5, n6, n7);
                    ((gzs)object).h(object3);
                }
                try {
                    object = ((gzs)object).g();
                }
                catch (RemoteException remoteException) {
                    Log.e((String)bqb.a, (String)"AiCore service failed to list features.", (Throwable)remoteException);
                    n3 = gzx.d;
                    object = hct.a;
                }
                return object;
            }
            case 3: {
                return ((bpl)object).a;
            }
            case 2: {
                object = (apo)object;
                object.f();
                return object.getClass().getSimpleName();
            }
            case 1: {
                uri = (adw)object;
                int n3 = adu.L;
                object = uri.a;
                uri = uri.b;
                uri = new StringBuilder();
                uri.append((String)object);
                uri.append(": null");
                return uri.toString();
            }
            case 0: {
                return new akl((afl)object);
            }
        }
        while (hdx2.hasNext()) {
            object = (Map.Entry)hdx2.next();
            ctf ctf2 = (ctf)object.getKey();
            if (object.getValue() == null) continue;
            if ((ctf2.b & 0x100) != 0) {
                Uri uri2 = (Uri)object.getValue();
                uri = ctf2.k;
                object = uri;
                if (uri == null) {
                    object = ikm.a;
                }
                uri = uri2;
                if (inw.a.b().f()) {
                    uri = ((ikm)object).b.size() == 0 ? uri2 : uri2.buildUpon().encodedFragment(fra.a((ikm)object)).build();
                }
                gzy2.d(ctf2, uri);
                continue;
            }
            gzy2.e((Map.Entry)object);
        }
        return gzy2.a();
    }
}

