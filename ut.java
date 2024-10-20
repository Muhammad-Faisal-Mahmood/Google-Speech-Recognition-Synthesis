/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.ContentInfo$Builder
 */
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

public final class ut
implements uu {
    private final ContentInfo.Builder a;

    public ut(ClipData clipData, int n2) {
        this.a = new ContentInfo.Builder(clipData, n2);
    }

    @Override
    public final uz a() {
        return new uz(new uw(ut$$ExternalSyntheticApiModelOutline0.m(this.a)));
    }

    @Override
    public final void b(Bundle bundle) {
        ut$$ExternalSyntheticApiModelOutline0.m(this.a, bundle);
    }

    @Override
    public final void c(int n2) {
        ut$$ExternalSyntheticApiModelOutline0.m(this.a, n2);
    }

    @Override
    public final void d(Uri uri) {
        ut$$ExternalSyntheticApiModelOutline0.m(this.a, uri);
    }
}

