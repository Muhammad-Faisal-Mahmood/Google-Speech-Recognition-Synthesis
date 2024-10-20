/*
 * Decompiled with CFR 0.152.
 */
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class byy
implements Consumer {
    public final boolean a;
    public final gto b;

    public /* synthetic */ byy(boolean bl2, gto gto2) {
        this.a = bl2;
        this.b = gto2;
    }

    public final void accept(Object object) {
        object = (DialogPreference)object;
        Object object2 = byz.a;
        object2 = this.b;
        if (!this.a) {
            if (!byz.c(((Preference)object).getKey())) {
                ((PreferenceGroup)((gtt)object2).a).g((Preference)object);
                return;
            }
        } else if (byz.c(((Preference)object).getKey())) {
            ((hfk)((hfk)byz.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/utils/LanguagePackSettingsSubscriptionCallbackHelper", "maybeReplaceAllPreferences", 93, "LanguagePackSettingsSubscriptionCallbackHelper.java")).u("Adding %s to extension section", "Speech Enhancement");
            ((PreferenceGroup)((gtt)object2).a).g((Preference)object);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

