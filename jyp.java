/*
 * Decompiled with CFR 0.152.
 */
public final class jyp
extends jyt {
    private final jro d;

    public /* synthetic */ jyp(jro jro2) {
        this(jro2, jqg.a, -2, 1);
    }

    public jyp(jro jro2, jqf jqf2, int n2, int n3) {
        super(jro2, jqf2, n2, n3);
        this.d = jro2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected final Object b(jyh var1_1, jqb var2_2) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        if (!(var2_2 instanceof jyo)) ** GOTO lbl-1000
                        var4_3 = (jyo)var2_2;
                        var3_4 = var4_3.c;
                        if ((var3_4 & -2147483648) != 0) {
                            var4_3.c = var3_4 + -2147483648;
                            var2_2 = var4_3;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = new jyo(this, (jqb)var2_2);
                        }
                        var4_3 = var2_2.a;
                        var5_5 = jqh.a;
                        var3_4 = var2_2.c;
                        if (var3_4 == 0) break block6;
                        if (var3_4 != 1) break block7;
                        var1_1 = var2_2.d;
                        jns.ak(var4_3);
                        break block8;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var4_3);
                var2_2.d = var1_1;
                var2_2.c = 1;
                if (jyt.d(this, var1_1, (jqb)var2_2) == var5_5) break block9;
            }
            if (var1_1.b.q()) {
                return jon.a;
            }
            throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        }
        return var5_5;
    }

    @Override
    protected final jzt c(jqf jqf2, int n2, int n3) {
        return new jyp(this.d, jqf2, n2, n3);
    }
}

