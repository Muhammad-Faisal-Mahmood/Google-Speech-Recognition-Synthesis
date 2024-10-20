/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.net.NetworkInfo
 *  android.net.NetworkInfo$DetailedState
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.Log
 *  gqv
 *  hom
 */
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.ApplicationStatus;
import org.chromium.net.AndroidNetworkLibrary;
import org.chromium.net.DnsStatus;

public final class bzo {
    public final Object a;

    public bzo() {
        this.a = new AtomicInteger(1);
    }

    public bzo(float f2) {
        this.a = Float.valueOf(f2);
    }

    public bzo(long l2) {
        this.a = l2;
    }

    public bzo(Context object) {
        object = new cae((Context)object, "ICING");
        ((cae)object).e = new czy(0);
        this.a = ((cae)object).a();
    }

    public bzo(Context context, byte[] byArray) {
        this.a = (ConnectivityManager)context.getSystemService("connectivity");
    }

    public bzo(bzb object) {
        this.a = new cld();
        Object object2 = new AmbientModeSupport$AmbientController(this);
        object = ((bzb)object).a;
        ckp ckp2 = new ckp((AmbientModeSupport$AmbientController)object2);
        object2 = clc.a;
        ((cld)object).i((Executor)object2, ckp2);
    }

    public bzo(htu htu2, Context object, hpq object2, iah object3) {
        this.a = htu2;
        hav hav2 = hav.n(((iah)object3).b);
        object3 = new HashMap();
        object3.put("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", new iyq(new eyd(object, 11), object.getPackageManager(), hav2, (Executor)object2));
        object = kmp.S((Map)object3);
        object2 = new iyt();
        ((iyt)object2).b();
        ((iyt)object2).a = true;
        htu2.b((ksb)object, ((iyt)object2).a());
    }

    public bzo(Object object) {
        this.a = object;
    }

    public bzo(Object object, byte[] byArray) {
        this.a = object;
    }

    public bzo(Set set) {
        jse.e(set, "directBootPackages");
        this.a = set;
    }

