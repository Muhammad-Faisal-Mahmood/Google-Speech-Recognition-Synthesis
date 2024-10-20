/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

public final class jgj
implements Closeable,
jcx {
    public jgg a;
    public int b;
    public iuu c;
    public jct d = new jct();
    public long e;
    public boolean f = false;
    public volatile boolean g = false;
    private final jjo h;
    private final jjv i;
    private int j = 5;
    private boolean k;
    private jct l;
    private boolean m = false;
    private int n = -1;
    private int o;
    private int p = 1;

    public jgj(jgg jgg2, iuu iuu2, int n2, jjo jjo2, jjv jjv2) {
        this.a = jgg2;
        this.c = iuu2;
        this.b = n2;
        this.h = jjo2;
        this.i = jjv2;
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        if (this.m) {
            return;
        }
        this.m = true;
        var6_6 = this.e;
        if (var6_6 <= 0L) ** GOTO lbl-1000
        {
            catch (Throwable var8_10) {}
            {
                throw var8_10;
            }
        }
        try {
            if (this.l == null) {
                var8_7 = new jct();
                this.l = var8_7;
            }
        }
        finally {
            var2_2 = 0;
        }
lbl-1000:
        // 1 sources

        {
            if (this.f && this.c()) {
                this.close();
            }
            return;
        }
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        boolean bl2;
        if (this.b()) {
            return;
        }
        jct jct2 = this.l;
        boolean bl3 = bl2 = false;
        if (jct2 != null) {
            bl3 = bl2;
            if (jct2.a > 0) {
                bl3 = true;
            }
        }
        try {
            jct2 = this.d;
            if (jct2 != null) {
                ((jbh)jct2).close();
            }
            if ((jct2 = this.l) != null) {
                ((jbh)jct2).close();
            }
            this.a.k(bl3);
            return;
        }
        finally {
            this.d = null;
            this.l = null;
        }
    }
}

