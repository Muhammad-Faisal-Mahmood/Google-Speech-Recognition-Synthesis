/*
 * Decompiled with CFR 0.152.
 */
public final class acg
implements Runnable {
    private final abg a;
    private final aaz b;
    private boolean c;

    public acg(abg abg2, aaz aaz2) {
        jse.e((Object)aaz2, "event");
        this.a = abg2;
        this.b = aaz2;
    }

    @Override
    public final void run() {
        if (!this.c) {
            this.a.d(this.b);
            this.c = true;
        }
    }
}