    public bzo(ThreadFactory threadFactory) {
        this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), threadFactory);
    }

    public bzo(jnu jnu2) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzo(jnu jnu2, jnu jnu3) {
        jse.e(jnu2, "processReaperConfig");
        jse.e(jnu3, "subpackager");
        this.a = jnu2;
        new LinkedHashMap();
    }

    public bzo(jnu jnu2, byte[] byArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzo(boolean bl2) {
        this.a = bl2;
    }

    public bzo(byte[] byArray) {
        this.a = new cld();
    }

    public bzo(byte[] byArray, byte[] byArray2) {
        this.a = new ArrayList(1);
    }

    public bzo(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        this.a = new ArrayList(20);
    }

    public bzo(byte[] object, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        object = (Object)TimeUnit.MINUTES;
        jse.e(object, "timeUnit");
        object = new kht(khh.a, (TimeUnit)((Object)object));
        this.a = object;
    }

    public bzo(char[] cArray) {
        this.a = new cxt(null, null);
    }

    public bzo(char[] cArray, byte[] byArray) {
        this.a = new LinkedHashSet();
    }

    public bzo(int[] object) {
        object = hhk.s();
        jse.d(object, "newConcurrentHashSet(...)");
        this.a = object;
    }

    public bzo(short[] sArray) {
        this.a = new EnumMap(edo.class);
        new HashSet();
    }

    public static hav J(Set set, pa pa2, gjt gjt22) {
        if (pa2.containsKey(gjt22)) {
            hat hat2 = new hat();
            for (gjt gjt22 : (Set)pa2.get(gjt22)) {
                if (set.contains(gjt22)) {
                    hat2.j(gjt22);
                    continue;
                }
                hat2.i(bzo.J(set, pa2, gjt22));
            }
            return hat2.g();
        }
        return hdc.a;
    }

    public static void K(pa pa2, gjt gjt2, gjt gjt3) {
        Set<gjt> set;
        Set<gjt> set2 = set = (Set<gjt>)pa2.get(gjt2);
        if (set == null) {
            set2 = Collections.newSetFromMap(new ot());
            pa2.put(gjt2, set2);
        }
        set2.add(gjt3);
    }

    private final void aB(int n2) {
        int n3 = this.ah();
        if (n2 == n3) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Attempted to access flag value as ");
        stringBuilder.append((Object)jjj.Z(n2));
        stringBuilder.append(", but actual type is ");
        stringBuilder.append((Object)jjj.Z(n3));
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static int[] ab(String string) {
        block5: {
            if (string.isEmpty()) break block5;
            StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
            int n2 = stringTokenizer.countTokens();
            int[] nArray = new int[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                nArray[i2] = Integer.parseInt(stringTokenizer.nextToken());
                continue;
            }
            return nArray;
        }
        try {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Version string is empty");
            throw illegalArgumentException;
        }
        catch (RuntimeException runtimeException) {
            throw new IllegalArgumentException(a.aj(string, "Unable to parse HTTP flags version string: `", "`"), runtimeException);
        }
    }

    /*
     * Exception decompiling
     */
    public static final boolean ap(Network var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static final boolean i(long l2, long l3) {
        return l2 % l3 == 0L;
    }

    public final void A(eap eap2) {
        jse.e(eap2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ece ece2 = (ece)hyg2.b;
        hyg2 = ece.a;
        ece2.j = eap2.h;
        ece2.b |= 0x20;
    }

    public final void B(ech ech2) {
        jse.e(ech2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ece)hyg2.b;
        ece ece2 = ece.a;
        ((ece)hyg2).e = ech2.t;
        ((ece)hyg2).b |= 1;
    }

    public final void C(eip eip2) {
        jse.e(eip2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ece)hyg2.b;
        ece ece2 = ece.a;
        eip2.getClass();
        ((ece)hyg2).k = eip2;
        ((ece)hyg2).b |= 0x40;
    }

    public final void D(long l2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ece ece2 = (ece)hyg2.b;
        hyg2 = ece.a;
        ece2.b |= 2;
        ece2.f = l2;
    }

    public final void E(long l2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ece ece2 = (ece)hyg2.b;
        hyg2 = ece.a;
        ece2.b |= 0x80;
        ece2.l = l2;
    }

    public final void F(long l2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ece ece2 = (ece)hyg2.b;
        hyg2 = ece.a;
        ece2.b |= 4;
        ece2.g = l2;
    }

    public final void G(ebv ebv2) {
        jse.e(ebv2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ece ece2 = (ece)hyg2.b;
        hyg2 = ece.a;
        ece2.h = ebv2.s;
        ece2.b |= 8;
    }

    public final gpf H(String string, String string2) {
        gto gto2;
        if (fxf.aw(gqv.a)) {
            gto2 = gsl.a;
        } else {
            Object object = this.a;
            String string3 = "Invoking ".concat(string);
            gto2 = gqv.a;
            gto2 = gto.i(((gpm)object).b(string3, (gqv)gto2));
        }
        return new gmp(fxf.as(a.ao(string2, string, "."), gqv.a), gto2, 4, null);
    }

    public final hpn I(hnx object, hav object2) {
        Object object3;
        long l2 = SystemClock.elapsedRealtime();
        Object object4 = new HashSet<gmb>();
        Object object5 = object2.iterator();
        while (object5.hasNext()) {
            object3 = this.a;
            object2 = (gmc)object5.next();
            Objects.requireNonNull(object2);
            object3 = fxf.ai(gqk.c(new frn(object2, 20)), (Executor)object3);
            gax.c((hpn)object3, "Future Monitor failed", new Object[0]);
            object4.add(new gmb((gmc)object2, (hpn)object3));
        }
        object = fxf.ai(gqk.c((hnx)object), (Executor)hom.a);
        object5 = fvd.d((hpn)object, gqk.j(new gma(l2, 0)), (Executor)hom.a);
        object3 = this.a;
        object2 = new HashSet();
        object4 = object4.iterator();
        while (object4.hasNext()) {
            Object object6 = (gmb)object4.next();
            object6 = fxf.aC(new hpn[]{((gmb)object6).b, object5, object}).C(new etu(object6, object5, 16, null), (Executor)object3);
            gax.c((hpn)object6, "Future Monitor failed", new Object[0]);
            object2.add(object6);
        }
        object4 = hhk.L(hhk.Y(object2).a(gqk.j(new dwp(11)), (Executor)hom.a));
        object2 = this.a;
        return fxf.aC(new hpn[]{object, hhk.R((hpn)object4, 10L, TimeUnit.SECONDS, (ScheduledExecutorService)object2)}).C(gqk.c(new frn(object, 19)), (Executor)hom.a);
    }

    public final boolean L(String string) {
        jse.e(string, "packageName");
        int n2 = crt.a;
        return this.a.contains(string);
    }

    public final void M(String string) {
        dyj dyj2 = dxv.aH.c(1);
        dyj2.r("model_manager", string);
        this.a.a(dyj2);
    }

    public final void N(String object) {
        object = dxv.aL.b("model_manager", (String)object);
        this.a.a((dyk)object);
    }

    public final void O(String object, int n2) {
        dyj dyj2 = dxv.aH.c(11);
        dyj2.r("model_manager", (String)object);
        gpm gpm2 = hky.i;
        object = hky.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        Object object2 = this.a;
        hky hky2 = (hky)((hwp)object).b;
        hky2.e = n2 - 1;
        hky2.b |= 4;
        dyj2.u(gpm2, (hky)((hwp)object).o());
        object2.a(dyj2);
    }

    public final void P(String object, int n2) {
        dyj dyj2 = dxv.az.c(11);
        dyj2.r("model_manager", (String)object);
        object = hkj.h;
        hwp hwp2 = hkj.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object2 = this.a;
        hkj hkj2 = (hkj)hwp2.b;
        hkj2.e = n2 - 1;
        hkj2.b |= 4;
        dyj2.u((gpm)object, (hkj)hwp2.o());
        object2.a(dyj2);
    }

    public final /* synthetic */ faq Q() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (faq)hwv2;
    }

    public final void R(String string) {
        jse.e(string, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (faq)hyg2.b;
        hxc hxc2 = faq.a;
        string.getClass();
        ((faq)hyg2).c |= 1;
        ((faq)hyg2).d = string;
    }

    public final etj S(ebl ebl2, hpn hpn2) {
        ebl2.getClass();
        ((czh)this.a.b()).getClass();
        return new etj(hpn2);
    }

    public final etf T(eau eau2, hpn hpn2) {
        eau2.getClass();
        ((czh)this.a.b()).getClass();
        return new etf(hpn2);
    }

    public final /* synthetic */ erh U() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (erh)hwv2;
    }

    public final /* synthetic */ void V(eqy eqy2) {
        jse.e(eqy2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (erh)hyg2.b;
        Object object = erh.a;
        eqy2.getClass();
        object = ((erh)hyg2).b;
        if (!object.c()) {
            ((erh)hyg2).b = hwv.s((hxk)object);
        }
        ((erh)hyg2).b.add(eqy2);
    }

    public final /* synthetic */ void W() {
        List list = DesugarCollections.unmodifiableList(((erh)((hwp)this.a).b).b);
        jse.d(list, "getDeltasList(...)");
        new hzr(list);
    }

    public final /* synthetic */ eqx X() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eqx)hwv2;
    }

    public final void Y(eqz eqz2) {
        jse.e(eqz2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eqx eqx2 = (eqx)hyg2.b;
        hyg2 = eqx.a;
        eqx2.e = eqz2.g;
        eqx2.b |= 1;
    }

    public final gpm Z(geo geo2, jrk jrk2, Executor executor, Map map, jro jro2, jrk jrk3, hny hny2, jqz jqz2, gfp gfp2) {
        gfl gfl2 = (gfl)this.a;
        return new gpm(((ilt)gfl2.d).a(), (bzo)((imc)gfl2.g).a, (Map)gfl2.a.b(), (AmbientModeSupport$AmbientController)gfl2.e.b(), (hpq)gfl2.f.b(), (bmu)gfl2.c.b(), (gto)gfl2.h.b(), (Map)gfl2.b.b(), geo2, jrk2, executor, map, jro2, jrk3, hny2, jqz2, gfp2);
    }

    public final int a() {
        return ((AtomicInteger)this.a).getAndIncrement();
    }

    public final void aA(String string) {
        int n2 = 0;
        while (n2 < this.a.size()) {
            int n3 = n2;
            if (jse.H(string, (String)this.a.get(n2))) {
                this.a.remove(n2);
                this.a.remove(n2);
                n3 = n2 - 2;
            }
            n2 = n3 + 2;
        }
    }

    public final Map aa() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public final float ac() {
        this.aB(3);
        return ((Float)this.a).floatValue();
    }

    public final long ad() {
        this.aB(2);
        return (Long)this.a;
    }

    public final hvu ae() {
        this.aB(5);
        return (hvu)this.a;
    }

    public final String af() {
        this.aB(4);
        return (String)this.a;
    }

    public final boolean ag() {
        this.aB(1);
        return (Boolean)this.a;
    }

    public final int ah() {
        Object object = this.a;
        if (object instanceof Boolean) {
            return 1;
        }
        if (object instanceof Long) {
            return 2;
        }
        if (object instanceof Float) {
            return 3;
        }
        if (object instanceof String) {
            return 4;
        }
        if (object instanceof hvu) {
            return 5;
        }
        throw new IllegalStateException("Unexpected flag value type: ".concat(String.valueOf(object.getClass().getName())));
    }

    public final int ai(Network network) {
        if ((network = this.al(network)) != null && network.isConnected()) {
            return kpb.a(network.getType(), network.getSubtype());
        }
        return 6;
    }

    public final Network aj() {
        Network network;
        block8: {
            Network network2;
            network = network2 = ((ConnectivityManager)this.a).getActiveNetwork();
            if (network2 != null) break block8;
            NetworkInfo networkInfo = ((ConnectivityManager)this.a).getActiveNetworkInfo();
            if (networkInfo == null) {
                return null;
            }
            Network[] networkArray = kpb.h(this, null);
            int n2 = networkArray.length;
            int n3 = 0;
            while (true) {
                block9: {
                    Network network3;
                    block11: {
                        NetworkInfo networkInfo2;
                        block10: {
                            network = network2;
                            if (n3 >= n2) break;
                            network3 = networkArray[n3];
                            networkInfo2 = this.am(network3);
                            network = network2;
                            if (networkInfo2 == null) break block9;
                            if (networkInfo2.getType() == networkInfo.getType()) break block10;
                            network = network2;
                            if (networkInfo2.getType() != 17) break block9;
                        }
                        network = network2;
                        if (network2 == null) break block11;
                        network = network2;
                        if (Build.VERSION.SDK_INT < 29) break block11;
                        network = network2;
                        if (networkInfo2.getDetailedState() == NetworkInfo.DetailedState.CONNECTING) break block9;
                        networkInfo2 = this.am(network2);
                        network = network2;
                        if (networkInfo2 != null) {
                            network = network2;
                            if (networkInfo2.getDetailedState() == NetworkInfo.DetailedState.CONNECTING) {
                                network = null;
                            }
                        }
                    }
                    if (network != null) {
                        Log.e((String)"cr_".concat(String.valueOf(kpb.a)), (String)"There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                    }
                    network = network3;
                }
                ++n3;
                network2 = network;
            }
        }
        return network;
    }

    public final NetworkCapabilities ak(Network network) {
        for (int i2 = 0; i2 < 2; ++i2) {
            try {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager)this.a).getNetworkCapabilities(network);
                return networkCapabilities;
            }
            catch (SecurityException securityException) {
                continue;
            }
        }
        return null;
    }

    public final NetworkInfo al(Network network) {
        NetworkInfo networkInfo = this.am(network);
        network = networkInfo;
        if (networkInfo != null) {
            network = networkInfo;
            if (networkInfo.getType() == 17) {
                network = ((ConnectivityManager)this.a).getActiveNetworkInfo();
            }
        }
        return network;
    }

    public final NetworkInfo am(Network network) {
        try {
            NetworkInfo networkInfo = ((ConnectivityManager)this.a).getNetworkInfo(network);
            return networkInfo;
        }
        catch (NullPointerException nullPointerException) {
            try {
                network = ((ConnectivityManager)this.a).getNetworkInfo(network);
                return network;
            }
            catch (NullPointerException nullPointerException2) {
                return null;
            }
        }
    }

    public final void an(ConnectivityManager.NetworkCallback networkCallback) {
        ((ConnectivityManager)this.a).unregisterNetworkCallback(networkCallback);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final koz ao() {
        void var4_5;
        Object object;
        Network network;
        block10: {
            block9: {
                network = this.aj();
                object = this.al(network);
                if (object == null) break block9;
                NetworkInfo networkInfo = object;
                if (object.isConnected()) break block10;
                if (object.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                    ApplicationStatus.getStateForApplication();
                }
            }
            Object var4_4 = null;
        }
        if (var4_5 == null) {
            return new koz(false, -1, -1, false, null, false, "");
        }
        if (network != null) {
            object = this.ak(network);
            boolean bl2 = object != null && !object.hasCapability(11);
            object = AndroidNetworkLibrary.a(network);
            if (object == null) {
                int n2 = var4_5.getType();
                int n3 = var4_5.getSubtype();
                String string = kpb.a;
                return new koz(true, n2, n3, bl2, String.valueOf(network.getNetworkHandle()), false, "");
            }
            int n4 = var4_5.getType();
            int n5 = var4_5.getSubtype();
            String string = kpb.a;
            return new koz(true, n4, n5, bl2, String.valueOf(network.getNetworkHandle()), ((DnsStatus)object).getPrivateDnsActive(), ((DnsStatus)object).getPrivateDnsServerName());
        }
        if (var4_5.getType() != 1) {
            return new koz(true, var4_5.getType(), var4_5.getSubtype(), false, null, false, "");
        }
        if (var4_5.getExtraInfo() != null && !"".equals(var4_5.getExtraInfo())) {
            return new koz(true, var4_5.getType(), var4_5.getSubtype(), false, var4_5.getExtraInfo(), false, "");
        }
        var4_5.getType();
        var4_5.getSubtype();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean aq(int n2) {
        synchronized (this) {
            int n3 = this.a.size();
            if (n3 >= 256) {
                return false;
            }
            this.a.add(n2);
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void ar(kgy kgy2) {
        synchronized (this) {
            jse.e(kgy2, "route");
            this.a.remove(kgy2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void as(kgy kgy2) {
        synchronized (this) {
            jse.e(kgy2, "failedRoute");
            this.a.add(kgy2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean at(kgy kgy2) {
        synchronized (this) {
            return this.a.contains(kgy2);
        }
    }

    public final void au(Runnable runnable) {
        jse.e(runnable, "runnable");
        ((ThreadPoolExecutor)this.a).execute(runnable);
    }

    public final String av(String string) {
        int n2 = this.a.size() - 2;
        int n3 = jsd.g(n2, 0, -2);
        if (n3 <= n2) {
            while (true) {
                if (jse.H(string, (String)this.a.get(n2))) {
                    return (String)this.a.get(n2 + 1);
                }
                if (n2 == n3) break;
                n2 -= 2;
            }
        }
        return null;
    }

    public final kgk aw() {
        return new kgk(this.a.toArray(new String[0]));
    }

    public final void ax(String string, String string2) {
        jse.e(string, "name");
        jse.e(string2, "value");
        this.a.add(string);
        string = ((Object)jse.w(string2)).toString();
        this.a.add(string);
    }

    public final void ay(String string, String string2) {
        jse.e(string2, "value");
        jvf.x(string);
        jvf.y(string2, string);
        this.aA(string);
        this.ax(string, string2);
    }

    public final void az(String string, String string2) {
        jse.e(string2, "value");
        jvf.x(string);
        jvf.y(string2, string);
        this.ax(string, string2);
    }

    public final void b(Exception exception) {
        ((cld)this.a).k(exception);
    }

    public final void c(Object object) {
        ((cld)this.a).l(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Exception exception) {
        a.s(exception, "Exception must not be null");
        Object object = this.a;
        cld cld2 = (cld)object;
        Object object2 = cld2.a;
        synchronized (object2) {
            if (((cld)object).b) {
                return;
            }
            ((cld)object).b = true;
            ((cld)object).d = exception;
        }
        cld2.e.d((ckz)object);
    }

    public final void e(Object object) {
        ((cld)this.a).n(object);
    }

    public final hpn f(Callable callable, Executor executor) {
        return ((cxt)this.a).E(callable, executor);
    }

    public final hpn g(hnx hnx2, Executor executor) {
        return ((cxt)this.a).F(hnx2, executor);
    }

    public final hpn h(long l2, gto object) {
        long l3 = l2 - 0L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (l4 == false) {
            return hhk.K(gsl.a);
        }
        if (l4 < 0) {
            cyr.g("Bad sample interval (negative number): %d", l2);
            return hhk.K(gsl.a);
        }
        if (inw.a.b().m() && ((gto)object).g()) {
            return dah.e(((gto)object).c().c()).f(new fll(l2, 1), (Executor)hom.a);
        }
        if (l4 != false && bzo.i(((Random)this.a).nextLong(), l2)) {
            hwp hwp2 = hmg.a.l();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (hmg)hwp2.b;
            ((hmg)object).b |= 1;
            ((hmg)object).c = false;
            object = hhk.K(gto.i((hmg)hwp2.o()));
        } else {
            object = hhk.K(gsl.a);
        }
        return object;
    }

    public final void j(cth cth2) {
        this.k(1008, cth2);
    }

    public final void k(int n2, cth object) {
        Object object2 = this.a;
        String string = ((cth)object).d;
        int n3 = ((cth)object).f;
        long l2 = ((cth)object).s;
        object = ((cth)object).t;
        ((cyu)object2).e(n2, string, n3, l2, (String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gto l(edo object) {
        synchronized (this) {
            return gto.h((eds)((EnumMap)this.a).get(object));
        }
    }

    public final /* synthetic */ edq m() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (edq)hwv2;
    }

    public final void n(eae eae2) {
        jse.e(eae2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (edq)hyg2.b;
        edq edq2 = edq.a;
        eae2.getClass();
        ((edq)hyg2).d = eae2;
        ((edq)hyg2).b |= 2;
    }

    public final /* synthetic */ eda o() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eda)hwv2;
    }

    public final /* synthetic */ ear p() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ear)hwv2;
    }

    public final void q(ebt ebt2) {
        jse.e(ebt2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ear)hyg2.b;
        ear ear2 = ear.a;
        ebt2.getClass();
        ((ear)hyg2).c = ebt2;
        ((ear)hyg2).b |= 1;
    }

    public final /* synthetic */ eag r() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eag)hwv2;
    }

    public final void s(long l2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eag eag2 = (eag)hyg2.b;
        hyg2 = eag.a;
        eag2.b |= 1;
        eag2.c = l2;
    }

    public final /* synthetic */ dzt t() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (dzt)hwv2;
    }

    public final void u(dzu dzu2) {
        jse.e(dzu2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        dzt dzt2 = (dzt)hyg2.b;
        hyg2 = dzt.a;
        dzt2.c = dzu2.c;
        dzt2.b |= 1;
    }

    public final /* synthetic */ ecf v() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ecf)hwv2;
    }

    public final void w(ebw ebw2) {
        jse.e(ebw2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ecf ecf2 = (ecf)hyg2.b;
        hyg2 = ecf.a;
        ebw2.getClass();
        ecf2.d = ebw2;
        ecf2.c = 3;
    }

    public final void x(ecc ecc2) {
        jse.e(ecc2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ecf)hyg2.b;
        ecf ecf2 = ecf.a;
        ecc2.getClass();
        ((ecf)hyg2).d = ecc2;
        ((ecf)hyg2).c = 5;
    }

    public final /* synthetic */ ece y() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ece)hwv2;
    }

    public final void z(efn efn2) {
        jse.e(efn2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ece)hyg2.b;
        ece ece2 = ece.a;
        efn2.getClass();
        ((ece)hyg2).i = efn2;
        ((ece)hyg2).b |= 0x10;
    }
}

