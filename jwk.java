/*
 * Decompiled with CFR 0.152.
 */
public class jwk
extends jwp
implements jwi {
    private final boolean a;

    /*
     * Unable to fully structure code
     */
    public jwk() {
        var1_1 = true;
        super(true);
        this.I(null);
        var2_2 = this.E();
        var2_2 = var2_2 instanceof juq != false ? (juq)var2_2 : null;
        if (var2_2 == null) ** GOTO lbl15
        var3_3 = var2_2.e();
        var2_2 = var3_3;
        if (var3_3 == null) ** GOTO lbl15
        while (!var2_2.bq()) {
            if ((var2_2 = (var2_2 = var2_2.E()) instanceof juq != false ? (juq)var2_2 : null) != null) {
                var3_3 = var2_2.e();
                var2_2 = var3_3;
                if (var3_3 != null) continue;
            }
lbl15:
            // 5 sources

            var1_1 = false;
            break;
        }
        this.a = var1_1;
    }

    @Override
    public final boolean bq() {
        return this.a;
    }

    @Override
    public final boolean br() {
        return true;
    }
}

