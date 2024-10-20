/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

final class wi {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    public WeakReference c = null;
    private SparseArray d = null;

    static wi c(View view) {
        wi wi2;
        wi wi3 = wi2 = (wi)view.getTag(2131427926);
        if (wi2 == null) {
            wi3 = new wi();
            view.setTag(2131427926, (Object)wi3);
        }
        return wi3;
    }

    public static final boolean d(View object) {
        if ((object = (ArrayList)object.getTag(2131427927)) != null) {
            int n2;
            int n3 = ((ArrayList)object).size();
            while ((n2 = n3 - 1) >= 0) {
                n3 = n2;
                if (!((wh)((ArrayList)object).get(n2)).a()) continue;
                return true;
            }
        }
        return false;
    }

    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final View b(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                weakHashMap = (ViewGroup)view;
                int n2 = weakHashMap.getChildCount();
                while (--n2 >= 0) {
                    View view2 = this.b(weakHashMap.getChildAt(n2), keyEvent);
                    if (view2 == null) continue;
                    return view2;
                }
            }
            if (wi.d(view)) {
                return view;
            }
        }
        return null;
    }
}

