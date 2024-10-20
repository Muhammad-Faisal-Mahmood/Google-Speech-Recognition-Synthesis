/*
 * Decompiled with CFR 0.152.
 */
final class kci
extends juy {
    public static final kci a = new kci();

    private kci() {
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        kcd.a.g(runnable, false);
    }

    @Override
    public final void f(jqf jqf2, Runnable runnable) {
        kcd.a.g(runnable, true);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}

