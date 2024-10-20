/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

final class jvu
extends jvw {
    final jvy a;
    private final jul c;

    public jvu(jvy jvy2, long l2, jul jul2) {
        this.a = jvy2;
        super(l2);
        this.c = jul2;
    }

    @Override
    public final void run() {
        this.c.v(this.a, jon.a);
    }

    @Override
    public final String toString() {
        String string = super.toString();
        jul jul2 = this.c;
        Objects.toString(jul2);
        return string.concat(((Object)jul2).toString());
    }
}

