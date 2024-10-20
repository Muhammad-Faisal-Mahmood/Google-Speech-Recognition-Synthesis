/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.widget.ImageView
 */
package androidx.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class PreferenceImageView
extends ImageView {
    private int a = Integer.MAX_VALUE;
    private int b = Integer.MAX_VALUE;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        context = context.obtainStyledAttributes(attributeSet, atn.j, n2, 0);
        this.setMaxWidth(context.getDimensionPixelSize(3, Integer.MAX_VALUE));
        this.setMaxHeight(context.getDimensionPixelSize(2, Integer.MAX_VALUE));
        context.recycle();
    }

    public final int getMaxHeight() {
        return this.b;
    }

    public final int getMaxWidth() {
        return this.a;
    }

    protected final void onMeasure(int n2, int n3) {
        int n4;
        block8: {
            int n5;
            block9: {
                int n6;
                int n7;
                block7: {
                    block5: {
                        int n8;
                        block6: {
                            block4: {
                                n5 = View.MeasureSpec.getMode((int)n2);
                                n7 = 0;
                                n6 = n5;
                                if (n5 == Integer.MIN_VALUE) break block4;
                                n4 = n2;
                                if (n5 != 0) break block5;
                                n6 = 0;
                            }
                            n5 = View.MeasureSpec.getSize((int)n2);
                            n8 = this.a;
                            n4 = n2;
                            if (n8 == Integer.MAX_VALUE) break block5;
                            if (n8 < n5) break block6;
                            n4 = n2;
                            if (n6 != 0) break block5;
                        }
                        n4 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)Integer.MIN_VALUE);
                    }
                    if ((n6 = View.MeasureSpec.getMode((int)n3)) == Integer.MIN_VALUE) break block7;
                    n2 = n3;
                    if (n6 != 0) break block8;
                    n6 = n7;
                }
                n7 = View.MeasureSpec.getSize((int)n3);
                n5 = this.b;
                n2 = n3;
                if (n5 == Integer.MAX_VALUE) break block8;
                if (n5 < n7) break block9;
                n2 = n3;
                if (n6 != 0) break block8;
            }
            n2 = View.MeasureSpec.makeMeasureSpec((int)n5, (int)Integer.MIN_VALUE);
        }
        super.onMeasure(n4, n2);
    }

    public final void setMaxHeight(int n2) {
        this.b = n2;
        super.setMaxHeight(n2);
    }

    public final void setMaxWidth(int n2) {
        this.a = n2;
        super.setMaxWidth(n2);
    }
}

