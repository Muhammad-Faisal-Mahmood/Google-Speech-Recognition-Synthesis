/*
 * Decompiled with CFR 0.152.
 */
package j$.nio.channels;

import j$.adapter.a;
import j$.desugar.sun.nio.fs.c;
import java.nio.channels.FileChannel;

public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (a.a) {
            return fileChannel;
        }
        return c.b(fileChannel);
    }
}

