/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

public final class fpo {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public fpo(egj egj2, dtu dtu2, bzq bzq2, bzq bzq3, dtu dtu3, cya cya2) {
        this.d = egj2;
        this.f = dtu2;
        this.e = bzq2;
        this.c = bzq3;
        this.a = dtu3;
        this.b = cya2;
    }

    public fpo(fpn fpn2) {
        this.f = fpn2.f;
        this.a = fpn2.a;
        this.b = fpn2.b;
        this.c = fpn2.c;
        this.d = fpn2.d;
        this.e = fpn2.e;
    }

    public fpo(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7) {
        jnu2.getClass();
        this.f = jnu2;
        jnu3.getClass();
        this.a = jnu3;
        jnu4.getClass();
        this.d = jnu4;
        jnu5.getClass();
        this.e = jnu5;
        jnu6.getClass();
        this.c = jnu6;
        jnu7.getClass();
        this.b = jnu7;
    }

    public fpo(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, byte[] byArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.f = jnu3;
        jnu4.getClass();
        this.e = jnu4;
        jnu5.getClass();
        this.c = jnu5;
        jnu6.getClass();
        this.a = jnu6;
        jnu7.getClass();
        this.d = jnu7;
    }

    public fpo(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.c = jnu2;
        jnu3.getClass();
        this.a = jnu3;
        jnu4.getClass();
        this.b = jnu4;
        jnu5.getClass();
        this.e = jnu5;
        jnu6.getClass();
        this.d = jnu6;
        jnu7.getClass();
        this.f = jnu7;
    }

    public fpo(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.d = jnu3;
        jnu4.getClass();
        this.a = jnu4;
        jnu5.getClass();
        this.e = jnu5;
        jnu6.getClass();
        this.c = jnu6;
        jnu7.getClass();
        this.f = jnu7;
    }

    public fpo(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, char[] cArray) {
        this.f = jnu2;
        this.d = jnu3;
        this.a = jnu4;
        this.e = jnu5;
        this.c = jnu6;
        this.b = jnu7;
    }

    public fpo(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, char[] cArray, byte[] byArray) {
        jnu2.getClass();
        this.c = jnu2;
        jnu3.getClass();
        this.b = jnu3;
        jnu4.getClass();
        this.f = jnu4;
        jnu5.getClass();
        this.d = jnu5;
        jnu6.getClass();
        this.a = jnu6;
        jnu7.getClass();
        this.e = jnu7;
    }

    public static /* synthetic */ Object c(Object object) {
        object = (eez)object;
        jse.e(object, "it");
        return (hpn)object.a();
    }

    public final List a(OutputStream object) {
        Object object2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(object);
        if (!this.c.isEmpty()) {
            Object object3 = this.c;
            object2 = this.d;
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                object3 = ((fqz)iterator.next()).b((Uri)object2);
                if (object3 == null) continue;
                arrayList2.add(object3);
            }
            object = !arrayList2.isEmpty() ? new fpm((OutputStream)object, arrayList2) : null;
            if (object != null) {
                arrayList.add(object);
            }
        }
        object2 = this.b.iterator();
        while (object2.hasNext()) {
            object = (fvc)object2.next();
            arrayList.add(new DeflaterOutputStream((OutputStream)fvd.P(arrayList)));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final boolean b() {
        return !this.b.isEmpty();
    }

    public final eoi d(eip eip2, gto gto2, int n2, eds eds2, edp edp2) {
        eip2.getClass();
        edp2.getClass();
        Object object = this.a;
        Object object2 = this.c.b();
        jvb jvb2 = (jvb)object.b();
        jvb2.getClass();
        object = ((eny)this.b).a();
        ((cgw)this.e.b()).getClass();
        dml dml2 = (dml)((imc)this.d).a;
        dml2.getClass();
        dml dml3 = (dml)((imc)this.f).a;
        dml3.getClass();
        return new eoi(eip2, gto2, n2, eds2, edp2, gsl.a, (bzb)object2, jvb2, (enx)object, dml2, dml3);
    }
}

