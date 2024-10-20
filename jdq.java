/*
 * Decompiled with CFR 0.152.
 */
public final class jdq
extends jgo {
    private boolean b;
    private final iyh c;
    private final jck d;
    private final iuc[] e;

    public jdq(iyh iyh2, jck jck2, iuc[] iucArray) {
        fxf.r(iyh2.g() ^ true, "error must not be OK");
        this.c = iyh2;
        this.d = jck2;
        this.e = iucArray;
    }

    public jdq(iyh iyh2, iuc[] iucArray) {
        this(iyh2, jck.a, iucArray);
    }

    @Override
    public final void b(jeh jeh2) {
        jeh2.b("error", this.c);
        jeh2.b("progress", (Object)this.d);
    }

    @Override
    public final void m(jcl jcl2) {
        iuc[] iucArray;
        fxf.B(this.b ^ true, "already started");
        this.b = true;
        for (int i2 = 0; i2 < (iucArray = this.e).length; ++i2) {
            iucArray[i2].h();
        }
        jcl2.a(this.c, this.d, new iwx());
    }
}

