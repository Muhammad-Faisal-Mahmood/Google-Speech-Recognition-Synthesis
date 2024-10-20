/*
 * Decompiled with CFR 0.152.
 */
final class bsf
implements gww {
    @Override
    public final /* synthetic */ int a(Object object, Object object2) {
        object = (bsg)object;
        object = ((bsh)object2).a;
        int n2 = object.size();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += ((byte[])object.get(i2)).length;
        }
        return n3;
    }
}

