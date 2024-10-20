/*
 * Decompiled with CFR 0.152.
 */
public final class bex
extends jqs
implements jrp {
    int a;
    public Object b;
    public Object c;

    public bex(jqb jqb2) {
        super(3, jqb2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final Object a(Object object3) {
        jqh jqh2 = jqh.a;
        int n2 = this.a;
        jns.ak(object3);
        if (n2 == 0) {
            void var4_12;
            void var1_5;
            Object object;
            block5: {
                object = this.b;
                for (ass ass2 : (ass[])this.c) {
                    if (jse.i(ass2, beq.a)) {
                        continue;
                    }
                    break block5;
                }
                Object var1_4 = null;
            }
            void var4_10 = var1_5;
            if (var1_5 == null) {
                beq beq2 = beq.a;
            }
            this.a = 1;
            if (object.bJ(var4_12, this) == jqh2) {
                return jqh2;
            }
        }
        return jon.a;
    }
}

