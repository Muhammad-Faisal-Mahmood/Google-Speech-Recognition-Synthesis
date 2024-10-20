/*
 * Decompiled with CFR 0.152.
 */
public final class aaz
extends Enum {
    private static final aaz[] $VALUES;
    public static final aay Companion;
    public static final /* enum */ aaz ON_ANY;
    public static final /* enum */ aaz ON_CREATE;
    public static final /* enum */ aaz ON_DESTROY;
    public static final /* enum */ aaz ON_PAUSE;
    public static final /* enum */ aaz ON_RESUME;
    public static final /* enum */ aaz ON_START;
    public static final /* enum */ aaz ON_STOP;

    static {
        aaz aaz2;
        aaz aaz3;
        aaz aaz4;
        aaz aaz5;
        aaz aaz6;
        aaz aaz7;
        aaz aaz8;
        ON_CREATE = aaz8 = new aaz("ON_CREATE", 0);
        ON_START = aaz7 = new aaz("ON_START", 1);
        ON_RESUME = aaz6 = new aaz("ON_RESUME", 2);
        ON_PAUSE = aaz5 = new aaz("ON_PAUSE", 3);
        ON_STOP = aaz4 = new aaz("ON_STOP", 4);
        ON_DESTROY = aaz3 = new aaz("ON_DESTROY", 5);
        ON_ANY = aaz2 = new aaz("ON_ANY", 6);
        $VALUES = new aaz[]{aaz8, aaz7, aaz6, aaz5, aaz4, aaz3, aaz2};
        Companion = new aay();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aaz() {
        void var2_-1;
        void var1_-1;
    }

    public static aaz[] values() {
        return (aaz[])$VALUES.clone();
    }

    public final aba a() {
        block2: {
            block3: {
                block4: {
                    int n2 = this.ordinal();
                    if (n2 == 0) break block2;
                    if (n2 == 1) break block3;
                    if (n2 == 2) break block4;
                    if (n2 == 3) break block3;
                    if (n2 != 4) {
                        if (n2 == 5) {
                            return aba.a;
                        }
                        ((Object)((Object)this)).toString();
                        throw new IllegalArgumentException(((Object)((Object)this)).toString().concat(" has no target state"));
                    }
                    break block2;
                }
                return aba.e;
            }
            return aba.d;
        }
        return aba.c;
    }
}

