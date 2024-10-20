/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class fwm {
    public static final Comparator a = new py(3);

    public static List a(Toolbar toolbar, CharSequence charSequence) {
        ArrayList<View> arrayList = new ArrayList<View>();
        for (int i2 = 0; i2 < toolbar.getChildCount(); ++i2) {
            View view = toolbar.getChildAt(i2);
            if (!(view instanceof TextView) || !TextUtils.equals((CharSequence)(view = (TextView)view).getText(), (CharSequence)charSequence)) continue;
            arrayList.add(view);
        }
        return arrayList;
    }
}

