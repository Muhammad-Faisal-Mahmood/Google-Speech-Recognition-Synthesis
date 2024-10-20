/*
 * Decompiled with CFR 0.152.
 */
public final class efz
extends dww {
    private final eio c;

    public efz(eio eio2) {
        jse.e((Object)eio2, "clientInfo");
        super(null, null);
        this.c = eio2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof efz)) {
            return false;
        }
        object = (efz)object;
        return this.c == ((efz)object).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioRequestInjectionClient(clientInfo=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

