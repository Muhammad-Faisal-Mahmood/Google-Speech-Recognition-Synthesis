/*
 * Decompiled with CFR 0.152.
 */
public final class cst {
    public gto a;
    public gto b;
    public gto c;
    public gto d;
    public boolean e;
    public byte f;
    public int g;
    private String h;
    private gto i;
    private gto j;
    private gto k;
    private int l;

    public cst() {
        throw null;
    }

    public cst(byte[] object) {
        object = gsl.a;
        this.i = object;
        this.j = object;
        this.a = object;
        this.b = object;
        this.k = object;
        this.c = object;
        this.d = object;
    }

    public final csu a() {
        int n2;
        CharSequence charSequence;
        if (this.f == 7 && (charSequence = this.h) != null && (n2 = this.g) != 0) {
            return new csu((String)charSequence, this.i, this.j, this.a, this.b, this.k, this.c, this.d, this.l, n2, this.e);
        }
        charSequence = new StringBuilder();
        if (this.h == null) {
            ((StringBuilder)charSequence).append(" groupName");
        }
        if ((this.f & 1) == 0) {
            ((StringBuilder)charSequence).append(" groupSizeBytes");
        }
        if (this.g == 0) {
            ((StringBuilder)charSequence).append(" showNotifications");
        }
        if ((this.f & 2) == 0) {
            ((StringBuilder)charSequence).append(" preserveZipDirectories");
        }
        if ((this.f & 4) == 0) {
            ((StringBuilder)charSequence).append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(charSequence.toString()));
    }

    public final void b(String string) {
        if (string != null) {
            this.h = string;
            return;
        }
        throw new NullPointerException("Null groupName");
    }

    public final void c(int n2) {
        this.l = n2;
        this.f = (byte)(this.f | 1);
    }
}

