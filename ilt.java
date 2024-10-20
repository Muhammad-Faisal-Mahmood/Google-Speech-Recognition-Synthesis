/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class ilt
implements imb {
    private final int a;
    private final Object b;

    public ilt(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    public static Context c(cxt object) {
        object = ((cxt)object).a;
        idi.m(object);
        return (Context)object;
    }

    public final Context a() {
        if (this.a != 0) {
            return ilt.c((cxt)this.b);
        }
        return (Context)((dlm)this.b).a;
    }

    @Override
    public final /* synthetic */ Object b() {
        if (this.a != 0) {
            return this.a();
        }
        return this.a();
    }
}

