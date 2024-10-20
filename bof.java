/*
 * Decompiled with CFR 0.152.
 */
import com.android.car.ui.uxr.DrawableStateButton;
import com.android.car.ui.uxr.DrawableStateConstraintLayout;
import com.android.car.ui.uxr.DrawableStateFrameLayout;
import com.android.car.ui.uxr.DrawableStateImageView;
import com.android.car.ui.uxr.DrawableStateLinearLayout;
import com.android.car.ui.uxr.DrawableStateRelativeLayout;
import com.android.car.ui.uxr.DrawableStateSwitch;
import com.android.car.ui.uxr.DrawableStateTextView;
import j$.util.function.Function$_CC;
import j$.util.stream.IntStream$_CC;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

public final class bof
implements Function {
    public final Object a;
    private final int b;

    public /* synthetic */ bof(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.b) {
            default: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 19: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 18: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 17: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 16: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 15: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 14: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 13: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 12: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 11: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 10: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 9: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 8: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 7: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 6: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 5: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 4: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 3: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 2: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 1: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 0: 
        }
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        int n2 = this.b;
        int n3 = 1;
        switch (n2) {
            default: {
                object = new fhc((fhd)object);
                ((fhc)object).f = this.a;
                return ((fhc)object).a();
            }
            case 19: {
                object = new fhc((fhd)object);
                ((fhc)object).a = Locale.forLanguageTag((String)this.a).getDisplayName();
                return ((fhc)object).a();
            }
            case 18: {
                object = new fhc((fhd)object);
                ((fhc)object).e = ((fef)this.a).a;
                return ((fhc)object).a();
            }
            case 17: {
                object = (ezj)object;
                return ((fbm)this.a).o((ezj)object);
            }
            case 16: {
                object = (ezj)object;
                Object object2 = ((ezj)object).a;
                hfn hfn2 = fbj.a;
                object2 = fbf.a(((Locale)object2).toLanguageTag(), ((ezj)object).b);
                ((hfk)((hfk)fbj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "scheduleLanguagePackDeletion", 335, "ZipfileLanguagePackPopulator.java")).u("MDD.removeFileGroup(%s)", object2);
                object = cuu.a();
                ((cut)object).b((String)object2);
                object = ((cut)object).a();
                return this.a.g((cuu)object);
            }
            case 15: {
                return fbf.b((csg)object, ((fbe)this.a).b);
            }
            case 14: {
                object = (ezj)object;
                return this.a.e(object);
            }
            case 13: {
                object = (ezj)object;
                return this.a.b(object);
            }
            case 12: {
                object = (ezj)object;
                return this.a.h(object);
            }
            case 11: {
                Object object3 = (ewy)object;
                object = dxs.a();
                n3 = ((ewy)object3).a();
                StringBuilder stringBuilder = new StringBuilder();
                Object object4 = (cya)this.a;
                stringBuilder.append((String)((cya)object4).e);
                stringBuilder.append(" logger for TNGAppId: ");
                stringBuilder.append(n3);
                ((dxr)object).a = stringBuilder.toString();
                ((dxr)object).b(((ewy)object3).a());
                ((dxr)object).c();
                ((dxr)object).d(true);
                ((dxr)object).e(((ewy)object3).a());
                if (!((cya)object4).c.containsKey(object3)) {
                    if (object3 == ewy.S) {
                        object4 = ((cya)object4).a;
                        object3 = new exd((Enum)object3, 0);
                        object = ((dxr)object).a();
                        object = ((gcv)object4).e((iku)object3, (dxs)object);
                    } else {
                        object4 = ((cya)object4).a;
                        object3 = new exd((Enum)object3, 2);
                        object = ((dxr)object).a();
                        object = ((gcv)object4).e((iku)object3, (dxs)object);
                    }
                    return object;
                }
                object = ((exc)((cya)object4).c.get((Object)object3)).a;
                throw null;
            }
            case 10: {
                exb exb2 = (exb)((Object)object);
                exd exd2 = new exd(exb2, 1);
                Object object5 = dxs.a();
                String string = exb2.name();
                String string2 = exb2.q.name();
                StringBuilder stringBuilder = new StringBuilder();
                object = (cya)this.a;
                stringBuilder.append((String)((cya)object).e);
                stringBuilder.append(" private logger for ");
                stringBuilder.append(string);
                stringBuilder.append(", TNGAppId: ");
                stringBuilder.append(string2);
                ((dxr)object5).a = stringBuilder.toString();
                ((dxr)object5).b(exb2.q.a());
                ((dxr)object5).c();
                ((dxr)object5).d(true);
                ((dxr)object5).e(exb2.q.a());
                object5 = ((dxr)object5).a();
                return ((gcv)((cya)object).a).e(exd2, (dxs)object5);
            }
            case 9: {
                Object object6 = this.a;
                object = (ctf)object;
                n2 = a.t(((cth)object6).j);
                if (n2 != 0) {
                    n3 = n2;
                }
                return crh.l((ctf)object, n3);
            }
            case 8: {
                object = (String)object;
                return IntStream$_CC.range(0, ((Map)((cmn)this.a).i.get(object)).size()).mapToObj(new cml((String)object));
            }
            case 7: {
                object = (Integer)object;
                return ((DrawableStateTextView)this.a).b((Integer)object);
            }
            case 6: {
                object = (Integer)object;
                return ((DrawableStateSwitch)this.a).b((Integer)object);
            }
            case 5: {
                object = (Integer)object;
                return ((DrawableStateRelativeLayout)this.a).b((Integer)object);
            }
            case 4: {
                object = (Integer)object;
                return ((DrawableStateLinearLayout)this.a).b((Integer)object);
            }
            case 3: {
                object = (Integer)object;
                return ((DrawableStateImageView)this.a).b((Integer)object);
            }
            case 2: {
                object = (Integer)object;
                return ((DrawableStateFrameLayout)this.a).b((Integer)object);
            }
            case 1: {
                object = (Integer)object;
                return ((DrawableStateButton)this.a).b((Integer)object);
            }
            case 0: 
        }
        object = (Integer)object;
        return ((DrawableStateConstraintLayout)this.a).d((Integer)object);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            default: {
                return Function$_CC.$default$compose(this, function);
            }
            case 19: {
                return Function$_CC.$default$compose(this, function);
            }
            case 18: {
                return Function$_CC.$default$compose(this, function);
            }
            case 17: {
                return Function$_CC.$default$compose(this, function);
            }
            case 16: {
                return Function$_CC.$default$compose(this, function);
            }
            case 15: {
                return Function$_CC.$default$compose(this, function);
            }
            case 14: {
                return Function$_CC.$default$compose(this, function);
            }
            case 13: {
                return Function$_CC.$default$compose(this, function);
            }
            case 12: {
                return Function$_CC.$default$compose(this, function);
            }
            case 11: {
                return Function$_CC.$default$compose(this, function);
            }
            case 10: {
                return Function$_CC.$default$compose(this, function);
            }
            case 9: {
                return Function$_CC.$default$compose(this, function);
            }
            case 8: {
                return Function$_CC.$default$compose(this, function);
            }
            case 7: {
                return Function$_CC.$default$compose(this, function);
            }
            case 6: {
                return Function$_CC.$default$compose(this, function);
            }
            case 5: {
                return Function$_CC.$default$compose(this, function);
            }
            case 4: {
                return Function$_CC.$default$compose(this, function);
            }
            case 3: {
                return Function$_CC.$default$compose(this, function);
            }
            case 2: {
                return Function$_CC.$default$compose(this, function);
            }
            case 1: {
                return Function$_CC.$default$compose(this, function);
            }
            case 0: 
        }
        return Function$_CC.$default$compose(this, function);
    }
}

