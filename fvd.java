/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Outline
 *  android.graphics.Path
 *  android.os.SystemClock
 *  android.view.View
 *  hom
 */
import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.SystemClock;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class fvd {
    public fvd() {
    }

    public fvd(AmbientModeSupport$AmbientController object) {
        new HashMap();
        object = (gto)((AmbientModeSupport$AmbientController)object).a;
        if (((gto)object).g()) {
            ((gto)object).c();
        }
    }

    public fvd(gto gto2) {
        if (gto2.g()) {
            fxf.A(gto2.c() instanceof mr);
        }
    }

    public static int A(Iterator iterator, int n2) {
        int n3;
        fxf.K(iterator);
        boolean bl2 = n2 >= 0;
        fxf.r(bl2, "numberToAdvance must be nonnegative");
        for (n3 = 0; n3 < n2 && iterator.hasNext(); ++n3) {
            iterator.next();
        }
        return n3;
    }

    public static int B(Iterator iterator, gtq gtq2) {
        a.s(gtq2, "predicate");
        int n2 = 0;
        while (iterator.hasNext()) {
            if (gtq2.a(iterator.next())) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static hdx C(Iterator iterator, gtq gtq2) {
        fxf.K(iterator);
        fxf.K(gtq2);
        return new hbg(iterator, gtq2);
    }

    public static hdx D(Iterator iterator) {
        fxf.K(iterator);
        if (iterator instanceof hdx) {
            return (hdx)iterator;
        }
        return new hbf(iterator);
    }

    public static Object E(Iterator iterator, gtq gtq2) {
        fxf.K(iterator);
        fxf.K(gtq2);
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!gtq2.a(e2)) continue;
            return e2;
        }
        throw new NoSuchElementException();
    }

    public static Object F(Iterator iterator, Object object) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    public static Object G(Iterator iterator) {
        if (iterator.hasNext()) {
            Object e2 = iterator.next();
            iterator.remove();
            return e2;
        }
        return null;
    }

    public static Iterator H(Iterator iterator, gte gte2) {
        fxf.K(gte2);
        return new hbh(iterator, gte2);
    }

    public static void I(Iterator iterator) {
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static boolean J(Collection collection, Iterator iterator) {
        fxf.K(collection);
        fxf.K(iterator);
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= collection.add(iterator.next());
        }
        return bl2;
    }

    public static boolean K(Iterator iterator, Object object) {
        if (object == null) {
            while (iterator.hasNext()) {
                if (iterator.next() != null) continue;
                return true;
            }
        } else {
            while (iterator.hasNext()) {
                if (!object.equals(iterator.next())) continue;
                return true;
            }
        }
        return false;
    }

    public static gto L(Iterable object, gtq gtq2) {
        block1: {
            Iterator iterator = object.iterator();
            fxf.K(iterator);
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!gtq2.a(object)) continue;
                object = gto.i(object);
                break block1;
            }
            object = gsl.a;
        }
        return object;
    }

    public static Iterable M(Iterable iterable, gtq gtq2) {
        fxf.K(iterable);
        return new hbb(iterable, gtq2);
    }

    public static Object N(Iterable object, int n2) {
        int n3;
        block4: {
            block3: {
                block2: {
                    fxf.K(object);
                    if (!(object instanceof List)) break block2;
                    object = ((List)object).get(n2);
                    break block3;
                }
                object = object.iterator();
                n3 = fvd.A((Iterator)object, n2);
                if (!object.hasNext()) break block4;
                object = object.next();
            }
            return object;
        }
        object = new StringBuilder("position (");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(") must be less than the number of elements that remained (");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(")");
        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
    }

    public static Object O(Iterable iterable, Object object) {
        return fvd.F(iterable.iterator(), null);
    }

    public static Object P(Iterable iterable) {
        if (iterable instanceof List) {
            if (!(iterable = (List)iterable).isEmpty()) {
                return iterable.get(iterable.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator iterator = iterable.iterator();
        do {
            iterable = iterator.next();
        } while (iterator.hasNext());
        return iterable;
    }

    public static Object Q(Iterable object) {
        object = object.iterator();
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        StringBuilder stringBuilder = new StringBuilder("expected one element but was: <");
        stringBuilder.append(e2);
        for (int i2 = 0; i2 < 4 && object.hasNext(); ++i2) {
            stringBuilder.append(", ");
            stringBuilder.append(object.next());
        }
        if (object.hasNext()) {
            stringBuilder.append(", ...");
        }
        stringBuilder.append('>');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static boolean R(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        return fvd.J(collection, iterable.iterator());
    }

    public static void S(List list, gtq gtq2) {
        int n2 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object e2 = list.get(i2);
            int n3 = n2;
            if (!gtq2.a(e2)) {
                if (i2 > n2) {
                    try {
                        list.set(n2, e2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        fvd.as(list, gtq2, n2, i2);
                        return;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        fvd.as(list, gtq2, n2, i2);
                        return;
                    }
                }
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        list.subList(n2, list.size()).clear();
    }

    public static final /* synthetic */ gzx T(Collection collection) {
        collection = gzx.o(collection);
        jse.d(collection, "copyOf(...)");
        return collection;
    }

    public static final /* synthetic */ hac U(Map map) {
        jse.e(map, "<this>");
        map = hac.i(map);
        jse.d(map, "copyOf(...)");
        return map;
    }

    public static final /* synthetic */ hav V(Collection collection) {
        jse.e(collection, "<this>");
        collection = hav.n(collection);
        jse.d(collection, "copyOf(...)");
        return collection;
    }

    public static int W(int n2) {
        return (int)((long)Integer.rotateLeft((int)((long)n2 * -862048943L), 15) * 461845907L);
    }

    public static int X(Object object) {
        int n2 = object == null ? 0 : object.hashCode();
        return fvd.W(n2);
    }

    public static int Y(int n2) {
        int n3;
        if ((n2 = Math.max(n2, 2)) > (int)((double)(n3 = Integer.highestOneBit(n2)))) {
            n2 = n3 + n3;
            if (n2 > 0) {
                return n2;
            }
            return 0x40000000;
        }
        return n3;
    }

    public static int Z(int n2, int n3) {
        return n2 & ~n3;
    }

    static void a(Outline outline, Path path) {
        sk$$ExternalSyntheticApiModelOutline1.m(outline, path);
    }

    public static int aa(int n2, int n3, int n4) {
        return n2 & ~n4 | n3 & n4;
    }

    public static int ab(int n2) {
        int n3 = n2 < 32 ? 4 : 2;
        return n3 * (n2 + 1);
    }

    public static int ac(Object object, Object object2, int n2, Object object3, int[] nArray, Object[] objectArray, Object[] objectArray2) {
        int n3 = fvd.X(object);
        int n4 = n3 & n2;
        int n5 = fvd.ad(object3, n4);
        if (n5 == 0) {
            return -1;
        }
        int n6 = fvd.Z(n3, n2);
        n3 = -1;
        while (true) {
            int n7 = n5 - 1;
            int n8 = nArray[n7];
            n5 = n8 & n2;
            if (fvd.Z(n8, n2) == n6 && a.k(object, objectArray[n7]) && (objectArray2 == null || a.k(object2, objectArray2[n7]))) {
                if (n3 == -1) {
                    fvd.ah(object3, n4, n5);
                } else {
                    nArray[n3] = fvd.aa(nArray[n3], n5, n2);
                }
                return n7;
            }
            if (n5 == 0) break;
            n3 = n7;
        }
        return -1;
    }

    public static int ad(Object object, int n2) {
        if (object instanceof byte[]) {
            return ((byte[])object)[n2] & 0xFF;
        }
        if (object instanceof short[]) {
            return (char)((short[])object)[n2];
        }
        return ((int[])object)[n2];
    }

    public static int ae(int n2) {
        return Math.max(4, fvd.Y(n2 + 1));
    }

    public static Object af(int n2) {
        if (n2 >= 2 && n2 <= 0x40000000 && Integer.highestOneBit(n2) == n2) {
            if (n2 <= 256) {
                return new byte[n2];
            }
            if (n2 <= 65536) {
                return new short[n2];
            }
            return new int[n2];
        }
        throw new IllegalArgumentException(a.af(n2, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void ag(Object object) {
        if (object instanceof byte[]) {
            Arrays.fill((byte[])object, (byte)0);
            return;
        }
        if (object instanceof short[]) {
            Arrays.fill((short[])object, (short)0);
            return;
        }
        Arrays.fill((int[])object, 0);
    }

    public static void ah(Object object, int n2, int n3) {
        if (object instanceof byte[]) {
            ((byte[])object)[n2] = (byte)n3;
            return;
        }
        if (object instanceof short[]) {
            ((short[])object)[n2] = (short)n3;
            return;
        }
        ((int[])object)[n2] = n3;
    }

    public static boolean ai(Collection collection, Object object) {
        fxf.K(collection);
        try {
            boolean bl2 = collection.contains(object);
            return bl2;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public static void aj(Object object, Object object2) {
        if (object != null) {
            if (object2 != null) {
                return;
            }
            throw new NullPointerException(a.ar(object, "null value in entry: ", "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(object2))));
    }

    public static void ak(boolean bl2) {
        fxf.B(bl2, "no calls to next() since the last call to remove()");
    }

    public static void al(int n2, String string) {
        if (n2 >= 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void am(boolean bl2) {
        if (bl2) {
            return;
        }
        throw new guq();
    }

    public static void an(boolean bl2, String string, Object object) {
        if (bl2) {
            return;
        }
        throw new guq(fvd.aq(string, object));
    }

    public static void ao(Object object) {
        if (object != null) {
            return;
        }
        throw new guq(fvd.aq("expected a non-null reference", new Object[0]));
    }

    public static gui ap(gui gui2) {
        if (!(gui2 instanceof gul) && !(gui2 instanceof guj)) {
            gui2 = gui2 instanceof Serializable ? new guj(gui2) : new gul(gui2);
            return gui2;
        }
        return gui2;
    }

    public static String aq(String string, Object ... objectArray) {
        int n2;
        CharSequence charSequence;
        int n3;
        int n4;
        int n5 = 0;
        for (n4 = 0; n4 < (n3 = objectArray.length); ++n4) {
            Object object = objectArray[n4];
            if (object == null) {
                charSequence = "null";
            } else {
                try {
                    charSequence = object.toString();
                }
                catch (Exception exception) {
                    String string2 = object.getClass().getName();
                    String string3 = Integer.toHexString(System.identityHashCode(object));
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append("@");
                    ((StringBuilder)object).append(string3);
                    string2 = ((StringBuilder)object).toString();
                    object = "Exception during lenientFormat for ".concat(string2);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", (String)object, exception);
                    object = exception.getClass().getName();
                    charSequence = new StringBuilder("<");
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append(" threw ");
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append(">");
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
            objectArray[n4] = charSequence;
        }
        charSequence = new StringBuilder(string.length() + n3 * 16);
        n3 = 0;
        n4 = n5;
        while (n4 < (n5 = objectArray.length) && (n2 = string.indexOf("%s", n3)) != -1) {
            ((StringBuilder)charSequence).append(string, n3, n2);
            ((StringBuilder)charSequence).append(objectArray[n4]);
            n3 = n2 + 2;
            ++n4;
        }
        ((StringBuilder)charSequence).append(string, n3, string.length());
        if (n4 < n5) {
            ((StringBuilder)charSequence).append(" [");
            n3 = n4 + 1;
            ((StringBuilder)charSequence).append(objectArray[n4]);
            for (n4 = n3; n4 < objectArray.length; ++n4) {
                ((StringBuilder)charSequence).append(", ");
                ((StringBuilder)charSequence).append(objectArray[n4]);
            }
            ((StringBuilder)charSequence).append(']');
        }
        return ((StringBuilder)charSequence).toString();
    }

    public static gtq ar(gtq gtq2, gtq gtq3) {
        fxf.K(gtq2);
        return new gtr(Arrays.asList(gtq2, gtq3));
    }

    private static void as(List list, gtq gtq2, int n2, int n3) {
        int n4 = list.size();
        while (true) {
            int n5 = n4 - 1;
            n4 = n3;
            if (n5 <= n3) break;
            n4 = n5;
            if (!gtq2.a(list.get(n5))) continue;
            list.remove(n5);
            n4 = n5;
        }
        while (--n4 >= n2) {
            list.remove(n4);
        }
    }

    public static boolean b(float[] fArray) {
        float f2 = fArray[0];
        for (int i2 = 1; i2 < 4; ++i2) {
            if (fArray[i2] == f2) continue;
            return false;
        }
        return true;
    }

    public static boolean c(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static hpn d(hpn hpn2, Callable object, Executor executor) {
        object = new hpo((Callable)object);
        hpn2.c((Runnable)object, executor);
        fvd.e(hpn2, (hpn)object);
        return object;
    }

    public static void e(hpn hpn2, hpn hpn3) {
        hpn3.c(new ffe((Object)hpn3, (Object)hpn2, 15, null), (Executor)hom.a);
    }

    public static Locale g(be be2) {
        be2 = be2.l;
        if (be2 == null) {
            return null;
        }
        return (Locale)be2.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }

    public static final long h(long l2) {
        return Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - l2));
    }

    public static final long i() {
        gto gto2 = drb.a();
        if (gto2.g()) {
            return (Long)gto2.c();
        }
        return ag$$ExternalSyntheticApiModelOutline1.m();
    }

    public static final String j(String string) {
        string = string == null ? "103243289" : "103243289_".concat(String.valueOf(new jtv("[^A-Za-z0-9\\-_:]").a(string, "_")));
        return string;
    }

    public static final void k(RandomAccessFile randomAccessFile, int n2) {
        randomAccessFile.writeInt(n2);
        randomAccessFile.seek(0L);
    }

    public static Object l(Context object, Class clazz) {
        if ((object = object.getApplicationContext()) instanceof ilw) {
            object = ((ilw)object).bn();
            try {
                object = clazz.cast(object);
                return object;
            }
            catch (ClassCastException classCastException) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", classCastException);
            }
        }
        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(object.getClass()))));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object m(Context object, Class clazz, fym fym2) {
        hth hth2 = ((gha)fvd.l(object.getApplicationContext(), gha.class)).M();
        object = hth2.b;
        synchronized (object) {
            if (!hth2.b.containsKey(fym2)) {
                Object object2 = hth2.b;
                Object object3 = ((bqy)hth2.a).a();
                ((awf)object3).b = fym2;
                Object object4 = ((awf)object3).a;
                object3 = (fym)((awf)object3).b;
                brf brf2 = new brf((brg)object4, (fym)object3);
                object2.put(fym2, brf2);
            }
            fym2 = hth2.b.get(fym2);
        }
        try {
            return clazz.cast(fym2);
        }
        catch (ClassCastException classCastException) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", classCastException);
        }
    }

    public static boolean n(Intent intent, Context context) {
        return intent.getPackage() != null && intent.getPackage().equals(context.getPackageName());
    }

    public static boolean o(hch hch2, Object object2) {
        if (object2 == hch2) {
            return true;
        }
        if (object2 instanceof hch) {
            object2 = (hch)object2;
            if (hch2.size() == object2.size() && hch2.j().size() == object2.j().size()) {
                for (Object object2 : object2.j()) {
                    if (hch2.a(((hci)object2).a) == ((hci)object2).a()) continue;
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static hac p(Iterator object, gte gte2, gzy gzy2) {
        while (object.hasNext()) {
            Object e2 = object.next();
            gzy2.d(gte2.apply(e2), e2);
        }
        try {
            object = gzy2.b();
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException(String.valueOf(illegalArgumentException.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    public static Object q(Map map, Object object) {
        fxf.K(map);
        try {
            map = map.get(object);
            return map;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return null;
        }
    }

    public static String r(Map object) {
        int n2 = object.size();
        fvd.al(n2, "size");
        StringBuilder stringBuilder = new StringBuilder((int)Math.min((long)n2 * 8L, 0x40000000L));
        stringBuilder.append('{');
        object = object.entrySet().iterator();
        n2 = 1;
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            if (n2 == 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append(entry.getValue());
            n2 = 0;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static boolean s(Map map, Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            object = (Map)object;
            return map.entrySet().equals(object.entrySet());
        }
        return false;
    }

    public static ArrayList t(Iterable arrayList) {
        fxf.K(arrayList);
        arrayList = arrayList instanceof Collection ? new ArrayList(arrayList) : fvd.u(arrayList.iterator());
        return arrayList;
    }

    public static ArrayList u(Iterator iterator) {
        ArrayList arrayList = new ArrayList();
        fvd.J(arrayList, iterator);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList v(Object ... objectArray) {
        fvd.al(1, "arraySize");
        ArrayList arrayList = new ArrayList(hhk.ag(6L));
        Collections.addAll(arrayList, objectArray);
        return arrayList;
    }

    public static ArrayList w(int n2) {
        fvd.al(n2, "initialArraySize");
        return new ArrayList(n2);
    }

    public static List x(List list) {
        if (list instanceof gzx) {
            return ((gzx)list).a();
        }
        if (list instanceof hbp) {
            return ((hbp)list).a;
        }
        if (list instanceof RandomAccess) {
            return new hbn(list);
        }
        return new hbp(list);
    }

    public static List y(List list, gte gte2) {
        list = list instanceof RandomAccess ? new hbr(list, gte2) : new hbt(list, gte2);
        return list;
    }

    public static boolean z(List object, Object iterator) {
        block7: {
            if (iterator == object) {
                return true;
            }
            if (!(iterator instanceof List)) {
                return false;
            }
            iterator = (List)((Object)iterator);
            int n2 = object.size();
            if (n2 != iterator.size()) {
                return false;
            }
            if (iterator instanceof RandomAccess) {
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (a.k(object.get(i2), iterator.get(i2))) continue;
                    return false;
                }
                return true;
            }
            object = object.iterator();
            iterator = iterator.iterator();
            while (object.hasNext()) {
                if (iterator.hasNext() && a.k(object.next(), iterator.next())) continue;
                break block7;
            }
            if (!iterator.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public final void f(by object) {
        try {
            ((by)object).ac();
        }
        catch (IllegalStateException illegalStateException) {
            StringWriter stringWriter = new StringWriter();
            ((by)object).C("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            object = new hue(stringWriter.toString());
            ((heg)((heg)fyy.a.g()).i(illegalStateException).j("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked$Companion", "clearFragments", 327, "ActivityAccountStateViewModelBacked.kt")).u("popBackStackImmediate failure, fragment state %s", object);
            throw illegalStateException;
        }
        Object object2 = ((by)object).h();
        jse.d(object2, "getFragments(...)");
        if (!object2.isEmpty()) {
            object = new y((by)object);
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object object3 = (be)object2.next();
                if (object3 instanceof ilw) {
                    Object object4 = ((ilw)object3).bn();
                    jse.d(object4, "generatedComponent(...)");
                    if (object4 instanceof fyu) {
                        ((ce)object).j((be)object3);
                        continue;
                    }
                }
                object3 = ((be)object3).getChildFragmentManager();
                jse.d(object3, "getChildFragmentManager(...)");
                ((by)object3).Y();
                this.f((by)object3);
            }
            if (!((ce)object).g()) {
                ((ce)object).q();
                ((ce)object).b();
            }
        }
        return;
    }
}

