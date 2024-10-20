/*
 * Decompiled with CFR 0.152.
 */
import com.google.apps.tiktok.concurrent.AndroidFuturesService;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import java.util.Set;

public final class dot
implements imb {
    private final int a;

    public dot(int n2) {
        this.a = n2;
    }

    public static final gkf a() {
        fzr fzr2 = new fzr();
        gke gke2 = gkf.a();
        gke2.a = "AccountSyncData";
        gke2.d(fzq.a);
        gke2.c(fzr2);
        return gke2.a();
    }

    public static final Boolean c() {
        return true;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.a) {
            default: {
                return new bzo(null);
            }
            case 19: {
                return dot.c();
            }
            case 18: {
                return InternalForegroundService.class;
            }
            case 17: {
                return new gbb();
            }
            case 16: {
                return AndroidFuturesService.class;
            }
            case 15: {
                throw null;
            }
            case 14: {
                return new bzq(null);
            }
            case 13: {
                return new fvc(null);
            }
            case 12: {
                return new hth(null);
            }
            case 11: {
                Set set = jns.T(new hsh[]{new hsh("www.google.com"), new hsh("history.google.com"), new hsh("android.googleapis.com"), new hsh("lens-pa.googleapis.com"), new hsh("www.gstatic.com"), new hsh("speechs3proto2-pa.googleapis.com")});
                idi.m(set);
                return set;
            }
            case 10: {
                return new euf();
            }
            case 9: {
                return new hou();
            }
            case 8: {
                return new dml(null);
            }
            case 7: {
                return new cqq();
            }
            case 6: {
                return new cxt(null);
            }
            case 5: {
                return new dpg();
            }
            case 4: {
                return new ivu(null);
            }
            case 3: {
                return new dml();
            }
            case 2: {
                return true;
            }
            case 1: {
                return new cxu(null);
            }
            case 0: 
        }
        return new dor();
    }
}

