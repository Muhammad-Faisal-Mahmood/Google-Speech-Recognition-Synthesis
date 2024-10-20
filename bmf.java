/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.function.Consumer;

public final class bmf
extends ImageView {
    public Consumer a;

    public bmf(Context context) {
        super(context);
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Consumer consumer = this.a;
        if (consumer != null) {
            ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)drawable);
        }
    }
}

