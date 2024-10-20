/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class ake
implements afr {
    public final akc a;
    public final int b;
    public final long c;

    public /* synthetic */ ake(akc akc2, int n2, long l2) {
        this.a = akc2;
        this.b = n2;
        this.c = l2;
    }

    @Override
    public final void a(Object object) {
        Object object2 = this.a;
        Object object3 = ((akc)object2).d;
        object = (ako)object;
        if (object3 != null) {
            Object object4 = ((ako)object).b;
            Object object5 = ((akc)object2).b;
            object2 = ((ako)object).f;
            object3 = object4.d((aew)object5, (anc)object3);
            object5 = (Long)((HashMap)object2).get(object3);
            object2 = (Long)((ako)object).e.get(object3);
            object4 = ((ako)object).f;
            long l2 = 0L;
            long l3 = object5 == null ? 0L : (Long)object5;
            ((HashMap)object4).put(object3, l3 + this.c);
            object = ((ako)object).e;
            l3 = object2 == null ? l2 : (Long)object2;
            ((HashMap)object).put(object3, l3 + (long)this.b);
        }
    }
}

