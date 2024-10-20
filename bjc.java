/*
 * Decompiled with CFR 0.152.
 */
public final class bjc {
    public static final String a = bbi.b("ConstraintTrkngWrkr");

    /*
     * Unable to fully structure code
     */
    public static final Object a(bzb var0, bhd var1_1, jqb var2_2) {
        if (!(var2_2 instanceof bjb)) ** GOTO lbl-1000
        var4_3 = (bjb)var2_2;
        var3_4 = var4_3.b;
        if ((var3_4 & -2147483648) != 0) {
            var4_3.b = var3_4 + -2147483648;
            var2_2 = var4_3;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = new bjb((jqb)var2_2);
        }
        var4_3 = var2_2.a;
        var5_5 = jqh.a;
        var3_4 = var2_2.b;
        if (var3_4 == 0) ** GOTO lbl18
        if (var3_4 == 1) {
            jns.ak(var4_3);
            var0 = var4_3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            jns.ak(var4_3);
            var0 = new bja(new jzg(var0.J((bhd)var1_1), new ehs((bhd)var1_1, null, 1), 2), 0);
            var2_2.b = 1;
            var0 = var1_1 = jsd.p((jyx)var0, (jqb)var2_2);
            if (var1_1 == var5_5) {
                return var5_5;
            }
        }
        return new Integer(((ber)var0).a);
    }
}

