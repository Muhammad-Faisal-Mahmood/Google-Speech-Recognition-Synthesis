/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;

public final class fhr
implements itt {
    public final fix a;

    public /* synthetic */ fhr(fix fix2) {
        this.a = fix2;
    }

    @Override
    public final ksb l() {
        Object object;
        gzx gzx2 = gzx.q(fhs.c);
        Object object2 = object = fhq.l(this.a);
        if (!gzx2.isEmpty()) {
            Object object3 = ((ksb)object).b;
            HashMap hashMap = new HashMap();
            Iterator iterator = ((ksb)object).m().iterator();
            while (true) {
                object2 = (iyc)object3;
                object = ((iyc)object2).a;
                if (!iterator.hasNext()) break;
                ksb ksb2 = (ksb)iterator.next();
                object2 = ksb2.a;
                hdy hdy2 = gzx2.v();
                while (hdy2.hasNext()) {
                    object2 = new iya((ixz)hdy2.next(), (ixy)object2);
                }
                kmp.U(ksb2.o((ixy)object2), (String)object, hashMap);
            }
            object2 = kmp.T((String)object, (iyc)object2, hashMap);
        }
        return object2;
    }
}

