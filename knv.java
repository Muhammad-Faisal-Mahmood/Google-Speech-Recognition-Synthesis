/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;

final class knv
extends SocketImpl {
    public knv(FileDescriptor fileDescriptor) {
        this.fd = fileDescriptor;
    }

    @Override
    protected final void accept(SocketImpl socketImpl) {
        throw new RuntimeException("accept not implemented");
    }

    @Override
    protected final int available() {
        throw new RuntimeException("accept not implemented");
    }

    @Override
    protected final void bind(InetAddress inetAddress, int n2) {
        throw new RuntimeException("accept not implemented");
    }

    @Override
    protected final void close() {
    }

    @Override
    protected final void connect(String string, int n2) {
        throw new RuntimeException("connect not implemented");
    }

    @Override
    protected final void connect(InetAddress inetAddress, int n2) {
        throw new RuntimeException("connect not implemented");
    }

    @Override
    protected final void connect(SocketAddress socketAddress, int n2) {
        throw new RuntimeException("connect not implemented");
    }

    @Override
    protected final void create(boolean bl2) {
    }

    @Override
    protected final InputStream getInputStream() {
        throw new RuntimeException("getInputStream not implemented");
    }

    @Override
    public final Object getOption(int n2) {
        throw new RuntimeException("getOption not implemented");
    }

    @Override
    protected final OutputStream getOutputStream() {
        throw new RuntimeException("getOutputStream not implemented");
    }

    @Override
    protected final void listen(int n2) {
        throw new RuntimeException("listen not implemented");
    }

    @Override
    protected final void sendUrgentData(int n2) {
        throw new RuntimeException("sendUrgentData not implemented");
    }

    @Override
    public final void setOption(int n2, Object object) {
        throw new RuntimeException("setOption not implemented");
    }
}

