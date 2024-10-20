/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

final class kmj
extends kll {
    private final Socket a;

    public kmj(Socket socket) {
        jse.e(socket, "socket");
        this.a = socket;
    }

    @Override
    protected final void a() {
        try {
            this.a.close();
            return;
        }
        catch (AssertionError assertionError) {
            if (klw.e(assertionError)) {
                Socket socket = this.a;
                Logger logger = klw.a;
                Level level = Level.WARNING;
                Objects.toString(socket);
                logger.log(level, "Failed to close timed out socket ".concat(String.valueOf(socket)), (Throwable)((Object)assertionError));
                return;
            }
            throw assertionError;
        }
        catch (Exception exception) {
            Socket socket = this.a;
            Logger logger = klw.a;
            Level level = Level.WARNING;
            Objects.toString(socket);
            logger.log(level, "Failed to close timed out socket ".concat(String.valueOf(socket)), exception);
            return;
        }
    }

    @Override
    protected final IOException d(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}

