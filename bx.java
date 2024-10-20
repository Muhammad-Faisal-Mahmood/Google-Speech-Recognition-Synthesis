/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

final class bx
implements bv {
    final by a;

    public bx(by by2) {
        this.a = by2;
    }

    @Override
    public final boolean f(ArrayList object4, ArrayList abstractCollection) {
        int n2;
        int n3;
        Object object2;
        Object object3;
        by by2 = this.a;
        if (by.S(2)) {
            Objects.toString(by2.a);
        }
        boolean bl2 = by2.b.isEmpty();
        int n4 = 0;
        if (bl2) {
            Log.i((String)"FragmentManager", (String)"Ignoring call to start back stack pop because the back stack is empty.");
            bl2 = false;
        } else {
            object3 = by2.b;
            by2.e = (y)((ArrayList)object3).get(((ArrayList)object3).size() - 1);
            object2 = by2.e.d;
            n3 = object2.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object3 = ((cd)object2.get((int)n2)).b;
                if (object3 == null) continue;
                ((be)object3).s = true;
            }
            bl2 = by2.ad((ArrayList)object4, (ArrayList)abstractCollection, -1, 0);
        }
        if (!this.a.i.isEmpty() && ((ArrayList)object4).size() > 0) {
            boolean bl3 = (Boolean)((ArrayList)abstractCollection).get(((ArrayList)object4).size() - 1);
            abstractCollection = new LinkedHashSet();
            n3 = object4.size();
            for (n2 = 0; n2 < n3; ++n2) {
                abstractCollection.addAll(by.Z((y)object4.get(n2)));
            }
            object3 = this.a.i;
            n3 = object3.size();
            for (n2 = n4; n2 < n3; ++n2) {
                object2 = (gpk)object3.get(n2);
                for (Object object4 : abstractCollection) {
                    ((gpk)object2).a(bl3);
                }
            }
        }
        return bl2;
    }
}

