/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class hiv
extends hik
implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public hiv() {
        MessageDigest messageDigest;
        this.a = messageDigest = hiv.b("SHA-256");
        this.b = messageDigest.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = hiv.c(messageDigest);
    }

    public hiv(String object, int n2) {
        boolean bl2;
        this.d = "Hashing.sha256()";
        this.a = object = hiv.b((String)object);
        int n3 = ((MessageDigest)object).getDigestLength();
        boolean bl3 = bl2 = false;
        if (n2 >= 4) {
            bl3 = bl2;
            if (n2 <= n3) {
                bl3 = true;
            }
        }
        fxf.w(bl3, "bytes (%s) must be >= 4 and < %s", n2, n3);
        this.b = n2;
        this.c = hiv.c((MessageDigest)object);
    }

    private static MessageDigest b(String object) {
        try {
            object = MessageDigest.getInstance((String)object);
            return object;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new AssertionError((Object)noSuchAlgorithmException);
        }
    }

    private static boolean c(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hiq a() {
        if (!this.c) return new hit(hiv.b(this.a.getAlgorithm()), this.b);
        try {
            return new hit((MessageDigest)this.a.clone(), this.b);
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return new hit(hiv.b(this.a.getAlgorithm()), this.b);
        }
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new hiu(this.a.getAlgorithm(), this.b);
    }
}

