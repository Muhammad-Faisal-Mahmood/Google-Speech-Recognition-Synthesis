/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileDescriptor;
import java.net.Socket;

public final class knw
extends Socket {
    public knw(FileDescriptor fileDescriptor) {
        super(new knv(fileDescriptor));
    }
}

