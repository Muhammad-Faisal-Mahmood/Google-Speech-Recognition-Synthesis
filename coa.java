/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import j$.util.Optional;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class coa
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final int d;

    public coa(jnu jnu2, jnu jnu3, jnu jnu4, int n2) {
        this.d = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public coa(jnu jnu2, jnu jnu3, jnu jnu4, int n2, float[] fArray) {
        this.d = n2;
        this.b = jnu2;
        this.c = jnu3;
        this.a = jnu4;
    }

    public coa(jnu jnu2, jnu jnu3, jnu jnu4, int n2, short[] sArray) {
        this.d = n2;
        this.b = jnu2;
        this.a = jnu3;
        this.c = jnu4;
    }

    public coa(jnu jnu2, jnu jnu3, jnu jnu4, int n2, short[][] sArray) {
        this.d = n2;
        this.c = jnu2;
        this.a = jnu3;
        this.b = jnu4;
    }

    public coa(jnu jnu2, jnu jnu3, jnu jnu4, int n2, boolean[][] blArray) {
        this.d = n2;
        this.a = jnu2;
        this.c = jnu3;
        this.b = jnu4;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.d) {
            default: {
                Object object = ((dzh)this.b).a();
                dze dze2 = ((fjl)this.c).a();
                iku iku2 = ima.c(this.a);
                iku2.getClass();
                object = (Set)((imc)((cxt)object).a).a;
                object.getClass();
                return new dzg(dze2, iku2, (Set)object);
            }
            case 19: {
                gcv gcv2 = ((dxn)this.b).a();
                Object object = this.a;
                Object object2 = this.c;
                object = ima.c((jnu)object);
                Optional optional = (Optional)((imc)object2).a;
                object2 = dxs.a();
                ((dxr)object2).a = "SingletonLogger";
                ((dxr)object2).e(optional.orElse(0));
                return gcv2.e((iku)object, ((dxr)object2).a());
            }
            case 18: {
                Object object = ((imc)this.c).a;
                dtu dtu2 = ((dwy)this.b).a();
                object = (Map)object;
                return new dxf(dtu2, ((ily)this.a).a, (Map)object);
            }
            case 17: {
                jnu jnu2 = this.a;
                jnu jnu3 = this.c;
                return new dwm(((ilt)this.b).a(), ((bqw)jnu3).a(), ((dtg)jnu2).a(), new ClearcutMetricSnapshotTransmitter());
            }
            case 16: {
                Serializable serializable = (gto)((imc)this.a).a;
                gto gto2 = (gto)((imc)this.c).a;
                serializable = !serializable.g() && !gto2.g() ? hdc.a : new hdq((dmw)this.b.b());
                idi.m(serializable);
                return serializable;
            }
            case 15: {
                Object object = (gto)((imc)this.a).a;
                gto gto3 = (gto)((imc)this.c).a;
                object = !((gto)object).g() && !gto3.g() ? new dox(null, null, null) : (dox)this.b.b();
                idi.m(object);
                return object;
            }
            case 14: {
                Object object = (Executor)this.c.b();
                object = (dqb)this.a.b();
                object = (cgw)this.b.b();
                return new doc(null);
            }
            case 13: {
                Object object = ((imc)this.a).a;
                return new dow(ima.c(this.c), (gto)object, (Executor)this.b.b());
            }
            case 12: {
                jnu jnu4 = this.c;
                jnu jnu5 = this.b;
                return new dop(((dmv)this.a).a(), ima.c(jnu5), (Executor)jnu4.b());
            }
            case 11: {
                Object object = ((imc)this.b).a;
                czh czh2 = ((dlk)this.c).a();
                return new dmx((gto)object, this.a, czh2);
            }
            case 10: {
                return new dli((dlm)this.b.b(), (dlq)this.c.b(), this.a);
            }
            case 9: {
                return new djs((hpr)this.c.b(), (dlm)this.a.b(), this.b);
            }
            case 8: {
                jnu jnu6 = this.a;
                jnu jnu7 = this.c;
                gkf gkf2 = ((czg)this.b).a();
                return ((gkg)jnu7).a().s(gkf2, (bmu)jnu6.b());
            }
            case 7: {
                jnu jnu8 = this.a;
                jnu jnu9 = this.c;
                gkf gkf3 = ((czf)this.b).a();
                return ((gkg)jnu9).a().s(gkf3, (bmu)jnu8.b());
            }
            case 6: {
                jnu jnu10 = this.a;
                jnu jnu11 = this.c;
                gkf gkf4 = ((czf)this.b).a();
                return ((gkg)jnu11).a().s(gkf4, (bmu)jnu10.b());
            }
            case 5: {
                jnu jnu12 = this.a;
                jnu jnu13 = this.c;
                gkf gkf5 = ((czf)this.b).a();
                return ((gkg)jnu13).a().s(gkf5, (bmu)jnu12.b());
            }
            case 4: {
                jnu jnu14 = this.a;
                jnu jnu15 = this.c;
                gkf gkf6 = ((czf)this.b).a();
                return ((gkg)jnu15).a().s(gkf6, (bmu)jnu14.b());
            }
            case 3: {
                frr frr2 = (frr)this.b.b();
                cqq cqq2 = (cqq)this.a.b();
                return new cyx(frr2, (Executor)this.c.b(), gtx.a);
            }
            case 2: {
                jnu jnu16 = this.c;
                hpr hpr2 = ((cob)this.a).a();
                return new cot(((cox)jnu16).a().c(hpr2), this.b);
            }
            case 1: {
                jnu jnu17 = this.c;
                hpr hpr3 = ((cob)this.a).a();
                return new cot(((cox)jnu17).a().c(hpr3), this.b);
            }
            case 0: 
        }
        jnu jnu18 = this.c;
        hpr hpr4 = ((cob)this.a).a();
        return new cot(((cox)jnu18).a().c(hpr4), this.b);
    }
}

