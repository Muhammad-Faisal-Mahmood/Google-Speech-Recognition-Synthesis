/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class dfr {
    public final ddn a;
    public final File b;
    private final dcv c;
    private final dda d;
    private final dez e;
    private final dfa f;
    private long g = -1L;
    private dez h;

    public dfr(fpn object) {
        Object object2;
        this.a = (ddn)((fpn)object).b;
        this.b = (File)((fpn)object).e;
        this.e = (dez)((fpn)object).f;
        this.f = ((fpn)object).c;
        this.c = (dcv)((fpn)object).d;
        object = object2 = ((fpn)object).a;
        if (object2 == null) {
            object = dda.a;
        }
        this.d = (dda)object;
    }

    public final int a() {
        int n2 = this.c().a();
        return this.c.c(n2);
    }

    public final long b() {
        long l2;
        long l3 = l2 = this.g;
        if (l2 < 0L) {
            this.g = l3 = this.d.a(this.b);
        }
        return l3;
    }

    public final dez c() {
        if (this.h == null) {
            dez dez2 = this.e;
            Object object = dez2;
            if (dez2 == null) {
                object = this.f;
                fxf.K(object);
                object = object.a(this.a);
            }
            fxf.K(object);
            this.h = object;
        }
        return this.h;
    }

    public final String toString() {
        return this.a.toString();
    }
}

