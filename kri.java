/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.Network
 */
import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class kri
implements krt {
    public final Object a;
    private final int b;

    public /* synthetic */ kri(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        int n2 = this.b;
        boolean bl2 = false;
        if (n2 != 0) {
            if (n2 != 1) {
                Object var6_3 = null;
                Object object = null;
                if (n2 != 2) {
                    String string;
                    if (n2 != 3) {
                        object = (krq)this.a;
                        if (!((krq)object).d.g.compareAndSet(1, 4)) return;
                        ksj ksj2 = ((krq)object).a;
                        object = ((krq)object).d;
                        ksj2.d((kpt)object, ((krs)object).x);
                        return;
                    }
                    Object object2 = this.a;
                    krs krs2 = (krs)object2;
                    if (krs2.p == null) {
                        return;
                    }
                    Object object3 = new ArrayList<AbstractMap.SimpleEntry<String, String>>();
                    Object object4 = "http/1.1";
                    n2 = 0;
                    while ((string = krs2.p.getHeaderFieldKey(n2)) != null) {
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(string)) {
                            object4 = krs2.p.getHeaderField(n2);
                        }
                        if (!string.startsWith("X-Android")) {
                            object3.add(new AbstractMap.SimpleEntry<String, String>(string, krs2.p.getHeaderField(n2)));
                        }
                        ++n2;
                    }
                    n2 = krs2.p.getResponseCode();
                    object3 = new kpv(new ArrayList(krs2.f), n2, krs2.p.getResponseMessage(), DesugarCollections.unmodifiableList(object3), false, (String)object4, "", 0L);
                    if (n2 >= 300 && n2 < 400 && (object4 = (List)((kpv)object3).c().get("location")) != null) {
                        krs2.n(1, 2, new hst(object2, (String)object4.get(0), object3, 14, null));
                        return;
                    }
                    krs2.x = object3;
                    krs2.i();
                    if (n2 >= 400) {
                        object4 = krs2.p.getErrorStream();
                        object4 = object4 == null ? object : kre.a((InputStream)object4);
                        krs2.n = object4;
                        krs2.b.c();
                        return;
                    }
                    krs2.n = kre.a(krs2.p.getInputStream());
                    krs2.b.c();
                    return;
                }
                object = (krs)this.a;
                if (((krs)object).g.get() == 8) {
                    return;
                }
                URL uRL = new URL(((krs)object).m);
                Object object5 = ((krs)object).p;
                if (object5 != null) {
                    ((HttpURLConnection)object5).disconnect();
                    ((krs)object).p = null;
                }
                if (((krs)object).t != -1L) {
                    Network[] networkArray = ((ConnectivityManager)((krs)object).q.d.getSystemService("connectivity")).getAllNetworks();
                    int n3 = networkArray.length;
                    n2 = 0;
                    while (true) {
                        object5 = var6_3;
                        if (n2 >= n3 || (object5 = networkArray[n2]).getNetworkHandle() == 0L) break;
                        ++n2;
                    }
                    if (object5 == null) throw new kry("Network bound to request not found", 9, -4);
                    ((krs)object).p = (HttpURLConnection)object5.openConnection(uRL);
                } else {
                    ((krs)object).p = (HttpURLConnection)uRL.openConnection();
                }
                ((krs)object).p.setInstanceFollowRedirects(false);
                if (!((krs)object).e.containsKey("User-Agent")) {
                    ((krs)object).e.put("User-Agent", ((krs)object).d);
                }
                for (Map.Entry entry : ((krs)object).e.entrySet()) {
                    ((krs)object).p.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
                }
                ((krs)object).p.setRequestMethod(((krs)object).i);
                object5 = ((krs)object).j;
                if (object5 != null) {
                    ((krs)object).y = new krk((krs)object, ((krs)object).k, ((krs)object).c, ((krs)object).p, (ksi)object5);
                    object5 = ((krs)object).y;
                    if (((krs)object).f.size() == 1) {
                        bl2 = true;
                    }
                    ((krk)object5).d(new krj((krk)object5, bl2, 1));
                    return;
                }
                ((krs)object).l = 10;
                ((krs)object).p.connect();
                ((krs)object).k();
                return;
            }
            Object object = this.a;
            krk krk2 = (krk)object;
            ByteBuffer byteBuffer = krk2.d;
            krk2.c.b((kpr)object, byteBuffer);
            object = new kra(object, 3);
            krk2.b.execute((Runnable)object);
            return;
        }
        krk krk3 = (krk)this.a;
        if (krk3.i == null) {
            krk3.k.l = 10;
            krk3.h.setDoOutput(true);
            krk3.h.connect();
            krk3.k.l = 12;
            krk3.j = krk3.h.getOutputStream();
            krk3.i = Channels.newChannel(krk3.j);
        }
        krk3.a.set(0);
        krk3.e();
    }
}

