/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class agu
implements agq {
    private final Context a;
    private final agq b;

    public agu(Context context) {
        agw agw2 = new agw();
        this.a = context.getApplicationContext();
        this.b = agw2;
    }

    @Override
    public final /* synthetic */ agr a() {
        agz agz2 = ((agw)this.b).b();
        return new agv(this.a, agz2);
    }
}

