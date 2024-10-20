/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 */
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class dtp {
    public static final String[] a;
    private static final Map g;
    public final ContentResolver b;
    public final Uri c;
    public final Object d;
    public volatile Map e;
    public final List f;
    private final ContentObserver h;

    static {
        g = new ot();
        a = new String[]{"key", "value"};
    }

    private dtp(ContentResolver contentResolver, Uri uri) {
        dto dto2 = new dto(this);
        this.h = dto2;
        this.d = new Object();
        this.f = new ArrayList();
        fxf.K(contentResolver);
        fxf.K(uri);
        this.b = contentResolver;
        this.c = uri;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)dto2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a() {
        synchronized (dtp.class) {
            Iterator iterator = g.values().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    g.clear();
                    return;
                }
                dtp dtp2 = (dtp)iterator.next();
                dtp2.b.unregisterContentObserver(dtp2.h);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static dtp b(ContentResolver contentResolver, Uri uri) {
        synchronized (dtp.class) {
            dtp dtp2;
            Map map = g;
            dtp dtp3 = dtp2 = (dtp)map.get(uri);
            if (dtp2 != null) return dtp3;
            try {
                dtp3 = new dtp(contentResolver, uri);
            }
            catch (SecurityException securityException) {
                return dtp2;
            }
            try {
                map.put(uri, dtp3);
            }
            catch (SecurityException securityException) {}
            return dtp3;
        }
    }
}

