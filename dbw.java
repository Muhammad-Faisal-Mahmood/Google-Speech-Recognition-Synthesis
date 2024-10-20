/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class dbw {
    public String a;
    public int b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public dbw() {
    }

    public dbw(byte[] byArray, byte[] byArray2) {
        this.g = gsl.a;
    }

    public final dbx a() {
        String string;
        Object object = this.e;
        if (object != null) {
            this.f = ((gzy)object).b();
        } else if (this.f == null) {
            this.f = hcy.a;
        }
        object = this.g;
        if (object != null) {
            this.h = ((gzy)object).b();
        } else if (this.h == null) {
            this.h = hcy.a;
        }
        if (this.c == 1 && (string = this.a) != null && this.d != null) {
            int n2 = this.b;
            Object object2 = this.f;
            object = (hac)this.h;
            object = new day(string, n2, (hac)object2, (hac)object);
            dde.e(((day)object).a);
            dec.o("version", ((day)object).b);
            return object;
        }
        object = new StringBuilder();
        if (this.a == null) {
            ((StringBuilder)object).append(" name");
        }
        if (this.c == 0) {
            ((StringBuilder)object).append(" version");
        }
        if (this.d == null) {
            ((StringBuilder)object).append(" indexSpecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(den den2) {
        Object object;
        Object object2;
        if (this.g == null) {
            if (this.h == null) {
                this.g = new gzy();
            } else {
                this.g = object2 = new gzy();
                Object object3 = this.h;
                object = (gzy)object2;
                ((gzy)object2).g((Map)object3);
                this.h = null;
            }
        }
        object2 = this.g;
        object = den2.i();
        ((gzy)object2).d(object, den2);
    }

    public final void c(gzx gzx2) {
        if (gzx2 != null) {
            this.d = gzx2;
            return;
        }
        throw new NullPointerException("Null indexSpecs");
    }

    public final void d(String string) {
        if (string != null) {
            this.a = string;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void e(int n2) {
        this.b = n2;
        this.c = 1;
    }

    public final void f(hvi hvi2) {
        if (hvi2 != null) {
            this.h = hvi2;
            return;
        }
        throw new NullPointerException("Null customDownloaderMetadata");
    }

    public final void g(cuz cuz2) {
        if (cuz2 != null) {
            this.e = cuz2;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    public final void h(gzx gzx2) {
        if (gzx2 != null) {
            this.f = gzx2;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }

    public final void i(int n2) {
        this.b = n2;
        this.c = 1;
    }
}

