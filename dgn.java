/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

final class dgn
implements dgi {
    private final String a;
    private final int b;
    private final Object c;

    public dgn(String string, Object object, int n2) {
        this.b = n2;
        this.a = string;
        this.c = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String a(InputStream inputStream, dcx object) {
        MessageDigest messageDigest;
        if (this.b != 0) {
            Checksum checksum = (Checksum)this.c.a();
            inputStream = new CheckedInputStream(inputStream, checksum);
            try {
                byte[] byArray = new byte[2048];
                while (((FilterInputStream)inputStream).read(byArray) > 0) {
                    ((dcx)object).a();
                }
                object = Long.toHexString(checksum.getValue());
                return object;
            }
            finally {
                ((FilterInputStream)inputStream).close();
            }
        }
        try {
            messageDigest = MessageDigest.getInstance((String)this.c);
            inputStream = new DigestInputStream(inputStream, messageDigest);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IOException(noSuchAlgorithmException);
        }
        try {
            byte[] byArray = new byte[2048];
            while (((FilterInputStream)inputStream).read(byArray) > 0) {
                ((dcx)object).a();
            }
            object = hjd.f.g(messageDigest.digest());
            return object;
        }
        finally {
            ((FilterInputStream)inputStream).close();
        }
    }

    public final String toString() {
        if (this.b != 0) {
            return this.a;
        }
        return this.a;
    }
}

