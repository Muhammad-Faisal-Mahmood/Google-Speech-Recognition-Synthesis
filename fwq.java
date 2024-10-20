/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ImageButton
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class fwq
extends ImageButton {
    public int d = this.getVisibility();

    public fwq(Context context) {
        this(context, null);
    }

    public fwq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fwq(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public final void g(int n2, boolean bl2) {
        super.setVisibility(n2);
        if (bl2) {
            this.d = n2;
        }
    }

    public final void setVisibility(int n2) {
        this.g(n2, true);
    }
}

