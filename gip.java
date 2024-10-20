/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;

public final class gip
extends ile {
    public gip(Activity activity) {
        super(activity);
    }

    @Override
    protected final Object a() {
        boolean bl2 = this.a.getApplication() instanceof ghv;
        Activity activity = this.a;
        fxf.G(bl2, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
        return super.a();
    }
}

