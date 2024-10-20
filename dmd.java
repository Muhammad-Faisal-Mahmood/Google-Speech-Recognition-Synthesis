/*
 * Decompiled with CFR 0.152.
 */
final class dmd
extends dmg {
    public static final dmd a = new dmd();

    private dmd() {
    }

    @Override
    public final /* synthetic */ hyf b(hyf hyf2, hyf hyf3) {
        kdf kdf2 = (kdf)hyf2;
        hyf3 = (kdf)hyf3;
        hyf2 = kdf2;
        if (kdf2 != null) {
            hyf2 = kdf2;
            if (hyf3 != null) {
                int n2;
                if ((kdf2.b & 1) != 0 && (n2 = kdf2.c - ((kdf)hyf3).c) != 0) {
                    hwp hwp2 = kdf.a.l();
                    if ((kdf2.b & 2) != 0) {
                        hyf2 = hyf3 = kdf2.d;
                        if (hyf3 == null) {
                            hyf2 = kdg.a;
                        }
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        hyf3 = (kdf)hwp2.b;
                        hyf2.getClass();
                        ((kdf)hyf3).d = hyf2;
                        ((kdf)hyf3).b |= 2;
                    }
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hyf2 = (kdf)hwp2.b;
                    ((kdf)hyf2).b |= 1;
                    ((kdf)hyf2).c = n2;
                    hyf2 = (kdf)hwp2.o();
                } else {
                    hyf2 = null;
                }
            }
        }
        return hyf2;
    }
}

