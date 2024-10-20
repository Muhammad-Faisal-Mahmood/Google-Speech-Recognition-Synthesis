/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;

public final class isf
implements imb {
    private final jnu a;
    private final int b;

    public isf(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    public final Boolean a() {
        switch (this.b) {
            default: {
                return ((isd)this.a).a().P();
            }
            case 7: {
                return ((isd)this.a).a().O();
            }
            case 6: {
                return ((isd)this.a).a().N();
            }
            case 5: {
                return ((isd)this.a).a().M();
            }
            case 4: {
                return ((isd)this.a).a().L();
            }
            case 3: {
                return ((isd)this.a).a().K();
            }
            case 2: {
                return ((isd)this.a).a().J();
            }
            case 1: {
                return ((AmbientModeSupport$AmbientController)((irz)this.a).a().a.b()).g("com.google.android.apps.search.transcription.device 45365703").d();
            }
            case 0: 
        }
        return ((isd)this.a).a().I();
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.b) {
            default: {
                return this.a();
            }
            case 7: {
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

