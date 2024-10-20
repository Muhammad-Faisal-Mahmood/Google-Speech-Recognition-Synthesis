/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.settings.asr.DownloadedLanguageDialogPreference;
import j$.util.function.Function$_CC;
import java.util.Locale;
import java.util.function.Function;

public final class byj
implements Function {
    public final byk a;
    public final hac b;
    public final byz c;

    public /* synthetic */ byj(byk byk2, hac hac2, byz byz2) {
        this.a = byk2;
        this.b = hac2;
        this.c = byz2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        object = (byq)this.b.get((Locale)object);
        byk byk2 = this.a;
        DownloadedLanguageDialogPreference downloadedLanguageDialogPreference = new DownloadedLanguageDialogPreference(byk2.a.b.getContext(), (byq)object);
        this.c.a(downloadedLanguageDialogPreference, (byq)object);
        byz.b(downloadedLanguageDialogPreference, (byq)object, byk2.a.b.getContext());
        return downloadedLanguageDialogPreference;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

