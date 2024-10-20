/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.io.IOException;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class blf {
    public blf() {
    }

    public blf(byte[] byArray) {
    }

    private static void a(List list, buc buc2, String string, brx brx2, Set set) {
        if (!set.contains(string)) {
            list.add(new bvj(buc2, string, brx2));
            set.add(string);
        }
    }

    @Deprecated
    public static void c() {
        Log.w((String)"carui", (String)"setMessageToShowWhenDisabledPreferenceClicked is deprecated, and does nothing!");
    }

    public static View d(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, bjm.b, 0, 0);
        attributeSet = context.obtainStyledAttributes(attributeSet, bjm.k, 0, 0);
        int n2 = attributeSet.getInt(18, 0);
        attributeSet.recycle();
        switch (n2) {
            default: {
                n2 = 2131623993;
                break;
            }
            case 11: {
                n2 = 2131623983;
                break;
            }
            case 10: {
                n2 = 2131623990;
                break;
            }
            case 9: {
                n2 = 2131624017;
                break;
            }
            case 8: {
                n2 = 2131623986;
                break;
            }
            case 7: {
                n2 = 2131623999;
                break;
            }
            case 6: {
                n2 = 2131623997;
                break;
            }
            case 5: {
                n2 = 2131624002;
                break;
            }
            case 4: {
                n2 = 2131624003;
                break;
            }
            case 3: {
                n2 = 2131624029;
                break;
            }
            case 2: {
                n2 = 2131623995;
                break;
            }
            case 1: {
                n2 = 2131623988;
            }
        }
        typedArray.recycle();
        return LayoutInflater.from((Context)context).inflate(n2, null, false);
    }

    public static List e(buc buc2, brx brx2) {
        a.s(brx2, "Null ISO2Locale argument.");
        boolean bl2 = buc2.c.isEmpty();
        int n2 = 1;
        fxf.r(bl2 ^ true, "Unset name field in voice metadata argument.");
        bl2 = brz.d(buc2).contains(brx2);
        Object object = brz.d(buc2).toString();
        String string = String.valueOf(brx2);
        Serializable serializable = new StringBuilder("Voice metadata proto locales: ");
        serializable.append((String)object);
        serializable.append(" do not contain the supplied locale:");
        serializable.append(string);
        fxf.r(bl2, serializable.toString());
        object = new ArrayList();
        serializable = new HashSet();
        for (bub bub22 : buc2.g) {
            if (!bub22.k.isEmpty()) {
                for (bub bub22 : bub22.k) {
                    if (cab.e(bub22)) continue;
                    blf.a((List)object, buc2, bub22.f, brx2, (Set)((Object)serializable));
                }
                continue;
            }
            if (cab.e(bub22)) continue;
            blf.a((List)object, buc2, bub22.f, brx2, (Set)((Object)serializable));
        }
        Collections.sort(object);
        int n3 = object.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            ((bvj)object.get((int)i2)).d = n2++;
        }
        return object;
    }

    public static int f(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 6) {
                                return 0;
                            }
                            return 7;
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

    /*
     * WARNING - void declaration
     */
    public static bud g(Context object) {
        void var0_3;
        byte[] byArray;
        try {
            byArray = hjg.b(object.getAssets().open(object.getString(2132017520)));
        }
        catch (IOException iOException) {
            throw new UncheckedIOException("Error reading bundled metadata. Commonly this is caused by using a wear build on a phone or vice versa.", iOException);
        }
        try {
            object = hwj.a();
            object = hwv.o(bud.a, byArray, 0, byArray.length, (hwj)object);
            hwv.D((hwv)object);
            object = (bud)object;
            return object;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
        }
        catch (hxn hxn2) {
            // empty catch block
        }
        throw new IllegalStateException("Error parsing cached metadata: ", (Throwable)var0_3);
    }
}

