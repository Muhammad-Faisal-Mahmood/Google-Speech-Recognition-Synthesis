/*
 * Decompiled with CFR 0.152.
 */
final class get
extends jsf
implements jqz {
    public static final get a;
    public static final get b;
    private final int c;

    static {
        b = new get(1);
        a = new get(0);
    }

    public get(int n2) {
        this.c = n2;
        super(0);
    }

    @Override
    public final Object a() {
        if (this.c != 0) {
            return false;
        }
        return true;
    }
}

