/*
 * Decompiled with CFR 0.152.
 */
public final class epl
extends jsf
implements jrk {
    final int a;
    private final int b;

    public epl(int n2, int n3) {
        this.b = n3;
        this.a = n2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2 = this.b;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = true;
        boolean bl6 = true;
        boolean bl7 = true;
        boolean bl8 = true;
        boolean bl9 = true;
        switch (n2) {
            default: {
                object = (eua)object;
                jse.e(object, "it");
                bl3 = ((eua)object).b != this.a ? bl8 : false;
            }
            case 6: {
                object = (ets)object;
                jse.e(object, "it");
                bl3 = ((ets)object).b != this.a ? bl9 : false;
                return bl3;
            }
            case 5: {
                object = (eqo)object;
                jse.e(object, "it");
                bl3 = ((eqo)object).c.a != this.a ? bl2 : false;
                return bl3;
            }
            case 4: {
                object = (eqo)object;
                jse.e(object, "it");
                if (((eqo)object).c.a == this.a) {
                    bl3 = false;
                }
                return bl3;
            }
            case 3: {
                object = (eqh)object;
                jse.e(object, "it");
                bl3 = ((eqh)object).c.a != this.a ? bl4 : false;
                return bl3;
            }
            case 2: {
                object = (epq)object;
                jse.e(object, "it");
                bl3 = ((epq)object).c != this.a ? bl5 : false;
                return bl3;
            }
            case 1: {
                object = (eke)object;
                jse.e(object, "it");
                bl3 = ((eke)object).a != this.a ? bl6 : false;
                return bl3;
            }
            case 0: {
                object = (epf)object;
                jse.e(object, "it");
                bl3 = ((epf)object).d != this.a ? bl7 : false;
                return bl3;
            }
        }
        return bl3;
    }
}

