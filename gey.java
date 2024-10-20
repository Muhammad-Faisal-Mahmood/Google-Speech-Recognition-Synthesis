/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class gey {
    public static final gey a;
    public final hac b;
    private final hac c;

    static {
        hdc hdc2 = hdc.a;
        a = new gey(hdc2, hdc2);
    }

    public gey(Set object, Set object2) {
        gzy gzy2 = new gzy();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            ((gep)object2.next()).a(gzy2);
        }
        this.c = gzy2.b();
        object2 = new gzy();
        object = object.iterator();
        while (object.hasNext()) {
            ((gep)object.next()).a((gzy)object2);
        }
        this.b = ((gzy)object2).b();
    }

    public final gex a(String string) {
        gex gex2 = (gex)this.c.get(string);
        if (gex2 != null) {
            return gex2;
        }
        return (gex)this.b.get(string);
    }

    public final hav b() {
        return this.b.l();
    }
}

