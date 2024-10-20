/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 */
import android.content.Context;
import android.content.pm.ProviderInfo;

public final class eyk
extends eyr {
    final String a;

    public eyk(String string) {
        this.a = string;
    }

    @Override
    public final int a(Context context, cxu cxu2, boolean bl2) {
        Object object = cxu2.b;
        if (context.getPackageName().equals(((ProviderInfo)object).packageName)) {
            if (!bl2) {
                return 2;
            }
        } else {
            if (bl2) {
                return 2;
            }
            if (!this.a.equals(((ProviderInfo)cxu2.b).packageName)) {
                return 3;
            }
        }
        return 1;
    }
}

