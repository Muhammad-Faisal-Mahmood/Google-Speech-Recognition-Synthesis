/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class fhq {
    private static volatile ixb a;
    private static volatile ixb b;
    private static volatile ixb c;
    private static volatile ixb d;
    private static volatile iyc e;
    private static Method f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb a() {
        Object object;
        Object object2 = object = b;
        if (object != null) return object2;
        synchronized (fhq.class) {
            object2 = object = b;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "CheckModelAvailability");
            ((iwy)object2).b();
            object = fhv.c;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = fhx.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            b = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb b() {
        Object object;
        Object object2 = object = c;
        if (object != null) return object2;
        synchronized (fhq.class) {
            object2 = object = c;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.c;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "DownloadModel");
            ((iwy)object2).b();
            object = fhy.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object3 = fib.a;
            ((iwy)object2).b = object = new jmi((hyf)object3);
            c = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb c() {
        Object object;
        Object object2 = object = a;
        if (object != null) return object2;
        synchronized (fhq.class) {
            object2 = object = a;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.a;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "QueryServiceStatus");
            ((iwy)object2).b();
            object = fir.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = fis.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            a = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixb d() {
        Object object;
        Object object2 = object = d;
        if (object != null) return object2;
        synchronized (fhq.class) {
            object2 = object = d;
            if (object != null) return object2;
            object2 = ixb.a();
            ((iwy)object2).c = ixa.d;
            ((iwy)object2).d = ixb.c("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "RecognitionSession");
            ((iwy)object2).b();
            object = fij.a;
            Object object3 = jmj.a;
            ((iwy)object2).a = object3 = new jmi((hyf)object);
            object = fiq.a;
            ((iwy)object2).b = object3 = new jmi((hyf)object);
            d = object2 = ((iwy)object2).a();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public static void e(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static void f(by by2) {
        Method method;
        if (f == null) {
            try {
                f = method = by.class.getDeclaredMethod("noteStateNotSaved", null);
                method.setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                fhq.n(noSuchMethodException);
            }
        }
        try {
            method = f;
            fph.a(method);
            method.invoke((Object)by2, null);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            fhq.n(invocationTargetException);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            fhq.n(illegalAccessException);
            return;
        }
    }

    public static int g(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 99) {
                    return 0;
                }
                return 100;
            }
            return 2;
        }
        return 1;
    }

    public static final void h(int n2, ffk ffk2) {
        ffk2.q(n2);
    }

    public static hav i(fgu fgu2) {
        hat hat2 = new hat();
        if (!fgu2.x.isEmpty()) {
            hat2.j(iaz.b);
        }
        if (fgu2.y) {
            hat2.j(iaz.a);
        }
        if (fgu2.r.isPresent()) {
            hat2.h(iaz.e, iaz.d);
        }
        if (fgu2.s) {
            hat2.h(iaz.e, iaz.d);
        }
        if (fgu2.q) {
            hat2.j(iaz.k);
        }
        if (fgu2.v.isPresent()) {
            int n2;
            int n3 = n2 = a.t(((iep)fgu2.v.get()).c);
            if (n2 == 0) {
                n3 = 1;
            }
            if (--n3 != 1) {
                if (n3 == 2) {
                    hat2.j(iaz.m);
                }
            } else {
                hat2.j(iaz.l);
            }
        }
        if (fgu2.z.isPresent()) {
            hat2.j(iaz.c);
        }
        if (fgu2.C) {
            hat2.j(iaz.j);
        }
        return hat2.g();
    }

    public static idq j(fgu object, Map map) {
        String string = ((fgu)object).d;
        if (map.containsKey(string) && map.get(string) != null) {
            return (idq)map.get(string);
        }
        if (!((fgu)object).w.equals("smart_dictation")) {
            object = ((fgu)object).o ? idq.e : idq.d;
            return object;
        }
        return idq.c;
    }

    public static final fdl k() {
        hwp hwp2 = fdl.a.l();
        String string = UUID.randomUUID().toString();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        fdl fdl2 = (fdl)hwp2.b;
        string.getClass();
        fdl2.b |= 1;
        fdl2.c = string;
        return (fdl)hwp2.o();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ksb l(fhp fhp2) {
        Object object = e;
        iyc iyc2 = object;
        if (object == null) {
            synchronized (fhq.class) {
                object = e;
                iyc2 = object;
                if (object == null) {
                    object = new ksb("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService");
                    ((ksb)object).l(fhq.c());
                    ((ksb)object).l(fhq.a());
                    ((ksb)object).l(fhq.b());
                    ((ksb)object).l(fhq.d());
                    e = iyc2 = new iyc((ksb)object);
                }
            }
        }
        HashMap hashMap = new HashMap();
        ixb ixb2 = fhq.c();
        jne jne2 = new jne(new fdd(fhp2, 0, 2), false);
        object = iyc2.a;
        kmp.N(ixb2, jne2, (String)object, iyc2, hashMap);
        kmp.N(fhq.a(), new jne(new fdd(fhp2, 1, 2), false), (String)object, iyc2, hashMap);
        kmp.N(fhq.b(), new jne(new fdd(fhp2, 2, 2), true), (String)object, iyc2, hashMap);
        kmp.N(fhq.d(), new jnb(new fdd(fhp2, 3, 2)), (String)object, iyc2, hashMap);
        return kmp.T((String)object, iyc2, hashMap);
    }

    public static boolean m(cxt cxt2) {
        return "true".equals(fpi.a((String)cxt2.a, "false"));
    }

    private static void n(Throwable throwable) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", throwable);
    }
}

