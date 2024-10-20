/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.settings.asr.DownloadedLanguageDialogPreference;
import j$.util.function.Function$_CC;
import java.util.Locale;
import java.util.function.Function;

public final class bxi
implements Function {
    public final bxj a;
    public final hac b;
    public final byz c;

    public /* synthetic */ bxi(bxj bxj2, hac hac2, byz byz2) {
        this.a = bxj2;
        this.b = hac2;
        this.c = byz2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        object = (byq)this.b.get((Locale)object);
        bxj bxj2 = this.a;
        DownloadedLanguageDialogPreference downloadedLanguageDialogPreference = new DownloadedLanguageDialogPreference(((be)bxj2.a.b).getContext(), (byq)object);
        this.c.a(downloadedLanguageDialogPreference, (byq)object);
        byz.b(downloadedLanguageDialogPreference, (byq)object, ((be)bxj2.a.b).getContext());
        return downloadedLanguageDialogPreference;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

