/*
 * Decompiled with CFR 0.152.
 */
public final class jiy
extends jcw {
    final iul a;
    final String b;
    final jje c;
    final jiu d;
    final hqa e;
    final jjo f;
    final iwx g;
    final jiz h;

    public jiy(jiz jiz2, iul iul2, String string, jje jje2, jiu jiu2, hqa hqa2, jjo jjo2, iwx iwx2) {
        this.a = iul2;
        this.b = string;
        this.c = jje2;
        this.d = jiu2;
        this.e = hqa2;
        this.f = jjo2;
        this.g = iwx2;
        this.h = jiz2;
        super(iul2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        kmp[] kmpArray;
        Object object;
        block7: {
            void var4_10;
            Object object2;
            int n2 = jnr.a;
            try {
                ksb ksb2 = this.h.b.e.a(this.b);
                object = ksb2;
                if (ksb2 == null) {
                    ive ive2 = this.h.b.f;
                    object = this.b;
                    this.c.k();
                    object = ive2.a((String)object);
                }
                if (object == null) {
                    iyh iyh2 = iyh.i;
                    object = this.b;
                    StringBuilder stringBuilder = new StringBuilder("Method not found: ");
                    stringBuilder.append((String)object);
                    object = iyh2.e(stringBuilder.toString());
                    this.d.g(jja.c);
                    jje jje2 = this.c;
                    iwx iwx2 = new iwx();
                    jje2.e((iyh)object, iwx2);
                    this.a.j(null);
                    this.e.cancel(false);
                    return;
                }
                jiz jiz2 = this.h;
                object2 = this.c;
                jjo jjo2 = this.f;
                object2.k();
                kmpArray = jjo2.b;
                if (kmpArray.length > 0) break block7;
                Object object3 = ((ksb)object).a;
                ixz[] ixzArray = jiz2.b.h;
                int n3 = ixzArray.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    iya iya2 = new iya(ixzArray[n2], (ixy)var4_10);
                }
            }
            catch (Throwable throwable) {
                this.d.g(jja.c);
                this.c.e(iyh.c(throwable), new iwx());
                this.a.j(null);
                this.e.cancel(false);
                throw throwable;
            }
            {
                ksb ksb3 = ((ksb)object).o((ixy)var4_10);
                jje jje3 = this.c;
                iwx iwx3 = this.g;
                iul iul2 = this.a;
                object2 = ksb3.b;
                Object object4 = this.h.b;
                iuw iuw2 = ((jja)object4).p;
                object4 = ((jja)object4).r;
                object = new jip(jje3, (ixb)object2, iwx3, iul2, iuw2, (jby)object4);
                ksb ksb4 = new ksb((jip)object, (ixy)ksb3.a);
                this.e.m(ksb4);
                return;
            }
        }
        object = kmpArray[0];
        {
            throw null;
        }
    }
}

