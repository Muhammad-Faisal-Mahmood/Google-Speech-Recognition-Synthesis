/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.VelocityTracker
 */
import android.support.v7.widget.RecyclerView;
import android.view.VelocityTracker;

public final class bai {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 180.0f;
    public float d = (float)Math.toRadians(180.0);
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public float j;
    public RecyclerView k;
    public VelocityTracker l;

    public static float a(float f2) {
        double d2 = f2;
        if (d2 < -Math.PI) {
            f2 = (float)(d2 + Math.PI * 2);
        }
        if ((d2 = (double)f2) > Math.PI) {
            f2 = (float)(d2 - Math.PI * 2);
        }
        return f2;
    }
}

