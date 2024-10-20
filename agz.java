/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class agz
extends agl
implements ahg {
    private agt b;
    private HttpURLConnection c;
    private InputStream d;
    private boolean e;
    private int f;
    private long g;
    private long h;
    private final awf i;
    private final awf j;

    public agz(awf awf2) {
        super(true);
        this.i = awf2;
        this.j = new awf(null);
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            }
            catch (Exception exception) {
                afx.c("DefaultHttpDataSource", "Unexpected error while disconnecting", exception);
            }
            this.c = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        try {
            long l2 = this.g;
            int n4 = n3;
            if (l2 != -1L) {
                if ((l2 -= this.h) == 0L) return -1;
                n4 = (int)Math.min((long)n3, l2);
            }
            InputStream inputStream = this.d;
            n3 = agf.a;
            if ((n2 = inputStream.read(byArray, n2, n4)) == -1) {
                return -1;
            }
            this.h += (long)n2;
            this.g(n2);
            return n2;
        }
        catch (IOException iOException) {
            n2 = agf.a;
            throw ahd.a(iOException, 2);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long b(agt var1_1) {
        block27: {
            block25: {
                block30: {
                    block26: {
                        block29: {
                            block28: {
                                block24: {
                                    this.b = var1_1;
                                    this.h = 0L;
                                    this.g = 0L;
                                    this.j();
                                    var12_6 = new URL(var1_1.a.toString());
                                    var2_7 = var1_1.b;
                                    var11_8 = var1_1.c;
                                    var6_9 = var1_1.e;
                                    var4_10 = var1_1.f;
                                    var10_11 = var1_1.b(1);
                                    var11_8 = var1_1.d;
                                    var12_6 = (HttpURLConnection)var12_6.openConnection();
                                    var12_6.setConnectTimeout(8000);
                                    var12_6.setReadTimeout(8000);
                                    var13_12 = new HashMap();
                                    var13_12.putAll(this.i.h());
                                    var13_12.putAll(this.j.h());
                                    var13_12.putAll(var11_8);
                                    var13_12 = var13_12.entrySet().iterator();
                                    while (var13_12.hasNext()) {
                                        var11_8 = (Map.Entry)var13_12.next();
                                        var12_6.setRequestProperty((String)var11_8.getKey(), (String)var11_8.getValue());
                                    }
                                    var11_8 = ahh.c(var6_9);
                                    if (var11_8 == null) break block24;
                                    var12_6.setRequestProperty("Range", (String)var11_8);
                                }
                                var11_8 = "identity";
                                if (var10_11) {
                                    var11_8 = "gzip";
                                }
                                var12_6.setRequestProperty("Accept-Encoding", (String)var11_8);
                                var12_6.setInstanceFollowRedirects(true);
                                var12_6.setDoOutput(false);
                                var12_6.setRequestMethod("GET");
                                var12_6.connect();
                                this.c = var12_6;
                                this.f = var12_6.getResponseCode();
                                var12_6.getResponseMessage();
                                var2_7 = this.f;
                                if (var2_7 < 200 || var2_7 > 299) break block25;
                                var12_6.getContentType();
                                if (this.f != 200) break block28;
                                var4_10 = var6_9 = var1_1.e;
                                if (var6_9 != 0L) break block29;
                            }
                            var4_10 = 0L;
                        }
                        var10_11 = "gzip".equalsIgnoreCase(var12_6.getHeaderField("Content-Encoding"));
                        var6_9 = -1L;
                        if (!var10_11) {
                            var8_13 = var1_1.f;
                            var8_13 = ahh.a(var12_6.getHeaderField("Content-Length"), var12_6.getHeaderField("Content-Range"));
                            if (var8_13 != -1L) {
                                var6_9 = var8_13 - var4_10;
                            }
                            this.g = var6_9;
                        } else {
                            var6_9 = var1_1.f;
                            this.g = -1L;
                        }
                        this.d = var12_6.getInputStream();
                        if (!var10_11) break block26;
                        this.d = var11_8 = new GZIPInputStream(this.d);
                    }
                    this.e = true;
                    this.i((agt)var1_1);
                    if (var4_10 == 0L) break block30;
                    try {
                        var1_1 = new byte[4096];
                    }
                    catch (IOException var1_2) {
                        this.k();
                        if (var1_2 instanceof ahd) {
                            throw (ahd)var1_2;
                        }
                        throw new ahd(var1_2, 2000, 1);
                    }
                    while (var4_10 > 0L) {
                        var2_7 = (int)Math.min(var4_10, 4096L);
                        var11_8 = this.d;
                        var3_14 = agf.a;
                        var2_7 = var11_8.read((byte[])var1_1, 0, var2_7);
                        if (Thread.currentThread().isInterrupted()) ** GOTO lbl89
                        if (var2_7 == -1) ** GOTO lbl87
                        var4_10 -= (long)var2_7;
                        this.g(var2_7);
                        continue;
lbl87:
                        // 1 sources

                        var1_1 = new ahd();
                        throw var1_1;
lbl89:
                        // 1 sources

                        var11_8 = new InterruptedIOException();
                        var1_1 = new ahd((IOException)var11_8, 2000, 1);
                        throw var1_1;
                    }
                }
                return this.g;
                catch (IOException var1_3) {
                    this.k();
                    throw new ahd(var1_3, 2000, 1);
                }
            }
            var12_6.getHeaderFields();
            if (this.f == 416 && var1_1.e == (var4_10 = ahh.b(var12_6.getHeaderField("Content-Range")))) {
                this.e = true;
                this.i((agt)var1_1);
                var4_10 = var1_1.f;
                return 0L;
            }
            var1_1 = var12_6.getErrorStream();
            if (var1_1 == null) ** GOTO lbl116
            try {
                hjg.b((InputStream)var1_1);
                break block27;
lbl116:
                // 1 sources

                var2_7 = agf.a;
            }
            catch (IOException var1_4) {
                var2_7 = agf.a;
            }
        }
        this.k();
        var1_1 = this.f == 416 ? new ags(2008) : null;
        throw new ahf(this.f, (IOException)var1_1);
        catch (IOException var1_5) {
            this.k();
            throw ahd.a(var1_5, 1);
        }
    }

    @Override
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse((String)httpURLConnection.getURL().toString());
    }

    @Override
    public final void d() {
        block7: {
            Object object = this.d;
            if (object == null) break block7;
            try {
                ((InputStream)object).close();
            }
            catch (IOException iOException) {
                int n2 = agf.a;
                object = new ahd(iOException, 2000, 3);
                throw object;
            }
        }
        return;
        finally {
            this.d = null;
            this.k();
            if (this.e) {
                this.e = false;
                this.h();
            }
        }
    }

    @Override
    public final Map e() {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection == null) {
            return hcy.a;
        }
        return new agy(httpURLConnection.getHeaderFields());
    }
}

