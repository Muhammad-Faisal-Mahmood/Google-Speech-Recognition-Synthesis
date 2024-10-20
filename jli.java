/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class jli {
    public static final jli a;
    private static final jlg[] f;
    final boolean b;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        jlg[] jlgArray = new jlg[]{jlg.aW, jlg.aX, jlg.aY, jlg.aK, jlg.aO, jlg.aL, jlg.aP, jlg.aT, jlg.aS, jlg.av, jlg.aw, jlg.U, jlg.V, jlg.D, jlg.H, jlg.h};
        f = jlgArray;
        Object object = new jlh();
        ((jlh)object).a(jlgArray);
        ((jlh)object).c(jlr.a, jlr.b);
        ((jlh)object).b();
        a = object = new jli((jlh)object);
        object = new jlh((jli)object);
        ((jlh)object).c(jlr.a, jlr.b, jlr.c, jlr.d);
        ((jlh)object).b();
    }

    public jli(jlh jlh2) {
        this.b = true;
        this.c = jlh2.a;
        this.d = jlh2.b;
        this.e = jlh2.c;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof jli)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        object = (jli)object;
        boolean bl2 = ((jli)object).b;
        if (!Arrays.equals(this.c, ((jli)object).c)) {
            return false;
        }
        if (!Arrays.equals(this.d, ((jli)object).d)) {
            return false;
        }
        return this.e == ((jli)object).e;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.c) + 527) * 31 + Arrays.hashCode(this.d)) * 31 + (this.e ^ 1);
    }

    public final String toString() {
        Object object;
        int n2;
        Object object2;
        Object object3 = this.c;
        int n3 = 0;
        if (object3 == null) {
            object3 = null;
        } else {
            object2 = new jlg[((String[])object3).length];
            for (n2 = 0; n2 < ((String[])(object3 = this.c)).length; ++n2) {
                object = object3[n2];
                object3 = jlg.a;
                object3 = ((String)object).startsWith("SSL_") ? jlg.a("TLS_".concat(String.valueOf(((String)object).substring(4)))) : jlg.a((String)object);
                object2[n2] = object3;
            }
            object3 = jls.a((Object[])object2);
        }
        object2 = object3 == null ? "[use default]" : object3.toString();
        object = new jlr[this.d.length];
        for (n2 = n3; n2 < ((String[])(object3 = this.d)).length; ++n2) {
            block12: {
                block8: {
                    block11: {
                        block10: {
                            block9: {
                                block7: {
                                    object3 = object3[n2];
                                    jlr jlr2 = jlr.a;
                                    if (!"TLSv1.3".equals(object3)) break block7;
                                    object3 = jlr.a;
                                    break block8;
                                }
                                if (!"TLSv1.2".equals(object3)) break block9;
                                object3 = jlr.b;
                                break block8;
                            }
                            if (!"TLSv1.1".equals(object3)) break block10;
                            object3 = jlr.c;
                            break block8;
                        }
                        if (!"TLSv1".equals(object3)) break block11;
                        object3 = jlr.d;
                        break block8;
                    }
                    if (!"SSLv3".equals(object3)) break block12;
                    object3 = jlr.e;
                }
                object[n2] = object3;
                continue;
            }
            throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(object3)));
        }
        object3 = String.valueOf(jls.a((Object[])object));
        boolean bl2 = this.e;
        object = new StringBuilder("ConnectionSpec(cipherSuites=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", tlsVersions=");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(", supportsTlsExtensions=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

