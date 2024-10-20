/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class klt
implements kmk {
    private byte a;
    private final kme b;
    private final Inflater c;
    private final klu d;
    private final CRC32 e;

    public klt(kmk kmk2) {
        Inflater inflater;
        kmk2 = new kme(kmk2);
        this.b = kmk2;
        this.c = inflater = new Inflater(true);
        this.d = new klu((klo)kmk2, inflater);
        this.e = new CRC32();
    }

    private final void c(klm object, long l2, long l3) {
        int n2;
        long l4;
        Object object2;
        object = ((klm)object).a;
        jse.b(object);
        while (true) {
            long l5 = ((kmf)object).c - ((kmf)object).b;
            object2 = object;
            l4 = l2;
            if (l2 < l5) break;
            object = ((kmf)object).f;
            jse.b(object);
            l2 -= l5;
        }
        for (long i2 = l3; i2 > 0L; i2 -= (long)n2) {
            l2 = ((kmf)object2).b;
            n2 = ((kmf)object2).c;
            int n3 = (int)(l2 + l4);
            n2 = (int)Math.min((long)(n2 - n3), i2);
            this.e.update(((kmf)object2).a, n3, n2);
            object2 = ((kmf)object2).f;
            jse.b(object2);
            l4 = 0L;
        }
    }

    private static final void d(String string, int n2, int n3) {
        if (n3 == n2) {
            return;
        }
        String string2 = jse.O(kmp.w(n3));
        String string3 = jse.O(kmp.w(n2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(": actual 0x");
        stringBuilder.append(string2);
        stringBuilder.append(" != expected 0x");
        stringBuilder.append(string3);
        throw new IOException(stringBuilder.toString());
    }

    @Override
    public final kmm a() {
        return this.b.a();
    }

    @Override
    public final long b(klm klo2, long l2) {
        block21: {
            Object object;
            block20: {
                int n2;
                block19: {
                    int n3;
                    n2 = n3 = this.a;
                    if (n3 == 0) {
                        this.b.w(10L);
                        n3 = this.b.b.c(3L);
                        n2 = n3 >> 1 & 1;
                        if (n2 != 0) {
                            this.c(this.b.b, 0L, 10L);
                        }
                        klt.d("ID1ID2", 8075, this.b.t());
                        this.b.x(8L);
                        if ((n3 >> 2 & 1) == 1) {
                            this.b.w(2L);
                            if (n2 != 0) {
                                this.c(this.b.b, 0L, 2L);
                            }
                            char c2 = (char)this.b.b.u();
                            object = this.b;
                            l2 = c2;
                            ((kme)object).w(l2);
                            if (n2 != 0) {
                                this.c(this.b.b, 0L, l2);
                            }
                            this.b.x(l2);
                        }
                        if ((n3 >> 3 & 1) == 1) {
                            l2 = this.b.g();
                            if (l2 != -1L) {
                                ++l2;
                                if (n2 != 0) {
                                    this.c(this.b.b, 0L, l2);
                                }
                                this.b.x(l2);
                            } else {
                                throw new EOFException();
                            }
                        }
                        if ((n3 >> 4 & 1) == 1) {
                            l2 = this.b.g();
                            if (l2 != -1L) {
                                ++l2;
                                if (n2 != 0) {
                                    this.c(this.b.b, 0L, l2);
                                }
                                this.b.x(l2);
                            } else {
                                throw new EOFException();
                            }
                        }
                        if (n2 != 0) {
                            object = this.b;
                            ((kme)object).w(2L);
                            CRC32 cRC32 = this.e;
                            klt.d("FHCRC", ((kme)object).b.u(), (short)cRC32.getValue());
                            this.e.reset();
                        }
                        this.a = 1;
                        n2 = 1;
                    }
                    if (n2 != 1) break block19;
                    l2 = ((klm)klo2).b;
                    long l3 = this.d.b((klm)klo2, 8192L);
                    if (l3 != -1L) {
                        this.c((klm)klo2, l2, l3);
                        return l3;
                    }
                    this.a = (byte)2;
                    break block20;
                }
                if (n2 != 2) break block21;
            }
            klo2 = this.b;
            object = this.e;
            klt.d("CRC", ((kme)klo2).c(), (int)((CRC32)object).getValue());
            klo2 = this.b;
            object = this.c;
            klt.d("ISIZE", ((kme)klo2).c(), (int)((Inflater)object).getBytesWritten());
            this.a = (byte)3;
            if (!this.b.y()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override
    public final void close() {
        this.d.close();
    }
}

