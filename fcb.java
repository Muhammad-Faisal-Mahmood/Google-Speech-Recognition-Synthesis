/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Callable;

public final class fcb
implements Callable {
    public final fcf a;
    public final hpn b;
    public final Optional c;
    public final String d;
    public final hpn e;
    public final boolean f;
    public final Locale g;

    public /* synthetic */ fcb(fcf fcf2, hpn hpn2, Optional optional, String string, hpn hpn3, boolean bl2, Locale locale) {
        this.a = fcf2;
        this.b = hpn2;
        this.c = optional;
        this.d = string;
        this.e = hpn3;
        this.f = bl2;
        this.g = locale;
    }

    public final Object call() {
        Object object = (Optional)hhk.S(this.b);
        boolean bl2 = ((Optional)object).isEmpty();
        fcf fcf2 = this.a;
        Optional optional = this.c;
        String string = this.d;
        if (bl2) {
            ((heg)((heg)fcf.a.h().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "triggerModelDownload", 177, "ModelManagerImpl.java")).r("Client requested locale with no matching pack. Ignoring request.");
            fcf.e(optional);
            fcf2.e.ifPresent(new bme(string, 15));
        } else {
            Locale locale = this.g;
            bl2 = this.f;
            String string2 = (String)hhk.S(this.e);
            object = (ezj)((Optional)object).get();
            fcf2.e.ifPresent(new fas(string, object, 4));
            if (bl2) {
                fcf2.g.a(string, locale, (ezj)object, optional, true);
            } else {
                fcf2.f.ifPresent(new fca(string, locale, string2, (ezj)object, optional));
            }
        }
        return null;
    }
}

