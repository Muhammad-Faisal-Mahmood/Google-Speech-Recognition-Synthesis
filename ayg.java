/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class ayg {
    public static final ayc a = new ayk(null);
    public static final ArrayList b;
    private static final ThreadLocal c;

    static {
        c = new ThreadLocal();
        b = new ArrayList();
    }

    static ot a() {
        ThreadLocal threadLocal = c;
        Object object = (WeakReference)threadLocal.get();
        if (object != null && (object = (ot)((Reference)object).get()) != null) {
            return object;
        }
        object = new ot();
        threadLocal.set(new WeakReference<Object>(object));
        return object;
    }

    public static void b(ViewGroup viewGroup, ayc object) {
        if (object != null && viewGroup != null) {
            object = new ayf((ayc)object, viewGroup);
            viewGroup.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
            viewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
        }
    }

    public static void c(ViewGroup viewGroup, ayc ayc2) {
        ArrayList arrayList = (ArrayList)ayg.a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((ayc)arrayList.get(i2)).u((View)viewGroup);
            }
        }
        if (ayc2 != null) {
            ayc2.p(viewGroup, true);
        }
        if ((aay)viewGroup.getTag(2131427987) == null) {
            return;
        }
        throw null;
    }
}

