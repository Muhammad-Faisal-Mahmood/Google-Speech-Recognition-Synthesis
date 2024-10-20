/*
 * Decompiled with CFR 0.152.
 */
public final class fdw
extends fef {
    private final String b;

    public fdw(int n2, String string) {
        fdq fdq2 = fdr.a();
        fdq2.a = 15;
        fdq2.b(n2);
        super(fdq2.a());
        this.b = string;
    }

    @Override
    public final String getMessage() {
        return this.b;
    }
}

