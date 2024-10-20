/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.Uri
 *  android.os.Process
 *  android.util.Base64
 *  android.util.Log
 */
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

public final class cqq {
    public static hyf A(String object, hym hym2) {
        try {
            object = Base64.decode((String)object, (int)3);
            Object object2 = hwj.a;
            object2 = hyo.a;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new hxn(new IOException(illegalArgumentException), null);
        }
        return hym2.g((byte[])object, hwj.a);
    }

    public static hyf B(SharedPreferences object, String string, hym hym2) {
        if ((object = object.getString(string, null)) == null) {
            return null;
        }
        try {
            object = cqq.A((String)object, hym2);
            return object;
        }
        catch (hxn hxn2) {
            return null;
        }
    }

    public static String C(String string, gto gto2) {
        String string2 = string;
        if (gto2 != null) {
            string2 = string;
            if (gto2.g()) {
                string2 = string.concat((String)gto2.c());
            }
        }
        return string2;
    }

    public static String D(hyf hyf2) {
        return Base64.encodeToString((byte[])hyf2.g(), (int)3);
    }

    public static void E(SharedPreferences.Editor editor, String string) {
        editor.remove(string);
    }

    public static void F(SharedPreferences.Editor editor, String string, hyf hyf2) {
        editor.putString(string, cqq.D(hyf2));
    }

    public static boolean G(SharedPreferences sharedPreferences, String string) {
        return sharedPreferences.edit().remove(string).commit();
    }

    public static boolean H(SharedPreferences sharedPreferences, String string, hyf hyf2) {
        sharedPreferences = sharedPreferences.edit();
        cqq.F((SharedPreferences.Editor)sharedPreferences, string, hyf2);
        return sharedPreferences.commit();
    }

    public static ctt I(String object, Context object2, cuv object3) {
        block22: {
            block23: {
                block19: {
                    int n2;
                    Object object4;
                    block15: {
                        block20: {
                            block21: {
                                block16: {
                                    block17: {
                                        block18: {
                                            object4 = guf.c("|").g((CharSequence)object);
                                            n2 = cqq.r((Context)object2, (cuv)object3).ordinal();
                                            if (n2 == 1) break block15;
                                            if (n2 == 2) break block16;
                                            if (object4.size() != 4) break block17;
                                            object = ctt.a.l();
                                            object3 = (String)object4.get(0);
                                            if (!((hwp)object).b.B()) {
                                                ((hwp)object).u();
                                            }
                                            object2 = (ctt)((hwp)object).b;
                                            object3.getClass();
                                            ((ctt)object2).b |= 1;
                                            ((ctt)object2).c = object3;
                                            n2 = Integer.parseInt((String)object4.get(1));
                                            if (!((hwp)object).b.B()) {
                                                ((hwp)object).u();
                                            }
                                            object2 = (ctt)((hwp)object).b;
                                            ((ctt)object2).b |= 2;
                                            ((ctt)object2).d = n2;
                                            object3 = (String)object4.get(2);
                                            if (!((hwp)object).b.B()) {
                                                ((hwp)object).u();
                                            }
                                            object2 = (ctt)((hwp)object).b;
                                            object3.getClass();
                                            ((ctt)object2).b |= 4;
                                            ((ctt)object2).e = object3;
                                            n2 = a.t(Integer.parseInt((String)object4.get(3)));
                                            if (!((hwp)object).b.B()) {
                                                ((hwp)object).u();
                                            }
                                            object2 = (ctt)((hwp)object).b;
                                            if (n2 == 0) break block18;
                                            ((ctt)object2).f = n2 - 1;
                                            ((ctt)object2).b |= 8;
                                            break block19;
                                        }
                                        throw null;
                                    }
                                    throw new czs("Bad-format serializedFileKey = ".concat(String.valueOf(object)));
                                }
                                if (object4.size() != 2) break block20;
                                object = ctt.a.l();
                                object2 = (String)object4.get(0);
                                if (!((hwp)object).b.B()) {
                                    ((hwp)object).u();
                                }
                                object3 = (ctt)((hwp)object).b;
                                object2.getClass();
                                ((ctt)object3).b |= 4;
                                ((ctt)object3).e = object2;
                                n2 = a.t(Integer.parseInt((String)object4.get(1)));
                                if (!((hwp)object).b.B()) {
                                    ((hwp)object).u();
                                }
                                object2 = (ctt)((hwp)object).b;
                                if (n2 == 0) break block21;
                                ((ctt)object2).f = n2 - 1;
                                ((ctt)object2).b |= 8;
                                break block19;
                            }
                            throw null;
                        }
                        throw new czs("Bad-format serializedFileKey = s".concat(String.valueOf(object)));
                    }
                    if (object4.size() != 5) break block22;
                    object2 = ctt.a.l();
                    String string = (String)object4.get(0);
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (ctt)((hwp)object2).b;
                    string.getClass();
                    ((ctt)object3).b |= 1;
                    ((ctt)object3).c = string;
                    n2 = Integer.parseInt((String)object4.get(1));
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (ctt)((hwp)object2).b;
                    ((ctt)object3).b |= 2;
                    ((ctt)object3).d = n2;
                    string = (String)object4.get(2);
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (ctt)((hwp)object2).b;
                    string.getClass();
                    ((ctt)object3).b |= 4;
                    ((ctt)object3).e = string;
                    n2 = a.t(Integer.parseInt((String)object4.get(3)));
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (ctt)((hwp)object2).b;
                    if (n2 == 0) break block23;
                    ((ctt)object3).f = n2 - 1;
                    ((ctt)object3).b |= 8;
                    if (object4.get(4) != null && !((String)object4.get(4)).isEmpty()) {
                        try {
                            object4 = (ikm)cqq.A((String)object4.get(4), (hym)ikm.a.C(7));
                            if (!((hwp)object2).b.B()) {
                                ((hwp)object2).u();
                            }
                            object3 = (ctt)((hwp)object2).b;
                            object4.getClass();
                            ((ctt)object3).g = object4;
                            ((ctt)object3).b |= 0x10;
                        }
                        catch (hxn hxn2) {
                            throw new czs("Failed to deserialize key:".concat(String.valueOf(object)), hxn2);
                        }
                    }
                    object = object2;
                }
                return (ctt)((hwp)object).o();
            }
            throw null;
        }
        throw new czs("Bad-format serializedFileKey = ".concat(String.valueOf(object)));
    }

