/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

final class bs
implements nl {
    final by a;
    private final int b;

    public bs(by by2, int n2) {
        this.b = n2;
        this.a = by2;
    }

    @Override
    public final /* synthetic */ void a(Object stringArray) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object = this.a;
                stringArray = (nk)stringArray;
                object = (bu)((by)object).s.pollFirst();
                if (object == null) {
                    this.toString();
                    Log.w((String)"FragmentManager", (String)"No IntentSenders were started for ".concat(this.toString()));
                    return;
                }
                Object object2 = this.a.y;
                String string = ((bu)object).a;
                if ((object2 = ((bqv)object2).d(string)) == null) {
                    Log.w((String)"FragmentManager", (String)"Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(string)));
                    return;
                }
                ((be)object2).onActivityResult(((bu)object).b, stringArray.a, stringArray.b);
                return;
            }
            Object object = (Map)stringArray;
            stringArray = object.keySet().toArray(new String[0]);
            Object object3 = new ArrayList(object.values());
            object = new int[((ArrayList)object3).size()];
            for (n2 = 0; n2 < ((ArrayList)object3).size(); ++n2) {
                int n3 = true != (Boolean)((ArrayList)object3).get(n2) ? -1 : 0;
                object[n2] = n3;
            }
            bu bu2 = (bu)this.a.s.pollFirst();
            if (bu2 == null) {
                this.toString();
                Log.w((String)"FragmentManager", (String)"No permissions were requested for ".concat(this.toString()));
                return;
            }
            Object object4 = this.a.y;
            object3 = bu2.a;
            if ((object4 = ((bqv)object4).d((String)object3)) == null) {
                Log.w((String)"FragmentManager", (String)"Permission request result delivered for unknown Fragment ".concat(String.valueOf(object3)));
                return;
            }
            ((be)object4).onRequestPermissionsResult(bu2.b, stringArray, (int[])object);
            return;
        }
        Object object = this.a;
        stringArray = (nk)stringArray;
        object = (bu)((by)object).s.pollLast();
        if (object == null) {
            this.toString();
            Log.w((String)"FragmentManager", (String)"No Activities were started for result for ".concat(this.toString()));
            return;
        }
        Object object5 = this.a.y;
        String string = ((bu)object).a;
        if ((object5 = ((bqv)object5).d(string)) == null) {
            Log.w((String)"FragmentManager", (String)"Activity result delivered for unknown Fragment ".concat(String.valueOf(string)));
            return;
        }
        ((be)object5).onActivityResult(((bu)object).b, stringArray.a, stringArray.b);
    }
}

