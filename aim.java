/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.media.AudioManager
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import androidx.wear.ambient.AmbientDelegate;
import java.io.File;
import java.util.Iterator;

public final class aim
implements gui {
    public final Object a;
    private final int b;

    public /* synthetic */ aim(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        int n2 = this.b;
        long l2 = 0L;
        boolean bl2 = false;
        int n3 = 0;
        switch (n2) {
            default: {
                fpn fpn2 = new fpn();
                fpn2.d = this.a;
                return fpn2.a();
            }
            case 19: {
                return ipb.a.b().b((Context)this.a);
            }
            case 18: {
                return (SharedPreferences)((gto)this.a).c();
            }
            case 17: {
                int n4 = ((Long)this.a.b()).intValue();
                drc[] drcArray = drc.values();
                n2 = drcArray.length;
                while (true) {
                    if (n3 >= n2) {
                        return drc.a;
                    }
                    drc drc2 = drcArray[n3];
                    if (n4 == drc2.f) {
                        return drc2;
                    }
                    ++n3;
                }
            }
            case 16: {
                return ((dke)this.a).a();
            }
            case 15: {
                long l3;
                Object object = this.a;
                l2 = l3 = dox.a;
                if (l3 != 0L) return l2;
                synchronized (dox.class) {
                    l2 = l3 = dox.a;
                    if (l3 != 0L) return l2;
                    object = dox.a((Context)object);
                    float f2 = 60.0f;
                    float f3 = ((Float)((gto)object).e(Float.valueOf(60.0f))).floatValue();
                    if (!(f3 < 1.0f)) {
                        f2 = f3;
                    }
                    dox.a = l2 = (long)Math.ceil(1.0E9 / (double)f2);
                    return l2;
                }
            }
            case 14: {
                return ((dne)this.a).a();
            }
            case 13: {
                return ((AmbientDelegate)((fzp)this.a).h).i().getTotalSpace() / 1024L;
            }
            case 12: {
                return gzx.u(new dfs(4), (Iterable)this.a.b());
            }
            case 11: {
                return ((imr)this.a).a();
            }
            case 10: {
                return ((Context)this.a).getSharedPreferences("primes", 0);
            }
            case 9: {
                Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    l2 += ((dfy)iterator.next()).c();
                }
                return l2;
            }
            case 8: {
                Object object = this.a;
                Object object2 = (dgu)object;
                Object object3 = ((dco)object2.a.o()).a;
                Object object4 = object2.a.g();
                synchronized (object) {
                    n3 = ((dgu)object).e;
                    ((dgu)object).e = n3 + 1;
                }
                Object object5 = object2.j;
                object = (String)object4.get(n3);
                fxf.K(object);
                Object object6 = object2.c;
                Object object7 = object2.b;
                Object object8 = object2.i;
                object4 = new hqa();
                bl2 = ((dwm)object5).a;
                object2 = ((deh)object7).g(bl2) ? djb.a : djb.b;
                bl2 = ((deh)object7).g(bl2);
                object7 = dds.e();
                ((dya)object7).j(bl2);
                ((dya)object7).h(false);
                ((dya)object7).i(false);
                ((dya)object7).g(false);
                object7 = ((dya)object7).f();
                ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol", "download", 113, "HttpDownloadProtocol.java")).G("Requesting download of URL %s to %s (constraints: %s)", dec.g((String)object3, (String)object), ((File)object6).getName(), object7);
                object3 = ((File)object6).getParentFile();
                fxf.K(object3);
                String string = ((File)object6).getName();
                object5 = ((dwm)object5).e;
                dhb dhb2 = new dhb((hqa)object4, (String)object, (fkg)object8, (File)object6);
                object6 = new dgp((File)object3, string, new eky(object8, object));
                object6 = new djc((djj)object5, (String)object, (File)object3, string, dhb2, (djm)object6);
                ((djc)object6).h((djb)((Object)object2));
                ((djc)object6).e();
                object6 = ((den)((fkg)object8).c).o();
                object2 = ((den)((fkg)object8).c).e();
                object3 = (dco)object6;
                object5 = ((dco)object3).a;
                l2 = ((File)((fkg)object8).a).length();
                ddb.a();
                object5 = ((dco)object3).b;
                object8 = ((dgu)((fkg)object8).b).h;
                object2 = new die((ddn)object6, (String)object, (ded)object2, l2, (dds)object7, 1);
                ((dgv)object8).d.a((dau)object2);
                return object4;
            }
            case 7: {
                if (((cxt)this.a).a() == ctc.d) return bl2;
                bl2 = true;
                return bl2;
            }
            case 6: {
                return ((ajd)this.a).g;
            }
            case 5: {
                return apc.e((Context)this.a);
            }
            case 4: {
                return new aox((Context)this.a);
            }
            case 3: {
                n3 = apm.a;
                return new bzb((Context)this.a);
            }
            case 2: {
                return this.a;
            }
            case 1: {
                AudioManager audioManager = (AudioManager)((Context)this.a).getApplicationContext().getSystemService("audio");
                abr.i(audioManager);
                return audioManager;
            }
            case 0: 
        }
        return this.a;
    }
}

