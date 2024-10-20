/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.TypedValue;

public final class fyj
extends AppCompatTextView {
    public fyj(Context context, AttributeSet attributeSet) {
        super(fyl.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = this.getContext();
        if (fyj.c(context2)) {
            context = context2.getTheme();
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet, fyk.b, 16842884, 0);
            int n2 = fyj.a(context2, typedArray, 1, 2);
            typedArray.recycle();
            if (n2 == -1) {
                attributeSet = context.obtainStyledAttributes(attributeSet, fyk.b, 16842884, 0);
                n2 = attributeSet.getResourceId(0, -1);
                attributeSet.recycle();
                if (n2 != -1) {
                    this.b((Resources.Theme)context, n2);
                }
            }
        }
    }

    private static int a(Context context, TypedArray typedArray, int ... nArray) {
        int n2 = -1;
        for (int i2 = 0; i2 < 2 && n2 < 0; ++i2) {
            n2 = nArray[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(n2, typedValue) && typedValue.type == 2) {
                typedValue = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                n2 = typedValue.getDimensionPixelSize(0, -1);
                typedValue.recycle();
                continue;
            }
            n2 = typedArray.getDimensionPixelSize(n2, -1);
        }
        return n2;
    }

    private final void b(Resources.Theme theme, int n2) {
        theme = theme.obtainStyledAttributes(n2, fyk.a);
        n2 = fyj.a(this.getContext(), (TypedArray)theme, 2, 4);
        theme.recycle();
        if (n2 >= 0) {
            yj.h(this, n2);
        }
    }

    private static boolean c(Context context) {
        return fvc.s(context, 2130970010, true);
    }

    @Override
    public final void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        if (fyj.c(context)) {
            this.b(context.getTheme(), n2);
        }
    }
}

