/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public final class ffp
implements gte {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ ffp(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ ffp(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    @Override
    public final Object apply(Object object) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                object = (itx)object;
                                Object object2 = this.a;
                                return ((itx)object).a((ixb)this.b, (itw)object2);
                            }
                            Object object3 = (String)object;
                            fxf.K(object3);
                            CharSequence charSequence = new StringBuilder();
                            object = (gkf)this.a;
                            charSequence.append(((gkf)object).a);
                            charSequence.append((String)object3);
                            charSequence.append(".pb");
                            charSequence = charSequence.toString();
                            object3 = ((hth)this.b).b;
                            gkc gkc2 = ((gkf)object).c;
                            object = gda.a;
                            return ((goi)object3).g(gkc2, (String)charSequence, (gda)object);
                        }
                        object = (gfb)object;
                        jse.e(object, "result");
                        if (!((gfb)object).a) {
                            gfl gfl2 = (gfl)this.a;
                            if (((gto)gfl2.a).g()) {
                                if ((fvc)((gto)((imc)((bzo)gfl2.g).a).a).f() == null) {
                                    ((dvy)((gto)gfl2.a).c()).a();
                                } else {
                                    throw null;
                                }
                            }
                        }
                        return object;
                    }
                    gab gab2 = (gab)this.a.apply((gam)object);
                    object = gab2.a;
                    ((AtomicReference)this.b).set(object);
                    return gab2.b;
                }
                gzx gzx2 = (gzx)object;
                int n3 = gzx2.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    Object object4 = this.a;
                    Object object5 = this.b;
                    object = (fze)gzx2.get(n2);
                    String string = ((fze)object).i;
                    fxf.H(((String)object5).equals(string), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", object4, object5, ((fze)object).i);
                }
                return gzx2;
            }
            object = (hav)object;
            Object object6 = (fbt)this.a;
            ((fbt)object6).a.isPresent();
            Object object7 = (Optional)this.b;
            if (((Optional)object7).isPresent()) {
                object6 = (bzo)((fbt)object6).a.get();
                object7 = ((Optional)object7).get();
                object7 = dxv.aB.b("model_manager", (String)object7);
                ((bzo)object6).a.a((dyk)object7);
            }
            return object;
        }
        Object object8 = (hac)object;
        Object object9 = this.a;
        object = this.b;
        if (object8 != null && !((hac)object8).isEmpty()) {
            object8 = (heg)((heg)ffr.a.f().h(hfo.a, "OnDevicePrimaryRecog")).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "startListening", 88, "OnDevicePrimaryRecognizer.java");
            object9 = (ffr)object9;
            object8.C("LP for locale: %s, domain: %s is available, using soda", object, ((ffr)object9).b.h);
            object = ((ffr)object9).h.a(((ffr)object9).b, ((ffr)object9).c, ((ffr)object9).d);
        } else {
            object8 = (heg)((heg)ffr.a.h().h(hfo.a, "OnDevicePrimaryRecog")).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "startListening", 96, "OnDevicePrimaryRecognizer.java");
            object9 = (ffr)object9;
            object8.C("LP for locale: %s, domain: %s is not available, fallback to hybrid with DEFAULT_CONTINUOUS application domain", object, ((ffr)object9).b.h.name());
            object = ((ffr)object9).i;
            object8 = new fgt(((ffr)object9).b);
            ((fgt)object8).d(idq.c);
            object = ((bmu)object).E(((fgt)object8).a(), ((ffr)object9).c, ((ffr)object9).d);
        }
        return object;
    }
}

