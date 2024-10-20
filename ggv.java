/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;

public final class ggv {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ggv() {
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = new HashMap();
    }

    public ggv(byte[] byArray) {
        this.d = new ReentrantLock();
        this.b = new long[7];
        this.c = new boolean[7];
    }

    public final boolean a() {
        boolean bl2;
        block3: {
            Object object = this.d.values();
            bl2 = object instanceof Collection;
            boolean bl3 = false;
            if (bl2 && object.isEmpty()) {
                bl2 = bl3;
            } else {
                object = object.iterator();
                do {
                    bl2 = bl3;
                    if (!object.hasNext()) break block3;
                } while (!((gpm)object.next()).s());
                bl2 = true;
            }
        }
        return bl2;
    }
}

