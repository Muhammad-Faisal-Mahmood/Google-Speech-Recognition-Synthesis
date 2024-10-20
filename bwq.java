/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.util.SparseArray
 */
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.SparseArray;

public final class bwq {
    private static final hei b;
    private static final SparseArray c;
    boolean a = false;
    private final Context d;
    private final PackageManager e;
    private final caj f;
    private final crc g;
    private final int h;

    static {
        SparseArray sparseArray;
        b = hei.m("com/google/android/apps/speech/tts/googletts/service/analytics/Analytics");
        c = sparseArray = new SparseArray();
        sparseArray.put(0, (Object)iac.b);
        sparseArray.put(-2, (Object)iac.f);
        sparseArray.put(-1, (Object)iac.g);
        sparseArray.put(-8, (Object)iac.h);
        sparseArray.put(-6, (Object)iac.i);
        sparseArray.put(-7, (Object)iac.j);
        sparseArray.put(-9, (Object)iac.k);
        sparseArray.put(-5, (Object)iac.l);
        sparseArray.put(-4, (Object)iac.m);
        sparseArray.put(-3, (Object)iac.n);
    }

    public bwq(Context context, caj object) {
        this.d = context;
        Object object2 = context.getPackageManager();
        this.e = object2;
        this.f = object;
        object = (UiModeManager)context.getSystemService("uimode");
        fxf.K(object);
        int n2 = object2.hasSystemFeature("android.software.leanback") ? (object.getCurrentModeType() == 4 ? 7 : 6) : (object2.hasSystemFeature("android.hardware.type.watch") ? 5 : (object2.hasSystemFeature("android.hardware.type.automotive") ? 4 : 3));
        this.h = n2;
        object2 = (heg)((heg)b.f()).j("com/google/android/apps/speech/tts/googletts/service/analytics/Analytics", "<init>", 84, "Analytics.java");
        object = n2 != 3 ? (n2 != 4 ? (n2 != 5 ? (n2 != 6 ? "TYPE_TV" : "TYPE_LEANBACK") : "TYPE_WATCH") : "TYPE_CAR") : "TYPE_PHONE";
        object2.u("Running on %s", object);
        this.g = new kct();
        brt.a(context);
    }

    private final void g(int n2, String object, int n3, String object2, int n4, String object3) {
        hwp hwp2 = iaf.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        iaf iaf2 = (iaf)hwv2;
        object.getClass();
        iaf2.c = object;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = hwp2.b;
        ((iaf)object).d = n3;
        if (!((hwv)object).B()) {
            hwp2.u();
        }
        object = hwp2.b;
        ((iaf)object).b = n2 - 2;
        if (!((hwv)object).B()) {
            hwp2.u();
        }
        object = hwp2.b;
        ((iaf)object).e = a.A(n4);
        if (!((hwv)object).B()) {
            hwp2.u();
        }
        object = hwp2.b;
        ((iaf)object).f = object3;
        if (object2 != null) {
            if (!((hwv)object).B()) {
                hwp2.u();
            }
            ((iaf)hwp2.b).g = object2;
        }
        object = iaa.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object2 = (iaa)((hwp)object).b;
        object3 = (iaf)hwp2.o();
        object3.getClass();
        ((iaa)object2).c = object3;
        ((iaa)object2).b = 2;
        this.h((hwp)object);
    }

    private final void h(hwp object) {
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        int n2 = this.h;
        iaa iaa2 = (iaa)((hwp)object).b;
        Object object2 = iaa.a;
        iaa2.d = n2 - 2;
        object = (iaa)((hwp)object).o();
        object2 = b;
        ((heg)((heg)((hdz)object2).c()).j("com/google/android/apps/speech/tts/googletts/service/analytics/Analytics", "log", 156, "Analytics.java")).u("Clearcut event: %s", object);
        if (this.a) {
            object = this.f.g((hyf)object, cro.a(this.d, this.g));
            ((cag)object).e(1);
            ((cai)object).a();
            return;
        }
        ((heg)((heg)((hdz)object2).c()).j("com/google/android/apps/speech/tts/googletts/service/analytics/Analytics", "log", 163, "Analytics.java")).r("ClearCut event not logged");
    }

