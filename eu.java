/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.text.method.TransformationMethod
 *  android.view.View
 */
import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class eu
implements TransformationMethod {
    private final Locale a;

    public eu(Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View object) {
        if (charSequence != null) {
            object = this.a;
            return charSequence.toString().toUpperCase((Locale)object);
        }
        return null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean bl2, int n2, Rect rect) {
    }
}

