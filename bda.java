/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class bda
implements awo {
    public final Context a;

    public /* synthetic */ bda(Context context) {
        this.a = context;
    }

    @Override
    public final awp a(duj duj2) {
        Object object = this.a;
        jse.e(object, "$context");
        object = yi.h((Context)object);
        ((awn)object).a = duj2.a;
        ((awn)object).b = (awm)duj2.e;
        ((awn)object).c = true;
        ((awn)object).d = true;
        return new axa().a(((awn)object).a());
    }
}

