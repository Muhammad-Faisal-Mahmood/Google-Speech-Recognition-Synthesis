/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class kjc
extends khd {
    final kjd d;
    final kjx e;

    public kjc(String string, kjd kjd2, kjx kjx2) {
        this.d = kjd2;
        this.e = kjx2;
        super(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final long a() {
        jsj jsj2 = new jsj();
        Object object = this.e;
        kjl kjl2 = this.d.a;
        Object object2 = kjl2.u;
        // MONITORENTER : object2
        // MONITORENTER : kjl2
        kjs[] kjsArray = kjl2.r;
        Object object3 = new kjx();
        ((kjx)object3).e((kjx)kjsArray);
        ((kjx)object3).e((kjx)object);
        jsj2.a = object3;
        long l2 = (long)((kjx)jsj2.a).c() - (long)kjsArray.c();
        int n2 = 0;
        kjsArray = null;
        if (l2 != 0L) {
            if (!kjl2.c.isEmpty()) {
                kjsArray = kjl2.c.values().toArray(new kjs[0]);
            }
        } else {
            l2 = 0L;
        }
        object = (kjx)jsj2.a;
        jse.e(object, "<set-?>");
        kjl2.r = object;
        object = kjl2.k;
        object3 = a.aw(kjl2.d, " onSettings");
        kiz kiz2 = new kiz((String)object3, kjl2, jsj2);
        ((khf)object).f(kiz2);
        // MONITOREXIT : kjl2
        try {
            kjl2.u.a((kjx)jsj2.a);
        }
        catch (IOException iOException) {
            kjl2.d(iOException);
        }
        if (kjsArray == null) return -1L;
        while (n2 < kjsArray.length) {
            object2 = kjsArray[n2];
            // MONITORENTER : object2
            ((kjs)object2).d(l2);
            // MONITOREXIT : object2
            ++n2;
        }
        return -1L;
    }
}

