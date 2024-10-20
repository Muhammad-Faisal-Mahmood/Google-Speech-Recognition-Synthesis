/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.Comparator$_CC;
import j$.util.Optional;
import java.util.Locale;

public final class fbh
implements hny {
    public final fbj a;
    public final ezj b;
    public final cty c;

    public /* synthetic */ fbh(fbj fbj2, ezj ezj2, cty cty2) {
        this.a = fbj2;
        this.b = ezj2;
        this.c = cty2;
    }

    @Override
    public final hpn a(Object object) {
        object = ((fao)object).equals(fao.d) ? csn.b : csn.a;
        Object object2 = this.b;
        Optional optional = csm.a.l();
        Object object3 = fbj.c((ezj)object2);
        if (!((hwp)((Object)optional)).b.B()) {
            ((hwp)((Object)optional)).u();
        }
        Object object4 = (csm)((hwp)((Object)optional)).b;
        object3.getClass();
        ((csm)object4).b |= 1;
        ((csm)object4).c = object3;
        object3 = csp.a.l();
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = ((hwp)object3).b;
        hyg hyg2 = (csp)object4;
        ((csp)hyg2).d = ((csn)object).d;
        ((csp)hyg2).b |= 2;
        object = cso.b;
        if (!((hwv)object4).B()) {
            ((hwp)object3).u();
        }
        object4 = (csp)((hwp)object3).b;
        ((csp)object4).c = ((cso)object).d;
        ((csp)object4).b |= 1;
        if (!((hwp)((Object)optional)).b.B()) {
            ((hwp)((Object)optional)).u();
        }
        object = (csm)((hwp)((Object)optional)).b;
        object3 = (csp)((hwp)object3).o();
        object3.getClass();
        ((csm)object).g = object3;
        ((csm)object).b |= 0x800;
        object = csl.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object3 = (csl)((hwp)object).b;
        ((csl)object3).b |= 1;
        ((csl)object3).c = "zipfile";
        object3 = ((ezi)((ezj)object2).f.c()).a;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hyg2 = ((hwp)object).b;
        object4 = (csl)hyg2;
        ((csl)object4).b |= 2;
        ((csl)object4).d = object3;
        int n2 = (int)((ezj)object2).e;
        if (!((hwv)hyg2).B()) {
            ((hwp)object).u();
        }
        object3 = (csl)((hwp)object).b;
        ((csl)object3).b |= 4;
        ((csl)object3).e = n2;
        object3 = ((ezi)((ezj)object2).f.c()).b.toLowerCase(Locale.US);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object4 = (csl)((hwp)object).b;
        object3.getClass();
        ((csl)object4).b |= 0x40;
        ((csl)object4).g = object3;
        object3 = ikm.a.l();
        object4 = ikl.a.l();
        hyg2 = ikn.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        ikn.c((ikn)((hwp)hyg2).b);
        hyg2 = (ikn)((hwp)hyg2).o();
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        ikl ikl2 = (ikl)((hwp)object4).b;
        hyg2.getClass();
        ikl2.c = hyg2;
        ikl2.b = 4;
        ((hwp)object3).aA((hwp)object4);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object4 = (csl)((hwp)object).b;
        object3 = (ikm)((hwp)object3).o();
        object3.getClass();
        ((csl)object4).f = object3;
        ((csl)object4).b |= 0x20;
        ((hwp)((Object)optional)).az((hwp)object);
        if (!((hwp)((Object)optional)).b.B()) {
            ((hwp)((Object)optional)).u();
        }
        object3 = this.a;
        object = (csm)((hwp)((Object)optional)).b;
        ((csm)object).b |= 0x200;
        ((csm)object).f = 432000L;
        object = (csm)((hwp)((Object)optional)).o();
        optional = Collection$_EL.stream(((fbq)((fbj)object3).b).a()).filter(new fai(object2, 4)).max(Comparator$_CC.comparingLong(new fbg()));
        if (optional.isEmpty()) {
            ((hfk)((hfk)fbj.a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "maybeAddTrainingPlan", 277, "ZipfileLanguagePackPopulator.java")).r("Skipping training plan.");
        } else {
            ((hfk)((hfk)fbj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "maybeAddTrainingPlan", 281, "ZipfileLanguagePackPopulator.java")).t("Injecting training plan %d", ((fan)optional.get()).c);
            object2 = (hwp)((hwv)object).C(5);
            ((hwp)object2).x((hwv)object);
            n2 = (int)((fan)optional.get()).c;
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object = (csm)((hwp)object2).b;
            ((csm)object).b |= 4;
            ((csm)object).e = n2;
            object = csl.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (csl)((hwp)object).b;
            ((csl)object3).b |= 1;
            ((csl)object3).c = "training_plan_zipfile";
            object3 = ((fan)optional.get()).d;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object4 = (csl)((hwp)object).b;
            object3.getClass();
            ((csl)object4).b |= 2;
            ((csl)object4).d = object3;
            n2 = (int)((fan)optional.get()).f;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (csl)((hwp)object).b;
            ((csl)object3).b |= 4;
            ((csl)object3).e = n2;
            object4 = ((fan)optional.get()).e;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (csl)((hwp)object).b;
            object4.getClass();
            ((csl)object3).b |= 0x40;
            ((csl)object3).g = object4;
            object3 = ikm.a.l();
            object4 = ikl.a.l();
            hyg2 = ikn.a.l();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            ikn.c((ikn)((hwp)hyg2).b);
            hyg2 = (ikn)((hwp)hyg2).o();
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            ikl2 = (ikl)((hwp)object4).b;
            hyg2.getClass();
            ikl2.c = hyg2;
            ikl2.b = 4;
            ((hwp)object3).aA((hwp)object4);
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object4 = (csl)((hwp)object).b;
            object3 = (ikm)((hwp)object3).o();
            object3.getClass();
            ((csl)object4).f = object3;
            ((csl)object4).b |= 0x20;
            object3 = hvi.a.l();
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            ((hvi)((hwp)object3).b).b = "type.googleapis.com/java.com.google.android.libraries.speech.modeldownload.languagepacks.personalization.TrainingPlanZipfile";
            optional = ((fan)optional.get()).e();
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            ((hvi)((hwp)object3).b).c = optional;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            optional = (csl)((hwp)object).b;
            object3 = (hvi)((hwp)object3).o();
            object3.getClass();
            ((csl)((Object)optional)).h = object3;
            ((csl)((Object)optional)).b |= 0x2000;
            ((hwp)object2).az((hwp)object);
            object = (csm)((hwp)object2).o();
        }
        object3 = (hfk)((hfk)fbj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "updateLanguagePackFileGroup", 190, "ZipfileLanguagePackPopulator.java");
        object4 = ((csm)object).c;
        object2 = optional = ((csm)object).g;
        if (optional == null) {
            object2 = csp.a;
        }
        object2 = optional = csn.b(((csp)object2).d);
        if (optional == null) {
            object2 = csn.a;
        }
        object3.C("MDD.addFileGroup(%s, %s)", object4, object2);
        object2 = gsl.a;
        if (object != null) {
            return this.c.a(new csh((csm)object, (gto)object2, (gto)object2));
        }
        throw new NullPointerException("Null dataFileGroup");
    }
}

