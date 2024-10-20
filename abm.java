/*
 * Decompiled with CFR 0.152.
 */
public abstract class abm {
    final abp c;
    boolean d;
    int e;
    final abn f;

    public abm(abn abn2, abp abp2) {
        this.f = abn2;
        this.e = -1;
        this.c = abp2;
    }

    public abstract boolean aS();

    public void b() {
    }

    public boolean c(abe abe2) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(boolean bl2) {
        if (bl2 == this.d) {
            return;
        }
        this.d = bl2;
        abn abn2 = this.f;
        int n2 = true != bl2 ? -1 : 1;
        int n3 = abn2.d;
        abn2.d = n2 + n3;
        if (!abn2.e) {
            abn2.e = true;
            try {
                int n4;
                while (n3 != (n4 = abn2.d)) {
                    if (n3 == 0) {
                        if (n4 > 0) {
                            n3 = 0;
                            n2 = 1;
                        } else {
                            n3 = 0;
                            n2 = 0;
                        }
                    } else {
                        n2 = 0;
                    }
                    n3 = n3 > 0 && n4 == 0 ? 1 : 0;
                    if (n2 != 0) {
                        abn2.d();
                    } else if (n3 != 0) {
                        abn2.e();
                    }
                    n3 = n4;
                }
                abn2.e = false;
            }
            catch (Throwable throwable) {
                abn2.e = false;
                throw throwable;
            }
        }
        if (!this.d) return;
        this.f.b(this);
    }
}