    public final void a(boolean bl2) {
        if (!brt.c()) {
            this.a = bl2;
        }
    }

    public final void b(String string, int n2, int n3, String string2, String string3) {
        this.g(5, string, n2, string2, n3, string3);
    }

    public final void c(String string, int n2, int n3, String string2) {
        this.g(3, string, n2, null, n3, string2);
    }

    public final void d(String string, int n2, int n3, String string2) {
        this.g(4, string, n2, null, n3, string2);
    }

    public final void e(ivu object) {
        Object object2;
        if (((ivu)object).c() == 0) {
            return;
        }
        hwp hwp2 = iaa.a.l();
        hwp hwp3 = iae.a.l();
        Object object3 = object2 = ((ivu)object).a;
        if (object2 == null) {
            object3 = "";
        }
        if (!hwp3.b.B()) {
            hwp3.u();
        }
        object2 = hwp3.b;
        ((iae)object2).b = (String)object3;
        int n2 = ((ivu)object).c();
        if (!((hwv)object2).B()) {
            hwp3.u();
        }
        object3 = hwp3.b;
        ((iae)object3).c = n2;
        object = ((StringBuilder)((ivu)object).b).toString();
        if (!((hwv)object3).B()) {
            hwp3.u();
        }
        ((iae)hwp3.b).d = object;
        object3 = (iae)hwp3.o();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (iaa)hwp2.b;
        object3.getClass();
        ((iaa)object).c = object3;
        ((iaa)object).b = 3;
        this.h(hwp2);
    }

