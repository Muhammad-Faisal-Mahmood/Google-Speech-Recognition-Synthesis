/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

public final class fwl {
    private static final int[] a = new int[]{2130968939};
    private static final int[] b = new int[]{2130968955};

    public static void a(Context context, AttributeSet attributeSet, int n2, int n3) {
        attributeSet = context.obtainStyledAttributes(attributeSet, fwi.b, n2, n3);
        boolean bl2 = attributeSet.getBoolean(1, false);
        attributeSet.recycle();
        if (bl2) {
            attributeSet = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969350, (TypedValue)attributeSet, true) || attributeSet.type == 18 && attributeSet.data == 0) {
                fwl.d(context, b, "Theme.MaterialComponents");
            }
        }
        fwl.d(context, a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int n2,  /* corrupt varargs signature?! */ intint n3) {
        if (!(context = context.obtainStyledAttributes(attributeSet, fwi.b, n2, n3)).getBoolean(2, false)) {
            context.recycle();
            return;
        }
        n2 = context.getResourceId(0, -1);
        context.recycle();
        if (n2 != -1) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static TypedArray c(Context context, AttributeSet attributeSet, int[] nArray, int n2,  /* corrupt varargs signature?! */ intint n3) {
        fwl.a(context, attributeSet, n2, n3);
        fwl.b(context, attributeSet, n2, n3);
        return context.obtainStyledAttributes(attributeSet, nArray, n2, n3);
    }

    private static void d(Context context, int[] nArray, String string) {
        if ((context = context.obtainStyledAttributes(nArray)).hasValue(0)) {
            context.recycle();
            return;
        }
        context.recycle();
        throw new IllegalArgumentException(a.aj(string, "The style on this component requires your app theme to be ", " (or a descendant)."));
    }
}

