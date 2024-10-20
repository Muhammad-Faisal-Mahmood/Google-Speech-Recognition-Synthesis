/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 */
import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.URL;

public final class djl
implements djk {
    private final klg a;

    public djl(kgp kgp2) {
        this.a = new klg(kgp2);
    }

    @Override
    public final HttpURLConnection a(String object) {
        object = new URL((String)object);
        return this.a.c((URL)object);
    }

    @Override
    public final /* synthetic */ void b() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override
    public final /* synthetic */ void c() {
        fs$$ExternalSyntheticApiModelOutline0.m();
    }

    @Override
    public final /* synthetic */ void d(HttpURLConnection httpURLConnection, int n2) {
        TrafficStats.setThreadStatsTag((int)n2);
    }

    @Override
    public final /* synthetic */ void e() {
    }
}

