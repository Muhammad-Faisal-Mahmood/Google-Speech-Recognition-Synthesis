/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class imq
implements imb {
    private final jnu a;
    private final int b;

    public imq(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    public static iah c(dml object) {
        object = (iah)((AmbientModeSupport$AmbientController)((dml)object).a.b()).g("com.google.android.apps.search.transcription.device 2").b();
        idi.m(object);
        return object;
    }

    public final iah a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return imq.c(((isd)this.a).a());
                }
                iah iah2 = (iah)((AmbientModeSupport$AmbientController)((isd)this.a).a().a.b()).g("com.google.android.apps.search.transcription.device 45418741").b();
                idi.m(iah2);
                return iah2;
            }
            iah iah3 = (iah)((AmbientModeSupport$AmbientController)((imo)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45491671").b();
            idi.m(iah3);
            return iah3;
        }
        iah iah4 = (iah)((AmbientModeSupport$AmbientController)((imo)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45622740").b();
        idi.m(iah4);
        return iah4;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return this.a();
                }
                return this.a();
            }
            return this.a();
        }
        return this.a();
    }
}

