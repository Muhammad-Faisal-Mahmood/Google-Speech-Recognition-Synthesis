/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.ContentInfo
 */
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

final class uy
implements ux {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public uy(uv uv2) {
        ClipData clipData = uv2.a;
        a.Y(clipData);
        this.a = clipData;
        this.b = uv2.b;
        this.c = uv2.c;
        this.d = uv2.d;
        this.e = uv2.e;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.b;
    }

    @Override
    public final ClipData c() {
        return this.a;
    }

    @Override
    public final ContentInfo d() {
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentInfoCompat{clip=");
        stringBuilder.append(this.a.getDescription());
        stringBuilder.append(", source=");
        int n2 = this.b;
        CharSequence charSequence = n2 != 1 ? (n2 != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD") : "SOURCE_CLIPBOARD";
        stringBuilder.append((String)charSequence);
        stringBuilder.append(", flags=");
        charSequence = 1 != this.c ? "0" : "FLAG_CONVERT_TO_PLAIN_TEXT";
        stringBuilder.append((String)charSequence);
        charSequence = this.d;
        String string = "";
        if (charSequence == null) {
            charSequence = "";
        } else {
            charSequence = new StringBuilder(", hasLinkUri(");
            ((StringBuilder)charSequence).append(this.d.toString().length());
            ((StringBuilder)charSequence).append(")");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        charSequence = this.e == null ? string : ", hasExtras";
        stringBuilder.append((String)charSequence);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

