/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hoh
extends hns {
    private List b;

    public hoh(gzm gzm2, boolean bl2) {
        super(gzm2, bl2, true);
        ArrayList arrayList = gzm2.isEmpty() ? Collections.emptyList() : fvd.w(gzm2.size());
        for (int i2 = 0; i2 < gzm2.size(); ++i2) {
            arrayList.add(null);
        }
        this.b = arrayList;
        this.q();
    }

    @Override
    public final void e(int n2, Object object) {
        List list = this.b;
        if (list != null) {
            list.set(n2, new bzq(object, null));
        }
    }

    @Override
    public final void g() {
        Object object = this.b;
        if (object != null) {
            ArrayList arrayList = fvd.w(object.size());
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (bzq)iterator.next();
                object = object != null ? ((bzq)object).a : null;
                arrayList.add(object);
            }
            this.m(DesugarCollections.unmodifiableList(arrayList));
        }
    }

    @Override
    public final void s(hnr hnr2) {
        super.s(hnr2);
        this.b = null;
    }
}

