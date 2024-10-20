/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 */
import android.graphics.Paint;
import android.graphics.Path;

public final class fwz {
    public static final int[] a = new int[3];
    public static final float[] b = new float[]{0.0f, 0.5f, 1.0f};
    public static final int[] c = new int[4];
    public static final float[] d = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final int h;
    public final int i;
    public final int j;
    public final Path k = new Path();
    public final Paint l;

    public fwz() {
        int n2;
        Paint paint;
        Paint paint2;
        this.l = paint2 = new Paint();
        this.e = paint = new Paint();
        this.h = n2 = tf.c(-16777216, 68);
        this.i = tf.c(-16777216, 20);
        this.j = tf.c(-16777216, 0);
        paint.setColor(n2);
        paint2.setColor(0);
        this.f = paint2 = new Paint(4);
        paint2.setStyle(Paint.Style.FILL);
        this.g = new Paint(paint2);
    }
}

