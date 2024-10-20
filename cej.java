/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

final class cej
implements ckv {
    private final cea a;
    private final int b;
    private final cdj c;
    private final long d;
    private final long e;

    public cej(cea cea2, int n2, cdj cdj2, long l2, long l3) {
        this.a = cea2;
        this.b = n2;
        this.c = cdj2;
        this.d = l2;
        this.e = l3;
    }

    public static cfh b(cdx cdx2, cfc object, int n2) {
        int[] nArray;
        object = ((cfc)object).m;
        object = object == null ? null : ((cfg)object).d;
        if (object != null && ((cfh)object).b && !((nArray = ((cfh)object).d) != null ? !cgw.d(nArray, n2) : (nArray = ((cfh)object).f) != null && cgw.d(nArray, n2))) {
            if (cdx2.h < ((cfh)object).e) {
                return object;
            }
        }
        return null;
    }

    @Override
    public final void a(ckz object) {
        block2: {
            long l2;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            long l3;
            ccp ccp2;
            Object object2;
            block8: {
                block11: {
                    block10: {
                        block9: {
                            block7: {
                                block6: {
                                    block3: {
                                        block5: {
                                            block4: {
                                                cgg cgg2;
                                                if (!this.a.g() || (cgg2 = cgf.a().a) != null && !cgg2.b || (object2 = this.a.b(this.c)) == null || !((ccp2 = ((cdx)object2).b) instanceof cfc)) break block2;
                                                l3 = this.d;
                                                n7 = 1;
                                                n6 = l3 > 0L ? 1 : 0;
                                                if (cgg2 == null) break block3;
                                                n6 &= cgg2.c;
                                                cfc cfc2 = (cfc)((Object)ccp2);
                                                boolean bl2 = cfc2.z();
                                                n5 = cgg2.d;
                                                n4 = cgg2.e;
                                                n3 = cgg2.a;
                                                if (!bl2 || cfc2.k()) break block4;
                                                if ((object2 = cej.b((cdx)object2, cfc2, this.b)) == null) break block2;
                                                n6 = ((cfh)object2).c && this.d > 0L ? n7 : 0;
                                                n7 = ((cfh)object2).e;
                                                break block5;
                                            }
                                            n7 = n4;
                                        }
                                        n2 = n6;
                                        n4 = n7;
                                        break block6;
                                    }
                                    n5 = 5000;
                                    n3 = 0;
                                    n4 = 100;
                                    n2 = n6;
                                }
                                object2 = this.a;
                                if (!((ckz)object).e()) break block7;
                                n6 = 0;
                                n7 = 0;
                                break block8;
                            }
                            if (!((cld)object).c) break block9;
                            n7 = -1;
                            n6 = 100;
                            break block8;
                        }
                        if (!((object = ((ckz)object).c()) instanceof ccq)) break block10;
                        object = ((ccq)object).a;
                        n6 = ((Status)object).e;
                        object = ((Status)object).h;
                        if (object == null) break block11;
                        n7 = ((cbk)object).c;
                        break block8;
                    }
                    n6 = 101;
                }
                n7 = -1;
            }
            if (n2 != 0) {
                l2 = this.d;
                long l4 = this.e;
                l3 = System.currentTimeMillis();
                n2 = (int)(SystemClock.elapsedRealtime() - l4);
            } else {
                n2 = -1;
                l2 = 0L;
                l3 = 0L;
            }
            int n8 = ((cfc)((Object)ccp2)).i;
            object = new cga(this.b, n6, n7, l2, l3, null, null, n8, n2);
            l3 = n5;
            ccp2 = ((cea)object2).m;
            ccp2.sendMessage(ccp2.obtainMessage(18, new cek((cga)object, n3, l3, n4)));
        }
    }
}

