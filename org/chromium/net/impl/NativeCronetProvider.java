/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.impl.ImplVersion;

public class NativeCronetProvider
extends kof {
    public NativeCronetProvider(Context context) {
        super(context);
    }

    @Override
    public final String a() {
        return "App-Packaged-Cronet-Provider";
    }

    @Override
    public final String b() {
        return ImplVersion.getCronetVersion();
    }

    @Override
    public final kob d() {
        return new koi(new krx(this.a));
    }

    @Override
    public final void e() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (object == this) return bl3;
        if (!(object instanceof NativeCronetProvider)) return false;
        if (!this.a.equals(((NativeCronetProvider)object).a)) return false;
        return bl2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.a});
    }
}

