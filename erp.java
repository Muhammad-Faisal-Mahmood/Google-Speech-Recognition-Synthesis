/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

final class erp
extends jqs
implements jro {
    final erq a;
    final erw b;

    public erp(erq erq2, erw erw2, jqb jqb2) {
        this.a = erq2;
        this.b = erw2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        Object object2;
        jns.ak(object);
        object = this.a;
        Object object3 = ((erq)object).b;
        Object object4 = new ArrayList();
        Object object5 = object3.iterator();
        while (true) {
            object3 = this.b;
            if (!object5.hasNext()) break;
            object2 = object5.next();
            if (jse.i(((erv)object2).d, ((erw)object3).f)) continue;
            object4.add(object2);
        }
        ((erq)object).b = object4;
        if (((erw)object3).c == 2) {
            object4 = ((erq)object).c;
            if (!(object4 instanceof Collection) || !object4.isEmpty()) {
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    if (!jse.i(((erw)object4.next()).f, ((erw)object3).f)) continue;
                    ((heg)erq.a.f().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "applyToPartialUpdates", 340, "MicStateReporterImpl.kt")).u("#audio# skip update(id(%s)), already active", ((erw)object3).f);
                    object = euf.A(erh.a.l()).U();
                    break;
                }
            } else {
                ((erq)object).c = jns.o(((erq)object).c, object3);
                object2 = euf.A(erh.a.l());
                ((bzo)object2).W();
                object5 = cqq.ay(eqy.a.l());
                object = object4 = eqz.b(((erw)object3).e);
                if (object4 == null) {
                    object = eqz.a;
                }
                ((bzb)object5).E((eqz)object);
                if ((((erw)object3).b & 4) != 0) {
                    ((bzb)object5).D(((erw)object3).g);
                }
                object = ((erw)object3).c == 2 ? (ebt)((erw)object3).d : ebt.a;
                jse.e(object, "value");
                object4 = (hwp)((bzb)object5).a;
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object4 = (eqy)((hwp)object4).b;
                object.getClass();
                ((eqy)object4).d = object;
                ((eqy)object4).c = 2;
                ((bzo)object2).V(((bzb)object5).C());
                object = ((bzo)object2).U();
            }
        } else {
            object4 = ((erq)object).c;
            if (!(object4 instanceof Collection) || !object4.isEmpty()) {
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    if (!jse.i(((erw)object4.next()).f, ((erw)object3).f)) continue;
                    object2 = ((erq)object).c;
                    object4 = new ArrayList();
                    object5 = object2.iterator();
                    while (object5.hasNext()) {
                        object2 = object5.next();
                        if (jse.i(((erw)object2).f, ((erw)object3).f)) continue;
                        object4.add(object2);
                    }
                    ((erq)object).c = object4;
                    object5 = euf.A(erh.a.l());
                    ((bzo)object5).W();
                    object2 = cqq.ay(eqy.a.l());
                    object = object4 = eqz.b(((erw)object3).e);
                    if (object4 == null) {
                        object = eqz.a;
                    }
                    ((bzb)object2).E((eqz)object);
                    if ((((erw)object3).b & 4) != 0) {
                        ((bzb)object2).D(((erw)object3).g);
                    }
                    object = ((erw)object3).c == 3 ? (ebq)((erw)object3).d : ebq.a;
                    jse.e(object, "value");
                    object4 = (hwp)((bzb)object2).a;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object4 = (eqy)((hwp)object4).b;
                    object.getClass();
                    ((eqy)object4).d = object;
                    ((eqy)object4).c = 3;
                    ((bzo)object5).V(((bzb)object2).C());
                    object = ((bzo)object5).U();
                    break;
                }
            } else {
                ((heg)erq.a.f().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "applyToPartialUpdates", 353, "MicStateReporterImpl.kt")).u("#audio# skip update(id(%s)), no active found", ((erw)object3).f);
                object = euf.A(erh.a.l()).U();
            }
        }
        object4 = ((erh)object).b;
        jse.d(object4, "getDeltasList(...)");
        if (!object4.isEmpty()) {
            object4 = this.a;
            ((erq)object4).c(((erq)object4).b(), (erh)object);
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new erp(this.a, this.b, jqb2);
    }
}

