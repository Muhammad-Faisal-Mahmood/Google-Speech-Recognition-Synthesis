/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.PrintWriter;

public final class acv {
    public final abe a;
    public final acz b;

    public acv() {
        throw null;
    }

    public acv(abe abe2, bzb bzb2) {
        this.a = abe2;
        this.b = (acz)new acn(bzb2, acz.a).a(acz.class);
    }

    public static acv a(abe abe2) {
        return new acv(abe2, ((aco)((Object)abe2)).getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging());
    }

    public static boolean b(int n2) {
        return Log.isLoggable((String)"LoaderManager", (int)n2);
    }

    @Deprecated
    public final void c(String string, PrintWriter printWriter) {
        acz acz2 = this.b;
        if (acz2.b.b() > 0) {
            printWriter.print(string);
            printWriter.println("Loaders:");
            String string2 = String.valueOf(string);
            for (int i2 = 0; i2 < acz2.b.b(); ++i2) {
                boolean bl2;
                String string3 = string2.concat("    ");
                acw acw2 = (acw)acz2.b.c(i2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(acz2.b.a(i2));
                printWriter.print(": ");
                printWriter.println(acw2.toString());
                printWriter.print(string3);
                printWriter.print("mId=");
                printWriter.print(acw2.j);
                printWriter.print(" mArgs=");
                Object object = null;
                printWriter.println((Object)null);
                printWriter.print(string3);
                printWriter.print("mLoader=");
                printWriter.println(acw2.k);
                adc adc2 = acw2.k;
                Object object2 = string3.concat("  ");
                printWriter.print((String)object2);
                printWriter.print("mId=");
                printWriter.print(adc2.d);
                printWriter.print(" mListener=");
                printWriter.println(adc2.j);
                if (adc2.f || adc2.i) {
                    printWriter.print((String)object2);
                    printWriter.print("mStarted=");
                    printWriter.print(adc2.f);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(adc2.i);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (adc2.g || adc2.h) {
                    printWriter.print((String)object2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(adc2.g);
                    printWriter.print(" mReset=");
                    printWriter.println(adc2.h);
                }
                adc2 = (adb)adc2;
                if (((adb)adc2).a != null) {
                    printWriter.print((String)object2);
                    printWriter.print("mTask=");
                    printWriter.print(((adb)adc2).a);
                    printWriter.print(" waiting=");
                    bl2 = ((adb)adc2).a.a;
                    printWriter.println(false);
                }
                if (((adb)adc2).b != null) {
                    printWriter.print((String)object2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(((adb)adc2).b);
                    printWriter.print(" waiting=");
                    bl2 = ((adb)adc2).b.a;
                    printWriter.println(false);
                }
                if (acw2.l != null) {
                    printWriter.print(string3);
                    printWriter.print("mCallbacks=");
                    printWriter.println(acw2.l);
                    object2 = acw2.l;
                    printWriter.print(string3.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(((acx)object2).b);
                }
                printWriter.print(string3);
                printWriter.print("mData=");
                object2 = acw2.k;
                object2 = acw2.f;
                if (object2 != abn.a) {
                    object = object2;
                }
                printWriter.println(adc.e(object));
                printWriter.print(string3);
                printWriter.print("mStarted=");
                bl2 = acw2.d > 0;
                printWriter.println(bl2);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        stringBuilder.append(this.a.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this.a)));
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

