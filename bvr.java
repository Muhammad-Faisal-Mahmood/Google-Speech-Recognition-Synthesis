/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
import android.content.Context;
import android.os.Handler;

public final class bvr
implements ajz {
    public final Context a;
    public final Object b;
    private final int c;

    public /* synthetic */ bvr(Object object, Context context, int n2) {
        this.c = n2;
        this.b = object;
        this.a = context;
    }

    @Override
    public final ajw[] a(Handler handler, aiv aiv2) {
        if (this.c != 0) {
            Context context = this.a;
            Object object = this.b;
            return new ajw[]{new aky(context, amc.a, handler, aiv2, (akx)object)};
        }
        Context context = this.a;
        Object object = this.b;
        return new ajw[]{new aky(context, amc.a, handler, aiv2, (akx)object)};
    }
}

