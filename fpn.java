/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

public final class fpn {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public final dua a() {
        ArrayList arrayList;
        Object object;
        fxf.K(this.d);
        if (this.a == null) {
            this.a = dua.b;
        }
        if (this.e == null) {
            this.e = dua.c((Context)this.d);
        }
        if (this.c == null) {
            this.c = new dty(this, 2);
        }
        if (this.b == null) {
            object = this.d;
            arrayList = new ArrayList();
            Collections.addAll(arrayList, new fpr(new cxt((Context)object, null)), new fpv());
            this.b = fvd.ap(new dty(arrayList, 0));
        }
        if (this.f == null) {
            this.f = new dty(this, 3);
        }
        arrayList = this.d;
        Object object2 = this.a;
        Object object3 = this.e;
        Object object4 = this.c;
        Object object5 = this.b;
        object = this.f;
        return new dua((Context)arrayList, (gui)object2, (gui)object3, (gui)object4, (gui)object5, (gui)object);
    }

    public final dfr b() {
        Object object = this.f;
        Object object2 = this.c;
        boolean bl2 = true;
        boolean bl3 = object != null;
        if (object2 == null) {
            bl2 = false;
        }
        fxf.B(bl3 ^ bl2, "One of metadata or metadata table must set, but not both at the same time");
        return new dfr(this);
    }
}

