/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.ArrayAdapter
 */
import android.content.Context;
import android.widget.ArrayAdapter;

final class dk
extends ArrayAdapter {
    public dk(Context context, int n2, CharSequence[] charSequenceArray) {
        super(context, n2, 16908308, (Object[])charSequenceArray);
    }

    public final long getItemId(int n2) {
        return n2;
    }

    public final boolean hasStableIds() {
        return true;
    }
}

