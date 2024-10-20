/*
 * Decompiled with CFR 0.152.
 */
package j$.desugar.sun.nio.fs;

import j$.desugar.sun.nio.fs.a;
import java.nio.channels.FileLock;

final class b
extends FileLock {
    private final FileLock a;

    b(FileLock fileLock, a a2) {
        super(a2, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.a = fileLock;
    }

    @Override
    public final boolean isValid() {
        return this.a.isValid();
    }

    @Override
    public final void release() {
        this.a.release();
    }
}

