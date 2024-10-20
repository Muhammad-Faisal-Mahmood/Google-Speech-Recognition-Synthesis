/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRecord
 *  android.media.AudioTimestamp
 */
import android.media.AudioRecord;
import android.media.AudioTimestamp;

public final class egq
implements efr {
    private final AudioRecord a;
    private final boolean b;
    private final eae c;
    private final boolean d;
    private final els e;
    private final elr f;

    public egq(AudioRecord object, efx hwv2, gto object2, efs efs2, dlm dlm2, boolean bl2) {
        boolean bl3;
        this.a = object;
        this.b = bl2;
        eae eae2 = ((efx)hwv2).e;
        hwv2 = eae2;
        if (eae2 == null) {
            hwv2 = eae.a;
        }
        jse.d(hwv2, "getAudioLibInputParams(...)");
        this.c = hwv2;
        int n2 = ((eae)hwv2).b;
        boolean bl4 = bl3 = false;
        if ((n2 & 0x100) != 0) {
            bl4 = bl3;
            switch (efs2.ordinal()) {
                default: {
                    throw new joa();
                }
                case 4: {
                    bl4 = bl3;
                    if (!bl2) break;
                }
                case 1: 
                case 12: 
                case 13: {
                    bl4 = true;
                }
                case 0: 
                case 2: 
                case 3: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
            }
        }
        this.d = bl4;
        this.e = object2 = (els)((gto)object2).f();
        if (object2 == null && !bl4) {
            object = null;
        } else {
            ((cgw)dlm2.a.b()).getClass();
            hwv2.getClass();
            object = new elr((AudioRecord)object, (eae)hwv2);
        }
        this.f = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final eft a(byte[] object, int n2) {
        synchronized (this) {
            block6: {
                block5: {
                    n2 = this.a.read((byte[])object, 0, n2);
                    if (n2 < -1) {
                        return new eft(n2, 0L, 6, null);
                    }
                    object = this.f;
                    if (object == null) break block5;
                    elq elq2 = ((elr)object).a(n2);
                    object = elq2;
                    if (this.e != null) {
                        Object object2 = elq2.b;
                        object = elq2;
                        if (object2 != null) {
                            object = doc.l(dzs.a.l());
                            bzb bzb2 = doc.h(dzq.a.l());
                            bzb2.h(((AudioTimestamp)object2).nanoTime);
                            bzb2.g(((AudioTimestamp)object2).framePosition);
                            bzb2.i(dzr.b);
                            ((bzb)object).m(bzb2.f());
                            object = ((bzb)object).k();
                            this.e.a((dzs)object);
                            object = elq2;
                        }
                    }
                    break block6;
                }
                object = null;
            }
            if (object == null) return new eft(n2, 0L, 6, null);
            if (!this.d) return new eft(n2, 0L, 6, null);
            return new eft(n2, ((elq)object).a, 4, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        synchronized (this) {
            throw null;
        }
    }
}

