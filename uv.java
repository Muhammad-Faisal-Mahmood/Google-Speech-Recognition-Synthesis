/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

public final class uv
implements uu {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public uv(ClipData clipData, int n2) {
        this.a = clipData;
        this.b = n2;
    }

    @Override
    public final uz a() {
        return new uz(new uy(this));
    }

    @Override
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override
    public final void c(int n2) {
        this.c = n2;
    }

    @Override
    public final void d(Uri uri) {
        this.d = uri;
    }
}

