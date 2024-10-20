/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

final class arp
extends ars {
    public static final byte[] a = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] o = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    private boolean p;

    public static boolean d(aga aga2, byte[] byArray) {
        if (aga2.a() < 8) {
            return false;
        }
        int n2 = aga2.b;
        byte[] byArray2 = new byte[8];
        aga2.r(byArray2, 0, 8);
        aga2.v(n2);
        return Arrays.equals(byArray2, byArray);
    }

    @Override
    protected final long a(aga object) {
        object = ((aga)object).a;
        Object object2 = 0;
        Object object3 = object[0];
        if (((Object)object).length > 1) {
            object2 = object[1];
        }
        return this.f(wc.l((byte)object3, object2));
    }

    @Override
    protected final void b(boolean bl2) {
        super.b(bl2);
        if (bl2) {
            this.p = false;
        }
    }

    @Override
    protected final boolean c(aga object, long l2, arq arq2) {
        block9: {
            block8: {
                block7: {
                    if (!arp.d((aga)object, a)) break block7;
                    Object object2 = Arrays.copyOf(((aga)object).a, ((aga)object).c);
                    byte by2 = object2[9];
                    l2 = wc.k((byte[])object2);
                    object = new ArrayList(3);
                    object.add(object2);
                    object.add(wc.o(wc.m(l2)));
                    object.add(wc.o(wc.m(3840L)));
                    if (arq2.a == null) {
                        object2 = new adt();
                        ((adt)object2).a("audio/opus");
                        ((adt)object2).B = by2 & 0xFF;
                        ((adt)object2).C = 48000;
                        ((adt)object2).p = object;
                        arq2.a = new adu((adt)object2);
                        return true;
                    }
                    break block8;
                }
                if (!arp.d((aga)object, o)) break block9;
                abr.j(arq2.a);
                if (!this.p) {
                    this.p = true;
                    ((aga)object).w(8);
                    aek aek2 = wd.r(gzx.p((Object[])wd.w((aga)object, (boolean)false, (boolean)false).a));
                    if (aek2 != null) {
                        object = arq2.a;
                        adt adt2 = new adt((adu)object);
                        adt2.k = aek2.d(((adu)object).l);
                        arq2.a = new adu(adt2);
                    }
                }
            }
            return true;
        }
        abr.j(arq2.a);
        return false;
    }
}

