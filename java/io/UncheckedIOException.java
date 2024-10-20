/*
 * Decompiled with CFR 0.152.
 */
package java.io;

import j$.util.Objects;
import java.io.IOException;

public class UncheckedIOException
extends RuntimeException {
    public UncheckedIOException(String string, IOException iOException) {
        super(string, Objects.requireNonNull(iOException));
    }

    @Override
    public IOException getCause() {
        return (IOException)super.getCause();
    }
}

