/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;

public final class gpn
implements imb {
    private final jnu a;
    private final int b;

    public gpn(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final /* synthetic */ Object b() {
        switch (this.b) {
            default: {
                var1_1 = ((ilt)this.a).a().getPackageName();
                idi.m(var1_1);
                return var1_1;
            }
            case 9: {
                var1_2 = ((ilt)this.a).a().getPackageName();
                idi.m(var1_2);
                return var1_2;
            }
            case 8: {
                return ((AmbientModeSupport$AmbientController)((imo)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45531217").d();
            }
            case 7: {
                var1_3 = (hwg)((AmbientModeSupport$AmbientController)((imo)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45618546").b();
                idi.m(var1_3);
                return var1_3;
            }
            case 6: {
                var1_4 = (hwg)((AmbientModeSupport$AmbientController)((imo)this.a).a().a.b()).g("com.google.android.libraries.search.audio.device 45626725").b();
                idi.m(var1_4);
                return var1_4;
            }
            case 5: {
                var1_5 = ((ilt)this.a).a().getPackageName();
                idi.m(var1_5);
                return var1_5;
            }
            case 4: {
                var2_10 = (Activity)((imc)this.a).a;
                if (var2_10 != null) ** GOTO lbl30
                try {
                    var1_6 /* !! */  = gsl.a;
                    ** GOTO lbl31
lbl30:
                    // 1 sources

                    var1_6 /* !! */  = gto.i((bh)var2_10);
lbl31:
                    // 2 sources

                    return var1_6 /* !! */ ;
                }
                catch (ClassCastException var1_7) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(var2_10))), var1_7);
                }
            }
            case 3: {
                var2_11 = ((imj)this.a).a();
                var1_8 = new hat();
                var2_11 = var2_11.iterator();
                while (var2_11.hasNext()) {
                    var1_8.j(new hsh((String)var2_11.next()));
                }
                var1_8 = var1_8.g();
                idi.m(var1_8);
                return var1_8;
            }
            case 2: {
                return new cxt((gqa)((gtt)((bqw)this.a).a()).a);
            }
            case 1: {
                return new gob((ExecutorService)this.a.b());
            }
            case 0: 
        }
        var1_9 = (gpm)this.a.b();
        Objects.requireNonNull(var1_9);
        return new ggk(var1_9, 9);
    }
}

