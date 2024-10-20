/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import javax.net.ssl.SSLSocketFactory;

final class jkl
implements jbf {
    final jkn a;

    public jkl(jkn jkn2) {
        this.a = jkn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(iyh iyh2) {
        int n2 = jnr.a;
        Object object = this.a.f;
        n2 = jkm.z;
        object = ((jkm)object).a;
        synchronized (object) {
            this.a.f.q(iyh2, true, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(jjw object, boolean bl2, boolean bl3, int n2) {
        Object object2;
        int n3 = jnr.a;
        if (object == null) {
            object = jkn.a;
        } else {
            object2 = ((jky)object).a;
            n3 = (int)((klm)object2).b;
            object = object2;
            if (n3 > 0) {
                this.a.w(n3);
                object = object2;
            }
        }
        object2 = this.a.f;
        n3 = jkm.z;
        object2 = ((jkm)object2).a;
        synchronized (object2) {
            jkm jkm2 = this.a.f;
            if (!jkm2.f) {
                if (jkm2.u) {
                    n3 = (int)((klm)object).b;
                    jkm2.c.bK((klm)object, n3);
                    jkm2.d |= bl2;
                    jkm2.e |= bl3;
                } else {
                    boolean bl4 = jkm2.x != -1;
                    fxf.B(bl4, "streamId should be set");
                    jkm2.h.a(bl2, jkm2.w, (klm)object, bl3);
                }
            }
            object = this.a.r;
            if (n2 != 0) {
                ((jjv)object).f += (long)n2;
                ((jjv)object).a.a();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(iwx object) {
        int n2 = jnr.a;
        Object object2 = a.ai(this.a.b.b, "/");
        Object object3 = this.a.f;
        n2 = jkm.z;
        object3 = ((jkm)object3).a;
        synchronized (object3) {
            Object object4 = this.a.f;
            Object object5 = ((jkm)object4).y;
            Object object6 = ((jkn)object5).e;
            Object object7 = ((jkn)object5).c;
            SSLSocketFactory sSLSocketFactory = ((jkm)object4).i.t;
            a.s(object, "headers");
            a.s(object6, "authority");
            ((iwx)object).e(jeb.h);
            ((iwx)object).e(jeb.i);
            ((iwx)object).e(jeb.j);
            Object object8 = ivp.a;
            object5 = new ArrayList(((iwx)object).e + 7);
            if (sSLSocketFactory == null) {
                object5.add(jkf.b);
            } else {
                object5.add(jkf.a);
            }
            object5.add(jkf.c);
            object8 = new jlv(jlv.e, (String)object6);
            object5.add(object8);
            object6 = new jlv(jlv.c, (String)object2);
            object5.add(object6);
            object2 = new jlv(jeb.j.a, (String)object7);
            object5.add(object2);
            object5.add(jkf.e);
            object5.add(jkf.f);
            object = jju.a((iwx)object);
            for (n2 = 0; n2 < ((Object)object).length; n2 += 2) {
                object7 = klp.f((byte[])object[n2]);
                if (((klp)object7).b() == 0 || ((klp)object7).a(0) == 58) continue;
                object6 = klp.f((byte[])object[n2 + 1]);
                object2 = new jlv((klp)object7, (klp)object6);
                object5.add(object2);
            }
            ((jkm)object4).b = object5;
            object5 = ((jkm)object4).i;
            object4 = ((jkm)object4).y;
            object = ((jks)object5).p;
            if (object != null) {
                object5 = ((jkn)object4).f;
                object2 = jck.d;
                object4 = new iwx();
                ((jbi)object5).m((iyh)object, (jck)((Object)object2), true, (iwx)object4);
            } else if (((jks)object5).k.size() >= ((jks)object5).u) {
                ((jks)object5).v.add(object4);
                ((jks)object5).k((jkn)object4);
            } else {
                ((jks)object5).m((jkn)object4);
            }
            return;
        }
    }
}

