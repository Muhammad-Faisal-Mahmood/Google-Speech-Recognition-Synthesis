/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
import android.content.Context;
import android.util.AttributeSet;

public final class fyl {
    private static final int[] a = new int[]{0x1010000, 2130970056};
    private static final int[] b = new int[]{2130969556};

    public static Context a(Context context, AttributeSet attributeSet, int n2, int n3) {
        Object object = context.obtainStyledAttributes(attributeSet, b, n2, n3);
        n3 = object.getResourceId(0, 0);
        object.recycle();
        n2 = context instanceof nx && ((nx)context).a == n3 ? 1 : 0;
        if (n3 != 0 && n2 == 0) {
            object = new nx(context, n3);
            context = context.obtainStyledAttributes(attributeSet, a);
            n3 = context.getResourceId(0, 0);
            int n4 = context.getResourceId(1, 0);
            context.recycle();
            n2 = n3;
            if (n3 == 0) {
                n2 = n4;
            }
            if (n2 != 0) {
                object.getTheme().applyStyle(n2, true);
            }
            return object;
        }
        return context;
    }
}

