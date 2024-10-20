/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 */
import android.content.Context;
import android.content.res.AssetManager;

public final class bst {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/PipelineReaderImpl");
    public final AssetManager b;

    public bst(Context context) {
        this.b = context.getAssets();
    }
}

