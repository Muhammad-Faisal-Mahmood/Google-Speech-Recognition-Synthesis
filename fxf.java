/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  gqv
 *  hom
 */
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class fxf {
    public fxf() {
    }

    public fxf(byte[] byArray) {
    }

    public static void A(boolean bl2) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void B(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException((String)object);
    }

    public static void C(boolean bl2, String string, int n2) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(fvd.aq(string, n2));
    }

    public static void D(boolean bl2, String string, long l2) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(fvd.aq(string, l2));
    }

    public static void E(boolean bl2, String string, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(fvd.aq(string, object));
    }

    public static void F(boolean bl2, String string, int n2, int n3) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(fvd.aq(string, n2, n3));
    }

    public static void G(boolean bl2, String string, Object object, Object object2) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(fvd.aq(string, object, object2));
    }

    public static void H(boolean bl2, String string, Object object, Object object2, Object object3) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(fvd.aq(string, object, object2, object3));
    }

    public static void I(boolean bl2, long l2, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq("duration cannot be negative: %s %s", l2, object));
    }

    public static void J(int n2, int n3) {
        String string;
        if (n2 >= 0 && n2 < n3) {
            return;
        }
        if (n2 >= 0) {
            if (n3 < 0) {
                throw new IllegalArgumentException(a.af(n3, "negative size: "));
            }
            string = fvd.aq("%s (%s) must be less than size (%s)", "index", n2, n3);
        } else {
            string = fvd.aq("%s (%s) must not be negative", "index", n2);
        }
        throw new IndexOutOfBoundsException(string);
    }

    public static void K(Object object) {
        object.getClass();
    }

    public static void L(Object object, String string, Object object2) {
        if (object != null) {
            return;
        }
        throw new NullPointerException(fvd.aq(string, object2));
    }

    public static void M(int n2, int n3) {
        if (n2 >= 0 && n2 <= n3) {
            return;
        }
        throw new IndexOutOfBoundsException(fxf.aG(n2, n3, "index"));
    }

    public static String N(String string) {
        String string2 = string;
        if (fxf.P(string)) {
            string2 = null;
        }
        return string2;
    }

    public static String O(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public static boolean P(String string) {
        return string == null || string.isEmpty();
        {
        }
    }

    public static gtn Q(Class clazz) {
        return new gtn(clazz.getSimpleName());
    }

    public static gtn R(Object object) {
        return new gtn(object.getClass().getSimpleName());
    }

    public static Object S(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        if (object2 != null) {
            return object2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static String T(String object) {
        int n2 = ((String)object).length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!fxf.X(((String)object).charAt(i2))) continue;
            object = ((String)object).toCharArray();
            while (i2 < n2) {
                Object object2 = object[i2];
                if (fxf.X((char)object2)) {
                    object[i2] = (char)(object2 ^ 0x20);
                }
                ++i2;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }

    public static String U(String object) {
        int n2 = ((String)object).length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!fxf.W(((String)object).charAt(i2))) continue;
            object = ((String)object).toCharArray();
            while (i2 < n2) {
                Object object2 = object[i2];
                if (fxf.W((char)object2)) {
                    object[i2] = (char)(object2 ^ 0x20);
                }
                ++i2;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }

    public static boolean V(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (n2 == charSequence2.length()) {
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3;
                char c2;
                char c3 = charSequence.charAt(i2);
                if (c3 == (c2 = charSequence2.charAt(i2)) || (n3 = fxf.aH(c3)) < 26 && n3 == fxf.aH(c2)) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean W(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean X(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static void Y(Context context) {
        ((grw)fvd.l(context, grw.class)).H();
    }

    public static void Z(Context context) {
        ((grw)fvd.l(context, grw.class)).H();
    }

    public static /* synthetic */ gqt aA(fxf fxf2, boolean bl2, int n2) {
        if ((n2 & 1) != 0) {
            fxf2 = new fxf();
        }
        n2 = (n2 & 4) != 0 ? 0 : 1;
        return new gqt(fxf2, false, false, (bl2 & n2) != 0);
    }

    public static cxt aB(Iterable iterable) {
        return new cxt(hhk.Y(iterable));
    }

    @SafeVarargs
    public static cxt aC(hpn ... hpnArray) {
        return new cxt(hhk.Z(hpnArray));
    }

    public static cxt aD(Iterable iterable) {
        return new cxt(hhk.aa(iterable));
    }

    @SafeVarargs
    public static cxt aE(hpn ... hpnArray) {
        return new cxt(hhk.ab(hpnArray));
    }

    @SafeVarargs
    public static cxt aF(hpn ... hpnArray) {
        return new cxt(fxf.aE(hpnArray));
    }

    private static String aG(int n2, int n3, String string) {
        if (n2 < 0) {
            return fvd.aq("%s (%s) must not be negative", string, n2);
        }
        if (n3 >= 0) {
            return fvd.aq("%s (%s) must not be greater than size (%s)", string, n2, n3);
        }
        throw new IllegalArgumentException(a.af(n3, "negative size: "));
    }

    private static int aH(char c2) {
        return (char)((c2 | 0x20) - 97);
    }

    public static View aa(at at2) {
        View view = at2.P;
        if (view == null) {
            at2 = at2.c;
            if (at2 != null) {
                return at2.findViewById(0x1020002);
            }
            return null;
        }
        return view;
    }

    public static void ab(at at2) {
        fxf.ac(at2);
        View view = fxf.aa(at2);
        be be2 = at2.D;
        at2 = be2 == null ? at2.getActivity().findViewById(0x1020002) : (be2 instanceof at ? fxf.aa((at)be2) : be2.P);
        fxf.K(view);
        view.setTag(2131427949, (Object)at2);
    }

    public static void ac(at at2) {
        if (at2.b && fxf.aa(at2) == null) {
            throw new IllegalStateException("DialogFragment is being used as a dialog. Must return a valid view in onCreateView() or a valid Dialog in onCreateDialog().");
        }
        if (!at2.b && at2.P == null) {
            throw new IllegalStateException("DialogFragment not being used as a dialog. Must return a valid view in onCreateView() -- onCreateDialog() is not called.");
        }
    }

    public static long ad(gqm gqm2) {
        long l2;
        long l3 = l2 = (gqm2.c ^ gqm2.d) & Long.MAX_VALUE;
        if (l2 == 0L) {
            l3 = 1L;
        }
        return l3;
    }

    public static hpn ae(hpn hpn2, Class clazz, gte gte2, Executor executor) {
        return hmv.f(hpn2, clazz, gqk.b(gte2), executor);
    }

    public static hpn af(hpn hpn2, Class clazz, hny hny2, Executor executor) {
        return hmv.g(hpn2, clazz, gqk.d(hny2), executor);
    }

    public static hpn ag(Runnable runnable, Executor executor) {
        return hhk.N(gqk.i(runnable), executor);
    }

    public static hpn ah(Callable callable, Executor executor) {
        return hhk.O(gqk.j(callable), executor);
    }

    public static hpn ai(hnx hnx2, Executor executor) {
        return hhk.P(gqk.c(hnx2), executor);
    }

    public static hpn aj(hpn hpn2, gte gte2, Executor executor) {
        return hno.f(hpn2, gqk.b(gte2), executor);
    }

    public static hpn ak(hpn hpn2, hny hny2, Executor executor) {
        return hno.g(hpn2, gqk.d(hny2), executor);
    }

    public static void al(hpn hpn2, hpb hpb2, Executor executor) {
        hhk.T(hpn2, gqk.g(hpb2), executor);
    }

    public static hpn am(hpn hpn2, Callable callable, Executor executor) {
        return fvd.d(hpn2, gqk.j(callable), executor);
    }

    public static hpn an(hpn hpn2, hnx object, Executor executor) {
        object = hhk.P(new gqg(gqk.c((hnx)object), hpn2, 1), new gaj((Object)hpn2, executor, 2));
        fvd.e(hpn2, (hpn)object);
        return object;
    }

    public static grf ao(Callable callable, Executor executor) {
        return fxf.ap(new grg(callable, 0), executor);
    }

    public static grf ap(hnx hnx2, Executor executor) {
        return grf.g(fxf.ai(hnx2, executor));
    }

    public static gol aq(String string) {
        return fxf.as(string, gqv.a);
    }

    public static gol ar(String string, gop gop2) {
        return fxf.at(string, gqv.a, gop2);
    }

    public static gol as(String string, gqv gqv2) {
        return fxf.at(string, gqv2, goo.a);
    }

    public static gol at(String string, gqv gqv2, gop gop2) {
        return fxf.au(string, gqv2, gop2, true);
    }

    public static gol au(String object, gqv object2, gop gop2, boolean bl2) {
        boolean bl3;
        fxf.K(object2);
        goz goz2 = gno.a();
        object2 = goz2.c;
        if (object2 == goj.a) {
            object2 = null;
            gno.f(goz2, null);
            bl3 = true;
        } else {
            bl3 = false;
        }
        if (object2 == null) {
            object2 = new gnx((String)object, gop2, bl2, goz2);
            if (object2.a) {
                object = object2;
            } else {
                object = object2;
                if (bl2) {
                    gno.u();
                    object = object2;
                }
            }
        } else {
            object = object2 instanceof gnd ? ((gnd)object2).f((String)object, gop2, bl2, goz2) : object2.m((String)object, gop2, goz2);
        }
        gno.f(goz2, (gpc)object);
        return new gol((gpc)object, bl3);
    }

    public static void av() {
        gno.v(false);
    }

    public static boolean aw(gqv gqv2) {
        fxf.K(gqv2);
        return gno.r();
    }

    public static boolean ax(gpc gpc2) {
        return !(gpc2 == null || gpc2 instanceof gnd || gpc2 instanceof gny || gpc2 instanceof goj || gpc2 instanceof goc);
        {
        }
    }

    public static jqf ay(jqf jqf2) {
        jqf2.minusKey(gqt.a);
        jqf2.get(gqt.a);
        gqt gqt2 = fxf.aA(new fxf(), true, 2);
        jqf2.plus(gqt2);
        return gqt2;
    }

    public static gom az(fxf fxf2) {
        gom gom2;
        gpc gpc2 = gno.b();
        gom gom3 = gom.d(2);
        while (true) {
            gom2 = gom3;
            if (gpc2 == null) break;
            gom2 = gom3 = gpc2.j(fxf2);
            if (gom3.c() - 1 == 0) break;
            gpc2 = gpc2.a();
        }
        return gom2;
    }

    public static void b(View view, float f2) {
        if ((view = view.getBackground()) instanceof fxi) {
            ((fxi)view).k(f2);
        }
    }

    public static void c(View view) {
        Drawable drawable = view.getBackground();
        if (drawable instanceof fxi) {
            fxf.d(view, (fxi)drawable);
        }
    }

    public static void d(View object, fxi fxi2) {
        fve fve2 = fxi2.a.b;
        if (fve2 != null && fve2.a) {
            object = object.getParent();
            float f2 = 0.0f;
            while (object instanceof View) {
                f2 += wa.a(object);
                object = object.getParent();
            }
            object = fxi2.a;
            if (object.n != f2) {
                object.n = f2;
                fxi2.p();
            }
        }
    }

    public static fxf e(int n2) {
        if (n2 != 1) {
            return new fxl();
        }
        return new fxe();
    }

    public static hpn f(hpn hpn2) {
        return fxf.aj(hpn2, new fiz(9), (Executor)hom.a);
    }

    public static hpn g(gcp gcp2, String string, int n2, bmu bmu2) {
        return gcp2.c(string, n2, Collections.singletonList(bmu2));
    }

    public static hpn h() {
        return hhk.J(new UnsupportedOperationException("A NoAccountWorker or AccountWorker used by a TikTokWorkSpec with setExpedited() must override getForegroundInfoAsync() in order to support API levels < 31."));
    }

    public static gpm i(Context context) {
        return ((gpp)idi.e(context, gpp.class)).c();
    }

    public static gpm j(Context context) {
        return ((gpq)idi.e(context, gpq.class)).c();
    }

    public static Set k(Context context) {
        return ((gpq)idi.e(context, gpq.class)).d();
    }

    public static gpc l(Intent intent) {
        long l2 = gqk.a;
        jse.e(gqv.a, "restricted");
        return gqk.n(intent, false);
    }

    public static gpf m(Service service, String string) {
        fpk.c();
        return fxf.j((Context)service).d(string);
    }

    public static void n(Collection collection, Set set) {
        set.addAll(collection);
    }

    public static String o(Context object) {
        int n2 = ((String)(object = dww.a((Context)object))).indexOf(58);
        object = n2 == -1 ? "" : ((String)object).substring(n2 + 1);
        return object;
    }

    public static Context p(Context context, Class ... classArray) {
        block0: while (context instanceof ContextWrapper) {
            int n2 = classArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (classArray[i2].isInstance(context)) break block0;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return context;
    }

    public static void q(boolean bl2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void r(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException((String)object);
    }

    public static void s(boolean bl2, String string, char c2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq(string, Character.valueOf(c2)));
    }

    public static void t(boolean bl2, String string, int n2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq(string, n2));
    }

    public static void u(boolean bl2, String string, long l2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq(string, l2));
    }

    public static void v(boolean bl2, String string, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq(string, object));
    }

    public static void w(boolean bl2, String string, int n2, int n3) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq(string, n2, n3));
    }

    public static void x(boolean bl2, String string, Object object, int n2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq(string, object, n2));
    }

    public static void y(boolean bl2, String string, Object object, Object object2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(fvd.aq(string, object, object2));
    }

    public static void z(int n2, int n3, int n4) {
        if (n2 >= 0 && n3 >= n2 && n3 <= n4) {
            return;
        }
        String string = n2 >= 0 && n2 <= n4 ? (n3 >= 0 && n3 <= n4 ? fvd.aq("end index (%s) must not be less than start index (%s)", n3, n2) : fxf.aG(n3, n4, "end index")) : fxf.aG(n2, n4, "start index");
        throw new IndexOutOfBoundsException(string);
    }

    public void a(fxw fxw2, float f2, float f3) {
    }
}

