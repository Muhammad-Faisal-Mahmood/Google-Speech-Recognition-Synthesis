/*
 * Decompiled with CFR 0.152.
 */
public final class cvk
extends cvm {
    private final hpn a;

    public cvk(hpn hpn2) {
        this.a = hpn2;
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final hpn c() {
        return this.a;
    }

    public final boolean equals(Object object) {
        return object instanceof cvn && ((cvn)(object = (cvn)object)).b() == 2 && this.a.equals(((cvn)object).c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

