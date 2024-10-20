/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.widget.TextView;
import java.util.function.Consumer;

public final class bnj
extends TextView {
    public Consumer a;

    public bnj(Context context) {
        super(context);
    }

    public final void setText(CharSequence charSequence, TextView.BufferType object) {
        super.setText(charSequence, object);
        object = this.a;
        if (object != null) {
            ag$$ExternalSyntheticApiModelOutline1.m((Consumer)object, (Object)charSequence);
        }
    }
}

