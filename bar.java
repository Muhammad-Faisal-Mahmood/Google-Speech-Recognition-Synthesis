/*
 * Decompiled with CFR 0.152.
 */
public final class bar
extends juy {
    public static final bar a = new bar();
    private static final juy d = jvo.a;

    private bar() {
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        jse.e(jqf2, "context");
        jse.e(runnable, "block");
        d.a(jqf2, runnable);
    }

    @Override
    public final boolean b(jqf jqf2) {
        jse.e(jqf2, "context");
        return true;
    }
}

