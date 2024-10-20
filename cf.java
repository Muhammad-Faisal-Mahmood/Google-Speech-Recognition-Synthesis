/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class cf {
    public static final cm a = new cl();
    public static final cm b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = null;
        try {
            Object object2 = Class.forName("androidx.transition.FragmentTransitionSupport");
            jse.c(object2, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            object = object2 = (cm)((Class)object2).getDeclaredConstructor(null).newInstance(null);
        }
        catch (Exception exception) {}
        b = object;
    }

    public static final void a(be object, be iterator, boolean bl2, ot ot2, boolean bl3) {
        jse.e(object, "inFragment");
        jse.e(iterator, "outFragment");
        object = bl2 ? ((be)((Object)iterator)).z() : ((be)object).z();
        if (object != null) {
            iterator = new ArrayList(ot2.f);
            object = ot2.entrySet().iterator();
            while (object.hasNext()) {
                iterator.add((View)object.next().getValue());
            }
            object = new ArrayList(ot2.f);
            iterator = ot2.entrySet().iterator();
            while (iterator.hasNext()) {
                object.add((String)iterator.next().getKey());
            }
            if (bl3) {
                throw null;
            }
            throw null;
        }
    }

    public static final void b(List object, int n2) {
        jse.e(object, "views");
        object = object.iterator();
        while (object.hasNext()) {
            ((View)object.next()).setVisibility(n2);
        }
    }
}

