/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Locale;

public final class hwc
extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    hwc() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public hwc(int n2, int n3, int n4, Throwable throwable) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", (long)n2, (long)n3, n4))), throwable);
    }

    public hwc(Throwable throwable) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
    }
}

