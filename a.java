/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorInflater
 *  android.content.ContentProviderClient
 *  android.content.Context
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.Base64
 *  android.util.SparseIntArray
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 */
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.ContentProviderClient;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class a {
    public a() {
    }

    public a(char[] cArray) {
    }

    public static /* synthetic */ int A(int n2) {
        return n2 - 2;
    }

    public static /* synthetic */ int B(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public static /* synthetic */ int C(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public static /* synthetic */ int D(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public static /* synthetic */ void E(int n2) {
        if (n2 != 0) {
            return;
        }
        throw null;
    }

    public static /* synthetic */ int F(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                return 0;
                            }
                            return 6;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ boolean G(int n2) {
        return a.w(n2) != 0;
    }

    public static /* synthetic */ boolean H(int n2) {
        return a.v(n2) != 0;
    }

    public static /* synthetic */ boolean I(int n2) {
        return a.t(n2) != 0;
    }

    public static /* synthetic */ boolean J(int n2) {
        return a.F(n2) != 0;
    }

    public static /* synthetic */ boolean K(int n2) {
        return a.u(n2) != 0;
    }

    public static /* synthetic */ void L(int n2) {
        if (n2 != 0) {
            return;
        }
        throw null;
    }

    public static Object M(Bundle bundle, String string, Class clazz) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a$$ExternalSyntheticApiModelOutline0.m(bundle, string, clazz);
        }
        if (clazz.isInstance(bundle = bundle.getParcelable(string))) {
            return bundle;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static cx N(int n2) {
        if (n2 == 0) return cx.b;
        if (n2 == 4) return cx.d;
        if (n2 != 8) throw new IllegalArgumentException(a.af(n2, "Unknown visibility "));
        return cx.c;
    }

    public static cx O(View object) {
        jse.e(object, "<this>");
        object = object.getAlpha() == 0.0f && object.getVisibility() == 0 ? cx.d : a.N(object.getVisibility());
        return object;
    }

    public static cz P(ViewGroup viewGroup, a object) {
        jse.e(viewGroup, "container");
        jse.e(object, "factory");
        object = viewGroup.getTag(2131427887);
        if (object instanceof cz) {
            return (cz)object;
        }
        jse.e(viewGroup, "container");
        object = new cz(viewGroup);
        viewGroup.setTag(2131427887, object);
        return object;
    }

    public static uz Q(uu uu2) {
        return uu2.a();
    }

    public static void X(int n2) {
        if (n2 >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void Y(Object object) {
        object.getClass();
    }

    public static Object Z(ExecutorService object, Callable callable, int n2) {
        object = object.submit(callable);
        long l2 = n2;
        try {
            object = object.get(l2, TimeUnit.MILLISECONDS);
            return object;
        }
        catch (TimeoutException timeoutException) {
            throw new InterruptedException("timeout");
        }
        catch (InterruptedException interruptedException) {
            throw interruptedException;
        }
        catch (ExecutionException executionException) {
            throw new RuntimeException(executionException);
        }
    }

    public static /* synthetic */ String a(int n2) {
        switch (n2) {
            default: {
                return "CENTER_Y";
            }
            case 8: {
                return "CENTER_X";
            }
            case 7: {
                return "CENTER";
            }
            case 6: {
                return "BASELINE";
            }
            case 5: {
                return "BOTTOM";
            }
            case 4: {
                return "RIGHT";
            }
            case 3: {
                return "TOP";
            }
            case 2: 
        }
        return "LEFT";
    }

    public static uh[] aa(List list) {
        return (uh[])list.get(0);
    }

    public static /* synthetic */ List ab(Object[] objectArray) {
        ArrayList<Object> arrayList = new ArrayList<Object>(1);
        arrayList.add(Objects.requireNonNull(objectArray[0]));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static void ac(ContentProviderClient contentProviderClient) {
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    /*
     * Unable to fully structure code
     */
    public static awg ad(Context var0, be var1_2, boolean var2_5, boolean var3_6) {
        block19: {
            block17: {
                block18: {
                    var7_7 = var1_2.S;
                    var6_8 = 0;
                    var5_9 = var7_7 == null ? 0 : var7_7.f;
                    if (!var3_6) break block17;
                    if (!var2_5) break block18;
                    var4_10 = var1_2.i();
                    ** GOTO lbl14
                }
                var4_10 = var1_2.j();
                ** GOTO lbl17
            }
            if (var2_5) {
                var4_10 = var1_2.g();
lbl14:
                // 2 sources

                var2_5 = true;
            } else {
                var4_10 = var1_2.h();
lbl17:
                // 2 sources

                var2_5 = false;
            }
            var1_2.s(0, 0, 0, 0);
            var7_7 = var1_2.O;
            if (var7_7 != null && var7_7.getTag(2131428014) != null) {
                var1_2.O.setTag(2131428014, null);
            }
            if ((var7_7 = var1_2.O) != null && var7_7.getLayoutTransition() != null) {
                return null;
            }
            var1_2.onCreateAnimation(var5_9, var2_5, var4_10);
            var1_2.onCreateAnimator(var5_9, var2_5, var4_10);
            if (var4_10 == 0) {
                var4_10 = var6_8;
                if (var5_9 != 0) {
                    var4_10 = var5_9 != 4097 ? (var5_9 != 8194 ? (var5_9 != 8197 ? (var5_9 != 4099 ? (var5_9 != 4100 ? -1 : (var2_5 ? a.ay(var0, 16842936) : a.ay(var0, 16842937))) : (!var2_5 ? 2130837510 : 2130837509)) : (var2_5 ? a.ay(var0, 16842938) : a.ay(var0, 0x10100BB))) : (!var2_5 ? 2130837508 : 2130837507)) : (true != var2_5 ? 2130837512 : 2130837511);
                }
            }
            if (var4_10 == 0) ** GOTO lbl57
            var2_5 = "anim".equals(var0.getResources().getResourceTypeName(var4_10));
            if (!var2_5) break block19;
            var1_2 = AnimationUtils.loadAnimation((Context)var0, (int)var4_10);
            if (var1_2 == null) ** GOTO lbl57
            var1_2 = new awg((Animation)var1_2);
            return var1_2;
        }
lbl44:
        // 2 sources

        while (true) {
            block16: {
                var1_2 = AnimatorInflater.loadAnimator((Context)var0, (int)var4_10);
                if (var1_2 == null) break block16;
                try {
                    var1_2 = new awg((Animator)var1_2);
                    return var1_2;
                }
                catch (RuntimeException var1_3) {
                    if (!var2_5) {
                        if ((var0 = AnimationUtils.loadAnimation((Context)var0, (int)var4_10)) != null) {
                            return new awg((Animation)var0);
                        }
                        break block16;
                    }
                    throw var1_3;
                }
            }
            return null;
        }
        catch (RuntimeException var1_4) {
            ** continue;
        }
    }

    public static /* synthetic */ String af(int n2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ag(int n2, String string, SparseIntArray sparseIntArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(Integer.toHexString(n2));
        stringBuilder.append("   ");
        stringBuilder.append(sparseIntArray.get(n2));
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ah(int n2, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(n2);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ai(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String aj(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ak(Object object, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(object);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String al(String string, AttributeSet attributeSet, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(attributeSet.getPositionDescription());
        stringBuilder.append(string2);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String am(Object object, Object object2, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(object2);
        stringBuilder.append(string2);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String an(int n2, int n3, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ao(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ap(long l2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String aq(String string, String string2, String string3, String string4, String string5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        stringBuilder.append(string4);
        stringBuilder.append(string);
        stringBuilder.append(string5);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ar(Object object, String string, String string2) {
        String string3 = object.toString();
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    public static /* synthetic */ void as(hew hew2, String string, String string2, String string3, char c2, String string4, Throwable throwable) {
        ((heg)((heg)((heg)hew2).i(throwable)).j(string2, string3, c2, string4)).r(string);
    }

    public static /* synthetic */ String at(Object object, Class object2, String string) {
        object2 = object2.toString();
        object = String.valueOf(object.getClass());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append((String)object2);
        stringBuilder.append(", but the wrapper available is of type: ");
        stringBuilder.append((String)object);
        stringBuilder.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
        return stringBuilder.toString();
    }

    public static /* synthetic */ String au(bh object, Class object2) {
        object2 = object2.toString();
        object = String.valueOf(object.getClass());
        StringBuilder stringBuilder = new StringBuilder("Attempt to inject a Activity wrapper of type ");
        stringBuilder.append((String)object2);
        stringBuilder.append(", but the wrapper available is of type: ");
        stringBuilder.append((String)object);
        stringBuilder.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
        return stringBuilder.toString();
    }

    public static /* synthetic */ String av(Object object, String string, String string2) {
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String aw(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String ax(Object object, String string, String string2) {
        String string3 = object.getClass().getName();
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    private static int ay(Context context, int n2) {
        context = context.obtainStyledAttributes(0x1030001, new int[]{n2});
        n2 = context.getResourceId(0, -1);
        context.recycle();
        return n2;
    }

    public static /* synthetic */ void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean d() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ PorterDuff.Mode e(int n2, PorterDuff.Mode mode) {
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 9) {
                    switch (n2) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static /* synthetic */ int f(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static /* synthetic */ boolean g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object object, Object object2, Object object3) {
        do {
            if (!atomicReferenceFieldUpdater.compareAndSet(object, object2, object3)) continue;
            return true;
        } while (atomicReferenceFieldUpdater.get(object) == object2);
        return false;
    }

    public static /* synthetic */ Object h(Future future) {
        boolean bl2 = false;
        while (true) {
            try {
                Object v2 = future.get();
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
                return v2;
            }
            catch (Throwable throwable) {
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
                throw throwable;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
    }

    public static /* synthetic */ boolean i(AtomicReference atomicReference, Object object) {
        do {
            if (!atomicReference.compareAndSet(null, object)) continue;
            return true;
        } while (atomicReference.get() == null);
        return false;
    }

    public static /* synthetic */ void j(boolean bl2) {
        if (!bl2) {
            return;
        }
        throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ boolean k(Object object, Object object2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (object == object2) return bl3;
        if (object == null) return false;
        if (!object.equals(object2)) return false;
        return bl2;
    }

    public static /* synthetic */ boolean l(AtomicReference atomicReference, Object object, Object object2) {
        do {
            if (!atomicReference.compareAndSet(object, object2)) continue;
            return true;
        } while (atomicReference.get() == object);
        return false;
    }

    public static /* synthetic */ Set m(gto serializable, jnu jnu2) {
        serializable = serializable.g() ? new hdq((dmw)jnu2.b()) : hdc.a;
        return serializable;
    }

    public static /* synthetic */ hpn n(jrk jrk2, Object object) {
        return (hpn)jrk2.a(object);
    }

    public static /* synthetic */ iaz o(int n2) {
        iaz iaz2;
        iaz iaz3 = iaz2 = iaz.b(n2);
        if (iaz2 == null) {
            iaz3 = iaz.a;
        }
        return iaz3;
    }

    public static /* synthetic */ hyf p() {
        try {
            byte[] byArray = Base64.decode((String)"CAU", (int)3);
            hwv hwv2 = hwg.a;
            int n2 = byArray.length;
            Object object = hwj.a;
            object = hyo.a;
            hwv2 = hwv.o(hwv2, byArray, 0, n2, hwj.a);
            hwv.D(hwv2);
            return hwv2;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ Set q() {
        return hav.s("ANDROID_GSA", "ANDROID_GSA_HIGH_PRIORITY_EVENTS", "AGSA_LEGACY", "AGSA_GOOGLE_APP", "AGSA_NIU", "AGSA_ASSISTANT", "AGSA_LENS", "AGSA_SOUND_SEARCH", "AGSA_ASSISTANT_AUTO", "AGSA_PRONUNCIATION_LEARNING", "AGSA_WEATHER", "AGSA_FACEVIEWER", "AGSA_SCENEVIEWER", "AGSA_MORRIS", "AGSA_LINGO_CAMERA", "AGSA_HOTWORD_LIBRARY", "AGSA_PODCASTS", "AGSA_WEBGLIDE", "AGSA_FEDORA", "AGSA_KAHANI", "AGSA_APA", "AGSA_ASSISTANT_TITAN_TNG", "AGSA_PROACTIVE_ASSISTANT", "AGSA_READ", "AGSA_QUICK_PHRASES", "AGSA_BISTO", "AGSA_INTERPRETER_MODE", "AGSA_INFRASTRUCTURE", "AGSA_TRANSCRIPTION", "AGSA_ASSISTANT_INTERACTOR", "AGSA_RESTRICTED", "AGSA_XBLEND", "AGSA_OMNI", "AGSA_IN_APP_UPDATE_ANDROID", "AGSA_TNG_FINANCE_WIDGET", "ROBIN_ANDROID", "ROBIN_ANDROID_PSEUDO", "AGSA_SEARCH_VIDEO_ANDROID", "AUDIO_LIBRARY_ANDROID", "FEDASS_LOGS", "AGSA_TNG_SPORTS_WIDGET", "AGSA_MDD_ANDROID", "AGSA_SEARCH_XR", "AGSA_HOTWORD_LIBRARY_ANDROID", "AGSA_OMNI_XR", "AGSA_SEAPORT_LIBRARY_ANDROID", "AGSA_GELLER", "ANDROID_GSA_COUNTERS", "AGSA_GOOGLE_APP_COUNTERS", "AGSA_LENS_COUNTERS", "AGSA_INFRASTRUCTURE_COUNTERS", "FEDASS_COUNTERS", "ANDROID_GSA_ANDROID_PRIMES", "CLIENT_LOGGING_PROD", "CRONET_ANDROID_GSA", "ONEGOOGLE_MOBILE", "PHENOTYPE", "SILK_NATIVE", "SODA_CLEARCUT", "STREAMZ_ANDROID_ASSISTANT", "STREAMZ_ANDROID_GSA", "STREAMZ_GELLER_LIBRARY", "STREAMZ_HUBMODE_GSA", "STREAMZ_LENS_ANDROID", "STREAMZ_MOBILE_ASSISTANT", "STREAMZ_OPA_PROACTIVE", "STREAMZ_SODA");
    }

    public static /* synthetic */ void r(Object object, String string) {
        if (object != null) {
            return;
        }
        throw new NullPointerException(string);
    }

    public static /* synthetic */ void s(Object object, Object object2) {
        if (object != null) {
            return;
        }
        throw new NullPointerException((String)object2);
    }

    public static /* synthetic */ int t(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int u(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return 0;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int v(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int w(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return 0;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int x(int n2) {
        return n2 - 1;
    }

    public static /* synthetic */ int y(int n2) {
        if (n2 != 0) {
            int n3 = 1;
            if (n2 != 1) {
                n3 = 2;
                if (n2 != 2) {
                    n3 = 3;
                    if (n2 != 3) {
                        n3 = 4;
                        if (n2 != 4) {
                            n3 = 5;
                            if (n2 != 5) {
                                return 0;
                            }
                        }
                    }
                }
            }
            return n3;
        }
        return 6;
    }

    public static /* synthetic */ int z(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public View R(MenuItem menuItem) {
        throw null;
    }

    public void S(SubMenu subMenu) {
        throw null;
    }

    public boolean T() {
        throw null;
    }

    public boolean U() {
        throw null;
    }

    public boolean V() {
        throw null;
    }

    public boolean W() {
        throw null;
    }

    public void ae(AmbientMode.AmbientController ambientController) {
        throw null;
    }
}

