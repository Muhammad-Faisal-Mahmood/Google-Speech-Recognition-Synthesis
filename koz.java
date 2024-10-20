/*
 * Decompiled with CFR 0.152.
 */
public final class koz {
    public final String a;
    public final boolean b;
    public final String c;
    private final boolean d;
    private final int e;
    private final int f;
    private final boolean g;

    public koz(boolean bl2, int n2, int n3, boolean bl3, String string, boolean bl4, String string2) {
        this.d = bl2;
        this.e = n2;
        this.f = n3;
        this.g = bl3;
        String string3 = string;
        if (string == null) {
            string3 = "";
        }
        this.a = string3;
        this.b = bl4;
        string = string2;
        if (string2 == null) {
            string = "";
        }
        this.c = string;
    }

    public final int a() {
        if (this.g) {
            return 2;
        }
        return 1;
    }

    public final int b() {
        if (this.d) {
            int n2 = this.e;
            if (n2 != 0 && n2 != 4 && n2 != 5) {
                return 0;
            }
            switch (this.f) {
                default: {
                    return 0;
                }
                case 15: {
                    return 17;
                }
                case 14: {
                    return 16;
                }
                case 13: {
                    return 18;
                }
                case 12: {
                    return 13;
                }
                case 11: {
                    return 4;
                }
                case 10: {
                    return 12;
                }
                case 9: {
                    return 15;
                }
                case 8: {
                    return 14;
                }
                case 7: {
                    return 6;
                }
                case 6: {
                    return 11;
                }
                case 5: {
                    return 10;
                }
                case 4: {
                    return 5;
                }
                case 3: {
                    return 9;
                }
                case 2: {
                    return 8;
                }
                case 1: 
            }
            return 7;
        }
        return 1;
    }

    public final int c() {
        if (!this.d) {
            return 6;
        }
        return kpb.a(this.e, this.f);
    }
}

