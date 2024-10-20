/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import java.util.Arrays;

final class hit
extends hij {
    private final MessageDigest b;
    private final int c;
    private boolean d;

    public hit(MessageDigest messageDigest, int n2) {
        this.b = messageDigest;
        this.c = n2;
    }

    private final void g() {
        fxf.B(this.d ^ true, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override
    protected final void c(byte[] byArray, int n2) {
        this.g();
        this.b.update(byArray, 0, n2);
    }

    @Override
    public final hio n() {
        Object object;
        this.g();
        this.d = true;
        int n2 = this.c;
        if (n2 == this.b.getDigestLength()) {
            object = this.b.digest();
            n2 = hio.b;
            object = new hin((byte[])object);
        } else {
            object = Arrays.copyOf(this.b.digest(), n2);
            n2 = hio.b;
            object = new hin((byte[])object);
        }
        return object;
    }
}

