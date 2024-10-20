/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

import j$.time.zone.h;
import j$.time.zone.i;
import java.security.PrivilegedAction;
import java.util.ArrayList;

final class g
implements PrivilegedAction {
    final ArrayList a;

    g(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final Object run() {
        Object object = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (object != null) {
            try {
                object = (i)i.class.cast(Class.forName((String)object, true, i.class.getClassLoader()).newInstance());
                i.d((i)object);
                this.a.add(object);
            }
            catch (Exception exception) {
                throw new Error(exception);
            }
        } else {
            i.d(new h());
        }
        return null;
    }
}

