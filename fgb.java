/*
 * Decompiled with CFR 0.152.
 */
public final class fgb {
    private int a;
    private String b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private fgs g;
    private boolean h;
    private byte i;
    private int j;

    public final fgc a() {
        fgs fgs2;
        int n2;
        String string;
        CharSequence charSequence;
        if (this.i == 31 && (charSequence = this.b) != null && (string = this.c) != null && (n2 = this.j) != 0 && (fgs2 = this.g) != null) {
            return new fgc(this.a, (String)charSequence, string, n2, this.d, this.e, this.f, fgs2, this.h);
        }
        charSequence = new StringBuilder();
        if ((this.i & 1) == 0) {
            ((StringBuilder)charSequence).append(" callingUid");
        }
        if (this.b == null) {
            ((StringBuilder)charSequence).append(" callingPackageName");
        }
        if (this.c == null) {
            ((StringBuilder)charSequence).append(" locale");
        }
        if (this.j == 0) {
            ((StringBuilder)charSequence).append(" recognizerMode");
        }
        if ((this.i & 2) == 0) {
            ((StringBuilder)charSequence).append(" isExternalAudioSource");
        }
        if ((this.i & 4) == 0) {
            ((StringBuilder)charSequence).append(" isSmartDictation");
        }
        if ((this.i & 8) == 0) {
            ((StringBuilder)charSequence).append(" enableIncognitoMode");
        }
        if (this.g == null) {
            ((StringBuilder)charSequence).append(" clientType");
        }
        if ((this.i & 0x10) == 0) {
            ((StringBuilder)charSequence).append(" preferOffline");
        }
        throw new IllegalStateException("Missing required properties:".concat(charSequence.toString()));
    }

    public final void b(String string) {
        if (string != null) {
            this.b = string;
            return;
        }
        throw new NullPointerException("Null callingPackageName");
    }

    public final void c(int n2) {
        this.a = n2;
        this.i = (byte)(this.i | 1);
    }

    public final void d(fgs fgs2) {
        if (fgs2 != null) {
            this.g = fgs2;
            return;
        }
        throw new NullPointerException("Null clientType");
    }

    public final void e(boolean bl2) {
        this.f = bl2;
        this.i = (byte)(this.i | 8);
    }

    public final void f(boolean bl2) {
        this.d = bl2;
        this.i = (byte)(this.i | 2);
    }

    public final void g(boolean bl2) {
        this.e = bl2;
        this.i = (byte)(this.i | 4);
    }

    public final void h(String string) {
        if (string != null) {
            this.c = string;
            return;
        }
        throw new NullPointerException("Null locale");
    }

    public final void i(boolean bl2) {
        this.h = bl2;
        this.i = (byte)(this.i | 0x10);
    }

    public final void j(int n2) {
        if (n2 != 0) {
            this.j = n2;
            return;
        }
        throw new NullPointerException("Null recognizerMode");
    }
}

