/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.VelocityTracker
 */
import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

public final class vq {
    public static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static vr a(VelocityTracker velocityTracker) {
        return (vr)a.get(velocityTracker);
    }
}

