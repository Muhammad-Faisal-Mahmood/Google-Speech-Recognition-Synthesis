/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.util.Base64
 *  android.util.Log
 */
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.util.Base64;
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.work.impl.WorkDatabase;

public final class bfb
extends jsf
implements jqz {
    final Object a;
    final Object b;
    private final int c;

    public bfb(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
        super(0);
    }

    public bfb(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
        super(0);
    }

    @Override
    public final /* synthetic */ Object a() {
        Object object;
        switch (this.c) {
            default: {
                object = this.a;
                break;
            }
            case 6: {
                hyf hyf2 = ((gex)this.b).b().aY().e(Base64.decode((String)((String)this.a), (int)3)).r();
                jse.d(hyf2, "build(...)");
                return hyf2;
            }
            case 5: {
                AudioManager audioManager = ((gdb)((dml)this.a).a).a();
                return new enn((eao)this.b, audioManager);
            }
            case 4: {
                Object object2 = this.b;
                Object object3 = this.a;
                object2 = gqk.i(new dpw(object3, object2, 9, null));
                ((eeb)object3).d.execute((Runnable)object2);
                return jon.a;
            }
            case 3: {
                Object object4 = this.b;
                AmbientMode$AmbientCallback.m((String)this.a, (bdn)object4);
                AmbientMode$AmbientCallback.n((bdn)this.b);
                return jon.a;
            }
            case 2: {
                WorkDatabase workDatabase = ((bdn)this.b).d;
                jse.d(workDatabase, "workManagerImpl.workDatabase");
                Object object5 = this.a;
                workDatabase.m(new aks(this.b, object5, 11));
                AmbientMode$AmbientCallback.n((bdn)this.b);
                return jon.a;
            }
            case 1: {
                bbi.a();
                long l2 = bfa.a;
                Object object6 = this.b;
                ((beu)this.a).a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback)object6);
                return jon.a;
            }
            case 0: {
                bfs bfs2 = ((bfc)this.a).a;
                Object object7 = this.b;
                Object object8 = bfs2.b;
                synchronized (object8) {
                    if (bfs2.c.remove(object7) && bfs2.c.isEmpty()) {
                        bfs2.e();
                    }
                    return jon.a;
                }
            }
        }
        try {
            object = ((gex)object).b;
            jse.b(object);
            hye hye2 = object.aY();
            object = this.b;
            object = ((ges)object).c == 6 ? (hvu)((ges)object).d : hvu.b;
            hye2.m((hvu)object);
            object = hye2.r();
        }
        catch (RuntimeException runtimeException) {
            Log.e((String)"MendelPackageState", (String)"Failed to parse flag", (Throwable)runtimeException);
            object = ((gex)this.a).b();
        }
        catch (hxn hxn2) {
            Log.e((String)"MendelPackageState", (String)"Failed to parse flag", (Throwable)hxn2);
            object = ((gex)this.a).b();
        }
        return object;
    }
}

