/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import java.util.Objects;

public final class bel
implements Runnable {
    private final int a;
    private final Object b;

    public bel(apf apf2, int n2) {
        this.a = n2;
        this.b = apf2;
    }

    public bel(bem bem2, int n2) {
        this.a = n2;
        this.b = bem2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var2_1 = this.a;
        if (var2_1 != 0) {
            var4_3 = (ann)this.b;
            for (anu var5_7 : var4_3.i) {
                var5_7.k(true);
                var5_7.i();
            }
            var4_3 = var4_3.x;
            if (var4_3.c != null) {
                var4_3.c = null;
            }
            var4_3.a = null;
            return;
        }
        bbi.a();
        bem.e();
        var7_10 = this.b;
        var4_4 = ((bem)var7_10).g;
        synchronized (var4_4) {
            if (((bem)var7_10).h != null) {
                bbi.a();
                Objects.toString(((bem)var7_10).h);
                if (!((Intent)((bem)var7_10).g.remove(0)).equals(((bem)var7_10).h)) {
                    var5_8 = new IllegalStateException("Dequeue-d command is not the first.");
                    throw var5_8;
                }
                ((bem)var7_10).h = null;
            }
            var5_9 = ((bem)var7_10).j.a;
            var8_11 = ((bem)var7_10).f;
            var6_6 = var8_11.d;
            synchronized (var6_6) {
                var3_12 = var8_11.c.isEmpty();
                if (!var3_12 || !((bem)var7_10).g.isEmpty()) ** GOTO lbl-1000
            }
            var6_6 = ((big)var5_9).b;
            synchronized (var6_6) {
                var3_12 = ((big)var5_9).a.isEmpty();
                ** if (!var3_12) goto lbl-1000
            }
lbl-1000:
            // 1 sources

            {
                bbi.a();
                var5_9 = ((bem)var7_10).i;
                if (var5_9 != null) {
                    var5_9.a();
                }
                ** GOTO lbl46
            }
lbl-1000:
            // 2 sources

            {
                if (!((bem)var7_10).g.isEmpty()) {
                    ((bem)var7_10).c();
                }
            }
lbl46:
            // 4 sources

            return;
        }
    }
}

