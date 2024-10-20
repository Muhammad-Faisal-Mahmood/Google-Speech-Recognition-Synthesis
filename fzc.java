/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class fzc
implements aas {
    public final gbt a;
    public fyt b;
    private final gib c;
    private final List d;

    public fzc(gib gib2) {
        jse.e(gib2, "fragmentHost");
        this.c = gib2;
        this.a = new gbt("KeepStateCallbacksHandler");
        this.d = new ArrayList();
        gib2.getLifecycle().b(this);
        gib2.getSavedStateRegistry().b("tiktok_keep_state_callback_handler", new bo(this, 6));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void onCreate(abe object) {
        boolean bl2 = this.c.getSavedStateRegistry().d();
        fzb fzb22 = null;
        object = bl2 ? this.c.getSavedStateRegistry().a("tiktok_keep_state_callback_handler") : null;
        if (object != null) {
            this.a.d((Bundle)object);
            if (!object.containsKey("KSCH$AC$callbacks_id")) {
                if (object.containsKey("KSCH$AC$callbacks_state")) throw new IllegalStateException("Check failed.");
                object = fzb22;
            } else {
                if (!object.containsKey("KSCH$AC$callbacks_state")) throw new IllegalStateException("Check failed.");
                object = new fyt(object.getInt("KSCH$AC$callbacks_id"), object.getInt("KSCH$AC$callbacks_state"));
            }
            this.b = object;
        }
        for (fzb fzb22 : this.d) {
            this.a.c(fzb22);
        }
        this.d.clear();
    }

    @Override
    public final /* synthetic */ void onDestroy(abe abe2) {
        wc.e(abe2);
    }

    @Override
    public final /* synthetic */ void onPause(abe abe2) {
        wc.f(abe2);
    }

    @Override
    public final /* synthetic */ void onResume(abe abe2) {
        wc.g(abe2);
    }

    @Override
    public final /* synthetic */ void onStart(abe abe2) {
        wc.h(abe2);
    }

    @Override
    public final /* synthetic */ void onStop(abe abe2) {
        wc.i(abe2);
    }
}

