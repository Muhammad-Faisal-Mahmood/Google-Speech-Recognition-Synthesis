/*
 * Decompiled with CFR 0.152.
 */
public final class ql {
    static final boolean[] a = new boolean[3];

    static void a(qh object, px px2, qg qg2) {
        int n2;
        int n3;
        qf qf2;
        qg2.p = -1;
        qg2.q = -1;
        if (((qh)object).aq[0] != 2 && qg2.aq[0] == 4) {
            qf2 = qg2.J;
            n3 = qf2.f;
            n2 = ((qg)object).j() - qg2.L.f;
            qf2.h = px2.b(qf2);
            qf2 = qg2.L;
            qf2.h = px2.b(qf2);
            px2.f(qg2.J.h, n3);
            px2.f(qg2.L.h, n2);
            qg2.p = 2;
            qg2.Z = n3;
            qg2.V = n2 -= n3;
            n3 = qg2.ac;
            if (n2 < n3) {
                qg2.V = n3;
            }
        }
        if (((qh)object).aq[1] != 2 && qg2.aq[1] == 4) {
            qf2 = qg2.K;
            n3 = qf2.f;
            n2 = ((qg)object).h() - qg2.M.f;
            qf2.h = px2.b(qf2);
            object = qg2.M;
            ((qf)object).h = px2.b(object);
            px2.f(qg2.K.h, n3);
            px2.f(qg2.M.h, n2);
            if (qg2.ab > 0 || qg2.ah == 8) {
                object = qg2.N;
                ((qf)object).h = px2.b(object);
                px2.f(qg2.N.h, qg2.ab + n3);
            }
            qg2.q = 2;
            qg2.aa = n3;
            qg2.W = n2 -= n3;
            n3 = qg2.ad;
            if (n2 < n3) {
                qg2.W = n3;
            }
        }
    }

    public static final boolean b(int n2, int n3) {
        return (n2 & n3) == n3;
    }
}

