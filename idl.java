/*
 * Decompiled with CFR 0.152.
 */
final class idl
implements hrf {
    private final djt b;
    private final hav c;
    private final int d;

    public idl(int n2) {
        this.d = n2;
        this.b = djt.a(idm.a, new djt("S3Bidi"));
        this.c = hav.r("https://www.googleapis.com/auth/assistant", "https://www.googleapis.com/auth/assistant-sdk-prototype", "https://www.googleapis.com/auth/googlenow", "https://www.googleapis.com/auth/googleit");
    }

    public idl(int n2, byte[] byArray) {
        this.d = n2;
        this.b = djt.a(idm.a, new djt("RunBlocking"));
        this.c = hav.r("https://www.googleapis.com/auth/assistant", "https://www.googleapis.com/auth/assistant-sdk-prototype", "https://www.googleapis.com/auth/googlenow", "https://www.googleapis.com/auth/googleit");
    }

    public idl(int n2, char[] cArray) {
        this.d = n2;
        this.b = djt.a(idm.a, new djt("RunBidi"));
        this.c = hdc.a;
    }

    @Override
    public final djt a() {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                return this.b;
            }
            return this.b;
        }
        return this.b;
    }

    @Override
    public final void b() {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                djt djt2 = idm.a;
                return;
            }
            djt djt3 = idm.a;
            return;
        }
        djt djt4 = idm.a;
    }

    @Override
    public final int c() {
        if (this.d != 0) {
            return 3;
        }
        return 2;
    }

    @Override
    public final void d() {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                if (this.c.isEmpty()) {
                    hav hav2 = idm.f.i;
                }
                return;
            }
            if (this.c.isEmpty()) {
                hav hav3 = idm.f.i;
            }
            return;
        }
        if (this.c.isEmpty()) {
            hav hav4 = idm.f.i;
        }
    }

    public final String toString() {
        if (this.d != 0) {
            // empty if block
        }
        return this.b.a;
    }
}

