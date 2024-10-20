/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;

public final class cfq {
    private static final Uri a;

    static {
        Uri uri;
        a = uri = Uri.parse((String)"https://plus.google.com/");
        uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}

