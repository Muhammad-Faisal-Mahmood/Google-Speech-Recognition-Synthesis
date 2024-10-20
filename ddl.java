/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.Map;

public final class ddl {
    public Object a;
    public Object b;

    public ddl() {
    }

    public ddl(bso bso2, bso bso3) {
        if (bso3 != null && bso3.v()) {
            throw new IllegalArgumentException("Network voices can't be fallback voices.");
        }
        this.a = bso2;
        this.b = bso3;
    }

    public final ddm a() {
        Object object = this.a;
        if (object != null) {
            this.b = ((gzy)object).b();
        } else if (this.b == null) {
            this.b = hcy.a;
        }
        return new ddm((hac)this.b);
    }

    public final gzy b() {
        if (this.a == null) {
            if (this.b == null) {
                this.a = new gzy();
            } else {
                gzy gzy2 = new gzy();
                this.a = gzy2;
                Object object = this.b;
                gzy gzy3 = gzy2;
                gzy2.g((Map)object);
                this.b = null;
            }
        }
        return (gzy)this.a;
    }

    public final void c(Map map) {
        this.b().g(map);
    }

    public final dbl d() {
        Object object;
        Object object2 = this.a;
        if (object2 != null && (object = this.b) != null) {
            object = (gzx)object;
            return new dbl((crh)object2, (gzx)object);
        }
        object2 = new StringBuilder();
        if (this.a == null) {
            ((StringBuilder)object2).append(" extraHandler");
        }
        if (this.b == null) {
            ((StringBuilder)object2).append(" indexSpecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(object2.toString()));
    }

    public final void e(gzx gzx2) {
        if (gzx2 != null) {
            this.b = gzx2;
            return;
        }
        throw new NullPointerException("Null indexSpecs");
    }

    public final ccr f() {
        if (this.a == null) {
            this.a = new ki(null);
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        Object object = this.a;
        Looper looper = (Looper)this.b;
        return new ccr((ki)object, looper);
    }
}

