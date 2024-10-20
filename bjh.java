/*
 * Decompiled with CFR 0.152.
 */
public final class bjh {
    public final int a;
    public final int b;
    public final Object c;

    public bjh(bzb bzb2) {
        this.c = bzb2.a;
        this.b = Integer.MAX_VALUE;
        this.a = Integer.MAX_VALUE;
    }

    public bjh(String string) {
        this.c = string;
        this.a = 443;
        this.b = 443;
    }

    public final CharSequence a() {
        return (CharSequence)this.c.get(0);
    }
}

