/*
 * Decompiled with CFR 0.152.
 */
public final class akh
implements afr {
    public final akc a;
    public final hti b;

    public /* synthetic */ akh(akc akc2, hti hti2) {
        this.a = akc2;
        this.b = hti2;
    }

    @Override
    public final void a(Object object) {
        Object object2;
        block3: {
            block4: {
                block5: {
                    block2: {
                        object = (ako)object;
                        Object object3 = this.a;
                        if (((akc)object3).d == null) break block2;
                        hti hti2 = this.b;
                        object2 = hti2.b;
                        abr.i(object2);
                        akp akp2 = ((ako)object).b;
                        Object object4 = ((akc)object3).b;
                        object3 = ((akc)object3).d;
                        abr.i(object3);
                        object4 = akp2.d((aew)object4, (anc)object3);
                        object2 = new dvy((adu)object2, (String)object4);
                        int n2 = hti2.a;
                        if (n2 == 0) break block3;
                        if (n2 == 1) break block4;
                        if (n2 == 2) break block3;
                        if (n2 == 3) break block5;
                    }
                    return;
                }
                ((ako)object).s = object2;
                return;
            }
            ((ako)object).r = object2;
            return;
        }
        ((ako)object).q = object2;
    }
}

