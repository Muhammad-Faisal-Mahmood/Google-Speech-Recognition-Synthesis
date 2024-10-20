/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Spatializer
 *  android.os.Handler
 */
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;

public final class aos {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public Spatializer$OnSpatializerStateChangedListener d;

    public aos(Spatializer spatializer) {
        this.a = spatializer;
        boolean bl2 = xu$$ExternalSyntheticApiModelOutline6.m(spatializer) != 0;
        this.b = bl2;
    }
}

