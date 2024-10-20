/*
 * Decompiled with CFR 0.152.
 */
public final class cjw
implements ckq {
    public final cka a;
    public final String b;
    public final byte[] c;

    public /* synthetic */ cjw(cka cka2, String string, byte[] byArray) {
        this.a = cka2;
        this.b = string;
        this.c = byArray;
    }

    @Override
    public final Object a(ckz object) {
        Object object2 = object;
        if (!((ckz)object).e()) {
            cka cka2 = this.a;
            if (!cka2.l(11925000)) {
                object2 = cka.a();
            } else {
                byte[] byArray = this.c;
                object = this.b;
                object2 = new cer();
                ((cer)object2).a = new cjv((String)object, byArray, 0);
                object2 = cka2.d(((cer)object2).a());
            }
        }
        return object2;
    }
}

