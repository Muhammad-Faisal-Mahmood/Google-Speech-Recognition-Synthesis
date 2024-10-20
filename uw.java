/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.view.ContentInfo
 */
import android.content.ClipData;
import android.view.ContentInfo;

final class uw
implements ux {
    private final ContentInfo a;

    public uw(ContentInfo contentInfo) {
        a.Y(contentInfo);
        this.a = contentInfo;
    }

    @Override
    public final int a() {
        return ut$$ExternalSyntheticApiModelOutline0.m(this.a);
    }

    @Override
    public final int b() {
        return ut$$ExternalSyntheticApiModelOutline0.m$1(this.a);
    }

    @Override
    public final ClipData c() {
        return ut$$ExternalSyntheticApiModelOutline0.m(this.a);
    }

    @Override
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentInfoCompat{");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

