/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.Binder
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.view.View
 *  org.xmlpull.v1.XmlPullParser
 */
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class kl {
    public static void A(Parcel parcel, int n2, int n3) {
        kl.z(parcel, n2, 4);
        parcel.writeInt(n3);
    }

    public static void B(Parcel parcel, int n2, long l2) {
        kl.z(parcel, n2, 8);
        parcel.writeLong(l2);
    }

    public static void C(Parcel parcel, int n2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcel.writeBundle(bundle);
        kl.w(parcel, n2);
    }

    public static void D(Parcel parcel, int n2, byte[] byArray) {
        if (byArray == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcel.writeByteArray(byArray);
        kl.w(parcel, n2);
    }

    public static void E(Parcel parcel, int n2, byte[][] byArray) {
        if (byArray == null) {
            return;
        }
        int n3 = kl.v(parcel, n2);
        int n4 = byArray.length;
        parcel.writeInt(n4);
        for (n2 = 0; n2 < n4; ++n2) {
            parcel.writeByteArray(byArray[n2]);
        }
        kl.w(parcel, n3);
    }

    public static void F(Parcel parcel, int n2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcel.writeStrongBinder(iBinder);
        kl.w(parcel, n2);
    }

    public static void G(Parcel parcel, int n2, int[] nArray) {
        if (nArray == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcel.writeIntArray(nArray);
        kl.w(parcel, n2);
    }

    public static void H(Parcel parcel, int n2, Integer n3) {
        if (n3 == null) {
            return;
        }
        kl.z(parcel, n2, 4);
        parcel.writeInt(n3.intValue());
    }

    public static void I(Parcel parcel, int n2, Long l2) {
        if (l2 == null) {
            return;
        }
        kl.z(parcel, n2, 8);
        parcel.writeLong(l2.longValue());
    }

    public static void J(Parcel parcel, int n2, Parcelable parcelable, int n3) {
        if (parcelable == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcelable.writeToParcel(parcel, n3);
        kl.w(parcel, n2);
    }

    public static void K(Parcel parcel, int n2, String string) {
        if (string == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcel.writeString(string);
        kl.w(parcel, n2);
    }

    public static void L(Parcel parcel, int n2, String[] stringArray) {
        if (stringArray == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcel.writeStringArray(stringArray);
        kl.w(parcel, n2);
    }

    public static void M(Parcel parcel, int n2, List list) {
        if (list == null) {
            return;
        }
        n2 = kl.v(parcel, n2);
        parcel.writeStringList(list);
        kl.w(parcel, n2);
    }

    public static void N(Parcel parcel, int n2, Parcelable[] parcelableArray, int n3) {
        if (parcelableArray == null) {
            return;
        }
        int n4 = kl.v(parcel, n2);
        int n5 = parcelableArray.length;
        parcel.writeInt(n5);
        for (n2 = 0; n2 < n5; ++n2) {
            Parcelable parcelable = parcelableArray[n2];
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            kl.c(parcel, parcelable, n3);
        }
        kl.w(parcel, n4);
    }

    public static void O(Parcel parcel, int n2, List list) {
        if (list == null) {
            return;
        }
        int n3 = kl.v(parcel, n2);
        int n4 = list.size();
        parcel.writeInt(n4);
        for (n2 = 0; n2 < n4; ++n2) {
            Parcelable parcelable = (Parcelable)list.get(n2);
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            kl.c(parcel, parcelable, 0);
        }
        kl.w(parcel, n3);
    }

    public static double P(Parcel parcel, int n2) {
        kl.af(parcel, n2, 8);
        return parcel.readDouble();
    }

    public static int Q(int n2) {
        return (char)n2;
    }

    public static int R(Parcel parcel) {
        return parcel.readInt();
    }

    public static int S(Parcel parcel, int n2) {
        kl.af(parcel, n2, 4);
        return parcel.readInt();
    }

    public static int T(Parcel parcel, int n2) {
        if ((n2 & 0xFFFF0000) != -65536) {
            return (char)(n2 >> 16);
        }
        return parcel.readInt();
    }

    public static int U(Parcel parcel) {
        int n2 = parcel.readInt();
        int n3 = kl.T(parcel, n2);
        int n4 = kl.Q(n2);
        int n5 = parcel.dataPosition();
        if (n4 == 20293) {
            n2 = n3 + n5;
            if (n2 >= n5 && n2 <= parcel.dataSize()) {
                return n2;
            }
            throw new cgl(a.an(n2, n5, "Size read is invalid start=", " end="), parcel);
        }
        throw new cgl("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(n2))), parcel);
    }

    public static long V(Parcel parcel, int n2) {
        kl.af(parcel, n2, 8);
        return parcel.readLong();
    }

    public static Bundle W(Parcel parcel, int n2) {
        n2 = kl.T(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(n3 + n2);
        return bundle;
    }

    public static IBinder X(Parcel parcel, int n2) {
        int n3 = kl.T(parcel, n2);
        n2 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        IBinder iBinder = parcel.readStrongBinder();
        parcel.setDataPosition(n2 + n3);
        return iBinder;
    }

    public static Parcelable Y(Parcel parcel, int n2, Parcelable.Creator creator) {
        int n3 = kl.T(parcel, n2);
        n2 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        creator = (Parcelable)creator.createFromParcel(parcel);
        parcel.setDataPosition(n2 + n3);
        return creator;
    }

    public static Integer Z(Parcel parcel, int n2) {
        if ((n2 = kl.T(parcel, n2)) == 0) {
            return null;
        }
        kl.d(parcel, n2, 4);
        return parcel.readInt();
    }

    public static void aA(Status status, Object object, bzo bzo2) {
        if (status.a()) {
            bzo2.c(object);
            return;
        }
        bzo2.b(kl.ax(status));
    }

    public static Long aa(Parcel parcel, int n2) {
        if ((n2 = kl.T(parcel, n2)) == 0) {
            return null;
        }
        kl.d(parcel, n2, 8);
        return parcel.readLong();
    }

    public static String ab(Parcel parcel, int n2) {
        int n3 = kl.T(parcel, n2);
        n2 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(n2 + n3);
        return string;
    }

    public static ArrayList ac(Parcel parcel, int n2) {
        n2 = kl.T(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.setDataPosition(n3 + n2);
        return arrayList;
    }

    public static ArrayList ad(Parcel parcel, int n2, Parcelable.Creator object) {
        n2 = kl.T(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        object = parcel.createTypedArrayList(object);
        parcel.setDataPosition(n3 + n2);
        return object;
    }

    public static void ae(Parcel parcel, int n2) {
        if (parcel.dataPosition() == n2) {
            return;
        }
        throw new cgl(a.af(n2, "Overread allowed size end="), parcel);
    }

    public static void af(Parcel parcel, int n2, int n3) {
        if ((n2 = kl.T(parcel, n2)) == n3) {
            return;
        }
        String string = Integer.toHexString(n2);
        StringBuilder stringBuilder = new StringBuilder("Expected size ");
        stringBuilder.append(n3);
        stringBuilder.append(" got ");
        stringBuilder.append(n2);
        stringBuilder.append(" (0x");
        stringBuilder.append(string);
        stringBuilder.append(")");
        throw new cgl(stringBuilder.toString(), parcel);
    }

    public static void ag(Parcel parcel, int n2) {
        n2 = kl.T(parcel, n2);
        parcel.setDataPosition(parcel.dataPosition() + n2);
    }

    public static boolean ah(Parcel parcel, int n2) {
        kl.af(parcel, n2, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] ai(Parcel parcel, int n2) {
        n2 = kl.T(parcel, n2);
        int n3 = parcel.dataPosition();
        if (n2 == 0) {
            return null;
        }
        byte[] byArray = parcel.createByteArray();
        parcel.setDataPosition(n3 + n2);
        return byArray;
    }

    public static int[] aj(Parcel parcel, int n2) {
        int n3 = kl.T(parcel, n2);
        n2 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int[] nArray = parcel.createIntArray();
        parcel.setDataPosition(n2 + n3);
        return nArray;
    }

    public static Object[] ak(Parcel parcel, int n2, Parcelable.Creator objectArray) {
        int n3 = kl.T(parcel, n2);
        n2 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        objectArray = parcel.createTypedArray((Parcelable.Creator)objectArray);
        parcel.setDataPosition(n2 + n3);
        return objectArray;
    }

    public static String[] al(Parcel parcel, int n2) {
        int n3 = kl.T(parcel, n2);
        n2 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(n2 + n3);
        return stringArray;
    }

    public static byte[][] am(Parcel parcel, int n2) {
        int n3 = kl.T(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        int n5 = parcel.readInt();
        byte[][] byArrayArray = new byte[n5][];
        for (n2 = 0; n2 < n5; ++n2) {
            byArrayArray[n2] = parcel.createByteArray();
        }
        parcel.setDataPosition(n4 + n3);
        return byArrayArray;
    }

    public static void an(boolean bl2) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void ao(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalArgumentException((String)object);
    }

    public static void ap(Handler object) {
        Object object2 = Looper.myLooper();
        if (object2 != object.getLooper()) {
            object2 = object2 != null ? object2.getThread().getName() : "null current looper";
            String string = object.getLooper().getThread().getName();
            object = new StringBuilder("Must be called on ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" thread, but got ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(".");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
    }

    public static void aq(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        throw new IllegalStateException((String)object);
    }

    public static void ar(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void as(String string, Object object) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        throw new IllegalArgumentException((String)object);
    }

    public static void at(Object object) {
        if (object != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static ckz au(ccx ccx2) {
        bzo bzo2 = new bzo(null);
        ccx2.c(new cgb(ccx2, bzo2, 0));
        return (ckz)bzo2.a;
    }

    public static String av(List list, Object object) {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(object.getClass().getSimpleName());
        stringBuilder.append('{');
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append((String)list.get(i2));
            if (i2 >= n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static void aw(String string, Object object, List list) {
        String string2 = String.valueOf(object);
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("=");
        ((StringBuilder)object).append(string2);
        list.add(((StringBuilder)object).toString());
    }

    public static ccq ax(Status status) {
        if (status.g != null) {
            return new ccz(status);
        }
        return new ccq(status);
    }

    public static cei ay(Object object, Looper looper, String string) {
        a.s(object, "Listener must not be null");
        a.s(looper, "Looper must not be null");
        a.s(string, "Listener type must not be null");
        return new cei(looper, object, string);
    }

    public static void az(Status status, bzo bzo2) {
        kl.aA(status, null, bzo2);
    }

    private static void c(Parcel parcel, Parcelable parcelable, int n2) {
        int n3 = parcel.dataPosition();
        parcel.writeInt(1);
        int n4 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, n2);
        n2 = parcel.dataPosition();
        parcel.setDataPosition(n3);
        parcel.writeInt(n2 - n4);
        parcel.setDataPosition(n2);
    }

    private static void d(Parcel parcel, int n2, int n3) {
        if (n2 == n3) {
            return;
        }
        String string = Integer.toHexString(n2);
        StringBuilder stringBuilder = new StringBuilder("Expected size ");
        stringBuilder.append(n3);
        stringBuilder.append(" got ");
        stringBuilder.append(n2);
        stringBuilder.append(" (0x");
        stringBuilder.append(string);
        stringBuilder.append(")");
        throw new cgl(stringBuilder.toString(), parcel);
    }

    public static int l(ld ld2, kc kc2, View view, View view2, ko ko2, boolean bl2) {
        if (ko2.ao() != 0 && ld2.a() != 0 && view != null && view2 != null) {
            if (!bl2) {
                return Math.abs(ko.bk(view) - ko.bk(view2)) + 1;
            }
            int n2 = kc2.a(view2);
            int n3 = kc2.d(view);
            return Math.min(kc2.k(), n2 - n3);
        }
        return 0;
    }

    public static int m(ld ld2, kc kc2, View view, View view2, ko ko2, boolean bl2, boolean bl3) {
        if (ko2.ao() != 0 && ld2.a() != 0 && view != null && view2 != null) {
            int n2 = Math.min(ko.bk(view), ko.bk(view2));
            int n3 = Math.max(ko.bk(view), ko.bk(view2));
            n2 = bl3 ? Math.max(0, ld2.a() - n3 - 1) : Math.max(0, n2);
            if (!bl2) {
                return n2;
            }
            int n4 = Math.abs(kc2.a(view2) - kc2.d(view));
            n3 = Math.abs(ko.bk(view) - ko.bk(view2));
            float f2 = n4;
            float f3 = n2;
            n2 = kc2.j();
            n4 = kc2.d(view);
            return Math.round(f3 * (f2 / (float)(n3 + 1)) + (float)(n2 - n4));
        }
        return 0;
    }

    public static int n(ld ld2, kc kc2, View view, View view2, ko ko2, boolean bl2) {
        if (ko2.ao() != 0 && ld2.a() != 0 && view != null && view2 != null) {
            if (!bl2) {
                return ld2.a();
            }
            int n2 = kc2.a(view2);
            int n3 = kc2.d(view);
            int n4 = Math.abs(ko.bk(view) - ko.bk(view2));
            float f2 = ld2.a();
            return (int)((float)(n2 - n3) / (float)(n4 + 1) * f2);
        }
        return 0;
    }

    public static hpn o(pq object) {
        ps ps2;
        block3: {
            po po2 = new po();
            po2.b = ps2 = new ps(po2);
            po2.a = object.getClass();
            object = object.a(po2);
            if (object == null) break block3;
            try {
                po2.a = object;
            }
            catch (Exception exception) {
                ps2.a(exception);
            }
        }
        return ps2;
    }

    public static void p(String string) {
        throw new IllegalArgumentException(string);
    }

    public static void q(String string) {
        throw new IllegalStateException(string);
    }

    public static List r(String[] stringArray) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(Base64.decode((String)stringArray[i2], (int)0));
        }
        return arrayList;
    }

    public static void s(XmlPullParser xmlPullParser) {
        int n2 = 1;
        while (n2 > 0) {
            int n3 = xmlPullParser.next();
            if (n3 != 2) {
                if (n3 != 3) continue;
                --n2;
                continue;
            }
            ++n2;
        }
    }

    public static int t(Context context, String object) {
        block14: {
            int n2;
            block10: {
                String string;
                String string2;
                int n3;
                block12: {
                    block13: {
                        int n4;
                        block11: {
                            block9: {
                                n2 = Process.myPid();
                                n3 = Process.myUid();
                                string2 = context.getPackageName();
                                n2 = context.checkPermission((String)object, n2, n3);
                                n4 = -1;
                                if (n2 != -1) break block9;
                                n2 = n4;
                                break block10;
                            }
                            string = AppOpsManager.permissionToOp((String)object);
                            if (string != null) break block11;
                            n2 = 0;
                            break block10;
                        }
                        object = string2;
                        if (string2 != null) break block12;
                        object = context.getPackageManager().getPackagesForUid(n3);
                        n2 = n4;
                        if (object == null) break block10;
                        if (((String[])object).length > 0) break block13;
                        n2 = n4;
                        break block10;
                    }
                    object = object[0];
                }
                n2 = Process.myUid();
                string2 = context.getPackageName();
                if (n2 == n3 && Objects.equals(string2, object)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        string2 = (AppOpsManager)context.getSystemService(AppOpsManager.class);
                        n2 = rw.s((AppOpsManager)string2, string, Binder.getCallingUid(), (String)object);
                        if (n2 == 0) {
                            n2 = rw.s((AppOpsManager)string2, string, n3, dp$$ExternalSyntheticApiModelOutline0.m(context));
                        }
                    } else {
                        n2 = rw.x(context, string, (String)object);
                    }
                } else {
                    n2 = rw.x(context, string, (String)object);
                }
                if (n2 == 0) break block14;
                n2 = -2;
            }
            return n2;
        }
        return 0;
    }

    public static int u(Parcel parcel) {
        return kl.v(parcel, 20293);
    }

    public static int v(Parcel parcel, int n2) {
        parcel.writeInt(n2 | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void w(Parcel parcel, int n2) {
        int n3 = parcel.dataPosition();
        parcel.setDataPosition(n2 - 4);
        parcel.writeInt(n3 - n2);
        parcel.setDataPosition(n3);
    }

    public static void x(Parcel parcel, int n2, boolean bl2) {
        kl.z(parcel, n2, 4);
        parcel.writeInt(bl2 ? 1 : 0);
    }

    public static void y(Parcel parcel, int n2, double d2) {
        kl.z(parcel, n2, 8);
        parcel.writeDouble(d2);
    }

    public static void z(Parcel parcel, int n2, int n3) {
        parcel.writeInt(n2 | n3 << 16);
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, ld ld2) {
        ((kp)view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }

    public void b(Canvas canvas, RecyclerView recyclerView) {
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
    }
}

