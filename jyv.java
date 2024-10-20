/*
 * Decompiled with CFR 0.152.
 */
final class jyv
implements jyy {
    final jyw a;
    final jsj b;
    final jyy c;

    public jyv(jyw jyw2, jsj jsj2, jyy jyy2) {
        this.a = jyw2;
        this.b = jsj2;
        this.c = jyy2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object bJ(Object var1_1, jqb var2_2) {
        if (!(var2_2 instanceof jyu)) ** GOTO lbl-1000
        var4_3 /* !! */  = (jyu)var2_2;
        var3_4 = var4_3 /* !! */ .c;
        if ((var3_4 & -2147483648) != 0) {
            var4_3 /* !! */ .c = var3_4 + -2147483648;
            var2_2 = var4_3 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = new jyu(this, var2_2);
        }
        var5_5 = var2_2.a;
        var4_3 /* !! */  = jqh.a;
        var3_4 = var2_2.c;
        if (var3_4 == 0) ** GOTO lbl17
        if (var3_4 == 1) {
            jns.ak(var5_5);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl17:
            // 1 sources

            jns.ak(var5_5);
            var5_5 = this.b.a;
            if (var5_5 == kag.a || !((Boolean)this.a.b.b(var5_5, var1_1)).booleanValue()) {
                this.b.a = var1_1;
                var5_5 = this.c;
                var2_2.c = 1;
                if (var5_5.bJ(var1_1, var2_2) == var4_3 /* !! */ ) {
                    return var4_3 /* !! */ ;
                }
            }
        }
        return jon.a;
    }
}

