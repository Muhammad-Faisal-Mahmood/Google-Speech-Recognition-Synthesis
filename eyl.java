/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;

final class eyl
extends eyr {
    @Override
    public final int a(Context context, cxu cxu2, boolean bl2) {
        if (((Uri)cxu2.a).getAuthority().lastIndexOf(64) >= 0 && kl.t(context, "android.permission.INTERACT_ACROSS_USERS") == 0) {
            return 2;
        }
        return 3;
    }
}

