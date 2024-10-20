/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Spatializer
 */
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

public final class aor
implements Spatializer$OnSpatializerStateChangedListener {
    final aox a;

    public aor(aox aox2) {
        this.a = aox2;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean bl2) {
        this.a.d();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean bl2) {
        this.a.d();
    }
}

