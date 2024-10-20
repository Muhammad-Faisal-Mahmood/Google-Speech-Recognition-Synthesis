/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class nv
extends nu {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ Object a(int n2, Intent object) {
        int n3;
        if (n2 != -1) return jpb.a;
        if (object == null) {
            return jpb.a;
        }
        Object object2 = object.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] nArray = object.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (nArray == null) return jpb.a;
        if (object2 != null) {
            n3 = nArray.length;
            object = new ArrayList(n3);
        } else {
            return jpb.a;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            boolean bl2 = nArray[n2] == 0;
            object.add(bl2);
        }
        List list = jns.Q((Object[])object2);
        Iterator iterator = list.iterator();
        object2 = object.iterator();
        object = new ArrayList(Math.min(jns.B(list), jns.B((Iterable)object)));
        while (iterator.hasNext()) {
            if (!object2.hasNext()) return jjj.J((Iterable)object);
            ((ArrayList)object).add(new joc(iterator.next(), object2.next()));
        }
        return jjj.J((Iterable)object);
    }

    @Override
    public final /* synthetic */ bzb c(Context object, Object stringArray) {
        block5: {
            stringArray = stringArray;
            jse.e(stringArray, "input");
            int n2 = stringArray.length;
            if (n2 == 0) {
                object = new bzb(jpb.a);
            } else {
                int n3;
                int n4 = 0;
                for (n3 = 0; n3 < n2; ++n3) {
                    if (ye.e(object, stringArray[n3]) == 0) {
                        continue;
                    }
                    object = null;
                    break block5;
                }
                n2 = stringArray.length;
                LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(jse.k(jjj.E(n2), 16));
                for (n3 = n4; n3 < n2; ++n3) {
                    object = new joc(stringArray[n3], true);
                    linkedHashMap.put(object.a, object.b);
                }
                object = new bzb(linkedHashMap);
            }
        }
        return object;
    }
}

