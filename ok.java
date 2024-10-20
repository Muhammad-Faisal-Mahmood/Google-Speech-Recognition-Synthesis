/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public final class ok
extends LayoutInflater {
    private static final String[] a = new String[]{"android.widget.", "android.webkit.", "android.app."};

    public ok(Context context) {
        super(context);
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new ok(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final View onCreateView(String string, AttributeSet attributeSet) {
        String[] stringArray = a;
        int n2 = 0;
        while (n2 < 3) {
            String string2 = stringArray[n2];
            try {
                string2 = this.createView(string, string2, attributeSet);
                if (string2 != null) {
                    return string2;
                }
            }
            catch (ClassNotFoundException classNotFoundException) {}
            ++n2;
        }
        return super.onCreateView(string, attributeSet);
    }
}