    public final void f(brv object, ddl object2, bws object3, int n2, int n3, boolean bl2) {
        hwv hwv2;
        Object object4 = ((brv)object).g.getString("com.google.android.tts:PreWarm");
        if (object4 != null && fxf.V((CharSequence)object4, "true")) {
            return;
        }
        object4 = new bzs().a(this.e, ((brv)object).f);
        hwp hwp2 = iad.a.l();
        int n4 = ((brv)object).e;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object5 = hwp2.b;
        ((iad)object5).s = n4;
        if (!((hwv)object5).B()) {
            hwp2.u();
        }
        object5 = (iad)hwp2.b;
        object4.getClass();
        ((iad)object5).h = object4;
        boolean bl3 = fxf.P(((brv)object).i);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object4 = hwp2.b;
        ((iad)object4).x = bl3 ^ true;
        n4 = ((brv)object).d;
        int n5 = 0;
        bl3 = n4 != 100;
        if (!((hwv)object4).B()) {
            hwp2.u();
        }
        object4 = hwp2.b;
        ((iad)object4).y = bl3;
        bl3 = ((brv)object).n;
        object5 = ((brv)object).h;
        n4 = object5 != null && (((ikd)object5).b & 1) != 0 ? 1 : 0;
        if (bl3) {
            if (!((hwv)object4).B()) {
                hwp2.u();
            }
            object4 = hwp2.b;
            ((iad)object4).A = a.A(5);
            bl3 = ((brv)object).o;
            if (!((hwv)object4).B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).v = bl3;
        } else if (object5 != null && n4 != 0) {
            object4 = object5 = ((ikd)object5).c;
            if (object5 == null) {
                object4 = iiu.a;
            }
            object5 = ((iiu)object4).c.iterator();
            int n6 = 0;
            int n7 = 0;
            n4 = n5;
            n5 = n7;
            while (object5.hasNext()) {
                object4 = (iit)object5.next();
                n7 = ((iit)object4).b;
                if (n7 == 4) {
                    n7 = ((ijb)((iit)object4).c).b;
                    if (n7 == 1) {
                        ++n6;
                        continue;
                    }
                    if (n7 != 2) continue;
                    ++n5;
                    continue;
                }
                if (n7 != 2) continue;
                ++n4;
            }
            object4 = iab.a.l();
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object5 = ((hwp)object4).b;
            ((iab)object5).b = n4;
            if (!((hwv)object5).B()) {
                ((hwp)object4).u();
            }
            object5 = ((hwp)object4).b;
            ((iab)object5).c = n6;
            if (!((hwv)object5).B()) {
                ((hwp)object4).u();
            }
            ((iab)((hwp)object4).b).d = n5;
            object5 = (iab)((hwp)object4).o();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = hwp2.b;
            object4 = (iad)hwv2;
            object5.getClass();
            ((iad)object4).z = object5;
            ((iad)object4).b |= 1;
            if (!hwv2.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).A = a.A(4);
        } else if (((brv)object).a != null) {
            if (!((hwv)object4).B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).A = a.A(3);
        }
        object4 = (iac)c.get(n2, (Object)iac.g);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        ((iad)hwp2.b).c = ((iac)object4).a();
        if (isy.a.c().b()) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).w = n3;
        }
        if (((brv)object).j()) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).d = idi.b(7);
        } else if (((brv)object).l()) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).d = idi.b(8);
        } else if (((brv)object).k()) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).d = idi.b(6);
        } else {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).d = idi.b(5);
        }
        if (object2 != null) {
            object4 = ((bso)((ddl)object2).a).m();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).e = object4;
            n2 = ((bso)((ddl)object2).a).c();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).g = n2;
            object5 = ((bso)((ddl)object2).a).g().name();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object4 = hwp2.b;
            hwv2 = (iad)object4;
            object5.getClass();
            ((iad)hwv2).q = object5;
            object2 = ((ddl)object2).b;
            if (object2 != null) {
                object2 = ((bso)object2).m();
                if (!((hwv)object4).B()) {
                    hwp2.u();
                }
                ((iad)hwp2.b).f = object2;
            }
        } else {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).e = "none";
        }
        if (object3 != null) {
            object4 = new gtk("|").d(((bws)object3).b);
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = hwp2.b;
            ((iad)object2).i = object4;
            if (((bws)object3).f != -1L) {
                long l2 = ((bws)object3).d;
                if (!((hwv)object2).B()) {
                    hwp2.u();
                }
                object4 = hwp2.b;
                ((iad)object4).j = l2;
                object2 = ((bws)object3).n;
                l2 = object2 == null ? -1L : ((bwt)object2).a();
                if (!((hwv)object4).B()) {
                    hwp2.u();
                }
                object2 = hwp2.b;
                ((iad)object2).k = l2;
                l2 = ((bws)object3).g;
                if (!((hwv)object2).B()) {
                    hwp2.u();
                }
                object2 = hwp2.b;
                ((iad)object2).l = l2;
                l2 = ((bws)object3).f;
                if (l2 != -1L) {
                    if (!((hwv)object2).B()) {
                        hwp2.u();
                    }
                    object2 = hwp2.b;
                    ((iad)object2).m = l2;
                    l2 = ((bws)object3).i;
                    float f2 = l2 != 0L ? (float)((bws)object3).g / (float)l2 : 0.0f;
                    if (!((hwv)object2).B()) {
                        hwp2.u();
                    }
                    object2 = hwp2.b;
                    ((iad)object2).n = f2;
                    l2 = ((bws)object3).l;
                    if (!((hwv)object2).B()) {
                        hwp2.u();
                    }
                    ((iad)hwp2.b).r = l2;
                } else {
                    throw new IllegalStateException("Call endSynthesis() before calling totalSynthesisTime()");
                }
            }
            if ((object2 = ((bws)object3).m) != null) {
                fxf.K(((bws)object3).p);
                double d2 = ((bws)object3).p.a();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                ((iad)hwp2.b).t = (int)(d2 /= 1000000.0);
                bl3 = (Boolean)object2;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                ((iad)hwp2.b).u = bl3;
            }
        }
        for (n2 = 1; n2 < ((brv)object).a.length() && n2 < 0x100000; n2 += n2) {
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = hwp2.b;
        ((iad)object).p = n2;
        if (bl2) {
            if (!((hwv)object).B()) {
                hwp2.u();
            }
            ((iad)hwp2.b).o = true;
        }
        object = (iad)hwp2.o();
        object3 = iaa.a.l();
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object2 = (iaa)((hwp)object3).b;
        object.getClass();
        ((iaa)object2).c = object;
        ((iaa)object2).b = 1;
        this.h((hwp)object3);
    }
}

