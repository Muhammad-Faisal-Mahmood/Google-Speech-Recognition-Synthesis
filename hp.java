/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapShader
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.ClipDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.RoundRectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.util.AttributeSet
 *  android.widget.ProgressBar
 */
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.wear.ambient.AmbientDelegate;

class hp {
    private static final int[] b = new int[]{16843067, 16843068};
    public Bitmap a;
    private final ProgressBar c;

    public hp(ProgressBar progressBar) {
        this.c = progressBar;
    }

    final Drawable a(Drawable drawable, boolean bl2) {
        if (drawable instanceof tq) {
            tq tq2 = (tq)drawable;
            Drawable drawable2 = tq2.a();
            if (drawable2 != null) {
                this.a(drawable2, bl2);
                tq2.b();
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                int n2;
                drawable = (LayerDrawable)drawable;
                int n3 = drawable.getNumberOfLayers();
                LayerDrawable layerDrawable = new Drawable[n3];
                int n4 = 0;
                for (n2 = 0; n2 < n3; ++n2) {
                    int n5 = drawable.getId(n2);
                    Drawable drawable3 = drawable.getDrawable(n2);
                    bl2 = n5 == 16908301 || n5 == 16908303;
                    layerDrawable[n2] = this.a(drawable3, bl2);
                }
                layerDrawable = new LayerDrawable((Drawable[])layerDrawable);
                for (n2 = n4; n2 < n3; ++n2) {
                    layerDrawable.setId(n2, drawable.getId(n2));
                    layerDrawable.setLayerGravity(n2, drawable.getLayerGravity(n2));
                    layerDrawable.setLayerWidth(n2, drawable.getLayerWidth(n2));
                    layerDrawable.setLayerHeight(n2, drawable.getLayerHeight(n2));
                    layerDrawable.setLayerInsetLeft(n2, drawable.getLayerInsetLeft(n2));
                    layerDrawable.setLayerInsetRight(n2, drawable.getLayerInsetRight(n2));
                    layerDrawable.setLayerInsetTop(n2, drawable.getLayerInsetTop(n2));
                    layerDrawable.setLayerInsetBottom(n2, drawable.getLayerInsetBottom(n2));
                    layerDrawable.setLayerInsetStart(n2, drawable.getLayerInsetStart(n2));
                    layerDrawable.setLayerInsetEnd(n2, drawable.getLayerInsetEnd(n2));
                }
                return layerDrawable;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.a == null) {
                    this.a = bitmap;
                }
                drawable = new ShapeDrawable((Shape)new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                bitmap = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                drawable.getPaint().setShader((Shader)bitmap);
                drawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (bl2) {
                    return new ClipDrawable(drawable, 3, 1);
                }
                return drawable;
            }
        }
        return drawable;
    }

    public void b(AttributeSet attributeSet, int n2) {
        AmbientDelegate ambientDelegate = AmbientDelegate.A(this.c.getContext(), attributeSet, b, n2, 0);
        Drawable drawable = ambientDelegate.s(0);
        if (drawable != null) {
            ProgressBar progressBar = this.c;
            attributeSet = drawable;
            if (drawable instanceof AnimationDrawable) {
                drawable = (AnimationDrawable)drawable;
                int n3 = drawable.getNumberOfFrames();
                attributeSet = new AnimationDrawable();
                attributeSet.setOneShot(drawable.isOneShot());
                for (n2 = 0; n2 < n3; ++n2) {
                    Drawable drawable2 = this.a(drawable.getFrame(n2), true);
                    drawable2.setLevel(10000);
                    attributeSet.addFrame(drawable2, drawable.getDuration(n2));
                }
                attributeSet.setLevel(10000);
            }
            progressBar.setIndeterminateDrawable((Drawable)attributeSet);
        }
        if ((attributeSet = ambientDelegate.s(1)) != null) {
            this.c.setProgressDrawable(this.a((Drawable)attributeSet, false));
        }
        ambientDelegate.v();
    }
}

