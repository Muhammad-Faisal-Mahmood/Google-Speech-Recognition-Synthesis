/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Service
 *  android.database.Cursor
 */
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.database.Cursor;
import androidx.work.impl.foreground.SystemForegroundService;
import java.math.RoundingMode;

public class ass {
    public static boolean a(app app2) {
        aga aga2 = new aga(8);
        int n2 = bea.a((app)app2, (aga)aga2).a;
        if (n2 != 1380533830 && n2 != 1380333108) {
            return false;
        }
        app2.h(aga2.a, 0, 4);
        aga2.v(0);
        n2 = aga2.c();
        if (n2 != 1463899717) {
            afx.b("WavHeaderReader", a.af(n2, "Unsupported form type: "));
            return false;
        }
        return true;
    }

    public static long b(apw apw2, long l2) {
        if (l2 != -1L && l2 != 0L) {
            return agf.k(l2 * (long)apw2.g - 1L, 1000000L, apw2.d, RoundingMode.FLOOR);
        }
        return -9223372036854775807L;
    }

    public static bea c(int n2, app object, aga aga2) {
        int n3;
        bea bea2 = bea.a((app)object, aga2);
        while ((n3 = bea2.a) != n2) {
            afx.e("WavHeaderReader", a.af(n3, "Ignoring unknown WAV chunk: "));
            long l2 = bea2.b;
            long l3 = 8L + l2;
            if ((1L & l2) != 0L) {
                l3 = l2 + 9L;
            }
            if (l3 <= Integer.MAX_VALUE) {
                object.j((int)l3);
                bea2 = bea.a((app)object, aga2);
                continue;
            }
            n2 = bea2.a;
            object = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
            ((StringBuilder)object).append(n2);
            throw new aem(((StringBuilder)object).toString(), null, false, 1);
        }
        return bea2;
    }

    public static bgm d(bgn object, bgs bgs2) {
        jse.e(bgs2, "id");
        auo auo2 = auo.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        auo2.g(1, bgs2.a);
        auo2.e(2, bgs2.b);
        object = (bgr)object;
        ((bgr)object).a.j();
        bgs2 = wf.i(((bgr)object).a, auo2, false);
        try {
            int n2 = wf.k((Cursor)bgs2, "work_spec_id");
            int n3 = wf.k((Cursor)bgs2, "generation");
            int n4 = wf.k((Cursor)bgs2, "system_id");
            object = bgs2.moveToFirst() ? new bgm(bgs2.getString(n2), bgs2.getInt(n3), bgs2.getInt(n4)) : null;
        }
        catch (Throwable throwable) {
            bgs2.close();
            auo2.j();
            throw throwable;
        }
        bgs2.close();
        auo2.j();
        return object;
    }

    public static void e(Service service, int n2, Notification notification, int n3) {
        try {
            dp$$ExternalSyntheticApiModelOutline0.m(service, n2, notification, n3);
            return;
        }
        catch (SecurityException securityException) {
            bbi.a().g(SystemForegroundService.a, "Unable to start foreground service", securityException);
            return;
        }
        catch (ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
            bbi.a().g(SystemForegroundService.a, "Unable to start foreground service", foregroundServiceStartNotAllowedException);
            return;
        }
    }
}

