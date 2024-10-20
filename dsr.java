/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import j$.time.Instant;
import java.util.Random;

final class dsr
extends dst {
    private final Random b;
    private final long c;
    private final dsg d;

    public dsr(ket ket2, Random random, dsg dsg2) {
        super(ket2);
        this.b = random;
        this.c = ket2.c;
        this.d = dsg2;
    }

    @Override
    public final long a(String object) {
        long l2;
        if (fxf.P((String)object)) {
            l2 = this.c;
        } else {
            Object object2;
            short[] sArray;
            int n2;
            dsg dsg2 = this.d;
            l2 = Instant.ofEpochMilli(SystemClock.elapsedRealtime()).toEpochMilli() - dsg2.d;
            int n3 = 0;
            if (l2 >= 14400000L) {
                long l3 = l2 / 14400000L;
                l2 = Math.min(l3, 15L);
                for (n2 = 0; n2 < 256; ++n2) {
                    sArray = dsg2.a;
                    object2 = (int)l2;
                    sArray[n2] = (short)(sArray[n2] >> object2);
                    sArray = dsg2.b;
                    sArray[n2] = (short)(sArray[n2] >> object2);
                }
                dsg2.d += l3 * 14400000L;
            }
            object2 = ((String)object).hashCode() * dsg2.c;
            n2 = ((String)object).isEmpty() ? n3 : (int)((String)object).charAt(0);
            n3 = ((String)object).length();
            object = dsg2.a;
            sArray = dsg2.b;
            n2 = (object2 >>> 24) + n2 & 0xFF;
            Object object3 = object[n2];
            n3 = (object2 >>> 16) + n3 & 0xFF;
            object3 = Math.min((int)object3, sArray[n3]);
            object2 = object3 + true;
            short s2 = (short)Math.min(Short.MAX_VALUE, object2);
            object = dsg2.a;
            if (object[n2] == object3) {
                object[n2] = s2;
            }
            if ((object = (Object)dsg2.b)[n3] == object3) {
                object[n3] = s2;
            }
            double d2 = object2 < 50 ? Math.sqrt(object2) : (double)object2;
            l2 = (int)((double)this.c / d2);
        }
        if (this.b.nextDouble() * 1000.0 < (double)l2) {
            return l2;
        }
        return -1L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final ket b(Long object) {
        int n2;
        if (object == null) return this.a;
        hyg hyg2 = this.a;
        if ((Long)object == ((ket)hyg2).c) return this.a;
        hyg2 = ket.a.l();
        int n3 = n2 = a.F(this.a.d);
        if (n2 == 0) {
            n3 = 1;
        }
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        ket ket2 = (ket)((hwp)hyg2).b;
        ket2.d = n3 - 1;
        ket2.b |= 4;
        long l2 = (Long)object;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object = (ket)((hwp)hyg2).b;
        ((ket)object).b |= 2;
        ((ket)object).c = l2;
        return (ket)((hwp)hyg2).o();
    }

    @Override
    public final ket c(Long object) {
        object = this.d() ? this.b((Long)object) : this.e();
        return object;
    }

    @Override
    public final boolean d() {
        return this.c > 0L;
    }
}

