/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

final class fyf
extends ArrayAdapter {
    final fyg a;
    private final ColorStateList b;
    private final ColorStateList c;

    public fyf(fyg fyg2, Context colorStateList, int n2, String[] objectArray) {
        this.a = fyg2;
        super((Context)colorStateList, n2, objectArray);
        boolean bl2 = this.b();
        objectArray = null;
        if (!bl2) {
            colorStateList = null;
        } else {
            colorStateList = (ColorStateList)new int[1];
            colorStateList[0] = (Context)16842919;
            n2 = fyg2.c.getColorForState((int[])colorStateList, 0);
            colorStateList = new ColorStateList((int[][])new int[][]{(int[])colorStateList, new int[0]}, new int[]{n2, 0});
        }
        this.c = colorStateList;
        colorStateList = objectArray;
        if (this.a()) {
            if (!this.b()) {
                colorStateList = objectArray;
            } else {
                objectArray = new int[2];
                objectArray[0] = (String)16843623;
                objectArray[1] = (String)-16842919;
                colorStateList = (ColorStateList)new int[2];
                colorStateList[0] = (String)0x10100A1;
                colorStateList[1] = (String)-16842919;
                n2 = fyg2.c.getColorForState((int[])colorStateList, 0);
                int n3 = fyg2.c.getColorForState((int[])objectArray, 0);
                n2 = tf.b(n2, fyg2.b);
                int n4 = tf.b(n3, fyg2.b);
                n3 = fyg2.b;
                colorStateList = new ColorStateList((int[][])new int[][]{(int[])colorStateList, (int[])objectArray, new int[0]}, new int[]{n2, n4, n3});
            }
        }
        this.b = colorStateList;
    }

    private final boolean a() {
        return this.a.b != 0;
    }

    private final boolean b() {
        return this.a.c != null;
    }

    public final View getView(int n2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(n2, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView)view2;
            boolean bl2 = this.a.getText().toString().contentEquals(textView.getText());
            viewGroup = null;
            view = viewGroup;
            if (bl2) {
                if (!this.a()) {
                    view = viewGroup;
                } else {
                    view = new ColorDrawable(this.a.b);
                    if (this.c != null) {
                        view.setTintList(this.b);
                        view = new RippleDrawable(this.c, (Drawable)view, null);
                    }
                }
            }
            textView.setBackground((Drawable)view);
        }
        return view2;
    }
}

