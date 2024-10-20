/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class qs
implements qq {
    public qq a = null;
    public boolean b = false;
    public boolean c = false;
    public final ra d;
    public int e;
    public int f;
    int g = 1;
    qt h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();
    int l = 1;

    public qs(ra ra2) {
        this.d = ra2;
    }

    public final void a(qq qq2) {
        this.j.add(qq2);
        if (this.i) {
            qq2.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int n2) {
        if (!this.i) {
            this.i = true;
            this.f = n2;
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                ((qq)iterator.next()).f();
            }
        }
    }

    @Override
    public final void f() {
        block8: {
            Object object;
            block9: {
                block10: {
                    qs qs2;
                    object = this.k.iterator();
                    while (object.hasNext()) {
                        if (((qs)object.next()).i) continue;
                        break block8;
                    }
                    this.c = true;
                    object = this.a;
                    if (object != null) {
                        object.f();
                    }
                    if (this.b) {
                        this.d.f();
                        return;
                    }
                    Iterator iterator = this.k.iterator();
                    int n2 = 0;
                    object = null;
                    while (iterator.hasNext()) {
                        qs2 = (qs)iterator.next();
                        if (qs2 instanceof qt) continue;
                        ++n2;
                        object = qs2;
                    }
                    if (object == null || n2 != true || !((qs)object).i) break block9;
                    qs2 = this.h;
                    if (qs2 == null) break block10;
                    if (!((qt)qs2).i) break block8;
                    this.e = this.g * ((qt)qs2).f;
                }
                this.c(((qs)object).f + this.e);
            }
            if ((object = this.a) != null) {
                object.f();
            }
        }
    }

    public final String toString() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d.d.ai);
        stringBuilder.append(":");
        switch (this.l) {
            default: {
                object = "null";
                break;
            }
            case 8: {
                object = "BASELINE";
                break;
            }
            case 7: {
                object = "BOTTOM";
                break;
            }
            case 6: {
                object = "TOP";
                break;
            }
            case 5: {
                object = "RIGHT";
                break;
            }
            case 4: {
                object = "LEFT";
                break;
            }
            case 3: {
                object = "VERTICAL_DIMENSION";
                break;
            }
            case 2: {
                object = "HORIZONTAL_DIMENSION";
                break;
            }
            case 1: {
                object = "UNKNOWN";
            }
        }
        stringBuilder.append(object);
        stringBuilder.append("(");
        object = this.i ? Integer.valueOf(this.f) : "unresolved";
        stringBuilder.append(object);
        stringBuilder.append(") <t=");
        stringBuilder.append(this.k.size());
        stringBuilder.append(":d=");
        stringBuilder.append(this.j.size());
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

