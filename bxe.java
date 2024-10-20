/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.LruCache
 */
import android.content.Context;
import android.util.LruCache;

final class bxe
extends LruCache {
    final Context a;
    final bxf b;

    public bxe(bxf bxf2, Context context) {
        this.a = context;
        this.b = bxf2;
        super(20);
    }
}

