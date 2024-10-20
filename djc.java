/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.File;
import java.util.Arrays;

public final class djc {
    public final String a;
    public final File b;
    public final String c;
    public final dja d;
    public final djm e;
    final boolean f;
    final boolean g;
    int h = 0;
    public int i = -1;
    public final int j;
    public final gwy k = new gyb();
    public AmbientModeSupport$AmbientController l = null;
    private final djj m;
    private boolean n = false;
    private djb o = djb.a;

    public djc(djj djj2, String string, File file, String string2, dja dja2, djm djm2) {
        boolean bl2;
        boolean bl3;
        this.j = -1;
        this.a = string;
        this.b = file;
        this.c = string2;
        this.d = dja2;
        this.m = djj2;
        this.e = djm2;
        this.f = bl3 = dix.a(string);
        this.g = bl2 = djc.g(string);
        if (!bl2 && !bl3) {
            return;
        }
        this.o = djb.c;
    }

    public static boolean g(String string) {
        return string.startsWith("file:");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final djb a() {
        synchronized (this) {
            return this.o;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void b() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void c() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void d() {
        synchronized (this) {
            this.n = true;
            return;
        }
    }

    public final boolean e() {
        return this.m.l(this);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof djc)) {
            return false;
        }
        object = (djc)object;
        return a.k(this.a, ((djc)object).a) && a.k(this.b, ((djc)object).b) && a.k(this.c, ((djc)object).c) && a.k((Object)this.o, (Object)((djc)object).o) && this.n == ((djc)object).n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f() {
        synchronized (this) {
            return this.n;
        }
    }

    public final void h(djb djb2) {
        if (!this.g && !this.f) {
            this.o = djb2;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, this.n});
    }

    public final String toString() {
        gtn gtn2 = fxf.Q(djc.class);
        gtn2.b("", this.a);
        gtn2.b("targetDirectory", this.b);
        gtn2.b("fileName", this.c);
        gtn2.b("requiredConnectivity", (Object)this.o);
        gtn2.g("canceled", this.n);
        return gtn2.toString();
    }
}

