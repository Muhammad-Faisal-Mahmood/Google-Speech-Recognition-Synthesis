/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class fuc
implements yd {
    final SwipeDismissBehavior a;

    public fuc(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean a(View var1_1) {
        block2: {
            block3: {
                var5_2 = this.a.G(var1_1);
                var3_3 = 0;
                if (!var5_2) break block2;
                var2_4 = var1_1.getLayoutDirection() == 1 ? 1 : 0;
                var4_5 = this.a.c;
                if (var4_5 != 0) break block3;
                if (var2_4 != 0) ** GOTO lbl-1000
                var2_4 = var3_3;
            }
            if (var4_5 == 1 && var2_4 == 0) lbl-1000:
            // 2 sources

            {
                var2_4 = -var1_1.getWidth();
            } else {
                var2_4 = var1_1.getWidth();
            }
            var6_6 = wj.a;
            var1_1.offsetLeftAndRight(var2_4);
            var1_1.setAlpha(0.0f);
            return true;
        }
        return false;
    }
}

