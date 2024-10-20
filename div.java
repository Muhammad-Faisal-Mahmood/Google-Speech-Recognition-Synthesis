/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 */
import android.net.TrafficStats;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class div
implements djk {
    private final AmbientMode$AmbientController a;

    public div(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.a = ambientMode$AmbientController;
    }

    @Override
    public final HttpURLConnection a(String object) {
        object = new URL((String)object);
        if ((object = ((koc)this.a.a).a((URL)object)) instanceof HttpURLConnection) {
            return (HttpURLConnection)object;
        }
        throw new IOException("Cronet connection is not an HttpURLConnection");
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(HttpURLConnection httpURLConnection, int n2) {
        if (httpURLConnection instanceof ksv) {
            ((ksv)httpURLConnection).b(n2);
            return;
        }
        TrafficStats.setThreadStatsTag((int)n2);
    }

    @Override
    public final /* synthetic */ void e() {
    }
}

