/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.concurrent.Callable;

public final class fcw
implements Callable {
    public final fcy a;
    public final hpn b;
    public final hpn c;
    public final hpn d;
    public final gji e;
    public final String f;

    public /* synthetic */ fcw(fcy fcy2, hpn hpn2, hpn hpn3, hpn hpn4, gji gji2, String string) {
        this.a = fcy2;
        this.b = hpn2;
        this.c = hpn3;
        this.d = hpn4;
        this.e = gji2;
        this.f = string;
    }

    public final Object call() {
        Object object = (hav)hhk.S(this.b);
        Object object2 = (hav)hhk.S(this.c);
        Object object3 = (hav)hhk.S(this.d);
        Bundle bundle = new Bundle();
        gji gji2 = this.e;
        Object object4 = gji2.c;
        if (object4 != null) {
            bundle.putAll(object4);
        }
        Object object5 = this.f;
        object4 = this.a;
        object3 = fcy.d((hav)object3);
        object2 = fcy.d((hav)object2);
        object = fcy.d((hav)object);
        ((heg)((heg)fcy.a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/LanguagePackDetailsReceiver", "onReceive", 162, "LanguagePackDetailsReceiver.java")).G("Language pack details fetched: available = %s, pending = %s, supported = %s", fcy.c((idx)object3), fcy.c((idx)object2), fcy.c((idx)object));
        object5 = dxv.ak.b("timestamp", (String)object5).j();
        object4.c.a((dyk)object5);
        bundle.putByteArray("com.google.recognition.extra.OFFLINE_AVAILABLE_LANGUAGES", ((hvd)object3).g());
        bundle.putByteArray("com.google.recognition.extra.OFFLINE_PENDING_LANGUAGES", ((hvd)object2).g());
        bundle.putByteArray("com.google.recognition.extra.OFFLINE_SUPPORTED_LANGUAGES", ((hvd)object).g());
        object4 = gji2.b;
        return new gji(gji2.a, (String)object4, bundle);
    }
}

