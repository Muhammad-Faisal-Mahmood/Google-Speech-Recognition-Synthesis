/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.Random;

final class gtw
extends Random {
    private final boolean a;

    public gtw() {
        this.a = true;
    }

    static final SecureRandom a() {
        return Objects.requireNonNull((SecureRandom)gtx.b.get());
    }

    @Override
    protected final int next(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean nextBoolean() {
        return gtw.a().nextBoolean();
    }

    @Override
    public final void nextBytes(byte[] byArray) {
        gtw.a().nextBytes(byArray);
    }

    @Override
    public final double nextDouble() {
        return gtw.a().nextDouble();
    }

    @Override
    public final float nextFloat() {
        return gtw.a().nextFloat();
    }

    @Override
    public final double nextGaussian() {
        return gtw.a().nextGaussian();
    }

    @Override
    public final int nextInt() {
        return gtw.a().nextInt();
    }

    @Override
    public final int nextInt(int n2) {
        return gtw.a().nextInt(n2);
    }

    @Override
    public final long nextLong() {
        return gtw.a().nextLong();
    }

    @Override
    public final void setSeed(long l2) {
        if (!this.a) {
            super.setSeed(l2);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
    }
}

