/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;

public final class gt
extends View {
    public gt(Context context) {
        super(context);
        this.setWillNotDraw(true);
    }

    public final int getWindowSystemUiVisibility() {
        return 0;
    }
}

