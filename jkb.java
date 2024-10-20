/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Socket;

public final class jkb
implements kmi {
    public final Object a = new Object();
    public final klm b = new klm();
    public final jkc c;
    public boolean d = false;
    public boolean e = false;
    public kmi f;
    public Socket g;
    public int h;
    public int i;
    private final jim j;
    private boolean k = false;
    private boolean l;

    public jkb(jim jim2, jkc jkc2) {
        a.s(jim2, "executor");
        this.j = jim2;
        this.c = jkc2;
    }

    @Override
    public final kmm a() {
        return kmm.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void bK(klm klm2, long l2) {
        block13: {
            int n2;
            block12: {
                block11: {
                    int n3;
                    if (this.k) throw new IOException("closed");
                    n2 = jnr.a;
                    Object object = this.a;
                    // MONITORENTER : object
                    this.b.bK(klm2, l2);
                    this.i = n3 = this.i + this.h;
                    n2 = 0;
                    this.h = 0;
                    if (this.l || n3 <= 10000) break block11;
                    this.l = true;
                    n2 = 1;
                    break block12;
                }
                if (this.d || this.e) break block13;
                if (this.b.g() <= 0L) {
                    return;
                }
                this.d = true;
            }
            // MONITOREXIT : object
            if (n2 == 0) {
                this.j.execute(new jjy(this));
                return;
            }
            try {
                this.g.close();
                return;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (IOException iOException) {
                this.c.a(iOException);
                return;
            }
        }
        // MONITOREXIT : object
    }

    @Override
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new jhz(this, 6));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void flush() {
        if (this.k) {
            throw new IOException("closed");
        }
        int n2 = jnr.a;
        Object object = this.a;
        synchronized (object) {
            if (this.e) {
                return;
            }
            this.e = true;
        }
        this.j.execute(new jjz(this));
    }
}

