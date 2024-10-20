/*
 * Decompiled with CFR 0.152.
 */
final class akm {
    public final String a;
    public int b;
    public long c;
    public anc d;
    public boolean e;
    public boolean f;
    final akn g;

    public akm(akn akn2, String string, int n2, anc anc2) {
        this.g = akn2;
        this.a = string;
        this.b = n2;
        long l2 = anc2 == null ? -1L : anc2.d;
        this.c = l2;
        if (anc2 != null && anc2.b()) {
            this.d = anc2;
        }
    }

    static /* bridge */ /* synthetic */ void b(akm akm2) {
        akm2.e = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(akc object) {
        anc anc2 = ((akc)object).d;
        boolean bl2 = true;
        if (anc2 == null) {
            if (this.b == ((akc)object).c) return false;
            return true;
        }
        long l2 = this.c;
        if (l2 == -1L) {
            return false;
        }
        if (anc2.d > l2) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        Object object2 = ((akc)object).b;
        int n2 = ((aew)object2).a(anc2.a);
        int n3 = ((aew)object2).a(this.d.a);
        object2 = ((akc)object).d;
        if (((anc)object2).d < this.d.d) return false;
        if (n2 < n3) return false;
        if (n2 > n3) {
            return true;
        }
        if (((anc)object2).b()) {
            object = ((akc)object).d;
            n2 = ((anc)object).b;
            n3 = ((anc)object).c;
            object = this.d;
            int n4 = ((anc)object).b;
            boolean bl3 = bl2;
            if (n2 > n4) return bl3;
            if (n2 != n4) return false;
            if (n3 <= ((anc)object).c) return false;
            return bl2;
        }
        n3 = ((akc)object).d.e;
        if (n3 == -1) return true;
        if (n3 <= this.d.b) return false;
        return true;
    }
}

