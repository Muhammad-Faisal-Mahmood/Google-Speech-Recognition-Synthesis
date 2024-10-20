/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  hom
 */
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class cai
extends cag {
    public final hyf o;
    public cro p;

    public cai(caj caj2, hyf hyf2) {
        super(caj2);
        this.o = hyf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ckz a() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block21: {
            if (this.b) throw new IllegalStateException("do not reuse LogEventBuilder");
            this.b = true;
            object4 = this.a;
            if (this.m) {
                Log.e((String)"AbstractLogEventBuilder", (String)"resolveComplianceData should not be invoked more than once per log.");
                object3 = hpj.a;
            } else {
                this.m = true;
                object2 = this.l;
                if (object2 != null && ((cao)object2).b == ikq.f) {
                    super.b((cao)object2);
                } else {
                    object3 = this.a.j;
                    object3 = object3 != null ? object3.a() : null;
                    object = object3;
                    if (object3 != null) {
                        Object object5 = ((cao)object3).b;
                        object = object3;
                        if (object5 != ikq.d) {
                            object = object3;
                            if (object5 != ikq.e) {
                                String string = object5.toString();
                                object5 = String.valueOf(ikq.d);
                                object3 = String.valueOf(ikq.e);
                                object = new StringBuilder("The provided logger-level ProductIdOrigin value ");
                                ((StringBuilder)object).append(string);
                                ((StringBuilder)object).append(" is not one of the values expected for a logger-level provider: ");
                                ((StringBuilder)object).append((String)object5);
                                ((StringBuilder)object).append(" or ");
                                ((StringBuilder)object).append((String)object3);
                                Log.e((String)"AbstractLogEventBuilder", (String)((StringBuilder)object).toString());
                                object = null;
                            }
                        }
                    }
                    if (object != null && ((cao)object).b == ikq.d) {
                        super.b((cao)object);
                    } else {
                        object3 = this.j;
                        if (object3 != null && ((cao)object3).b == ikq.b) {
                            super.b((cao)object3);
                        } else if (object2 != null) {
                            super.b((cao)object2);
                        } else if (object != null) {
                            super.b((cao)object);
                        } else if (object3 != null) {
                            super.b((cao)object3);
                        }
                    }
                }
                if (!this.a.c()) {
                    object3 = hhk.K(null);
                    object3 = hno.f(hno.g((hpn)object3, new bpu(this, object3, 5), (Executor)hom.a), new brk(this, 6), (Executor)hom.a);
                } else {
                    object3 = hpj.a;
                }
            }
            object = ((caj)object4).f;
            if (object3.isDone() && !object3.isCancelled()) {
                try {
                    a.h((Future)object3);
                }
                catch (RuntimeException | ExecutionException exception) {
                    break block21;
                }
                object3 = (ccs)object;
                object4 = ((ccs)object3).h;
                object = new caz((cba)object, this, (ccv)object4);
                ((ccs)object3).f((cdl)object);
                return kl.au((ccx)object);
            }
        }
        object4 = new bzb();
        object2 = new bzo((bzb)((bzb)object4).a);
        hhk.T((hpn)object3, new cru((bzo)object2, (hpn)object3, (bzb)object4, 0), (Executor)hom.a);
        object4 = ((bzo)object2).a;
        object3 = hom.a;
        object = new cjy((cba)object, this, 1);
        return ((ckz)object4).b((Executor)object3, (ckq)object);
    }
}

