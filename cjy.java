/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public final class cjy
implements ckq {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ cjy(cba cba2, cag cag2, int n2) {
        this.c = n2;
        this.b = cba2;
        this.a = cag2;
    }

    public /* synthetic */ cjy(cka cka2, dup dup2, int n2) {
        this.c = n2;
        this.a = cka2;
        this.b = dup2;
    }

    @Override
    public final Object a(ckz object) {
        Object object2;
        if (this.c != 0) {
            if (!((ckz)object).e()) {
                Log.e((String)"ClearcutLoggerApiImpl", (String)"Error resolving compliance data.", (Throwable)((ckz)object).c());
            } else {
                Object object3 = this.a;
                Object object4 = this.b;
                object = (ccs)object4;
                ccv ccv2 = ((ccs)object).h;
                object3 = new caz((cba)object4, (cag)object3, ccv2);
                ((ccs)object).f((cdl)object3);
                object = kl.au((ccx)object3);
            }
            return object;
        }
        boolean bl2 = ((ckz)object).c() instanceof cdb;
        Object object5 = this.b;
        Object object6 = this.a;
        if (bl2) {
            object = ((dup)object5).c;
            object2 = ((cka)object6).i((String)object);
        } else {
            object2 = object;
            if (((ckz)object).c() instanceof ccq) {
                ccq ccq2 = (ccq)((ckz)object).c();
                fxf.K(ccq2);
                object2 = object;
                if (ccq2.a() == 29514) {
                    object = ((dup)object5).c;
                    object2 = ((cka)object6).i((String)object);
                }
            }
        }
        return object2;
    }
}

