/*
 * Decompiled with CFR 0.152.
 */
final class jem
implements Runnable {
    final jcu a;
    final boolean b;
    final jeu c;

    public jem(jeu jeu2, jcu jcu2, boolean bl2) {
        this.a = jcu2;
        this.b = bl2;
        this.c = jeu2;
    }

    @Override
    public final void run() {
        this.c.l.c(this.a, this.b);
    }
}

