/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.app.Application
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.graphics.Outline
 *  android.graphics.Path
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.system.Os
 *  android.system.StructStat
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.animation.AnimationUtils
 *  android.view.animation.PathInterpolator
 *  hom
 */
import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Duration;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

public class fvc {
    public static Thread e;

    public fvc() {
        throw null;
    }

    public fvc(byte[] byArray) {
    }

    public fvc(short[] sArray) {
    }

    public static gex A(double d2) {
        return new gex(new gev(d2), ger.c);
    }

    public static gex B(long l2) {
        return new gex(new gew(l2), ger.a);
    }

    public static gex C(jqz jqz2, hyf hyf2) {
        jse.e(hyf2, "defaultInstance");
        return new gex(jqz2, ger.f, hyf2);
    }

    public static gex D(String string) {
        jse.e(string, "value");
        return new gex(new jtp(string, 1), ger.d);
    }

    public static void E(AnimatorSet animatorSet, List list) {
        Animator animator;
        int n2 = list.size();
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            animator = (Animator)list.get(i2);
            l2 = Math.max(l2, animator.getStartDelay() + animator.getDuration());
        }
        animator = ValueAnimator.ofInt((int[])new int[]{0, 0});
        animator.setDuration(l2);
        list.add(0, animator);
        animatorSet.playTogether((Collection)list);
    }

    public static Uri F(Uri uri, String string) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(string)).build();
    }

    public static hpn G(hpn hpn2) {
        return hno.f(hpn2, new gtf(), (Executor)hom.a);
    }

    public static void H(boolean bl2, String string, Object ... objectArray) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException(String.format(string, objectArray));
    }

    public static File I(Uri uri) {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty((CharSequence)uri.getQuery())) {
                if (TextUtils.isEmpty((CharSequence)uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new fpz("Did not expect uri to have authority");
            }
            throw new fpz("Did not expect uri to have query");
        }
        throw new fpz("Scheme must be 'file'");
    }

    public static Uri J(Uri.Builder builder, gzs gzs2) {
        return builder.encodedFragment(fqh.a(gzs2.g())).build();
    }

    public static Uri K(String string, String object, long l2) {
        Uri.Builder builder = new Uri.Builder().scheme("blobstore").authority((String)object).path(string);
        if (fpu.a(string)) {
            object = string;
            if (string.startsWith("/")) {
                object = string.substring(1);
            }
            if (!TextUtils.equals((CharSequence)object, (CharSequence)"*.lease")) {
                builder.appendQueryParameter("expiryDateSecs", String.valueOf(l2));
            }
        }
        if ((object = (string = builder.build()).getPathSegments()).size() == 1 && (fpu.a.g((CharSequence)(object = (String)object.get(0))).size() == 1 || fpu.a((String)object) && !TextUtils.equals((CharSequence)object, (CharSequence)".lease"))) {
            if (TextUtils.isEmpty((CharSequence)string.getQuery()) || string.getQueryParameterNames().size() == 1 && string.getQueryParameter("expiryDateSecs") != null) {
                return string;
            }
            throw new fpz(String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", string.getQuery()));
        }
        throw new fpz(String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", string.getPath()));
    }

    public static File L(Uri object, Context context) {
        block11: {
            block12: {
                block13: {
                    ArrayList arrayList;
                    block21: {
                        block15: {
                            block16: {
                                block17: {
                                    block18: {
                                        block19: {
                                            block20: {
                                                int n2;
                                                block14: {
                                                    if (!object.getScheme().equals("android")) break block11;
                                                    if (object.getPathSegments().isEmpty()) break block12;
                                                    if (!TextUtils.isEmpty((CharSequence)object.getQuery())) break block13;
                                                    arrayList = new ArrayList(object.getPathSegments());
                                                    String string = (String)arrayList.get(0);
                                                    switch (string.hashCode()) {
                                                        default: {
                                                            break;
                                                        }
                                                        case 991565957: {
                                                            if (!string.equals("directboot-files")) break;
                                                            n2 = 0;
                                                            break block14;
                                                        }
                                                        case 988548496: {
                                                            if (!string.equals("directboot-cache")) break;
                                                            n2 = 1;
                                                            break block14;
                                                        }
                                                        case 835260319: {
                                                            if (!string.equals("managed")) break;
                                                            n2 = 4;
                                                            break block14;
                                                        }
                                                        case 97434231: {
                                                            if (!string.equals("files")) break;
                                                            n2 = 2;
                                                            break block14;
                                                        }
                                                        case 94416770: {
                                                            if (!string.equals("cache")) break;
                                                            n2 = 3;
                                                            break block14;
                                                        }
                                                        case -1820761141: {
                                                            if (!string.equals("external")) break;
                                                            n2 = 5;
                                                            break block14;
                                                        }
                                                    }
                                                    n2 = -1;
                                                }
                                                if (n2 == 0) break block15;
                                                if (n2 == 1) break block16;
                                                if (n2 == 2) break block17;
                                                if (n2 == 3) break block18;
                                                if (n2 == 4) break block19;
                                                if (n2 != 5) break block20;
                                                object = context.getExternalFilesDir(null);
                                                break block21;
                                            }
                                            throw new fpz(String.format("Path must start with a valid logical location: %s", object));
                                        }
                                        object = new File(fvc.N(context), "managed");
                                        if (arrayList.size() < 3) break block21;
                                        try {
                                            context = fpq.a((String)arrayList.get(2));
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw new fpz(illegalArgumentException);
                                        }
                                        if (!fpq.c((Account)context)) {
                                            throw new fpz("AccountManager cannot be null");
                                        }
                                        break block21;
                                    }
                                    object = context.getCacheDir();
                                    break block21;
                                }
                                object = fvc.N(context);
                                break block21;
                            }
                            object = ag$$ExternalSyntheticApiModelOutline1.m(context).getCacheDir();
                            break block21;
                        }
                        object = ag$$ExternalSyntheticApiModelOutline1.m(context).getFilesDir();
                    }
                    return new File((File)object, TextUtils.join((CharSequence)File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new fpz("Did not expect uri to have query");
            }
            throw new fpz(String.format("Path must start with a valid logical location: %s", object));
        }
        throw new fpz("Scheme must be 'android'");
    }

    public static File M(Context context) {
        return fvc.N(ag$$ExternalSyntheticApiModelOutline1.m(context)).getParentFile();
    }

    public static File N(Context context) {
        File file;
        File file2 = file = context.getFilesDir();
        if (file == null) {
            SystemClock.sleep((long)100L);
            file2 = context.getFilesDir();
            if (file2 == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return file2;
    }

    public static /* synthetic */ bzb O(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static IOException P(bmu object, Uri uri, IOException iOException, String string) {
        block6: {
            block2: {
                block3: {
                    block4: {
                        block5: {
                            try {
                                fqo fqo2 = new fqo();
                                fqo2.b();
                                object = (File)((bmu)object).w(uri, fqo2);
                                if (!((File)object).exists()) break block2;
                                if (!((File)object).isFile()) break block3;
                                if (!((File)object).canRead()) break block4;
                                if (!((File)object).canWrite()) break block5;
                            }
                            catch (IOException iOException2) {
                                return new IOException(iOException);
                            }
                            object = fvc.aM((File)object, iOException, string);
                            break block6;
                        }
                        object = fvc.aM((File)object, iOException, string);
                        break block6;
                    }
                    object = ((File)object).canWrite() ? fvc.aM((File)object, iOException, string) : fvc.aM((File)object, iOException, string);
                    break block6;
                }
                object = ((File)object).canRead() ? (((File)object).canWrite() ? fvc.aM((File)object, iOException, string) : fvc.aM((File)object, iOException, string)) : (((File)object).canWrite() ? fvc.aM((File)object, iOException, string) : fvc.aM((File)object, iOException, string));
                break block6;
            }
            object = fvc.aM((File)object, iOException, string);
        }
        return object;
    }

    public static frr Q(String string, hpn hpn2, hyf hyf2, hwj hwj2, Executor executor, gto gto2, bmu bmu2) {
        return new frr(new frp(string, hpn2, new frv(hyf2, hwj2), executor, bmu2, gto2, new gns()), hhk.K(""), true);
    }

    public static hth R(StringBuilder stringBuilder, ArrayList arrayList) {
        return new hth(stringBuilder.toString(), arrayList.toArray(new Object[arrayList.size()]));
    }

    public static itx S(itx itx2, List object) {
        a.s(itx2, "channel");
        object = object.iterator();
        while (object.hasNext()) {
            itx2 = new iub(itx2, (iua)object.next());
        }
        return itx2;
    }

    public static itx T(itx itx2, iua ... iuaArray) {
        return fvc.S(itx2, Arrays.asList(iuaArray));
    }

    public static itx U(itx itx2, List arrayList) {
        arrayList = new ArrayList(arrayList);
        Collections.reverse(arrayList);
        return fvc.S(itx2, arrayList);
    }

    public static itx V(itx itx2, iua ... iuaArray) {
        return fvc.U(itx2, Arrays.asList(iuaArray));
    }

    public static /* synthetic */ hyf Z() {
        try {
            byte[] byArray = Base64.decode((String)"CB4", (int)3);
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

    public static boolean aA(byte by2) {
        return by2 >= 0;
    }

    public static boolean aB(byte by2) {
        return by2 < -16;
    }

    public static boolean aC(byte by2) {
        return by2 < -32;
    }

    public static String aD(hvu hvu2) {
        StringBuilder stringBuilder = new StringBuilder(hvu2.d());
        for (int i2 = 0; i2 < hvu2.d(); ++i2) {
            byte by2 = hvu2.a(i2);
            if (by2 != 34) {
                if (by2 != 39) {
                    if (by2 != 92) {
                        switch (by2) {
                            default: {
                                if (by2 >= 32 && by2 <= 126) {
                                    stringBuilder.append((char)by2);
                                    break;
                                }
                                stringBuilder.append('\\');
                                stringBuilder.append((char)((by2 >>> 6 & 3) + 48));
                                stringBuilder.append((char)((by2 >>> 3 & 7) + 48));
                                stringBuilder.append((char)((by2 & 7) + 48));
                                break;
                            }
                            case 13: {
                                stringBuilder.append("\\r");
                                break;
                            }
                            case 12: {
                                stringBuilder.append("\\f");
                                break;
                            }
                            case 11: {
                                stringBuilder.append("\\v");
                                break;
                            }
                            case 10: {
                                stringBuilder.append("\\n");
                                break;
                            }
                            case 9: {
                                stringBuilder.append("\\t");
                                break;
                            }
                            case 8: {
                                stringBuilder.append("\\b");
                                break;
                            }
                            case 7: {
                                stringBuilder.append("\\a");
                                break;
                            }
                        }
                        continue;
                    }
                    stringBuilder.append("\\\\");
                    continue;
                }
                stringBuilder.append("\\'");
                continue;
            }
            stringBuilder.append("\\\"");
        }
        return stringBuilder.toString();
    }

    public static void aE(hvu hvu2, ArrayDeque arrayDeque) {
        if (hvu2.h()) {
            int n2 = fvc.aP(hvu2.d());
            int n3 = hyt.c(n2 + 1);
            if (!arrayDeque.isEmpty() && ((hvu)arrayDeque.peek()).d() < n3) {
                n3 = hyt.c(n2);
                hvu hvu3 = (hvu)arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((hvu)arrayDeque.peek()).d() < n3) {
                    hvu3 = new hyt((hvu)arrayDeque.pop(), hvu3);
                }
                hvu2 = new hyt(hvu3, hvu2);
                while (!arrayDeque.isEmpty()) {
                    n3 = hyt.c(fvc.aP(((hyt)hvu2).d) + 1);
                    if (((hvu)arrayDeque.peek()).d() >= n3) break;
                    hvu2 = new hyt((hvu)arrayDeque.pop(), hvu2);
                }
                arrayDeque.push(hvu2);
                return;
            }
            arrayDeque.push(hvu2);
            return;
        }
        if (hvu2 instanceof hyt) {
            hvu2 = (hyt)hvu2;
            int[] nArray = hyt.a;
            fvc.aE(((hyt)hvu2).e, arrayDeque);
            fvc.aE(((hyt)hvu2).f, arrayDeque);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(hvu2.getClass()))));
    }

    public static Object aF(hwt hwt2, gpm gpm2) {
        jse.e(hwt2, "<this>");
        jse.e(gpm2, "extension");
        return hwt2.aG(gpm2);
    }

    public static imf aG(dlm dlm2) {
        return new imf((Map)dlm2.a);
    }

    public static ime aH(dlm dlm2) {
        return new ime((Map)dlm2.a);
    }

    private static float aI(String[] object, int n2) {
        float f2 = Float.parseFloat(object[n2]);
        if (!(f2 < 0.0f) && !(f2 > 1.0f)) {
            return f2;
        }
        object = new StringBuilder("Motion easing control point value must be between 0 and 1; instead got: ");
        ((StringBuilder)object).append(f2);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static String aJ(String string, String string2) {
        int n2 = string.length();
        return string.substring(string2.length() + 1, n2 - 1);
    }

    private static boolean aK(String string, String string2) {
        return string.startsWith(string2.concat("(")) && string.endsWith(")");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static IOException aL(File object, IOException iOException, String charSequence) {
        String string;
        String string2 = string = "Inoperable file:";
        try {
            String string3 = String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", ((File)object).getCanonicalPath(), ((File)object).getFreeSpace(), charSequence);
            String string5 = string;
            string5 = string;
            charSequence = new StringBuilder("Inoperable file:");
            String string6 = string;
            ((StringBuilder)charSequence).append(string3);
            String string7 = string;
            CharSequence charSequence2 = charSequence = ((StringBuilder)charSequence).toString();
            try {
                object = Os.stat((String)((File)object).getCanonicalPath());
                CharSequence charSequence3 = charSequence;
                string = String.format(Locale.US, " mode[%d]", ((StructStat)object).st_mode);
                CharSequence charSequence5 = charSequence;
                charSequence5 = charSequence;
                object = new StringBuilder();
                CharSequence charSequence6 = charSequence;
                ((StringBuilder)object).append((String)charSequence);
                CharSequence charSequence7 = charSequence;
                ((StringBuilder)object).append(string);
                CharSequence charSequence8 = charSequence;
                object = ((StringBuilder)object).toString();
                return new IOException((String)object, iOException);
            }
            catch (Exception exception) {
                object = charSequence;
                return new IOException((String)object, iOException);
            }
        }
        catch (IOException iOException2) {
            object = string2.concat(" failed");
        }
        return new IOException((String)object, iOException);
    }

    private static IOException aM(File file, IOException iOException, String string) {
        File file2 = file.getParentFile();
        if (file2 == null) {
            return fvc.aL(file, iOException, string);
        }
        if (file2.exists()) {
            if (file2.isDirectory()) {
                if (file2.canRead()) {
                    if (file2.canWrite()) {
                        return fvc.aL(file, iOException, string);
                    }
                    return fvc.aL(file, iOException, string);
                }
                if (file2.canWrite()) {
                    return fvc.aL(file, iOException, string);
                }
                return fvc.aL(file, iOException, string);
            }
            if (file2.canRead()) {
                if (file2.canWrite()) {
                    return fvc.aL(file, iOException, string);
                }
                return fvc.aL(file, iOException, string);
            }
            if (file2.canWrite()) {
                return fvc.aL(file, iOException, string);
            }
            return fvc.aL(file, iOException, string);
        }
        return fvc.aL(file, iOException, string);
    }

    private static int aN(byte by2) {
        return by2 & 0x3F;
    }

    private static boolean aO(byte by2) {
        return by2 > -65;
    }

    private static int aP(int n2) {
        int n3;
        n2 = n3 = Arrays.binarySearch(hyt.a, n2);
        if (n3 < 0) {
            n2 = -(n3 + 1) - 1;
        }
        return n2;
    }

    public static /* synthetic */ hyf aa() {
        try {
            Object object = Base64.decode((String)"CMC1oAE", (int)3);
            hwg hwg2 = hwg.a;
            int n2 = ((byte[])object).length;
            Object object2 = hwj.a;
            object2 = hyo.a;
            object = hwv.o(hwg2, object, 0, n2, hwj.a);
            hwv.D((hwv)object);
            object = (hwg)object;
            return object;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ hyf ab() {
        try {
            Object object = Base64.decode((String)"CAo", (int)3);
            hwg hwg2 = hwg.a;
            int n2 = ((byte[])object).length;
            Object object2 = hwj.a;
            object2 = hyo.a;
            object = hwv.o(hwg2, object, 0, n2, hwj.a);
            hwv.D((hwv)object);
            object = (hwg)object;
            return object;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ hyf ac() {
        try {
            Object object = Base64.decode((String)"EMCEPQ", (int)3);
            hwg hwg2 = hwg.a;
            int n2 = ((byte[])object).length;
            Object object2 = hwj.a;
            object2 = hyo.a;
            object = hwv.o(hwg2, object, 0, n2, hwj.a);
            hwv.D((hwv)object);
            object = (hwg)object;
            return object;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ hyf ad() {
        try {
            hwg hwg2 = hwg.a;
            return hwg2;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ hyf ae() {
        try {
            iag iag2 = iag.a;
            return iag2;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ hyf af() {
        try {
            iah iah2 = iah.a;
            return iah2;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ Object ag(Object object) {
        object = (byte[])object;
        ket ket2 = ket.a;
        int n2 = ((Object)object).length;
        Object object2 = hwj.a;
        object2 = hyo.a;
        object = hwv.o(ket2, (byte[])object, 0, n2, hwj.a);
        hwv.D((hwv)object);
        return (ket)object;
    }

    public static int ah(int n2) {
        if (n2 < 3) {
            return n2 + 1;
        }
        if (n2 < 0x40000000) {
            return (int)((float)n2 / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap ai(int n2) {
        return new LinkedHashMap(fvc.ah(n2));
    }

    public static List aj(int n2) {
        if (n2 == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(n2);
    }

    public static void ak(boolean bl2, String string, Object ... objectArray) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException(String.format(string, objectArray));
    }

    public static void al(Object object) {
        object.getClass();
    }

    public static ack am(mr mr2, ack ack2) {
        return ((ikx)idi.e(mr2, ikx.class)).f().n(ack2);
    }

    public static ack an(be be2, ack ack2) {
        return ((iky)idi.e(be2, iky.class)).e().n(ack2);
    }

    public static Application ao(Context context) {
        if (!(context instanceof Application)) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                Context context3;
                context2 = context3 = ((ContextWrapper)context2).getBaseContext();
                if (!(context3 instanceof Application)) continue;
                return (Application)context3;
            }
            throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(context))));
        }
        return (Application)context;
    }

    public static boolean ap(Context object) {
        object = ((ikw)idi.d((Context)object, ikw.class)).w();
        hdc hdc2 = (hdc)object;
        boolean bl2 = hdc2.e <= 1;
        fvc.ak(bl2, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (object.isEmpty()) {
            return true;
        }
        return (Boolean)hdc2.k().next();
    }

    public static Duration aq(hwg hwg2) {
        hwg2 = hzu.c(hwg2.b, hwg2.c);
        return Duration.ofSeconds(hwg2.b, hwg2.c);
    }

    public static hyf ar(Bundle object, String string, hyf hyf2, hwj hwj2) {
        if ((object = object.getParcelable(string)) instanceof Bundle) {
            object.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            object = (ProtoParsers$InternalDontUse)object.getParcelable("protoparsers");
        } else {
            object = (ProtoParsers$InternalDontUse)object;
        }
        return ((ProtoParsers$InternalDontUse)object).b(hyf2.t(), hwj2);
    }

    public static void as(Bundle bundle, String string, hyf hyf2) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", (Parcelable)new ProtoParsers$InternalDontUse(null, hyf2));
        bundle.putParcelable(string, (Parcelable)bundle2);
    }

    public static hyf at(Bundle object, hyf hyf2, hwj hwj2) {
        try {
            object = fvc.ar(object, "TIKTOK_FRAGMENT_ARGUMENT", hyf2, hwj2);
            return object;
        }
        catch (hxn hxn2) {
            throw new RuntimeException(hxn2);
        }
    }

    public static String au(ByteBuffer byteBuffer, int n2, int n3) {
        if ((byteBuffer.limit() - n2 - n3 | (n2 | n3)) >= 0) {
            byte by2;
            int n4 = n2 + n3;
            char[] cArray = new char[n3];
            n3 = 0;
            while (n2 < n4 && fvc.aA(by2 = byteBuffer.get(n2))) {
                ++n2;
                fvc.ax(by2, cArray, n3);
                ++n3;
            }
            block1: while (n2 < n4) {
                byte by3;
                int n5;
                int n6 = n2 + 1;
                by2 = byteBuffer.get(n2);
                if (fvc.aA(by2)) {
                    fvc.ax(by2, cArray, n3);
                    n5 = n3 + 1;
                    while (true) {
                        n3 = n5;
                        n2 = n6;
                        if (n6 >= n4) continue block1;
                        by2 = byteBuffer.get(n6);
                        n3 = n5;
                        n2 = n6++;
                        if (!fvc.aA(by2)) continue block1;
                        fvc.ax(by2, cArray, n5);
                        ++n5;
                    }
                }
                if (fvc.aC(by2)) {
                    if (n6 < n4) {
                        n5 = n3 + 1;
                        n2 += 2;
                        fvc.az(by2, byteBuffer.get(n6), cArray, n3);
                        n3 = n5;
                        continue;
                    }
                    throw new hxn("Protocol message had invalid UTF-8.");
                }
                if (fvc.aB(by2)) {
                    if (n6 < n4 - 1) {
                        n5 = n3 + 1;
                        by3 = byteBuffer.get(n6);
                        n6 = n2 + 3;
                        fvc.ay(by2, by3, byteBuffer.get(n2 + 2), cArray, n3);
                        n3 = n5;
                        n2 = n6;
                        continue;
                    }
                    throw new hxn("Protocol message had invalid UTF-8.");
                }
                if (n6 < n4 - 2) {
                    byte by4 = byteBuffer.get(n6);
                    by3 = byteBuffer.get(n2 + 2);
                    n6 = n2 + 4;
                    fvc.aw(by2, by4, by3, byteBuffer.get(n2 + 3), cArray, n3);
                    n3 += 2;
                    n2 = n6;
                    continue;
                }
                throw new hxn("Protocol message had invalid UTF-8.");
            }
            return new String(cArray, 0, n3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer.limit(), n2, n3));
    }

    public static String av(byte[] byArray, int n2, int n3) {
        int n4 = byArray.length;
        if ((n4 - n2 - n3 | (n2 | n3)) >= 0) {
            byte by2;
            int n5 = n2 + n3;
            char[] cArray = new char[n3];
            n4 = 0;
            int n6 = n2;
            while (true) {
                n3 = n4;
                n2 = n6;
                if (n6 >= n5) break;
                by2 = byArray[n6];
                n3 = n4;
                n2 = n6++;
                if (!fvc.aA(by2)) break;
                fvc.ax(by2, cArray, n4);
                ++n4;
            }
            block1: while (n2 < n5) {
                byte by3;
                n4 = n2 + 1;
                by2 = byArray[n2];
                if (fvc.aA(by2)) {
                    fvc.ax(by2, cArray, n3);
                    n6 = n3 + 1;
                    while (true) {
                        n3 = n6;
                        n2 = n4;
                        if (n4 >= n5) continue block1;
                        by2 = byArray[n4];
                        n3 = n6;
                        n2 = n4++;
                        if (!fvc.aA(by2)) continue block1;
                        fvc.ax(by2, cArray, n6);
                        ++n6;
                    }
                }
                if (fvc.aC(by2)) {
                    if (n4 < n5) {
                        n6 = n3 + 1;
                        n2 += 2;
                        fvc.az(by2, byArray[n4], cArray, n3);
                        n3 = n6;
                        continue;
                    }
                    throw new hxn("Protocol message had invalid UTF-8.");
                }
                if (fvc.aB(by2)) {
                    if (n4 < n5 - 1) {
                        n6 = n3 + 1;
                        by3 = byArray[n4];
                        n4 = n2 + 3;
                        fvc.ay(by2, by3, byArray[n2 + 2], cArray, n3);
                        n3 = n6;
                        n2 = n4;
                        continue;
                    }
                    throw new hxn("Protocol message had invalid UTF-8.");
                }
                if (n4 < n5 - 2) {
                    byte by4 = byArray[n4];
                    by3 = byArray[n2 + 2];
                    n4 = n2 + 4;
                    fvc.aw(by2, by4, by3, byArray[n2 + 3], cArray, n3);
                    n3 += 2;
                    n2 = n4;
                    continue;
                }
                throw new hxn("Protocol message had invalid UTF-8.");
            }
            return new String(cArray, 0, n3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", n4, n2, n3));
    }

    public static void aw(byte by2, byte by3, byte by4, byte by5, char[] cArray, int n2) {
        if (!(fvc.aO(by3) || (by2 << 28) + (by3 + 112) >> 30 != 0 || fvc.aO(by4) || fvc.aO(by5))) {
            by2 = (byte)((by2 & 7) << 18 | fvc.aN(by3) << 12 | fvc.aN(by4) << 6 | fvc.aN(by5));
            cArray[n2] = (char)((by2 >>> 10) + 55232);
            cArray[n2 + 1] = (char)((by2 & 0x3FF) + 56320);
            return;
        }
        throw new hxn("Protocol message had invalid UTF-8.");
    }

    public static void ax(byte by2, char[] cArray, int n2) {
        cArray[n2] = (char)by2;
    }

    public static void ay(byte n2, byte by2, byte by3, char[] cArray, int n3) {
        block4: {
            block6: {
                int n4;
                block5: {
                    if (fvc.aO(by2)) break block4;
                    n4 = n2;
                    if (n2 != -32) break block5;
                    if (by2 < -96) break block4;
                    n4 = -32;
                }
                n2 = n4;
                if (n4 != -19) break block6;
                if (by2 >= -96) break block4;
                n2 = -19;
            }
            if (!fvc.aO(by3)) {
                cArray[n3] = (char)((n2 & 0xF) << 12 | fvc.aN(by2) << 6 | fvc.aN(by3));
                return;
            }
        }
        throw new hxn("Protocol message had invalid UTF-8.");
    }

    public static void az(byte by2, byte by3, char[] cArray, int n2) {
        if (by2 >= -62 && !fvc.aO(by3)) {
            cArray[n2] = (char)((by2 & 0x1F) << 6 | fvc.aN(by3));
            return;
        }
        throw new hxn("Protocol message had invalid UTF-8.");
    }

    static void c(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static ColorStateList d(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf((int)((ColorDrawable)drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && dp$$ExternalSyntheticApiModelOutline0.m((Object)drawable)) {
            return dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m((Object)drawable));
        }
        return null;
    }

    public static Drawable e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable2;
        if (drawable == null) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
            if (colorStateList != null) {
                drawable2 = drawable = drawable.mutate();
                if (mode != null) {
                    drawable.setTintMode(mode);
                    drawable2 = drawable;
                }
            }
        }
        return drawable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            fvd.a(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            if (!path.isConvex()) return;
            fvc.c(outline, path);
            return;
        }
        try {
            fvc.c(outline, path);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public static int g(int n2, int n3) {
        return tf.c(n2, Color.alpha((int)n2) * n3 / 255);
    }

    public static int h(View view, int n2) {
        Class<?> clazz = view.getClass();
        return fvc.j(view.getContext(), fvc.r(view.getContext(), n2, clazz.getCanonicalName()));
    }

    public static int i(int n2, int n3, float f2) {
        return tf.b(tf.c(n3, Math.round((float)Color.alpha((int)n3) * f2)), n2);
    }

    public static int j(Context context, TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return context.getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static Integer k(Context context, int n2) {
        TypedValue typedValue = fvc.q(context, n2);
        if (typedValue != null) {
            return fvc.j(context, typedValue);
        }
        return null;
    }

    public static int l(Context object, int n2) {
        if ((object = fvc.k((Context)object, n2)) != null) {
            return (Integer)object;
        }
        return 0;
    }

    public static Typeface m(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 31 && ut$$ExternalSyntheticApiModelOutline0.m(configuration) != Integer.MAX_VALUE && ut$$ExternalSyntheticApiModelOutline0.m(configuration) != 0 && typeface != null) {
            return fs$$ExternalSyntheticApiModelOutline0.m(typeface, rw.z(fs$$ExternalSyntheticApiModelOutline0.m(typeface) + ut$$ExternalSyntheticApiModelOutline0.m(configuration), 1, 1000), typeface.isItalic());
        }
        return null;
    }

    public static int n(TypedArray typedArray, int n2, int n3) {
        if (typedArray.hasValue(n2)) {
            return n2;
        }
        return n3;
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int n2) {
        int n3;
        if (typedArray.hasValue(n2) && (n3 = typedArray.getResourceId(n2, 0)) != 0 && (context = ye.f(context, n3)) != null) {
            return context;
        }
        return typedArray.getColorStateList(n2);
    }

    public static int p(Context context, int n2, int n3) {
        if ((context = fvc.q(context, n2)) != null && context.type == 16) {
            return context.data;
        }
        return n3;
    }

    public static TypedValue q(Context context, int n2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue r(Context context, int n2, String string) {
        TypedValue typedValue = fvc.q(context, n2);
        if (typedValue != null) {
            return typedValue;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", string, context.getResources().getResourceName(n2)));
    }

    public static boolean s(Context context, int n2, boolean bl2) {
        context = fvc.q(context, n2);
        boolean bl3 = bl2;
        if (context != null) {
            bl3 = bl2;
            if (context.type == 18) {
                if (context.data == 0) {
                    bl3 = false;
                } else {
                    return true;
                }
            }
        }
        return bl3;
    }

    public static TimeInterpolator t(Context stringArray, int n2, TimeInterpolator object) {
        block7: {
            block11: {
                block10: {
                    th[] thArray;
                    block8: {
                        block9: {
                            thArray = new TypedValue();
                            if (!stringArray.getTheme().resolveAttribute(n2, (TypedValue)thArray, true)) {
                                return object;
                            }
                            if (thArray.type != 3) break block7;
                            object = String.valueOf(thArray.string);
                            if (!fvc.aK((String)object, "cubic-bezier") && !fvc.aK((String)object, "path")) {
                                return AnimationUtils.loadInterpolator((Context)stringArray, (int)thArray.resourceId);
                            }
                            if (!fvc.aK((String)object, "cubic-bezier")) break block8;
                            stringArray = fvc.aJ((String)object, "cubic-bezier").split(",");
                            n2 = stringArray.length;
                            if (n2 != 4) break block9;
                            stringArray = new PathInterpolator(fvc.aI(stringArray, 0), fvc.aI(stringArray, 1), fvc.aI(stringArray, 2), fvc.aI(stringArray, 3));
                            break block10;
                        }
                        throw new IllegalArgumentException(a.af(n2, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
                    }
                    if (!fvc.aK((String)object, "path")) break block11;
                    stringArray = fvc.aJ((String)object, "path");
                    object = new Path();
                    thArray = kt.i((String)stringArray);
                    try {
                        kt.h(thArray, (Path)object);
                    }
                    catch (RuntimeException runtimeException) {
                        throw new RuntimeException("Error in parsing ".concat(String.valueOf(stringArray)), runtimeException);
                    }
                    stringArray = new PathInterpolator((Path)object);
                }
                return stringArray;
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(object)));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static gft u(geq geq2, dup dup2) {
        jse.e(geq2, "<this>");
        jse.e(dup2, "commitProperties");
        String string = geq2.c;
        jse.d(string, "getServerToken(...)");
        hvu hvu2 = (geq2.b & 4) != 0 ? geq2.e : null;
        return new gft(string, hvu2, geq2.i, dup2);
    }

    public static void v(hpn hpn2, String string) {
        hhk.T(hpn2, gqk.g(new fgl(string, 4)), (Executor)hom.a);
    }

    public static hpn w(List list) {
        jse.e(list, "futures");
        return fxf.aB(list).C(new frn(list, 12), (Executor)hom.a);
    }

    public static String x(Map object, gfy object2) {
        if (!jse.F((CharSequence)(object2 = object2.a()), "#")) {
            if ((object = (String)object.get(object2)) != null) {
                return a.ao((String)object, (String)object2, "#");
            }
            return object2;
        }
        throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(object2)));
    }

    public static /* synthetic */ String y(Map object, gfz object2) {
        if (!jse.F((CharSequence)(object2 = object2.a()), "#")) {
            if ((object = (String)object.get(object2)) != null) {
                return a.ao((String)object, (String)object2, "#");
            }
            return object2;
        }
        throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(object2)));
    }

    public static gex z(boolean bl2) {
        return new gex(new geu(bl2), ger.b);
    }

    public void W(iwx iwx2) {
    }

    public void X(Object object) {
        throw null;
    }

    public void Y() {
    }

    public void a(iyh iyh2, iwx iwx2) {
        throw null;
    }

    public iuc b() {
        throw null;
    }
}

