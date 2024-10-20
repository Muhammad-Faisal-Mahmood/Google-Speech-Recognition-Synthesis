/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class ahd
extends ags {
    public final int b;

    public ahd() {
        super(ahd.b(2008, 1));
        this.b = 1;
    }

    public ahd(IOException iOException, int n2, int n3) {
        super(iOException, ahd.b(n2, n3));
        this.b = n3;
    }

    public ahd(String string, int n2) {
        super(string, ahd.b(2003, 1));
        this.b = 1;
    }

    public ahd(String string, IOException iOException, int n2) {
        super(string, iOException, ahd.b(n2, 1));
        this.b = 1;
    }

    public static ahd a(IOException iOException, int n2) {
        String string = iOException.getMessage();
        int n3 = iOException instanceof SocketTimeoutException ? 2002 : (iOException instanceof InterruptedIOException ? 1004 : (string != null && fxf.T(string).matches("cleartext.*not permitted.*") ? 2007 : 2001));
        iOException = n3 == 2007 ? new ahc(iOException) : new ahd(iOException, n3, n2);
        return iOException;
    }

    private static int b(int n2, int n3) {
        int n4 = n2;
        if (n2 == 2000) {
            n4 = n3 != 1 ? 2000 : 2001;
        }
        return n4;
    }
}

