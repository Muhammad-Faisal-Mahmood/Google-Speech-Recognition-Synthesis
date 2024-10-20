/*
 * Decompiled with CFR 0.152.
 */
public final class epv
extends jsf
implements jrk {
    final int a;
    final Object b;
    private final int c;

    public epv(int n2, eae eae2, int n3) {
        this.c = n3;
        this.a = n2;
        this.b = eae2;
        super(1);
    }

    public epv(epw epw2, int n2, int n3) {
        this.c = n3;
        this.b = epw2;
        this.a = n2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                object = (ebg)object;
                jse.e(object, "it");
                object = ekr.j((ebg)object);
                Object object2 = this.b;
                n2 = this.a;
                ((epw)object2).c(n2, (ebv)object);
                return jon.a;
            }
            eaf eaf2 = (eaf)object;
            jse.e(eaf2, "input");
            object = eaf2;
            if ((eaf2.b & 1) != 0) {
                n2 = this.a;
                object = this.b;
                Object object3 = (hwp)eaf2.C(5);
                ((hwp)object3).x(eaf2);
                object3 = doc.m((hwr)object3);
                ((bzb)object3).o(eaf2.c + ekn.c(n2, (eae)object));
                object = ((bzb)object3).n();
            }
            return object;
        }
        ebv ebv2 = (ebv)object;
        jse.e(ebv2, "it");
        object = this.b;
        n2 = this.a;
        ((epw)object).c(n2, ebv2);
        return jon.a;
    }
}

