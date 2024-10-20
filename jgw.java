/*
 * Decompiled with CFR 0.152.
 */
final class jgw {
    public final iwe a;
    public iui b;
    public boolean c = false;
    public iuj d = iuj.a(iui.d);

    public jgw(iwe iwe2, iui iui2) {
        this.a = iwe2;
        this.b = iui2;
    }

    public final iui a() {
        return this.d.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(iui iui2) {
        block1: {
            boolean bl2;
            block2: {
                block0: {
                    this.b = iui2;
                    if (iui2 == iui.b || iui2 == iui.c) break block0;
                    if (iui2 != iui.d) break block1;
                    bl2 = false;
                    break block2;
                }
                bl2 = true;
            }
            this.c = bl2;
        }
    }
}

