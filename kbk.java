/*
 * Decompiled with CFR 0.152.
 */
public class kbk {
    public final juc c = new juc(this, jud.a);
    public final juc d;
    public final juc e;

    public kbk() {
        jud jud2 = jud.a;
        this.d = new juc(this, jud2);
        this.e = new juc(null, jud2);
    }

    public boolean bw() {
        return this.f() instanceof kbo;
    }

    public final Object f() {
        return this.c.a;
    }

    /*
     * Unable to fully structure code
     */
    public final kbk g() {
        block0: while (true) {
            var3_3 = (kbk)this.d.a;
            var1_1 = var3_3;
            block1: while (true) {
                var2_2 = null;
                while (true) {
                    if ((var4_4 = var1_1.c.a) == this) {
                        if (var3_3 == var1_1) {
                            return var1_1;
                        }
                        if (!this.d.d(var3_3, var1_1)) continue block0;
                        return var1_1;
                    }
                    if (this.bw()) {
                        return null;
                    }
                    if (var4_4 instanceof kbo) {
                        if (var2_2 != null) {
                            var4_4 = ((kbo)var4_4).a;
                            if (var2_2.c.d(var1_1, var4_4)) ** break;
                            continue block0;
                            var1_1 = var2_2;
                            continue block1;
                        }
                        var1_1 = (kbk)var1_1.d.a;
                        continue;
                    }
                    jse.c(var4_4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    var4_4 = (kbk)var4_4;
                    var2_2 = var1_1;
                    var1_1 = var4_4;
                }
                break;
            }
            break;
        }
    }

    public final kbk h() {
        Object object = this.f();
        kbo kbo2 = object instanceof kbo ? (kbo)object : null;
        if (kbo2 != null) {
            return kbo2.a;
        }
        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (kbk)object;
    }

    public final kbk i() {
        kbk kbk2 = this.g();
        if (kbk2 == null) {
            kbk2 = (kbk)this.d.a;
            while (true) {
                if (!kbk2.bw()) {
                    return kbk2;
                }
                kbk2 = (kbk)kbk2.d.a;
            }
        }
        return kbk2;
    }

    public final void j(int n2) {
        this.l(new kbh(n2), n2);
    }

    public final void k(kbk kbk2) {
        block2: {
            kbk kbk3;
            do {
                kbk3 = (kbk)kbk2.d.a;
                if (this.f() != kbk2) break block2;
            } while (!kbk2.d.d(kbk3, this));
            if (this.bw()) {
                kbk2.g();
            }
        }
    }

    public final boolean l(kbk kbk2, int n2) {
        boolean bl2;
        block3: {
            kbk kbk3;
            do {
                kbk3 = this.i();
                boolean bl3 = kbk3 instanceof kbh;
                bl2 = true;
                if (bl3) {
                    if ((((kbh)kbk3).a & n2) == 0 && kbk3.l(kbk2, n2)) {
                        return true;
                    }
                    bl2 = false;
                    break block3;
                }
                kbk2.d.b(kbk3);
                kbk2.c.b(this);
            } while (!kbk3.c.d(this, kbk2));
            kbk2.k(this);
        }
        return bl2;
    }

    public String toString() {
        kbj kbj2 = new kbj(this);
        String string = jvf.b(this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(kbj2);
        stringBuilder.append("@");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

