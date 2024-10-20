/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.util.Property
 *  android.view.animation.LinearInterpolator
 */
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

public final class bah
extends Drawable {
    private static final Property b = new bag(Integer.class);
    private static final TimeInterpolator c = bab.a;
    public final ObjectAnimator a;
    private final RectF d = new RectF();
    private final Paint e;

    public bah() {
        Paint paint;
        this.e = paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint = ObjectAnimator.ofInt((Object)((Object)this), (Property)b, (int[])new int[]{0, 10000});
        this.a = paint;
        paint.setRepeatCount(-1);
        paint.setRepeatMode(1);
        paint.setDuration(6000L);
        paint.setInterpolator((TimeInterpolator)new LinearInterpolator());
    }

    private static float a(float f2, float f3, float f4) {
        if (f2 != f3) {
            return (f4 - f2) / (f3 - f2);
        }
        return 0.0f;
    }

    public final void draw(Canvas canvas) {
        float f2;
        canvas.save();
        this.d.set(this.getBounds());
        RectF rectF = this.d;
        float f3 = 0.0f;
        rectF.inset(0.0f, 0.0f);
        this.e.setStrokeWidth(0.0f);
        rectF = this.e;
        boolean bl2 = false;
        rectF.setColor(0);
        int n2 = this.getLevel();
        float f4 = (float)(n2 - n2 / 2000 * 2000) / 2000.0f;
        if (f4 < 0.5f) {
            bl2 = true;
        }
        if (bl2) {
            f2 = bah.a(0.0f, 0.5f, f4);
            f2 = c.getInterpolation(f2);
        } else {
            f2 = bah.a(0.5f, 1.0f, f4);
            f2 = 1.0f - c.getInterpolation(f2);
        }
        float f5 = Math.max(1.0f, f2 * 306.0f);
        f2 = n2;
        rectF = this.d;
        canvas.rotate(((f2 *= 1.0E-4f) + f2) * 360.0f - 90.0f + f4 * 54.0f, rectF.centerX(), rectF.centerY());
        rectF = this.d;
        f2 = bl2 ? f3 : 306.0f - f5;
        canvas.drawArc(rectF, f2, f5, false, this.e);
        canvas.restore();
    }

    public final int getOpacity() {
        return -1;
    }

    protected final boolean onLevelChange(int n2) {
        return true;
    }

    public final void setAlpha(int n2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

