/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class anr {
    public final aga a;
    public anq b;
    public anq c;
    public anq d;
    public long e;
    public final apb f;

    public anr(apb object) {
        this.f = object;
        this.a = new aga(32);
        this.b = object = new anq(0L);
        this.c = object;
        this.d = object;
    }

    public static anq b(anq object, ahx object2, ans ans2, aga object3) {
        block16: {
            int n2;
            int n3;
            long l2;
            block20: {
                Object object4;
                block19: {
                    Object object5;
                    block18: {
                        block17: {
                            long l3;
                            if (!((ahx)object2).c()) break block16;
                            l2 = ans2.b;
                            n3 = 1;
                            ((aga)object3).s(1);
                            object = anr.g((anq)object, l2, ((aga)object3).a, 1);
                            ++l2;
                            object4 = ((aga)object3).a;
                            int n4 = 0;
                            n2 = object4[0];
                            int n5 = n2 & 0x7F;
                            object5 = ((ahx)object2).b;
                            object2 = ((ahu)object5).a;
                            if (object2 == null) {
                                ((ahu)object5).a = new byte[16];
                            } else {
                                Arrays.fill((byte[])object2, (byte)0);
                            }
                            n2 = (n2 & 0x80) != 0 ? 1 : 0;
                            object2 = anr.g((anq)object, l2, ((ahu)object5).a, n5);
                            l2 = l3 = l2 + (long)n5;
                            object = object2;
                            if (n2 != 0) {
                                ((aga)object3).s(2);
                                object = anr.g((anq)object2, l3, ((aga)object3).a, 2);
                                l2 = l3 + 2L;
                                n3 = ((aga)object3).k();
                            }
                            if ((object4 = (Object)((ahu)object5).b) == null) break block17;
                            object2 = object4;
                            if (((byte[])object4).length >= n3) break block18;
                        }
                        object2 = new int[n3];
                    }
                    if ((object5 = (Object)((ahu)object5).c) == null) break block19;
                    object4 = object5;
                    if (((Object)object5).length >= n3) break block20;
                }
                object4 = new int[n3];
            }
            if (n2 != 0) {
                n2 = n3 * 6;
                ((aga)object3).s(n2);
                anr.g((anq)object, l2, ((aga)object3).a, n2);
                ((aga)object3).v(0);
                for (n2 = n4; n2 < n3; ++n2) {
                    object2[n2] = ((aga)object3).k();
                    object4[n2] = ((aga)object3).j();
                }
            } else {
                object2[0] = false;
                object4[0] = ans2.a - (int)(l2 - ans2.b);
            }
            object = ans2.c;
            n3 = agf.a;
            object = ((aqd)object).a;
            throw null;
        }
        if (((aht)object2).hasSupplementalData()) {
            ((aga)object3).s(4);
            object = anr.g((anq)object, ans2.b, ((aga)object3).a, 4);
            int n6 = ((aga)object3).j();
            ans2.b += 4L;
            ans2.a -= 4;
            ((ahx)object2).a(n6);
            object = anr.f((anq)object, ans2.b, ((ahx)object2).c, n6);
            ans2.b += (long)n6;
            ans2.a = n6 = ans2.a - n6;
            object3 = ((ahx)object2).f;
            if (object3 != null && ((Buffer)object3).capacity() >= n6) {
                ((ahx)object2).f.clear();
            } else {
                ((ahx)object2).f = ByteBuffer.allocate(n6);
            }
            object = anr.f((anq)object, ans2.b, ((ahx)object2).f, ans2.a);
        } else {
            ((ahx)object2).a(ans2.a);
            object = anr.f((anq)object, ans2.b, ((ahx)object2).c, ans2.a);
        }
        return object;
    }

    private static anq e(anq anq2, long l2) {
        while (l2 >= anq2.b) {
            anq2 = anq2.c;
        }
        return anq2;
    }

    private static anq f(anq anq2, long l2, ByteBuffer byteBuffer, int n2) {
        anq2 = anr.e(anq2, l2);
        while (n2 > 0) {
            long l3;
            int n3 = Math.min(n2, (int)(anq2.b - l2));
            Object object = anq2.d.b;
            int n4 = anq2.a(l2);
            byteBuffer.put((byte[])object, n4, n3);
            n4 = n2 - n3;
            l2 = l3 = l2 + (long)n3;
            n2 = n4;
            if (l3 != anq2.b) continue;
            anq2 = anq2.c;
            l2 = l3;
            n2 = n4;
        }
        return anq2;
    }

    private static anq g(anq anq2, long l2, byte[] byArray, int n2) {
        anq2 = anr.e(anq2, l2);
        int n3 = n2;
        while (n3 > 0) {
            int n4 = Math.min(n3, (int)(anq2.b - l2));
            System.arraycopy(anq2.d.b, anq2.a(l2), byArray, n2 - n3, n4);
            int n5 = n3 - n4;
            long l3 = l2 + (long)n4;
            n3 = n5;
            l2 = l3;
            if (l3 != anq2.b) continue;
            anq2 = anq2.c;
            n3 = n5;
            l2 = l3;
        }
        return anq2;
    }

    public final int a(int n2) {
        anq anq2 = this.d;
        if (anq2.d == null) {
            hti hti2 = this.f.j();
            anq anq3 = new anq(this.d.b);
            anq2.d = hti2;
            anq2.c = anq3;
        }
        return Math.min(n2, (int)(this.d.b - this.e));
    }

    public final void c(long l2) {
        if (l2 != -1L) {
            anq anq2;
            while (true) {
                anq2 = this.b;
                if (l2 < anq2.b) break;
                this.f.k(anq2.d);
                this.b = this.b.b();
            }
            if (this.c.a < anq2.a) {
                this.c = anq2;
            }
        }
    }

    public final void d(int n2) {
        long l2;
        this.e = l2 = this.e + (long)n2;
        anq anq2 = this.d;
        if (l2 == anq2.b) {
            this.d = anq2.c;
        }
    }
}

