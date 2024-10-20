/*
 * Decompiled with CFR 0.152.
 */
public class uo {
    private final Object[] a;
    private int b;

    public uo(int n2) {
        this.a = new Object[n2];
    }

    public Object a() {
        int n2 = this.b;
        if (n2 > 0) {
            Object object = this.a[--n2];
            jse.c(object, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.a[n2] = null;
            --this.b;
            return object;
        }
        return null;
    }

    public boolean b(Object object) {
        int n2;
        jse.e(object, "instance");
        int n3 = this.b;
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.a[n2] != object) {
                continue;
            }
            throw new IllegalStateException("Already in the pool!");
        }
        n2 = this.b;
        Object[] objectArray = this.a;
        if (n2 < objectArray.length) {
            objectArray[n2] = object;
            this.b = n2 + 1;
            return true;
        }
        return false;
    }
}

