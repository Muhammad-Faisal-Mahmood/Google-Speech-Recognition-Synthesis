/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class iqx
implements imb {
    private final jnu a;
    private final int b;

    public iqx(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    public final String a() {
        if (this.b != 0) {
            String string = ((AmbientModeSupport$AmbientController)((iqu)this.a).a().a.b()).g("com.google.android.libraries.search.device 45377401").c();
            idi.m(string);
            return string;
        }
        String string = ((AmbientModeSupport$AmbientController)((iqu)this.a).a().a.b()).g("com.google.android.libraries.search.device 45633312").c();
        idi.m(string);
        return string;
    }

    @Override
    public final /* synthetic */ Object b() {
        if (this.b != 0) {
            return this.a();
        }
        return this.a();
    }
}

