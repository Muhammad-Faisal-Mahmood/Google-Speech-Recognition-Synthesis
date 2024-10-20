/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 *  android.widget.LinearLayout$LayoutParams
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

public final class ftp
extends LinearLayout.LayoutParams {
    public int a = 1;
    public Interpolator b;
    public hth c;

    public ftp() {
        super(-1, -2);
    }

    public ftp(Context context, AttributeSet object) {
        super(context, object);
        TypedArray typedArray = context.obtainStyledAttributes(object, ftw.b);
        this.a = typedArray.getInt(1, 0);
        int n2 = typedArray.getInt(0, 0);
        object = null;
        if (n2 == 1) {
            object = new hth(null, null);
        }
        this.c = object;
        if (typedArray.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator((Context)context, (int)typedArray.getResourceId(2, 0));
        }
        typedArray.recycle();
    }

    public ftp(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public ftp(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public ftp(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

