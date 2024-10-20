/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class kfx {
    public static final kfx a = new kfx(jns.x(new ArrayList()), null);
    public final kks b;
    private final Set c;

    public kfx(Set set, kks kks2) {
        jse.e(set, "pins");
        this.c = set;
        this.b = kks2;
    }

    public final kfx a(kks kks2) {
        jse.e(kks2, "certificateChainCleaner");
        if (jse.i(this.b, kks2)) {
            return this;
        }
        return new kfx(this.c, kks2);
    }

    public final void b() {
        Iterator iterator = this.c.iterator();
        if (!iterator.hasNext()) {
            return;
        }
        iterator = (kfw)iterator.next();
        throw null;
    }

    public final boolean equals(Object object) {
        if (object instanceof kfx) {
            object = (kfx)object;
            if (jse.i(((kfx)object).c, this.c) && jse.i(((kfx)object).b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = ((Object)this.c).hashCode();
        kks kks2 = this.b;
        int n3 = kks2 != null ? kks2.hashCode() : 0;
        return (n2 + 1517) * 41 + n3;
    }
}

