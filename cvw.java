/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

public final class cvw
implements hny {
    public final boolean a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ cvw(cwz cwz2, ctq ctq2, boolean bl2, int n2) {
        this.d = n2;
        this.c = cwz2;
        this.b = ctq2;
        this.a = bl2;
    }

    public /* synthetic */ cvw(faj faj2, String string, boolean bl2, int n2) {
        this.d = n2;
        this.b = faj2;
        this.c = string;
        this.a = bl2;
    }

    public /* synthetic */ cvw(Object object, boolean bl2, Object object2, int n2) {
        this.d = n2;
        this.b = object;
        this.a = bl2;
        this.c = object2;
    }

    @Override
    public final hpn a(Object object) {
        Object object2;
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        object = (hav)object;
                        ((hfk)((hfk)faj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/inject/LanguagePackDirGeneratorImpl", "getLanguagePackInfo", 92, "LanguagePackDirGeneratorImpl.java")).u("Found matching installed packs: %s", ezj.a((Collection)object));
                        Object object3 = (hac)Collection$_EL.stream((Collection)object).collect(gye.a(new fab(6), new fab(7)));
                        object = this.c;
                        boolean bl2 = ((hac)object3).containsKey(object);
                        Object object4 = this.b;
                        if (!bl2) {
                            faj faj2 = (faj)object4;
                            ezs ezs2 = faj2.c;
                            object3 = faq.b.l();
                            if (!((hwp)object3).b.B()) {
                                ((hwp)object3).u();
                            }
                            object4 = (faq)((hwp)object3).b;
                            object.getClass();
                            ((faq)object4).c = 1 | ((faq)object4).c;
                            ((faq)object4).d = (String)object;
                            object = fxf.ak(ezs2.c((faq)((hwp)object3).o()), new ezz(object, 3), faj2.d);
                        } else if (!this.a) {
                            object = hhk.H(gzx.q(((faj)object4).b.e((ezj)((hac)object3).get(object))));
                        } else {
                            object = Collection$_EL.stream(((hac)object3).g());
                            object4 = ((faj)object4).b;
                            Objects.requireNonNull(object4);
                            object = object.map(new bof(object4, 14));
                            n2 = gzx.d;
                            object = hhk.H((Iterable)object.collect(gye.a));
                        }
                        return object;
                    }
                    object = (Void)object;
                    object = ((cwz)this.c).c;
                    boolean bl3 = this.a;
                    return ((cwj)object).g((ctq)this.b, bl3);
                }
                object = (Void)object;
                if (inw.a.b().t()) {
                    object = this.c;
                    boolean bl4 = this.a;
                    Object object5 = (cwz)this.b;
                    ((cwz)object5).m.d(1031);
                    object5 = ((cwz)object5).c;
                    object = ((cwj)object5).q(((cwj)object5).c.d(), gqk.d(new cvw(object5, bl4, object, 0)));
                } else {
                    object = hpj.a;
                }
                return object;
            }
            boolean bl5 = (Boolean)object;
            object = this.b;
            if (!bl5) {
                ((cwj)object).i.d(1036);
                object = hhk.J(new IOException("Unable to update file group metadata"));
            } else {
                Object object6 = this.c;
                if (this.a) {
                    new bzo(((cwj)object).i).k(1072, (cth)hhk.S((Future)object6));
                }
                object = hhk.K((cth)hhk.S((Future)object6));
            }
            return object;
        }
        Object object7 = (List)object;
        object = new ArrayList();
        Iterator iterator = object7.iterator();
        while (true) {
            object2 = this.b;
            if (!iterator.hasNext()) break;
            ctq ctq2 = (ctq)iterator.next();
            if (ctq2.f) continue;
            Object object8 = this.c;
            boolean bl6 = this.a;
            object7 = (cwj)object2;
            object.add(((cwj)object7).q(((cwj)object7).c.g(ctq2), new cwf(object2, bl6, ctq2, object8, 0)));
        }
        return crh.w((Iterable)object).u(new cuh(7), ((cwj)object2).e);
    }
}

