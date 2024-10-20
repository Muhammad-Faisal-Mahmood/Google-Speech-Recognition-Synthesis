/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class cdj {
    public final bxt a;
    private final int b;
    private final cco c;
    private final String d;

    public cdj(bxt bxt2, cco cco2, String string) {
        this.a = bxt2;
        this.c = cco2;
        this.d = string;
        this.b = Arrays.hashCode(new Object[]{bxt2, cco2, string});
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof cdj)) {
            return false;
        }
        object = (cdj)object;
        return a.k(this.a, ((cdj)object).a) && a.k(this.c, ((cdj)object).c) && a.k(this.d, ((cdj)object).d);
    }

    public final int hashCode() {
        return this.b;
    }
}

