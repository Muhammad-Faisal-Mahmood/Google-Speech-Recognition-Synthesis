/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Size
 *  android.util.SizeF
 *  android.util.SparseArray
 */
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class abw {
    public static final List a = jns.Q(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class});
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final awe f;

    public abw() {
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new abu(this);
    }

    public abw(Map map) {
        LinkedHashMap linkedHashMap;
        this.b = linkedHashMap = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new abu(this);
        linkedHashMap.putAll(map);
    }

    public final Object a(String string) {
        block2: {
            try {
                Object v2 = this.b.get(string);
                string = v2;
            }
            catch (ClassCastException classCastException) {
                this.b.remove(string);
                if ((abv)this.d.remove(string) != null) break block2;
                this.e.remove(string);
                string = null;
            }
            return string;
        }
        throw null;
    }

    public final void b(String string, awe awe2) {
        this.c.put(string, awe2);
    }

    public final boolean c() {
        return this.b.containsKey("FutureListenerState");
    }
}

