/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Set;

public final class ham
extends gzl {
    public hcn a;
    public boolean b = false;
    public boolean c = false;

    public ham() {
        this(4);
    }

    public ham(int n2) {
        this.a = new hcn(n2);
    }

    public final hap a() {
        Objects.requireNonNull(this.a);
        hcn hcn2 = this.a;
        if (hcn2.c == 0) {
            return hdb.a;
        }
        if (this.c) {
            this.a = new hcn(hcn2);
            this.c = false;
        }
        this.b = true;
        return new hdb(this.a);
    }

    public final void b(Iterable object3) {
        Objects.requireNonNull(this.a);
        if (object3 instanceof hch) {
            Object object2 = object3 instanceof hdb ? ((hdb)object3).b : null;
            if (object2 != null) {
                object3 = this.a;
                ((hcn)object3).i(Math.max(((hcn)object3).c, ((hcn)object2).c));
                int n2 = ((hcn)object2).a();
                while (n2 >= 0) {
                    this.d(((hcn)object2).h(n2), ((hcn)object2).c(n2));
                    n2 = ((hcn)object2).e(n2);
                }
            } else {
                Set set = object3.j();
                object2 = this.a;
                ((hcn)object2).i(Math.max(((hcn)object2).c, set.size()));
                for (Object object3 : object3.j()) {
                    this.d(((hci)object3).a, ((hci)object3).a());
                }
            }
            return;
        }
        super.e((Iterable)object3);
    }

    public final void d(Object object, int n2) {
        Objects.requireNonNull(this.a);
        if (n2 == 0) {
            return;
        }
        if (this.b) {
            this.a = new hcn(this.a);
            this.c = false;
        }
        this.b = false;
        fxf.K(object);
        hcn hcn2 = this.a;
        hcn2.o(object, n2 + hcn2.b(object));
    }

    public final void g(Object object) {
        this.d(object, 1);
    }
}

