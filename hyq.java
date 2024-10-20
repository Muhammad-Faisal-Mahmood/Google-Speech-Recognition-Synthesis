/*
 * Decompiled with CFR 0.152.
 */
public final class hyq
implements hyc {
    public final hyf a;
    public final String b;
    public final Object[] c;
    private final int d;

    public hyq(hyf hyf2, String string, Object[] objectArray) {
        char c2;
        this.a = hyf2;
        this.b = string;
        this.c = objectArray;
        int n2 = string.charAt(0);
        if (n2 < 55296) {
            this.d = n2;
            return;
        }
        int n3 = n2 & 0x1FFF;
        int n4 = 1;
        n2 = 13;
        while ((c2 = string.charAt(n4)) >= '\ud800') {
            n3 |= (c2 & 0x1FFF) << n2;
            n2 += 13;
            ++n4;
        }
        this.d = n3 | c2 << n2;
    }

    @Override
    public final hyf a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override
    public final int c() {
        int n2 = this.d;
        if ((n2 & 1) != 0) {
            return 1;
        }
        if ((n2 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}

