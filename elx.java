/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class elx
extends IOException {
    public final ebt a;

    public elx(ebt ebt2) {
        this.a = ebt2;
    }

    public elx(String string, ebt ebt2) {
        super(string);
        this.a = ebt2;
    }

    public elx(String string, ebt ebt2, Throwable throwable) {
        super(string, throwable);
        this.a = ebt2;
    }
}

