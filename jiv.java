/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

final class jiv
implements jjf {
    @Override
    public final void a(iyh iyh2) {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d(jjq jjq2) {
        InputStream inputStream;
        while ((inputStream = jjq2.g()) != null) {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                InputStream inputStream2;
                while ((inputStream2 = jjq2.g()) != null) {
                    try {
                        inputStream2.close();
                    }
                    catch (IOException iOException2) {
                        jja.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", iOException2);
                    }
                }
                throw new RuntimeException(iOException);
            }
        }
    }

    @Override
    public final void e() {
    }
}

