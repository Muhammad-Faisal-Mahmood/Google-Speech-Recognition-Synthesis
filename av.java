/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

final class av
extends bc {
    final be a;

    public av(be be2) {
        this.a = be2;
    }

    @Override
    public final void a() {
        this.a.ad.a();
        acb.c(this.a);
        Object object = this.a.g;
        object = object != null ? object.getBundle("registryState") : null;
        this.a.ad.b((Bundle)object);
    }
}

