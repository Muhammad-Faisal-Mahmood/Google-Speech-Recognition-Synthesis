/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class dsg {
    public final short[] a;
    public final short[] b;
    public final int c;
    public long d;

    public dsg(Random random) {
        fxf.q(true);
        this.a = new short[256];
        this.b = new short[256];
        this.c = random.nextInt() & 0xFDFDFDFD | 0x1010101;
        this.d = 0L;
    }
}

