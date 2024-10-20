/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class gch {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public gch() {
        throw null;
    }

    public gch(fxm fxm2) {
        this.e = new fxl();
        this.g = new fxl();
        this.c = new fxl();
        this.j = new fxl();
        this.d = new fxa(0.0f);
        this.k = new fxa(0.0f);
        this.f = new fxa(0.0f);
        this.b = new fxa(0.0f);
        this.a = new fxf();
        this.i = new fxf();
        this.l = new fxf();
        this.h = new fxf();
        this.e = fxm2.j;
        this.g = fxm2.k;
        this.c = fxm2.l;
        this.j = fxm2.m;
        this.d = fxm2.b;
        this.k = fxm2.c;
        this.f = fxm2.d;
        this.b = fxm2.e;
        this.a = fxm2.f;
        this.i = fxm2.g;
        this.l = fxm2.h;
        this.h = fxm2.i;
    }

    public gch(gcl gcl2) {
        gsl gsl2 = gsl.a;
        this.c = gsl2;
        this.e = gsl2;
        this.g = gsl2;
        this.h = gsl2;
        this.j = gsl2;
        this.k = gsl2;
        this.l = gsl2;
        this.a = gcl2.a;
        this.b = gcl2.b;
        this.c = gcl2.c;
        this.d = gcl2.d;
        this.e = gcl2.e;
        this.f = gcl2.f;
        this.g = gcl2.g;
        this.h = gcl2.h;
        this.i = gcl2.i;
        this.j = gcl2.j;
        this.k = gcl2.k;
        this.l = gcl2.l;
    }

    public gch(byte[] object) {
        object = gsl.a;
        this.c = object;
        this.e = object;
        this.g = object;
        this.h = object;
        this.j = object;
        this.k = object;
        this.l = object;
    }

    public gch(char[] cArray) {
        this.e = new fxl();
        this.g = new fxl();
        this.c = new fxl();
        this.j = new fxl();
        this.d = new fxa(0.0f);
        this.k = new fxa(0.0f);
        this.f = new fxa(0.0f);
        this.b = new fxa(0.0f);
        this.a = new fxf();
        this.i = new fxf();
        this.l = new fxf();
        this.h = new fxf();
    }

    private static void l(fxf fxf2) {
        if (fxf2 instanceof fxl) {
            fxf2 = (fxl)fxf2;
            return;
        }
        if (fxf2 instanceof fxe) {
            fxf2 = (fxe)fxf2;
        }
    }

    public final gcl a() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = this.a;
        if (object5 != null && (object4 = this.b) != null && (object3 = this.d) != null && (object2 = this.f) != null && (object = this.i) != null) {
            Object object6 = this.c;
            Object object7 = this.e;
            Object object8 = this.g;
            Object object9 = this.h;
            Object object10 = this.j;
            Object object11 = this.k;
            gto gto2 = (gto)this.l;
            object11 = (gto)object11;
            object10 = (gto)object10;
            object9 = (gto)object9;
            object8 = (gto)object8;
            object7 = (gto)object7;
            object6 = (gto)object6;
            object = (hav)object;
            object2 = (bas)object2;
            object3 = (gcj)object3;
            object4 = (baq)object4;
            object5 = new gcl((Class)object5, (baq)object4, (gto)object6, (gcj)object3, (gto)object7, (bas)object2, (gto)object8, (gto)object9, (hav)object, (gto)object10, (gto)object11, gto2);
            if (((gcl)object5).l.g()) {
                fxf.r(((String)((gcl)object5).l.c()).contains(":") ^ true, "Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
            }
            return object5;
        }
        object5 = new StringBuilder();
        if (this.a == null) {
            ((StringBuilder)object5).append(" workerClass");
        }
        if (this.b == null) {
            ((StringBuilder)object5).append(" constraints");
        }
        if (this.d == null) {
            ((StringBuilder)object5).append(" initialDelay");
        }
        if (this.f == null) {
            ((StringBuilder)object5).append(" inputData");
        }
        if (this.i == null) {
            ((StringBuilder)object5).append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(object5.toString()));
    }

    public final void b(baq baq2) {
        if (baq2 != null) {
            this.b = baq2;
            return;
        }
        throw new NullPointerException("Null constraints");
    }

    public final void c(gci gci2) {
        this.g = gto.i(gci2);
    }

    public final void d(Set set) {
        this.i = hav.n(set);
    }

    public final void e(String string) {
        this.l = gto.i(string);
    }

    public final void f(gck gck2) {
        this.h = gto.i(gck2);
    }

    public final void g(float f2) {
        this.d = new fxa(f2);
        this.k = new fxa(f2);
        this.f = new fxa(f2);
        this.b = new fxa(f2);
    }

    public final void h(fxf fxf2) {
        this.j = fxf2;
        gch.l(fxf2);
    }

    public final void i(fxf fxf2) {
        this.c = fxf2;
        gch.l(fxf2);
    }

    public final void j(fxf fxf2) {
        this.e = fxf2;
        gch.l(fxf2);
    }

    public final void k(fxf fxf2) {
        this.g = fxf2;
        gch.l(fxf2);
    }
}

