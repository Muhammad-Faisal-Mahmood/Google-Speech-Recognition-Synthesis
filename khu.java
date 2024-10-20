/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class khu
extends RuntimeException {
    public final IOException a;
    public IOException b;

    public khu(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}

