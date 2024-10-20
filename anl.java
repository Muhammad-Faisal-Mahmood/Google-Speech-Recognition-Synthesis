/*
 * Decompiled with CFR 0.152.
 */
final class anl
implements anv {
    public final int a;
    final ann b;

    public anl(ann ann2, int n2) {
        this.b = ann2;
        this.a = n2;
    }

    @Override
    public final int a(long l2) {
        int n2;
        ann ann2;
        block3: {
            int n3;
            block2: {
                ann2 = this.b;
                boolean bl2 = ann2.w();
                n3 = 0;
                if (bl2) break block2;
                n2 = this.a;
                ann2.s(n2);
                anu anu2 = ann2.i[n2];
                n3 = anu2.b(l2, ann2.t);
                anu2.n(n3);
                if (n3 == 0) break block3;
            }
            return n3;
        }
        ann2.t(n2);
        return 0;
    }

    @Override
    public final void b() {
        ann ann2 = this.b;
        bzb bzb2 = ann2.i[this.a].g;
        if (bzb2 == null) {
            ann2.u();
            return;
        }
        throw (Throwable)bzb2.a;
    }

    @Override
    public final boolean c() {
        int n2;
        ann ann2 = this.b;
        return !ann2.w() && ann2.i[n2 = this.a].p(ann2.t);
    }

    @Override
    public final int d(arq object, ahx ahx2, int n2) {
        int n3;
        block4: {
            int n4;
            ann ann2;
            block5: {
                block6: {
                    Object object2;
                    block9: {
                        block7: {
                            Object object3;
                            block8: {
                                int n5;
                                ann2 = this.b;
                                boolean bl2 = ann2.w();
                                n3 = -3;
                                if (bl2) break block4;
                                n4 = this.a;
                                ann2.s(n4);
                                object2 = ann2.i[n4];
                                boolean bl3 = ann2.t;
                                object3 = ((anu)object2).b;
                                bl2 = (n2 & 2) != 0;
                                n3 = n5 = ((anu)object2).v((arq)object, ahx2, bl2, bl3, (ans)object3);
                                if (n5 != -4) break block5;
                                if (ahx2.isEndOfStream()) break block6;
                                n3 = n2 & 1;
                                if ((n2 & 4) != 0) break block7;
                                if (n3 == 0) break block8;
                                object = ((anu)object2).a;
                                object2 = ((anu)object2).b;
                                anr.b(((anr)object).c, ahx2, (ans)object2, ((anr)object).a);
                                break block6;
                            }
                            object3 = ((anu)object2).a;
                            object = ((anu)object2).b;
                            ((anr)object3).c = anr.b(((anr)object3).c, ahx2, (ans)object, ((anr)object3).a);
                            break block9;
                        }
                        if (n3 != 0) break block6;
                    }
                    ++((anu)object2).e;
                }
                n3 = -4;
            }
            if (n3 == -3) {
                ann2.t(n4);
                return n3;
            }
        }
        return n3;
    }
}

