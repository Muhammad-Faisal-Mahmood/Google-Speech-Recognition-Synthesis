/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class bqv {
    public Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public bqv() {
        this.d = new ArrayList();
        this.c = new HashMap();
        this.b = new HashMap();
    }

    public bqv(brg brg2, brc brc2, brb brb2) {
        this.b = brg2;
        this.c = brc2;
        this.d = brb2;
    }

    public final brd a() {
        idi.k(this.a, be.class);
        Object object = this.b;
        Object object2 = this.a;
        return new brd((brg)object, (brb)this.d, (be)object2);
    }

    public final Bundle b(String string, Bundle bundle) {
        if (bundle != null) {
            return ((HashMap)this.b).put(string, bundle);
        }
        return (Bundle)((HashMap)this.b).remove(string);
    }

    public final be c(String object) {
        if ((object = (gbb)((HashMap)this.c).get(object)) != null) {
            return (be)((gbb)object).c;
        }
        return null;
    }

    public final be d(String string) {
        for (Object object : ((HashMap)this.c).values()) {
            if (object == null) continue;
            object = ((gbb)object).c;
            be be2 = (be)object;
            if (!string.equals(be2.k)) {
                object = be2.C.y.d(string);
            }
            if (object == null) continue;
            return (be)object;
        }
        return null;
    }

    public final List e() {
        ArrayList<gbb> arrayList = new ArrayList<gbb>();
        for (gbb gbb2 : ((HashMap)this.c).values()) {
            if (gbb2 == null) continue;
            arrayList.add(gbb2);
        }
        return arrayList;
    }

    public final List f() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (gbb gbb2 : ((HashMap)this.c).values()) {
            if (gbb2 != null) {
                arrayList.add(gbb2.c);
                continue;
            }
            arrayList.add(null);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List g() {
        if (((ArrayList)this.d).isEmpty()) {
            return Collections.emptyList();
        }
        Object object = this.d;
        synchronized (object) {
            return new ArrayList(this.d);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(be be2) {
        if (!((ArrayList)this.d).contains(be2)) {
            Object object = this.d;
            synchronized (object) {
                ((ArrayList)this.d).add(be2);
            }
            be2.q = true;
            return;
        }
        Objects.toString(be2);
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(be2)));
    }

    public final void i() {
        ((HashMap)this.c).values().removeAll(Collections.singleton(null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(be be2) {
        Object object = this.d;
        synchronized (object) {
            ((ArrayList)this.d).remove(be2);
        }
        be2.q = false;
    }

    public final boolean k(String string) {
        return ((HashMap)this.c).get(string) != null;
    }

    public final gbb l(String string) {
        return (gbb)((HashMap)this.c).get(string);
    }

    public final void m(gbb gbb2) {
        Object object = gbb2.c;
        be be2 = (be)object;
        if (!this.k(be2.k)) {
            Object object2 = this.c;
            String string = be2.k;
            ((HashMap)object2).put(string, gbb2);
            if (be2.K) {
                if (be2.J) {
                    ((ca)this.a).a(be2);
                } else {
                    ((ca)this.a).e(be2);
                }
                be2.K = false;
            }
            if (by.S(2)) {
                Objects.toString(object);
            }
        }
    }

    public final void n(gbb object) {
        String string;
        Object object2;
        Object object3 = ((gbb)object).c;
        Object object4 = (be)object3;
        if (((be)object4).J) {
            ((ca)this.a).e((be)object4);
        }
        if (((HashMap)(object2 = this.c)).get(string = ((be)object4).k) == object && (gbb)((HashMap)(object = this.c)).put(object4 = ((be)object4).k, null) != null && by.S(2)) {
            Objects.toString(object3);
        }
    }
}

