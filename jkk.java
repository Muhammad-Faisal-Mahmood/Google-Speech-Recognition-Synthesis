/*
 * Decompiled with CFR 0.152.
 */
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class jkk
extends iuy {
    static final jli a;
    static final jgp b;
    private static final jjl i;
    public final jfy c;
    public final jgp d;
    public final jgp e;
    public final jli f;
    public final long g;
    public final dml h = jjv.i;
    private SSLSocketFactory j;

    static {
        Logger.getLogger(jkk.class.getName());
        Object object = new jlh(jli.a);
        ((jlh)object).a(jlg.aK, jlg.aO, jlg.aL, jlg.aP, jlg.aT, jlg.aS);
        ((jlh)object).c(jlr.b);
        ((jlh)object).b();
        a = new jli((jlh)object);
        TimeUnit.DAYS.toNanos(1000L);
        i = object = new jkg(0);
        b = new jjn(object, 0);
        EnumSet.of(iyo.b, iyo.c);
    }

    public jkk(String string) {
        this.d = b;
        this.e = new jjn(jeb.p, 0);
        this.f = a;
        this.g = jeb.l;
        this.c = new jfy(string, new jki(this, 0), new jkh());
    }

    @Override
    public final kmp j() {
        return this.c;
    }

    final SSLSocketFactory k() {
        try {
            if (this.j == null) {
                this.j = SSLContext.getInstance("Default", jlp.b.c).getSocketFactory();
            }
            SSLSocketFactory sSLSocketFactory = this.j;
            return sSLSocketFactory;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException("TLS Provider failure", generalSecurityException);
        }
    }
}

