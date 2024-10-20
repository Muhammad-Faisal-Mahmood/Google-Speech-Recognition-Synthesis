/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.media.AudioAttributes$Builder
 *  android.net.ConnectivityManager
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.util.Log
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.widget.TextView
 *  gda
 *  hom
 */
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.speech.tts.googletts.settings.asr.voiceime.VoiceInputMethodService;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class bzb {
    private static bzb b;
    public final Object a;

    public bzb() {
        this.a = new bzb(null, null);
    }

    public bzb(int n2) {
        this.a = new LinkedHashMap(n2, 0.75f, true);
    }

    public bzb(Context object) {
        agu agu2 = new agu((Context)object);
        AmbientDelegate ambientDelegate = new AmbientDelegate();
        this.a = ambientDelegate;
        object = ambientDelegate;
        if (agu2 != ambientDelegate.a) {
            ambientDelegate.a = agu2;
            ambientDelegate.b.clear();
            ambientDelegate.c.clear();
        }
    }

    public bzb(Context context, bni bni2, Runnable runnable) {
        this.a = bni2;
        new bnj((Context)context).a = new bme(runnable, 1);
        new bmf((Context)context).a = new bme(runnable, 0);
        throw null;
    }

    public bzb(View view) {
        this.a = new WeakReference<View>(view);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public bzb(View object, byte[] byArray) {
        void var1_3;
        if (Build.VERSION.SDK_INT >= 30) {
            vo vo2 = new vo((View)object);
        } else {
            vm vm2 = new vm((View)object);
        }
        this.a = var1_3;
    }

    public bzb(TextView textView) {
        this.a = new zt(textView);
    }

    public bzb(WorkDatabase workDatabase, byte[] byArray) {
        jse.e(workDatabase, "workDatabase");
        this.a = workDatabase;
    }

    public bzb(awp awp2) {
        jse.e(awp2, "openHelper");
        this.a = awp2;
    }

    public bzb(bgs bgs2) {
        jse.e(bgs2, "id");
        this.a = bgs2;
    }

    public bzb(VoiceInputMethodService voiceInputMethodService, bmu object) {
        fma fma2 = (fma)((bmu)object).a.b();
        fma2.getClass();
        fld fld2 = (fld)((bmu)object).c.b();
        fld2.getClass();
        object = (gpm)((bmu)object).b.b();
        object.getClass();
        this.a = new fmb(voiceInputMethodService, fma2, fld2, (gpm)object);
    }

    public bzb(cya object, byte[] object2) {
        object2 = new bfd((bfs)((cya)object).a);
        bfe bfe2 = new bfe((bfn)((cya)object).b);
        bfk bfk2 = new bfk((bfs)((cya)object).e);
        Object object3 = (bfs)((cya)object).d;
        bfg bfg2 = new bfg((bfs)object3);
        bfj bfj2 = new bfj((bfs)object3);
        object3 = new bfi((bfs)((cya)object).d);
        bfh bfh2 = new bfh((bfs)((cya)object).d);
        if (Build.VERSION.SDK_INT >= 28) {
            object = ((cya)object).c;
            jse.e(object, "context");
            object = ((Context)object).getSystemService("connectivity");
            jse.c(object, "null cannot be cast to non-null type android.net.ConnectivityManager");
            object = new beu((ConnectivityManager)object, bfa.a);
        } else {
            object = null;
        }
        object = jns.Q(new bff[]{object2, bfe2, bfk2, bfg2, bfj2, object3, bfh2, object});
        this.a = object;
    }

    public bzb(hpn hpn2, gdu gdu2) {
        fpk.c();
        this.a = hpn2;
        fxf.K(gdu2);
    }

    public bzb(CharSequence object) {
        object = Collections.singletonList(object);
        this.a = object;
    }

    public bzb(Object object) {
        this.a = object;
    }

    public bzb(Object object, byte[] byArray) {
        this.a = object;
    }

    public /* synthetic */ bzb(List list, int n2) {
        jpa jpa2 = null;
        jpa jpa3 = (n2 & 1) != 0 ? jpa.a : null;
        if ((n2 & 2) != 0) {
            jpa2 = jpa.a;
        }
        if ((n2 & 4) != 0) {
            list = jpa.a;
        }
        jse.e(jpa3, "ids");
        jse.e(jpa2, "uniqueWorkNames");
        jse.e(list, "tags");
        this.a = list;
    }

    public bzb(jnu jnu2) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzb(jnu jnu2, byte[] byArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public bzb(byte[] byArray, byte[] byArray2) {
        this.a = new cld();
    }

    public bzb(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        this.a = new aga(10);
    }

    public bzb(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        this.a = new CopyOnWriteArrayList();
    }

    public bzb(byte[] byArray, char[] cArray) {
        this.a = new LinkedHashMap();
    }

    public bzb(byte[] byArray, char[] cArray, byte[] byArray2) {
        this((short[])null, (byte[])null);
    }

    private bzb(char[] cArray) {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), (Handler.Callback)new fyd(this));
    }

    public bzb(char[] cArray, byte[] byArray) {
        this.a = jzm.a(new int[7]);
    }

    public bzb(char[] object, byte[] byArray, byte[] byArray2) {
        object = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        if (agf.a >= 29) {
            dp$$ExternalSyntheticApiModelOutline0.m((AudioAttributes.Builder)object, 1);
        }
        if (agf.a >= 32) {
            xu$$ExternalSyntheticApiModelOutline6.m((AudioAttributes.Builder)object, 0);
        }
        this.a = object.build();
    }

    public bzb(char[] cArray, char[] cArray2) {
        this.a = new LinkedHashMap();
    }

    public bzb(short[] sArray, byte[] byArray) {
        this.a = new AudioAttributes.Builder();
    }

    public bzb(short[] sArray, byte[] byArray, byte[] byArray2) {
        this.a = new ArrayList();
    }

    public static bzb H(hpn hpn2) {
        return new bzb(hno.f(hpn2, new fiz(8), (Executor)hom.a));
    }

    public static bzb I() {
        if (b == null) {
            b = new bzb(null);
        }
        return b;
    }

    public static bzb am(int n2, int n3, int n4, int n5) {
        return new bzb(AccessibilityNodeInfo.CollectionItemInfo.obtain((int)n2, (int)n3, (int)n4, (int)n5, (boolean)false, (boolean)false));
    }

    public final /* synthetic */ esg A() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (esg)hwv2;
    }

    public final void B(esf esf2) {
        jse.e(esf2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        esg esg2 = (esg)hyg2.b;
        hyg2 = esg.a;
        esf2.getClass();
        esg2.e = esf2;
        esg2.b |= 1;
    }

    public final /* synthetic */ eqy C() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eqy)hwv2;
    }

    public final void D(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eqy)hyg2.b;
        eqy eqy2 = eqy.a;
        ((eqy)hyg2).b |= 2;
        ((eqy)hyg2).f = n2;
    }

    public final void E(eqz eqz2) {
        jse.e(eqz2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eqy eqy2 = (eqy)hyg2.b;
        hyg2 = eqy.a;
        eqy2.e = eqz2.g;
        eqy2.b |= 1;
    }

    public final eou F(int n2, hpn hpn2) {
        Executor executor = (Executor)this.a.b();
        executor.getClass();
        return new eou(n2, hpn2, executor);
    }

    public final gpm G() {
        jvb jvb2 = (jvb)this.a.b();
        jvb2.getClass();
        return new gpm(jvb2);
    }

    public final jyx J(bhd bhd2) {
        Object object;
        jse.e(bhd2, "spec");
        Object object2 = new ArrayList<Object>();
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!((bff)object).b(bhd2)) continue;
            object2.add(object);
        }
        object = new ArrayList(jns.B(object2));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object.add((jyx)((bff)object2.next()).a(bhd2.k));
        }
        return jzb.a(new bja(jns.s(object).toArray(new jyx[0]), 1));
    }

    public final boolean K(bhd object) {
        jse.e(object, "workSpec");
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!((bff)t2).c((bhd)object)) continue;
            arrayList.add(t2);
        }
        if (!arrayList.isEmpty()) {
            bbi.a();
            long l2 = bfa.a;
            object = ((bhd)object).b;
            jns.D(arrayList, null, null, null, wl.i, 31);
        }
        return arrayList.isEmpty();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final avo L(String object) {
        String string = ((Object)jse.w((CharSequence)object)).toString();
        int n2 = string.length();
        Object object2 = this.a;
        if (n2 < 3) return new avn((awl)object2, (String)object);
        string = string.substring(0, 3);
        jse.d(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        string = string.toUpperCase(Locale.ROOT);
        jse.d(string, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        n2 = string.hashCode();
        if (n2 != 79487) {
            if (n2 != 81978) {
                if (n2 != 85954) return new avn((awl)object2, (String)object);
                if (string.equals("WIT")) return new avm((awl)object2, (String)object);
                return new avn((awl)object2, (String)object);
            } else if (string.equals("SEL")) return new avm((awl)object2, (String)object);
            return new avn((awl)object2, (String)object);
        } else {
            if (!string.equals("PRA")) return new avn((awl)object2, (String)object);
            return new avm((awl)object2, (String)object);
        }
    }

    public final void M(avp avp2) {
        Object object;
        jse.e(avp2, "migration");
        int n2 = avp2.a;
        int n3 = avp2.b;
        Integer n4 = n2;
        Object object2 = this.a;
        Object object3 = object = object2.get(n4);
        if (object == null) {
            object3 = new TreeMap();
            object2.put(n4, object3);
        }
        if ((object3 = (TreeMap)object3).containsKey(object2 = Integer.valueOf(n3))) {
            object = new StringBuilder("Overriding migration ");
            ((StringBuilder)object).append(((TreeMap)object3).get(object2));
            ((StringBuilder)object).append(" with ");
            ((StringBuilder)object).append(avp2);
            Log.w((String)"ROOM", (String)((StringBuilder)object).toString());
        }
        object3.put(object2, avp2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object N(jyy var1_1, jqb var2_2) {
        if (!(var2_2 instanceof auh)) ** GOTO lbl-1000
        var4_3 /* !! */  = (auh)var2_2;
        var3_4 = var4_3 /* !! */ .b;
        if ((var3_4 & -2147483648) != 0) {
            var4_3 /* !! */ .b = var3_4 + -2147483648;
            var2_2 = var4_3 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = new auh(this, var2_2);
        }
        var5_5 = var2_2.a;
        var4_3 /* !! */  = jqh.a;
        var3_4 = var2_2.b;
        if (var3_4 != 0) {
            if (var3_4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jns.ak(var5_5);
        } else {
            jns.ak(var5_5);
            var5_5 = this.a;
            var2_2.b = 1;
            if (((jzq)var5_5).a(var1_1, var2_2) == var4_3 /* !! */ ) {
                return var4_3 /* !! */ ;
            }
        }
        throw new jnx();
    }

    public final void O(akl akl2) {
        for (giu giu2 : (CopyOnWriteArrayList)this.a) {
            if (giu2.c != akl2) continue;
            giu2.a = true;
            ((CopyOnWriteArrayList)this.a).remove(giu2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final aek P(app var1_1, wd var2_2) {
        var2_2 = null;
        var5_3 = 0;
        while (true) {
            block19: {
                block17: {
                    block18: {
                        block22: {
                            block21: {
                                block20: {
                                    var1_1.h(((aga)this.a).a, 0, 10);
                                    ((aga)this.a).v(0);
                                    if (((aga)this.a).i() != 0x494433) break;
                                    ((aga)this.a).w(3);
                                    var3_4 = ((aga)this.a).g();
                                    var7_7 = var3_4 + 10;
                                    if (var2_2 != null) break block17;
                                    var2_2 = new byte[var7_7];
                                    System.arraycopy(((aga)this.a).a, 0, var2_2, 0, 10);
                                    var1_1.h((byte[])var2_2, 10, var3_4);
                                    var12_12 = new ArrayList<aqs>();
                                    var13_14 = new aga((byte[])var2_2, var7_7);
                                    var3_4 = var13_14.a();
                                    var11_11 = true;
                                    if (var3_4 < 10) {
                                        afx.e("Id3Decoder", "Data too short to be an ID3 tag");
lbl21:
                                        // 4 sources

                                        while (true) {
                                            var2_2 = null;
                                            break block18;
                                            break;
                                        }
                                    }
                                    var3_4 = var13_14.i();
                                    if (var3_4 == 0x494433) break block20;
                                    afx.e("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", new Object[]{var3_4}))));
                                    ** GOTO lbl21
                                }
                                var9_9 = var13_14.h();
                                var13_14.w(1);
                                var8_8 = var13_14.h();
                                var6_6 = var13_14.g();
                                if (var9_9 != 2) break block21;
                                var3_4 = var6_6;
                                if ((var8_8 & 64) == 0) ** GOTO lbl56
                                afx.e("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                ** GOTO lbl21
                            }
                            if (var9_9 != 3) break block22;
                            var3_4 = var6_6;
                            if ((var8_8 & 64) != 0) {
                                var3_4 = var13_14.c();
                                var13_14.w(var3_4);
                                var3_4 = var6_6 - (var3_4 + 4);
                            }
                            ** GOTO lbl56
                        }
                        if (var9_9 == 4) {
                            var4_5 = var6_6;
                            if ((var8_8 & 64) != 0) {
                                var3_4 = var13_14.g();
                                var13_14.w(var3_4 - 4);
                                var4_5 = var6_6 - var3_4;
                            }
                            var3_4 = var4_5;
                            if ((var8_8 & 16) != 0) {
                                var3_4 = var4_5 - 10;
                            }
lbl56:
                            // 5 sources

                            var10_10 = var9_9 < 4 && (var8_8 & 128) != 0;
                            var2_2 = new aqr(var9_9, var10_10, var3_4);
                        } else {
                            afx.e("Id3Decoder", a.af(var9_9, "Skipped ID3 tag with unsupported majorVersion="));
                            ** continue;
                        }
                    }
                    if (var2_2 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var2_2 = null;
                            break block19;
                            break;
                        }
                    }
                    var8_8 = var13_14.b;
                    var3_4 = var2_2.a == 2 ? 6 : 10;
                    var10_10 = var2_2.b;
                    var4_5 = var6_6 = var2_2.c;
                    if (var10_10) {
                        var4_5 = wd.o(var13_14, var6_6);
                    }
                    var13_14.u(var8_8 + var4_5);
                    if (wd.p(var13_14, var2_2.a, var3_4, false)) ** GOTO lbl83
                    if (var2_2.a == 4 && wd.p(var13_14, 4, var3_4, true)) {
                        var10_10 = var11_11;
                    } else {
                        var3_4 = var2_2.a;
                        var2_2 = new StringBuilder("Failed to validate ID3 tag with majorVersion=");
                        var2_2.append(var3_4);
                        afx.e("Id3Decoder", var2_2.toString());
                        ** continue;
lbl83:
                        // 1 sources

                        var10_10 = false;
                    }
                    while (var13_14.a() >= var3_4) {
                        var14_15 = wd.v(var2_2.a, var13_14, var10_10, var3_4, null);
                        if (var14_15 == null) continue;
                        var12_12.add(var14_15);
                    }
                    var2_2 = new aek(var12_12);
                    break block19;
                }
                var1_1.f(var3_4);
            }
            var5_3 += var7_7;
        }
lbl97:
        // 2 sources

        while (true) {
            var1_1.i();
            var1_1.f(var5_3);
            return var2_2;
        }
        catch (EOFException var12_13) {
            ** continue;
        }
    }

    public final ach Q(String string) {
        jse.e(string, "key");
        return (ach)this.a.get(string);
    }

    public final Set R() {
        return new HashSet(this.a.keySet());
    }

    public final void S() {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((ach)iterator.next()).g();
        }
        this.a.clear();
    }

    public final void T() {
        for (int i2 = jns.e((List)this.a); i2 >= 0; --i2) {
            ((yo)((ArrayList)this.a).get(i2)).a();
        }
    }

    public final void U() {
        View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void V(float f2) {
        View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void W(long l2) {
        View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().setDuration(l2);
        }
    }

    public final void X(wq wq2) {
        View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            if (wq2 != null) {
                view.animate().setListener((Animator.AnimatorListener)new wp(wq2));
                return;
            }
            view.animate().setListener(null);
        }
    }

    public final void Y(float f2) {
        View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }

    public final Object Z(Object object, Object object2) {
        jse.e(object2, "value");
        return ((LinkedHashMap)this.a).put(object, object2);
    }

    public final Map a() {
        HashMap<String, buc> hashMap = new HashMap<String, buc>();
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            buc buc2 = (buc)iterator.next();
            hashMap.put(buc2.c, buc2);
        }
        return hashMap;
    }

    public final boolean aa() {
        return ((LinkedHashMap)this.a).isEmpty();
    }

    public final by ab() {
        return ((bm)this.a).e;
    }

    public final void ac() {
        ((bm)this.a).e.p();
    }

    public final void ad() {
        ((bm)this.a).e.q();
    }

    public final void ae() {
        ((bm)this.a).e.w();
    }

    public final void af() {
        ((bm)this.a).e.y();
    }

    public final void ag() {
        ((bm)this.a).e.z();
    }

    public final void ah() {
        ((bm)this.a).e.B();
    }

    public final void ai() {
        ((bm)this.a).e.noteStateNotSaved();
    }

    public final void aj() {
        Object object = this.a;
        bm bm2 = (bm)object;
        bm2.e.k(bm2, (bj)object, null);
    }

    public final void ak() {
        ((bm)this.a).e.af(true);
    }

    public final void al(AmbientMode$AmbientController object) {
        View view = (View)((WeakReference)this.a).get();
        if (view != null) {
            object = object != null ? new wo((AmbientMode$AmbientController)object, 0) : null;
            view.animate().setUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        }
    }

    public final /* synthetic */ ecc b() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ecc)hwv2;
    }

    public final void c(String string) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ecc)hyg2.b;
        ecc ecc2 = ecc.a;
        ((ecc)hyg2).b |= 2;
        ((ecc)hyg2).d = string;
    }

    public final void d(ecb ecb2) {
        jse.e(ecb2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ecc)hyg2.b;
        ecc ecc2 = ecc.a;
        ((ecc)hyg2).c = ecb2.e;
        ((ecc)hyg2).b |= 1;
    }

    public final /* synthetic */ ebd e() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ebd)hwv2;
    }

    public final /* synthetic */ dzq f() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (dzq)hwv2;
    }

    public final void g(long l2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (dzq)hyg2.b;
        dzq dzq2 = dzq.a;
        ((dzq)hyg2).b |= 2;
        ((dzq)hyg2).d = l2;
    }

    public final void h(long l2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        dzq dzq2 = (dzq)hyg2.b;
        hyg2 = dzq.a;
        dzq2.b |= 1;
        dzq2.c = l2;
    }

    public final void i(dzr dzr2) {
        jse.e(dzr2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        dzq dzq2 = (dzq)hyg2.b;
        hyg2 = dzq.a;
        dzq2.e = dzr2.d;
        dzq2.b |= 4;
    }

    public final /* synthetic */ dzo j() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (dzo)hwv2;
    }

    public final /* synthetic */ dzs k() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (dzs)hwv2;
    }

    public final void l(dzo dzo2) {
        jse.e(dzo2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        dzs dzs2 = (dzs)hyg2.b;
        hyg2 = dzs.a;
        dzo2.getClass();
        dzs2.c = dzo2;
        dzs2.b = 4;
    }

    public final void m(dzq dzq2) {
        jse.e(dzq2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (dzs)hyg2.b;
        dzs dzs2 = dzs.a;
        dzq2.getClass();
        ((dzs)hyg2).c = dzq2;
        ((dzs)hyg2).b = 1;
    }

    public final /* synthetic */ eaf n() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eaf)hwv2;
    }

    public final void o(long l2) {
        Object object = this.a;
        hyg hyg2 = (hwp)object;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        object = (eaf)((hwr)object).b;
        hyg2 = eaf.a;
        ((eaf)object).b |= 1;
        ((eaf)object).c = l2;
    }

    public final /* synthetic */ ebt p() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ebt)hwv2;
    }

    public final void q(ebs ebs2) {
        jse.e(ebs2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ebt)hyg2.b;
        ebt ebt2 = ebt.a;
        ((ebt)hyg2).c = ebs2.ai;
        ((ebt)hyg2).b = 2;
    }

    public final void r(ebu ebu2) {
        jse.e(ebu2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ebt ebt2 = (ebt)hyg2.b;
        hyg2 = ebt.a;
        ebt2.c = ebu2.e;
        ebt2.b = 1;
    }

    public final /* synthetic */ ebq s() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (ebq)hwv2;
    }

    public final void t(ebp ebp2) {
        jse.e(ebp2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (ebq)hyg2.b;
        ebq ebq2 = ebq.a;
        ((ebq)hyg2).c = ebp2.M;
        ((ebq)hyg2).b = 2;
    }

    public final void u(ebr ebr2) {
        jse.e(ebr2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        ebq ebq2 = (ebq)hyg2.b;
        hyg2 = ebq.a;
        ebq2.c = ebr2.d;
        ebq2.b = 1;
    }

    public final /* synthetic */ geq v() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (geq)hwv2;
    }

    public final hpn w(gda gda2) {
        fxf.K(gda2);
        return this.a;
    }

    public final ewg x(eip eip2, hpn hpn2, hpn hpn3, eae eae2, int n2) {
        fpo fpo2 = (fpo)this.a;
        return new ewg((jvb)fpo2.f.b(), (Executor)fpo2.d.b(), (Executor)fpo2.a.b(), (evu)fpo2.e.b(), ((emh)fpo2.c).a(), ((ims)fpo2.b).a(), eip2, hpn2, hpn3, eae2, n2);
    }

    public final /* synthetic */ euo y() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (euo)hwv2;
    }

    public final /* synthetic */ esl z() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (esl)hwv2;
    }
}

