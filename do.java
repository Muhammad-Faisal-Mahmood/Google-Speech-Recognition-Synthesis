/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

final class do
implements nj {
    final dp a;

    public do(dp dp2) {
        this.a = dp2;
    }

    @Override
    public final void a(Context object) {
        object = this.a.bk();
        ((ds)object).e();
        this.a.getSavedStateRegistry().a("androidx:appcompat");
        ((ds)object).o();
    }
}

