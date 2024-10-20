/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;

public final class csa
implements iua {
    private static final crz a = new crz();
    private final hsq b;

    public csa(hsq hsq2) {
        this.b = hsq2;
    }

    @Override
    public final itz a(ixb ixb2, itw itw2, itx itx2) {
        crz crz2 = a;
        ArrayList<crz> arrayList = (ArrayList<crz>)itw2.g(jba.c);
        arrayList = arrayList == null ? new ArrayList<crz>() : new ArrayList(arrayList);
        hsq hsq2 = this.b;
        arrayList.add(crz2);
        return hsq2.a(ixb2, itw2.f(jba.c, DesugarCollections.unmodifiableList(arrayList)), itx2);
    }
}

