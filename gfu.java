/*
 * Decompiled with CFR 0.152.
 */
public final class gfu
extends jsf
implements jqz {
    final Object a;
    private final int b;

    public gfu(Object object, int n2) {
        this.b = n2;
        this.a = object;
        super(0);
    }

    @Override
    public final /* synthetic */ Object a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return this.a;
            }
            gfv gfv2 = (gfv)this.a;
            String string = gfv2.o;
            return gfv2.c.contains(string);
        }
        Object object = (ges)this.a;
        object = ((ges)object).c == 5 ? (hvu)((ges)object).d : hvu.b;
        jse.d(object, "getBytesValue(...)");
        return object;
    }
}

