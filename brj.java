/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.apps.speech.tts.googletts.GoogleTTSRoot_Application;

public class brj
extends bwe {
    private boolean g = false;
    private final ill h = new ill(new AmbientModeSupport$AmbientController(this));

    @Override
    public final ill a() {
        return this.h;
    }

    @Override
    public void onCreate() {
        if (!this.g) {
            this.g = true;
            Object object = this.bn();
            GoogleTTSRoot_Application googleTTSRoot_Application = (GoogleTTSRoot_Application)this;
            object = (brg)object;
            googleTTSRoot_Application.e = (gpm)((brg)object).g.b();
            googleTTSRoot_Application.f = ((brg)object).m;
            googleTTSRoot_Application.a = (Context)((brg)object).n.b();
            googleTTSRoot_Application.c = (bwp)((brg)object).o.b();
            ima.a(((brg)object).p);
            googleTTSRoot_Application.d = (bxf)((brg)object).q.b();
            googleTTSRoot_Application.b = (bwq)((brg)object).r.b();
            ima.a(((brg)object).s);
            ima.a(((brg)object).t);
        }
        super.onCreate();
    }
}