    public static String J(ctt ctt2, Context context, cuv cuv2) {
        int n2 = cqq.r(context, cuv2).ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return cqq.K(ctt2);
                }
                return cqq.L(ctt2);
            }
            return cqq.M(ctt2);
        }
        return cqq.K(ctt2);
    }

    public static String K(ctt ctt2) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder(ctt2.c);
        stringBuilder.append("|");
        stringBuilder.append(ctt2.d);
        stringBuilder.append("|");
        stringBuilder.append(ctt2.e);
        stringBuilder.append("|");
        int n3 = n2 = a.t(ctt2.f);
        if (n2 == 0) {
            n3 = 1;
        }
        stringBuilder.append(n3 - 1);
        return stringBuilder.toString();
    }

    public static String L(ctt ctt2) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder(ctt2.e);
        stringBuilder.append("|");
        int n3 = n2 = a.t(ctt2.f);
        if (n2 == 0) {
            n3 = 1;
        }
        stringBuilder.append(n3 - 1);
        return stringBuilder.toString();
    }

    public static String M(ctt object) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder(((ctt)object).c);
        stringBuilder.append("|");
        stringBuilder.append(((ctt)object).d);
        stringBuilder.append("|");
        stringBuilder.append(((ctt)object).e);
        stringBuilder.append("|");
        int n3 = n2 = a.t(((ctt)object).f);
        if (n2 == 0) {
            n3 = 1;
        }
        stringBuilder.append(n3 - 1);
        stringBuilder.append("|");
        if ((((ctt)object).b & 0x10) != 0) {
            ikm ikm2 = ((ctt)object).g;
            object = ikm2;
            if (ikm2 == null) {
                object = ikm.a;
            }
            object = cqq.D((hyf)object);
        } else {
            object = "";
        }
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public static ByteBuffer N(Iterable object) {
        Object object2 = object.iterator();
        long l2 = 0L;
        int n2 = 0;
        int n3 = 0;
        while (object2.hasNext()) {
            l2 += (long)(((hyf)object2.next()).k() + 12);
            ++n3;
        }
        if (n3 != 0) {
            n3 = (int)l2;
            try {
                object2 = ByteBuffer.allocate(n3);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object = l2 > 0x40000000L ? String.format(Locale.US, "%.2fGB", (double)l2 / 1.073741824E9) : (l2 > 0x100000L ? String.format(Locale.US, "%.2fMB", (double)l2 / 1048576.0) : (l2 > 1024L ? String.format(Locale.US, "%.2fKB", (double)l2 / 1024.0) : String.format(Locale.US, "%d Bytes", l2)));
                Log.e((String)"ProtoLiteUtil", (String)String.format("Too big to serialize, %s", object), (Throwable)illegalArgumentException);
                return null;
            }
            byte[] byArray = ((ByteBuffer)object2).array();
            object = object.iterator();
            n3 = n2;
            while (object.hasNext()) {
                Object object3 = (hyf)object.next();
                n2 = object3.k();
                try {
                    ((ByteBuffer)object2).putInt(n2);
                    n3 += 4;
                }
                catch (BufferOverflowException bufferOverflowException) {
                    cqq.az(bufferOverflowException);
                    return null;
                }
                try {
                    hwb hwb2 = new hwb(byArray, n3, n2);
                    object3.aZ(hwb2);
                }
                catch (IOException iOException) {
                    Log.e((String)"ProtoLiteUtil", (String)"Exception while writing to buffer.", (Throwable)iOException);
                }
                try {
                    ((ByteBuffer)object2).put(byArray, n3, n2);
                }
                catch (BufferOverflowException bufferOverflowException) {
                    cqq.az(bufferOverflowException);
                    return null;
                }
                object3 = new CRC32();
                ((CRC32)object3).update(byArray, (n3 += n2) - n2, n2);
                ((ByteBuffer)object2).putLong(((CRC32)object3).getValue());
                n3 += 8;
            }
            ((ByteBuffer)object2).rewind();
            return object2;
        }
        return ByteBuffer.allocate(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List O(ByteBuffer byteBuffer, Class clazz, hym hym2) {
        String string = clazz.toString();
        int n2 = byteBuffer.limit();
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(byteBuffer.limit() / 1000 + 1);
        while (true) {
            Object object;
            int n3;
            block13: {
                block12: {
                    block11: {
                        if (byteBuffer.position() >= n2) {
                            return arrayList;
                        }
                        try {
                            n3 = byteBuffer.getInt();
                            if (n3 >= 0) break block11;
                        }
                        catch (BufferUnderflowException bufferUnderflowException) {
                            Log.e((String)"ProtoLiteUtil", (String)String.format("Buffer underflow. May have given the wrong message type: %s", string), (Throwable)bufferUnderflowException);
                            return null;
                        }
                        Log.e((String)"ProtoLiteUtil", (String)String.format("Invalid message size: %d. May have given the wrong message type: %s", n3, string));
                        return null;
                    }
                    if (n2 < byteBuffer.position() + n3 + 8) {
                        Log.e((String)"ProtoLiteUtil", (String)String.format("Invalid message size: %d (buffer end is %d)", n3, n2));
                        return arrayList;
                    }
                    long l2 = byteBuffer.getLong(byteBuffer.position() + n3);
                    object = byteBuffer.array();
                    int n4 = byteBuffer.arrayOffset();
                    int n5 = byteBuffer.position();
                    Object object2 = new CRC32();
                    ((CRC32)object2).update((byte[])object, n4 + n5, n3);
                    long l3 = ((CRC32)object2).getValue();
                    if (l3 != l2) {
                        Log.e((String)"ProtoLiteUtil", (String)String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", l2, l3));
                        return arrayList;
                    }
                    object = byteBuffer.array();
                    n4 = byteBuffer.arrayOffset();
                    n5 = byteBuffer.position();
                    try {
                        object2 = hwj.a;
                        object2 = hyo.a;
                        object2 = hwj.a;
                    }
                    catch (hxn hxn3) {
                        // empty catch block
                        break block12;
                    }
                    try {
                        object = hym2.h((byte[])object, n4 + n5, n3, (hwj)object2);
                        break block13;
                    }
                    catch (hxn hxn2) {}
                }
                Log.e((String)"ProtoLiteUtil", (String)"Cannot deserialize message of type ".concat(((Object)clazz).toString()), (Throwable)object);
                return null;
            }
            if (object == null) {
                return null;
            }
            arrayList.add((byte[])object);
            byteBuffer.position(byteBuffer.position() + n3 + 8);
        }
    }

    public static ctj P(csp object) {
        object = ((hvd)object).g();
        Object object2 = hwj.a;
        object2 = hyo.a;
        int n2 = ((Object)object).length;
        object2 = hwj.a;
        object = hwv.o(ctj.a, (byte[])object, 0, n2, (hwj)object2);
        hwv.D((hwv)object);
        return (ctj)object;
    }

    public static frd Q(Context object, hpq hpq2, cyu cyu2, cxt cxt2, gto gto2) {
        object = frk.d((Context)object, hpq2);
        ((fri)object).c = cqq.C("gms_icing_mdd_groups", gto2);
        ((fri)object).b();
        ((fri)object).d = new aim(cxt2, 7);
        ((fri)object).c(new czr(cyu2, 1));
        return ((fri)object).a();
    }

    public static frd R(Context object, hpq hpq2, cyu cyu2, cxt cxt2, gto gto2) {
        object = frk.d((Context)object, hpq2);
        ((fri)object).c = cqq.C("gms_icing_mdd_shared_files", gto2);
        ((fri)object).b();
        ((fri)object).d = new aim(cxt2, 7);
        ((fri)object).c(new czr(cyu2, 0));
        return ((fri)object).a();
    }

    /*
     * WARNING - void declaration
     */
    public static ctq S(String string) {
        void var1_4;
        try {
            ctq ctq2 = (ctq)cqq.A(string, (hym)ctq.a.C(7));
            return ctq2;
        }
        catch (hxn hxn2) {
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        throw new czq("Failed to deserialize key:".concat(String.valueOf(string)), (Throwable)var1_4);
    }

    public static File T(Context context, gto gto2) {
        String string;
        String string2 = string = "gms_icing_mdd_garbage_file";
        if (gto2 != null) {
            string2 = string;
            if (gto2.g()) {
                string2 = "gms_icing_mdd_garbage_file".concat((String)gto2.c());
            }
        }
        return new File(context.getFilesDir(), string2);
    }

    public static String U(ctq ctq2) {
        return Base64.encodeToString((byte[])ctq2.g(), (int)3);
    }

    public static long V(cth cth2) {
        if (cth2.l == 0L) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(cth2.l);
    }

    public static Uri W(Uri uri, ctf object2) {
        uri = uri.buildUpon();
        if (((ctf)object2).p.isEmpty()) {
            String string = ((ctf)object2).d;
            uri.appendPath(string.substring(string.lastIndexOf("/") + 1));
        } else {
            for (String string : ((ctf)object2).p.split("/", -1)) {
                if (string.isEmpty()) continue;
                uri.appendPath(string);
            }
        }
        return uri.build();
    }

    public static Uri X(Context context, gto gto2, cth cth2) {
        int n2;
        String string = !cth2.w.isEmpty() ? cth2.w : cth2.d;
        int n3 = n2 = a.t(cth2.j);
        if (n2 == 0) {
            n3 = 1;
        }
        return crh.d(context, gto2).buildUpon().appendPath(crh.g(n3)).build().buildUpon().appendPath(string).build();
    }

    public static cth Y(cth cth2, long l2) {
        hyg hyg2;
        hyg hyg3 = hyg2 = cth2.c;
        if (hyg2 == null) {
            hyg3 = ctg.a;
        }
        hyg2 = (hwp)((hwv)hyg3).C(5);
        ((hwp)hyg2).x((hwv)hyg3);
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hyg3 = (ctg)((hwp)hyg2).b;
        ((ctg)hyg3).b |= 1;
        ((ctg)hyg3).c = l2;
        hyg2 = (ctg)((hwp)hyg2).o();
        hyg3 = (hwp)cth2.C(5);
        ((hwp)hyg3).x(cth2);
        if (!((hwp)hyg3).b.B()) {
            ((hwp)hyg3).u();
        }
        cth2 = (cth)((hwp)hyg3).b;
        hyg2.getClass();
        cth2.c = hyg2;
        cth2.b |= 1;
        return (cth)((hwp)hyg3).o();
    }

    public static String Z(ctf object) {
        object = cqq.aa((ctf)object) ? ((ctf)object).i : ((ctf)object).g;
        return object;
    }

    public static boolean aa(ctf object) {
        if ((((ctf)object).b & 0x20) != 0) {
            ikm ikm2 = ((ctf)object).h;
            object = ikm2;
            if (ikm2 == null) {
                object = ikm.a;
            }
            object = ((ikm)object).b.iterator();
            while (object.hasNext()) {
                if (((ikl)object.next()).b != 4) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean ab(String string, hav object) {
        if (string.isEmpty()) {
            return false;
        }
        int n2 = string.indexOf(58);
        boolean bl2 = n2 >= 0;
        fxf.E(bl2, "Invalid url: %s", string);
        string = string.substring(0, n2);
        object = ((hav)object).k();
        while (object.hasNext()) {
            if (!fxf.V(string, (String)object.next())) continue;
            return true;
        }
        return false;
    }

    public static boolean ac(ctf ctf2) {
        return cqq.ab(ctf2.d, new hdq("inlinefile"));
    }

    public static boolean ad(cth object) {
        if (((cth)object).n) {
            object = ((cth)object).o.iterator();
            while (object.hasNext()) {
                int n2 = a.w(((ctf)object.next()).m);
                if (n2 == 0 || n2 != 2) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean ae(ctf ctf2) {
        return cqq.ab(ctf2.d, hav.p("file", "asset"));
    }

    public static boolean af(long l2) {
        return l2 <= cqq.x();
    }

    public static final jwi ag(eqa eqa2, jvb jvb2, jrk jrk2) {
        jse.e(jvb2, "scope");
        return jse.ah(jvb2, null, null, new epy(eqa2, jrk2, null, 0), 3);
    }

    public static final void ah(epz epz2, jvb jvb2, jrk jrk2) {
        jse.e(jvb2, "scope");
        jse.ah(jvb2, null, null, new epy(jrk2, epz2, null, 2), 3);
    }

    public static final String ai(ecw hwv2) {
        eip eip2 = hwv2.g;
        hwv2 = eip2;
        if (eip2 == null) {
            hwv2 = eip.a;
        }
        jse.d(hwv2, "getClientInfo(...)");
        return crh.O((eip)hwv2);
    }

    public static hpn aj(epp epp2) {
        return epp2.d().b.a;
    }

    /*
     * Unable to fully structure code
     */
    public static /* synthetic */ Object ak(epp var0, jqb var1_1) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        if (!(var1_1 instanceof epo)) ** GOTO lbl-1000
                        var3_2 = (epo)var1_1;
                        var2_3 = var3_2.c;
                        if ((var2_3 & -2147483648) != 0) {
                            var3_2.c = var2_3 + -2147483648;
                            var1_1 = var3_2;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 = new epo((epp)var0, (jqb)var1_1);
                        }
                        var3_2 = var1_1.a;
                        var4_4 = jqh.a;
                        var2_3 = var1_1.c;
                        if (var2_3 == 0) break block6;
                        if (var2_3 != 1) break block7;
                        jns.ak(var3_2);
                        var0 = var3_2;
                        break block8;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var3_2);
                var0 = var0.b().c();
                var1_1.c = 1;
                var0 = jsd.l((hpn)var0, (jqb)var1_1);
                if (var0 == var4_4) break block9;
            }
            var0 = var1_1 = ((ecx)((ecs)var0).f()).c;
            if (var1_1 == null) {
                var0 = ebt.a;
            }
            jse.d(var0, "getAudioSourceOpeningStatus(...)");
            return var0;
        }
        return var4_4;
    }

    public static String al(epp object) {
        int n2 = object.a();
        object = new StringBuilder("hotword_session_timeout:");
        ((StringBuilder)object).append(n2);
        return ((StringBuilder)object).toString();
    }

    public static hpn am(epe epe2) {
        return epe2.e().b.a;
    }

    /*
     * Unable to fully structure code
     */
    public static /* synthetic */ Object an(epe var0, jqb var1_1) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        if (!(var1_1 instanceof epd)) ** GOTO lbl-1000
                        var3_2 = (epd)var1_1;
                        var2_3 = var3_2.c;
                        if ((var2_3 & -2147483648) != 0) {
                            var3_2.c = var2_3 + -2147483648;
                            var1_1 = var3_2;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 = new epd((epe)var0, (jqb)var1_1);
                        }
                        var3_2 = var1_1.a;
                        var4_4 = jqh.a;
                        var2_3 = var1_1.c;
                        if (var2_3 == 0) break block6;
                        if (var2_3 != 1) break block7;
                        jns.ak(var3_2);
                        var0 = var3_2;
                        break block8;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var3_2);
                var0 = var0.b().c();
                jse.d(var0, "getStartListeningResult(...)");
                var1_1.c = 1;
                var0 = jsd.l((hpn)var0, (jqb)var1_1);
                if (var0 == var4_4) break block9;
            }
            var0 = var1_1 = ((ear)((eah)var0).f()).c;
            if (var1_1 == null) {
                var0 = ebt.a;
            }
            jse.d(var0, "getAudioSourceOpeningStatus(...)");
            return var0;
        }
        return var4_4;
    }

    public static String ao(epe object) {
        int n2 = object.a();
        object = new StringBuilder("audio_session_timeout:");
        ((StringBuilder)object).append(n2);
        return ((StringBuilder)object).toString();
    }

    public static /* synthetic */ hpn ap(eon eon2) {
        return eon2.k(new eol(0));
    }

    public static final kcn aq(eip object) {
        jse.e(object, "clientInfo");
        switch (eio.a(((eip)object).b).ordinal()) {
            default: {
                throw new joa();
            }
            case 35: {
                object = kcn.a;
                break;
            }
            case 34: {
                object = kcn.J;
                break;
            }
            case 33: {
                object = kcn.I;
                break;
            }
            case 32: {
                object = kcn.H;
                break;
            }
            case 31: {
                object = kcn.G;
                break;
            }
            case 30: {
                object = kcn.F;
                break;
            }
            case 29: {
                object = kcn.E;
                break;
            }
            case 28: {
                object = kcn.D;
                break;
            }
            case 27: {
                object = kcn.C;
                break;
            }
            case 26: {
                object = kcn.B;
                break;
            }
            case 25: {
                object = kcn.A;
                break;
            }
            case 24: {
                object = kcn.z;
                break;
            }
            case 23: {
                object = kcn.y;
                break;
            }
            case 22: {
                object = kcn.x;
                break;
            }
            case 21: {
                object = kcn.w;
                break;
            }
            case 20: {
                object = kcn.v;
                break;
            }
            case 19: {
                object = kcn.u;
                break;
            }
            case 18: {
                object = kcn.t;
                break;
            }
            case 17: {
                object = kcn.s;
                break;
            }
            case 16: {
                object = kcn.r;
                break;
            }
            case 15: {
                object = kcn.q;
                break;
            }
            case 14: {
                object = kcn.p;
                break;
            }
            case 13: {
                object = kcn.o;
                break;
            }
            case 12: {
                object = kcn.n;
                break;
            }
            case 11: {
                object = kcn.m;
                break;
            }
            case 10: {
                object = kcn.l;
                break;
            }
            case 9: {
                object = kcn.k;
                break;
            }
            case 8: {
                object = kcn.j;
                break;
            }
            case 7: {
                object = kcn.i;
                break;
            }
            case 6: {
                object = kcn.h;
                break;
            }
            case 5: {
                object = kcn.g;
                break;
            }
            case 4: {
                object = kcn.f;
                break;
            }
            case 3: {
                object = kcn.e;
                break;
            }
            case 2: {
                object = kcn.d;
                break;
            }
            case 1: {
                object = kcn.c;
                break;
            }
            case 0: {
                object = kcn.b;
            }
        }
        return object;
    }

    public static final kcq ar(eaz object) {
        jse.e(object, "audioRouteType");
        switch (eay.a(((eaz)object).b).ordinal()) {
            default: {
                throw new joa();
            }
            case 8: {
                object = kcq.a;
                break;
            }
            case 7: {
                object = kcq.i;
                break;
            }
            case 6: {
                object = kcq.h;
                break;
            }
            case 5: {
                object = kcq.f;
                break;
            }
            case 4: {
                object = kcq.g;
                break;
            }
            case 3: {
                object = kcq.e;
                break;
            }
            case 2: {
                object = kcq.d;
                break;
            }
            case 1: {
                object = kcq.b;
                break;
            }
            case 0: {
                object = kcq.c;
            }
        }
        return object;
    }

    public static final String as(eam hwv2) {
        eip eip2 = hwv2.c;
        hwv2 = eip2;
        if (eip2 == null) {
            hwv2 = eip.a;
        }
        jse.d(hwv2, "getClientInfo(...)");
        return crh.O((eip)hwv2);
    }

    public static epc at(ekd ekd2) {
        return new epc(ekd2.a(), ekd2.b(), ekd2.e());
    }

    public static etp au(ekd ekd2) {
        return new etp(ekd2.a(), ekd2.b(), ekd2.e());
    }

    public static final dtu av(jvb jvb2) {
        jse.e(jvb2, "scope");
        return new dtu(jvb2);
    }

    public static final /* synthetic */ dlm aw(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dlm((Object)hwp2, null);
    }

    public static void ax(Context object, gto gto2, cth cth2, bmu bmu2) {
        if (bmu2.B((Uri)(gto2 = cqq.X(object, gto2, cth2)))) {
            object = new fqr();
            object.a = true;
            object = (Void)bmu2.w((Uri)gto2, (fpp)object);
        }
    }

    public static final /* synthetic */ bzb ay(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    private static void az(BufferOverflowException bufferOverflowException) {
        Log.e((String)"ProtoLiteUtil", (String)"Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", (Throwable)bufferOverflowException);
    }

    public static boolean b(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static sk c(Context context) {
        sk sk2 = cqq.d(context);
        sk2.f(context.getResources().getString(2132017358));
        sk2.i(17301629);
        return sk2;
    }

    public static sk d(Context object) {
        object = new sk((Context)object, "download-notification-channel-id");
        ((sk)object).n = "service";
        ((sk)object).d(8, true);
        return object;
    }

    public static String e(Context context) {
        return context.getResources().getString(2132017360);
    }

    public static void f(Context context, Class clazz, String string) {
        clazz = new Intent(context, clazz);
        clazz.putExtra("key", string);
        ag$$ExternalSyntheticApiModelOutline0.m(context, (Intent)clazz);
    }

    public static void g(Context context, Class clazz, String string) {
        clazz = new Intent(context, clazz);
        clazz.putExtra("stop-service", true);
        clazz.putExtra("key", string);
        ag$$ExternalSyntheticApiModelOutline0.m(context, (Intent)clazz);
    }

    public static final boolean h() {
        return inw.a.b().i();
    }

    public static final boolean i() {
        return inw.a.b().j();
    }

    public static final boolean j() {
        return inw.a.b().k();
    }

    public static final boolean k() {
        return inw.a.b().l();
    }

    public static final int l() {
        return (int)inw.a.b().a();
    }

    public static final float m() {
        return (float)ins.a.b().a();
    }

    public static final boolean n() {
        return inw.a.b().q();
    }

    public static final int o() {
        return (int)ioa.a.b().d();
    }

    public static final int p() {
        return (int)inw.a.b().b();
    }

    public static final int q() {
        return (int)ioa.a.b().f();
    }

    public static cwq r(Context context, cuv cuv2) {
        int n2 = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", cwq.a.d);
        try {
            cwq cwq2 = cwq.a(n2);
            return cwq2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            cuv2.a();
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return cwq.c;
        }
    }

    public static boolean s(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean t(Context context, cwq cwq2) {
        cyr.d("%s: Setting FileKeyVersion to %s", "Migrations", cwq2.name());
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", cwq2.d).commit();
    }

    public static void u(Context context) {
        cyr.d("%s: Setting migration to new file key to %s", "Migrations", true);
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static /* synthetic */ String v(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return "DOWNLOADED_GROUP";
            }
            return "IN_PROGRESS_FUTURE";
        }
        return "PENDING_GROUP";
    }

    public static boolean w(ikm ikm2) {
        try {
            fra.a(ikm2);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            cyr.q(illegalArgumentException, "Invalid transform specification");
            return false;
        }
    }

    public static final long x() {
        return cgw.p().toEpochMilli();
    }

    public static int y(int n2) {
        if (n2 != 0) {
            switch (n2) {
                default: {
                    switch (n2) {
                        default: {
                            return 0;
                        }
                        case 1005: {
                            return 1006;
                        }
                        case 1004: {
                            return 1005;
                        }
                        case 1003: {
                            return 1004;
                        }
                        case 1002: {
                            return 1003;
                        }
                        case 1001: 
                    }
                    return 1002;
                }
                case 952: {
                    return 953;
                }
                case 951: {
                    return 952;
                }
                case 950: 
            }
            return 951;
        }
        return 1;
    }

    public static SharedPreferences z(Context context, String string, gto gto2) {
        return context.getSharedPreferences(cqq.C(string, gto2), 0);
    }

    public final cqp a() {
        cqp cqp2;
        cqs.c = cqp2 = new cqp(cqs.b, Process.myTid(), true, 0, false, 104);
        return cqp2;
    }
}

