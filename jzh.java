/*
 * Decompiled with CFR 0.152.
 */
public final class jzh
implements jyy {
    final Object a;
    private final int b;

    public jzh(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object bJ(Object var1_1, jqb var2_2) {
        block5: {
            if (this.b == 0) break block5;
            if (!(var2_2 instanceof jyr)) ** GOTO lbl-1000
            var4_3 /* !! */  = (jyr)var2_2;
            var3_4 = var4_3 /* !! */ .b;
            if ((var3_4 & -2147483648) != 0) {
                var4_3 /* !! */ .b = var3_4 + -2147483648;
                var2_2 = var4_3 /* !! */ ;
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = new jyr(this, var2_2);
            }
            var5_5 = var2_2.a;
            var4_3 /* !! */  = jqh.a;
            var3_4 = var2_2.b;
            if (var3_4 == 0) ** GOTO lbl18
            if (var3_4 == 1) {
                jns.ak(var5_5);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
                // 1 sources

                jns.ak(var5_5);
                jns.at(var2_2.d());
                var5_5 = this.a;
                var2_2.b = 1;
                if (var5_5.bJ(var1_1, var2_2) == var4_3 /* !! */ ) {
                    return var4_3 /* !! */ ;
                }
            }
            return jon.a;
        }
        ((jsj)this.a).a = var1_1;
        throw new jzp(this);
    }
}

