/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

final class an
extends cu {
    public final List a;
    public final cy b;
    public final cy c;
    public final cm d;
    public final ot e;
    public final boolean f;
    public Object g;
    private final Object j;
    private final ArrayList k;
    private final ArrayList l;
    private final ot m;
    private final ArrayList n;
    private final ArrayList o;
    private final ot p;
    private final tu q;

    public an(List list, cy cy2, cy cy3, cm cm2, Object object, ArrayList arrayList, ArrayList arrayList2, ot ot2, ArrayList arrayList3, ArrayList arrayList4, ot ot3, ot ot4, boolean bl2) {
        this.a = list;
        this.b = cy2;
        this.c = cy3;
        this.d = cm2;
        this.j = object;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = ot2;
        this.n = arrayList3;
        this.o = arrayList4;
        this.p = ot3;
        this.e = ot4;
        this.f = bl2;
        this.q = new tu();
    }

    private final joc g(ViewGroup object, cy cy2, cy cy3) {
        int n2;
        Object object2;
        Object object3;
        View view = new View(object.getContext());
        Rect rect = new Rect();
        Iterator iterator = this.a.iterator();
        Object object4 = null;
        int n3 = 0;
        View view2 = null;
        while (iterator.hasNext()) {
            if (!((ao)iterator.next()).c() || cy3 == null || cy2 == null || this.m.isEmpty() || this.j == null) continue;
            boolean bl2 = this.f;
            object3 = this.p;
            object2 = cy3.c;
            cf.a(cy2.c, (be)object2, bl2, (ot)object3, true);
            vl.a((View)object, new ai(cy2, cy3, this, 0));
            this.k.addAll(this.p.values());
            if (!this.o.isEmpty()) {
                object2 = this.o.get(0);
                jse.d(object2, "exitingNames[0]");
                object2 = (String)object2;
                view2 = (View)this.p.get(object2);
                this.d.j(this.j, view2);
            }
            this.l.addAll(this.e.values());
            n2 = n3;
            if (!this.n.isEmpty()) {
                object2 = this.n.get(0);
                jse.d(object2, "enteringNames[0]");
                object2 = (String)object2;
                object2 = (View)this.e.get(object2);
                n2 = n3;
                if (object2 != null) {
                    vl.a((View)object, new aj(object2, rect, 0));
                    n2 = 1;
                }
            }
            this.d.k(this.j, view, this.k);
            object3 = this.d;
            object2 = this.j;
            ((cm)object3).q(object2, null, null, object2, this.l);
            n3 = n2;
        }
        object3 = new ArrayList();
        iterator = this.a.iterator();
        object2 = null;
        while (iterator.hasNext()) {
            int n4;
            ao ao2 = (ao)iterator.next();
            cy cy4 = ao2.a;
            Object object5 = this.d.a(ao2.b);
            if (object5 == null) continue;
            ArrayList arrayList = new ArrayList();
            Object object6 = cy4.c.P;
            jse.d(object6, "operation.fragment.mView");
            this.h(arrayList, (View)object6);
            if (this.j != null && (cy4 == cy3 || cy4 == cy2)) {
                if (cy4 == cy3) {
                    arrayList.removeAll(jns.x(this.k));
                } else {
                    arrayList.removeAll(jns.x(this.l));
                }
            }
            if (arrayList.isEmpty()) {
                this.d.d(object5, view);
            } else {
                this.d.e(object5, arrayList);
                this.d.q(object5, object5, arrayList, null, null);
                if (cy4.a == cx.c) {
                    cy4.h();
                    object6 = new ArrayList(arrayList);
                    ((ArrayList)object6).remove(cy4.c.P);
                    this.d.h(object5, cy4.c.P, (ArrayList)object6);
                    vl.a((View)object, new ak(arrayList, 1));
                }
            }
            if (cy4.a == cx.b) {
                ((ArrayList)object3).addAll(arrayList);
                if (n3 != 0) {
                    this.d.i(object5, rect);
                }
                if (by.S(2)) {
                    Objects.toString(object5);
                    n4 = arrayList.size();
                    for (n2 = 0; n2 < n4; ++n2) {
                        cy4 = arrayList.get(n2);
                        jse.d(cy4, "transitioningViews");
                        Objects.toString((View)cy4);
                    }
                }
            } else {
                this.d.j(object5, view2);
                if (by.S(2)) {
                    Objects.toString(object5);
                    n4 = arrayList.size();
                    for (n2 = 0; n2 < n4; ++n2) {
                        cy4 = arrayList.get(n2);
                        jse.d(cy4, "transitioningViews");
                        Objects.toString((View)cy4);
                    }
                }
            }
            if (ao2.c) {
                object4 = this.d.p(object4, object5);
                continue;
            }
            object2 = this.d.p(object2, object5);
        }
        object = this.d.b(object4, object2, this.j);
        if (by.S(2)) {
            Objects.toString(object);
        }
        return new joc(object3, object);
    }

    private final void h(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.isTransitionGroup()) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
            } else {
                int n2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < n2; ++i2) {
                    view = viewGroup.getChildAt(i2);
                    if (view.getVisibility() != 0) continue;
                    jse.d(view, "child");
                    this.h(arrayList, view);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, jqz object) {
        Object object2;
        int n2;
        cf.b(arrayList, 4);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList arrayList3 = this.l;
        int n3 = arrayList3.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object2 = (View)arrayList3.get(n2);
            arrayList2.add(wa.f((View)object2));
            wa.l((View)object2, null);
        }
        if (by.S(2)) {
            arrayList3 = this.k;
            n3 = arrayList3.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object2 = arrayList3.get(n2);
                jse.d(object2, "sharedElementFirstOutViews");
                Objects.toString(object2);
                wa.f((View)object2);
            }
            arrayList3 = this.l;
            n3 = arrayList3.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object2 = arrayList3.get(n2);
                jse.d(object2, "sharedElementLastInViews");
                Objects.toString(object2);
                wa.f((View)object2);
            }
        }
        object.a();
        arrayList3 = this.k;
        object2 = this.l;
        ot ot2 = this.m;
        int n4 = ((ArrayList)object2).size();
        object = new ArrayList();
        block3: for (n2 = 0; n2 < n4; ++n2) {
            Object object3 = (View)arrayList3.get(n2);
            String string = wa.f((View)object3);
            ((ArrayList)object).add(string);
            if (string == null) continue;
            wa.l((View)object3, null);
            object3 = (String)ot2.get(string);
            for (n3 = 0; n3 < n4; ++n3) {
                if (!((String)object3).equals(arrayList2.get(n3))) continue;
                wa.l((View)((ArrayList)object2).get(n3), string);
                continue block3;
            }
        }
        vl.a((View)viewGroup, new fjx(n4, (ArrayList)object2, arrayList2, arrayList3, (ArrayList)object, 1));
        cf.b(arrayList, 0);
        this.d.l(this.j, this.k, this.l);
    }

    @Override
    public final void a(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        this.q.a();
    }

    @Override
    public final void b(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        if (!viewGroup.isLaidOut()) {
            for (ao ao2 : this.a) {
                cy cy2 = ao2.a;
                if (by.S(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(cy2);
                }
                ao2.a.f(this);
            }
        } else {
            Object object = this.g;
            if (object != null) {
                this.d.t(object);
                if (by.S(2)) {
                    Objects.toString(this.b);
                    Objects.toString(this.c);
                    return;
                }
            } else {
                object = this.g(viewGroup, this.c, this.b);
                Object object2 = ((joc)object).a;
                object = ((joc)object).b;
                Object object3 = this.a;
                object2 = (ArrayList)object2;
                Object object4 = new ArrayList<cy>(jns.B((Iterable)object3));
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    object4.add(((ao)object3.next()).a);
                }
                Iterator iterator = object4.iterator();
                while (iterator.hasNext()) {
                    object4 = (cy)iterator.next();
                    cm cm2 = this.d;
                    object3 = ((cy)object4).c;
                    cm2.r(object, this.q, new aj(object4, this, 2));
                }
                this.i((ArrayList)object2, viewGroup, new al((Object)this, (Object)viewGroup, object, 1));
                if (by.S(2)) {
                    Objects.toString(this.b);
                    Objects.toString(this.c);
                }
            }
        }
    }

    @Override
    public final void c(mk mk2, ViewGroup object) {
        jse.e(mk2, "backEvent");
        jse.e(object, "container");
        object = this.g;
        if (object != null) {
            this.d.w(object, mk2.a);
        }
    }

    @Override
    public final void d(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        if (!viewGroup.isLaidOut()) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                cy cy2 = ((ao)iterator.next()).a;
                if (!by.S(2)) continue;
                Objects.toString(viewGroup);
                Objects.toString(cy2);
            }
        } else {
            Serializable serializable;
            if (this.f() && this.j != null && !((cu)this).e()) {
                serializable = new StringBuilder("Ignoring shared elements transition ");
                ((StringBuilder)serializable).append(this.j);
                ((StringBuilder)serializable).append(" between ");
                ((StringBuilder)serializable).append(this.b);
                ((StringBuilder)serializable).append(" and ");
                ((StringBuilder)serializable).append(this.c);
                ((StringBuilder)serializable).append(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
                Log.i((String)"FragmentManager", (String)((StringBuilder)serializable).toString());
            }
            if (((cu)this).e() && this.f()) {
                serializable = new jsj();
                Object object = this.g(viewGroup, this.c, this.b);
                Object object2 = ((joc)object).a;
                object = ((joc)object).b;
                Object object3 = this.a;
                object2 = (ArrayList)object2;
                Object object4 = new ArrayList<cy>(jns.B((Iterable)object3));
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    object4.add(((ao)object3.next()).a);
                }
                Iterator iterator = object4.iterator();
                while (iterator.hasNext()) {
                    cy cy3 = (cy)iterator.next();
                    object3 = new ak(serializable, 0);
                    object4 = this.d;
                    be be2 = cy3.c;
                    ((cm)object4).z(object, this.q, (Runnable)object3, new aj(cy3, this, 3));
                }
                this.i((ArrayList)object2, viewGroup, new am(this, viewGroup, object, (jsj)serializable));
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean e() {
        boolean bl2;
        boolean bl3 = this.d.n();
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        Object object = this.a;
        if (!object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object object2 = (ao)object.next();
                bl4 = bl2;
                if (Build.VERSION.SDK_INT < 34) return bl4;
                object2 = ((ao)object2).b;
                bl4 = bl2;
                if (object2 == null) return bl4;
                if (this.d.o(object2)) continue;
                return bl2;
            }
        }
        object = this.j;
        if (object == null) return true;
        if (this.d.o(object)) return true;
        return bl2;
    }

    public final boolean f() {
        boolean bl2;
        block3: {
            Object object = this.a;
            bl2 = object.isEmpty();
            boolean bl3 = true;
            if (bl2) {
                bl2 = bl3;
            } else {
                object = object.iterator();
                do {
                    bl2 = bl3;
                    if (!object.hasNext()) break block3;
                } while (((ao)object.next()).a.c.s);
                bl2 = false;
            }
        }
        return bl2;
    }
}

