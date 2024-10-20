/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.media.audiofx.AcousticEchoCanceler
 *  android.media.audiofx.NoiseSuppressor
 */
import android.app.Activity;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import com.android.car.ui.core.CarUiInstaller;
import j$.util.Collection$_EL;
import j$.util.function.Function$_CC;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

public final class bpf
implements Function {
    private final int a;

    public /* synthetic */ bpf(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
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
        switch (this.a) {
            default: {
                return ((ezv)object).c();
            }
            case 19: {
                return ((ezv)object).d();
            }
            case 18: {
                object = (Map.Entry)object;
                hfn hfn2 = ezu.a;
                return (ezj)((gto)object.getValue()).c();
            }
            case 17: {
                return ((ezj)object).b();
            }
            case 16: {
                return AcousticEchoCanceler.create((int)((Integer)object));
            }
            case 15: {
                return NoiseSuppressor.create((int)((Integer)object));
            }
            case 14: {
                return (ctf)object;
            }
            case 13: {
                ezj ezj2 = (ezj)object;
                object = byu.a;
                return ezj2;
            }
            case 12: {
                return ((ezj)object).a;
            }
            case 11: {
                byq byq2 = (byq)object;
                object = byu.a;
                return byq2;
            }
            case 10: {
                object = (byq)object;
                hfn hfn3 = byu.a;
                return ((byq)object).a.a;
            }
            case 9: {
                return ((brx)object).d();
            }
            case 8: {
                return ((izk)object).d;
            }
            case 7: {
                String string = (String)object;
                object = string;
                if (string.equals("ar-xa")) {
                    object = "ar";
                }
                return object;
            }
            case 6: {
                return ((buc)object).c;
            }
            case 5: {
                return cab.a((bso)object);
            }
            case 4: {
                return Collection$_EL.stream(((btw)object).c);
            }
            case 3: {
                return ((iik)object).d;
            }
            case 2: {
                return cab.a((bso)object);
            }
            case 1: {
                int n2 = CarUiInstaller.a;
                object = object instanceof Activity ? Activity.class : object.getClass();
                return object;
            }
            case 0: 
        }
        object = (bqh)object;
        return String.format(Locale.getDefault(), "(%d, %d)", ((bqh)object).b, ((bqh)object).c);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
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

