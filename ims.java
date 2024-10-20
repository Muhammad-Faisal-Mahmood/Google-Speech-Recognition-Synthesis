/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class ims
implements imb {
    private final jnu a;
    private final int b;

    public ims(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    public final Long a() {
        switch (this.b) {
            default: {
                return ((isd)this.a).a().H();
            }
            case 6: {
                return ((isd)this.a).a().G();
            }
            case 5: {
                return ((AmbientModeSupport$AmbientController)((iqu)this.a).a().a.b()).g("com.google.android.libraries.search.device 45644410").a();
            }
            case 4: {
                return ((AmbientModeSupport$AmbientController)((imu)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45646067").a();
            }
            case 3: {
                return ((AmbientModeSupport$AmbientController)((imu)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45639055").a();
            }
            case 2: {
                return ((AmbientModeSupport$AmbientController)((imu)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45639056").a();
            }
            case 1: {
                return ((ilt)this.a).a().p();
            }
            case 0: 
        }
        return ((AmbientModeSupport$AmbientController)((imo)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45629156").a();
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.b) {
            default: {
                return this.a();
            }
            case 6: {
                return this.a();
            }
            case 5: {
                return this.a();
            }
            case 4: {
                return this.a();
            }
            case 3: {
                return this.a();
            }
            case 2: {
                return this.a();
            }
            case 1: {
                return this.a();
            }
            case 0: 
        }
        return this.a();
    }
}

