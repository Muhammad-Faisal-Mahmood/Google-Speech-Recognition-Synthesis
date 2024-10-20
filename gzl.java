/*
 * Decompiled with CFR 0.152.
 */
public abstract class gzl {
    static int f(int n2, int n3) {
        if (n3 >= 0) {
            int n4;
            if (n3 <= n2) {
                return n2;
            }
            n2 = n4 = n2 + (n2 >> 1) + 1;
            if (n4 < n3) {
                n2 = Integer.highestOneBit(n3 - 1);
                n2 += n2;
            }
            n3 = n2;
            if (n2 < 0) {
                n3 = Integer.MAX_VALUE;
            }
            return n3;
        }
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }

    public abstract void c(Object var1);

    public void e(Iterable object) {
        object = object.iterator();
        while (object.hasNext()) {
            this.c(object.next());
        }
    }
}

