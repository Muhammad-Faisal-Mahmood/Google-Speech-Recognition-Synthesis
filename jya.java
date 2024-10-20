/*
 * Decompiled with CFR 0.152.
 */
public final class jya
extends jyb {
    public final Throwable a;

    public jya(Throwable throwable) {
        this.a = throwable;
    }

    public final boolean equals(Object object) {
        return object instanceof jya && jse.i(this.a, ((jya)object).a);
    }

    public final int hashCode() {
        Throwable throwable = this.a;
        if (throwable != null) {
            return throwable.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Closed(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

