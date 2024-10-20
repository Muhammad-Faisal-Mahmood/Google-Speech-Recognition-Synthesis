/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

final class bp
extends my {
    final by a;

    public bp(by by2) {
        this.a = by2;
    }

    @Override
    public final void a() {
        y y2;
        if (by.S(3)) {
            Objects.toString(this.a);
        }
        by by2 = this.a;
        if (by.S(3)) {
            Objects.toString(by2.e);
        }
        if ((y2 = by2.e) != null) {
            y2.b = false;
            ak ak2 = new ak(by2, 8);
            if (y2.t == null) {
                y2.t = new ArrayList();
            }
            y2.t.add(ak2);
            by2.e.h();
            by2.f = true;
            by2.Y();
            by2.f = false;
            by2.e = null;
        }
    }

    @Override
    public final void b() {
        if (by.S(3)) {
            Objects.toString(this.a);
        }
        by by2 = this.a;
        by2.f = true;
        by2.af(true);
        int n2 = 0;
        by2.f = false;
        if (by2.e != null) {
            int n3;
            int n4;
            Object object;
            Object object22;
            if (!by2.i.isEmpty()) {
                object22 = new LinkedHashSet(by.Z(by2.e));
                object = by2.i;
                n4 = object.size();
                for (n3 = 0; n3 < n4; ++n3) {
                    Object object3 = (gpk)object.get(n3);
                    Iterator iterator = object22.iterator();
                    while (iterator.hasNext()) {
                        object3 = (be)iterator.next();
                    }
                }
            }
            object = by2.e.d;
            n4 = object.size();
            for (n3 = 0; n3 < n4; ++n3) {
                object22 = ((cd)object.get((int)n3)).b;
                if (object22 == null) continue;
                ((be)object22).s = false;
            }
            for (Object object22 : by2.i(new ArrayList<y>(Collections.singletonList(by2.e)), 0, 1)) {
                ((cz)object22).i(((cz)object22).c);
                ((cz)object22).e(((cz)object22).c);
            }
            object22 = by2.e.d;
            n4 = object22.size();
            for (n3 = n2; n3 < n4; ++n3) {
                object = ((cd)object22.get((int)n3)).b;
                if (object == null || ((be)object).O != null) continue;
                by2.ah((be)object).e();
            }
            by2.e = null;
            by2.N();
            if (by.S(3)) {
                boolean bl2 = by2.g.b;
                Objects.toString(by2);
            }
            return;
        }
        if (by2.g.b) {
            by2.W();
            return;
        }
        by2.d.b();
    }

    @Override
    public final void c(mk object) {
        if (by.S(2)) {
            Objects.toString(this.a);
        }
        Object object2 = this.a;
        Object object32 = ((by)object2).e;
        if (object32 != null) {
            int n2;
            int n3;
            object32 = new ArrayList<y>(Collections.singletonList(object32));
            int n4 = 0;
            for (Object object32 : ((by)object2).i((ArrayList)object32, 0, 1)) {
                jse.e(object, "backEvent");
                if (by.S(2)) {
                    float f2 = ((mk)object).a;
                }
                Object object4 = ((cz)object32).c;
                List list = new ArrayList();
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    jns.A(list, ((cy)object4.next()).i);
                }
                list = jns.s(jns.x(list));
                n3 = list.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    ((cu)list.get(n2)).c((mk)object, ((cz)object32).a);
                }
            }
            object = this.a.i;
            n3 = object.size();
            for (n2 = n4; n2 < n3; ++n2) {
                object2 = (gpk)object.get(n2);
            }
        }
    }

    @Override
    public final void d() {
        if (by.S(3)) {
            Objects.toString(this.a);
        }
        this.a.D();
        by by2 = this.a;
        by2.E(new bx(by2), false);
    }
}

