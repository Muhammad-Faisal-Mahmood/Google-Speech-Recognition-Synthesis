/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.settings.asr.NondownloadedLanguageDialogPreference;
import j$.util.function.Function$_CC;
import java.util.Locale;
import java.util.function.Function;

public final class bxk
implements Function {
    public final bxl a;
    public final hac b;
    public final byz c;

    public /* synthetic */ bxk(bxl bxl2, hac hac2, byz byz2) {
        this.a = bxl2;
        this.b = hac2;
        this.c = byz2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        byq byq2 = (byq)this.b.get((Locale)object);
        object = this.a;
        NondownloadedLanguageDialogPreference nondownloadedLanguageDialogPreference = new NondownloadedLanguageDialogPreference(((be)((bxl)object).a.b).getContext(), byq2);
        this.c.a(nondownloadedLanguageDialogPreference, byq2);
        if (byq2.e == 2) {
            nondownloadedLanguageDialogPreference.setIcon(2131231130);
        } else {
            nondownloadedLanguageDialogPreference.setIcon(kh.m(((be)((bxl)object).a.b).getContext()));
        }
        return nondownloadedLanguageDialogPreference;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

