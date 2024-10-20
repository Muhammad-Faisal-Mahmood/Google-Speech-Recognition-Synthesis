/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class hxn
extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public hxn(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public hxn(IOException iOException, byte[] byArray) {
        super("Unable to decode to byte array", iOException);
    }

    public hxn(String string) {
        super(string);
    }

    final void a() {
        this.a = true;
    }
}

