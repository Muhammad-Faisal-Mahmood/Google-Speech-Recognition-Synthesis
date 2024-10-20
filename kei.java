/*
 * Decompiled with CFR 0.152.
 */
public final class kei
implements hwz {
    static final hwz a;
    static final hwz b;
    static final hwz c;
    static final hwz d;
    static final hwz e;
    static final hwz f;
    static final hwz g;
    static final hwz h;
    public static final hwz i;
    private final int j;

    static {
        i = new kei(8);
        h = new kei(7);
        g = new kei(6);
        f = new kei(5);
        e = new kei(4);
        d = new kei(3);
        c = new kei(2);
        b = new kei(1);
        a = new kei(0);
    }

    private kei(int n2) {
        this.j = n2;
    }

    @Override
    public final boolean a(int n2) {
        switch (this.j) {
            default: {
                return a.H(n2);
            }
            case 7: {
                return jsl.z(n2) != 0;
            }
            case 6: {
                return a.J(n2);
            }
            case 5: {
                return jsl.z(n2) != 0;
            }
            case 4: {
                return a.K(n2);
            }
            case 3: {
                return a.J(n2);
            }
            case 2: {
                return a.H(n2);
            }
            case 1: {
                return a.K(n2);
            }
            case 0: 
        }
        return a.I(n2);
    }
}

