/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageButton
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class hl
extends ImageButton {
    private final hf a;
    private boolean b;
    private final khv c;

    public hl(Context context) {
        this(context, null);
    }

    public hl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969321);
    }

    public hl(Context object, AttributeSet attributeSet, int n2) {
        lv.a((Context)object);
        super((Context)object, attributeSet, n2);
        this.b = false;
        lt.d((View)this, this.getContext());
        object = new hf((View)this);
        this.a = object;
        ((hf)object).b(attributeSet, n2);
        this.c = object = new khv((ImageView)this);
        ((khv)object).i(attributeSet, n2);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((hf)object).a();
        }
        if ((object = this.c) != null) {
            ((khv)object).h();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.c.l() && super.hasOverlappingRendering();
    }

    public final void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((hf)object).e();
        }
    }

    public final void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        hf hf2 = this.a;
        if (hf2 != null) {
            hf2.c(n2);
        }
    }

    public final void setImageBitmap(Bitmap object) {
        super.setImageBitmap((Bitmap)object);
        object = this.c;
        if (object != null) {
            ((khv)object).h();
        }
    }

    public final void setImageDrawable(Drawable object) {
        khv khv2 = this.c;
        if (khv2 != null && object != null && !this.b) {
            khv2.j((Drawable)object);
        }
        super.setImageDrawable((Drawable)object);
        object = this.c;
        if (object != null) {
            ((khv)object).h();
            if (!this.b) {
                this.c.g();
            }
        }
    }

    public final void setImageLevel(int n2) {
        super.setImageLevel(n2);
        this.b = true;
    }

    public final void setImageResource(int n2) {
        this.c.k(n2);
    }

    public final void setImageURI(Uri object) {
        super.setImageURI((Uri)object);
        object = this.c;
        if (object != null) {
            ((khv)object).h();
        }
    }
}

