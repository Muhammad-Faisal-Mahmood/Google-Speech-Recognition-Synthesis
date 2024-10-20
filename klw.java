/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class klw {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final kmi a(OutputStream outputStream) {
        return new kly(outputStream, new kmm());
    }

    public static final kmi b(Socket closeable) {
        jse.e(closeable, "<this>");
        kmj kmj2 = new kmj((Socket)closeable);
        closeable = closeable.getOutputStream();
        jse.d(closeable, "getOutputStream(...)");
        return new klj(kmj2, new kly((OutputStream)closeable, kmj2));
    }

    public static final kmk c(InputStream inputStream) {
        jse.e(inputStream, "<this>");
        return new klv(inputStream, new kmm());
    }

    public static final kmk d(Socket closeable) {
        jse.e(closeable, "<this>");
        kmj kmj2 = new kmj((Socket)closeable);
        closeable = closeable.getInputStream();
        jse.d(closeable, "getInputStream(...)");
        return new klk(kmj2, new klv((InputStream)closeable, kmj2));
    }

    public static final boolean e(AssertionError object) {
        return ((Throwable)object).getCause() != null && (object = ((Throwable)object).getMessage()) != null && jse.F((CharSequence)object, "getsockname failed");
    }
}

