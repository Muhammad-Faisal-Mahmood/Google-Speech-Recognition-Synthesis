/*
 * Decompiled with CFR 0.152.
 */
package j$.desugar.sun.nio.fs;

import j$.desugar.sun.nio.fs.b;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

final class a
extends FileChannel
implements SeekableByteChannel {
    final FileChannel a;

    private a(FileChannel fileChannel) {
        this.a = fileChannel;
    }

    public static FileChannel b(FileChannel fileChannel) {
        if (fileChannel instanceof a) {
            return fileChannel;
        }
        return new a(fileChannel);
    }

    @Override
    public final void force(boolean bl2) {
        this.a.force(bl2);
    }

    @Override
    public final void implCloseChannel() {
        this.a.close();
    }

    @Override
    public final FileLock lock(long l2, long l3, boolean bl2) {
        FileLock fileLock = this.a.lock(l2, l3, bl2);
        fileLock = fileLock == null ? null : new b(fileLock, this);
        return fileLock;
    }

    @Override
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long l2, long l3) {
        return this.a.map(mapMode, l2, l3);
    }

    @Override
    public final long position() {
        return this.a.position();
    }

    @Override
    public final FileChannel position(long l2) {
        return j$.desugar.sun.nio.fs.a.b(this.a.position(l2));
    }

    @Override
    public final int read(ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    @Override
    public final int read(ByteBuffer byteBuffer, long l2) {
        return this.a.read(byteBuffer, l2);
    }

    @Override
    public final long read(ByteBuffer[] byteBufferArray, int n2, int n3) {
        return this.a.read(byteBufferArray, n2, n3);
    }

    @Override
    public final long size() {
        return this.a.size();
    }

    @Override
    public final long transferFrom(ReadableByteChannel readableByteChannel, long l2, long l3) {
        return this.a.transferFrom(readableByteChannel, l2, l3);
    }

    @Override
    public final long transferTo(long l2, long l3, WritableByteChannel writableByteChannel) {
        return this.a.transferTo(l2, l3, writableByteChannel);
    }

    @Override
    public final FileChannel truncate(long l2) {
        return j$.desugar.sun.nio.fs.a.b(this.a.truncate(l2));
    }

    @Override
    public final FileLock tryLock(long l2, long l3, boolean bl2) {
        FileLock fileLock = this.a.tryLock(l2, l3, bl2);
        fileLock = fileLock == null ? null : new b(fileLock, this);
        return fileLock;
    }

    @Override
    public final int write(ByteBuffer byteBuffer) {
        return this.a.write(byteBuffer);
    }

    @Override
    public final int write(ByteBuffer byteBuffer, long l2) {
        return this.a.write(byteBuffer, l2);
    }

    @Override
    public final long write(ByteBuffer[] byteBufferArray, int n2, int n3) {
        return this.a.write(byteBufferArray, n2, n3);
    }
}

