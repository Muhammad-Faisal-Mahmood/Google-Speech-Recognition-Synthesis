/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.SparseIntArray
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class azs {
    final pa a;
    final pa b;
    final pa c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public azs(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new pa(), new pa(), new pa());
    }

    private azs(Parcel parcel, int n2, int n3, String string, pa pa2, pa pa3, pa pa4) {
        this.a = pa2;
        this.b = pa3;
        this.c = pa4;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = n2;
        this.g = n3;
        this.j = n2;
        this.h = string;
    }

    private final Class v(Class clazz) {
        Class<?> clazz2;
        Class<?> clazz3 = clazz2 = (Class<?>)this.c.get(clazz.getName());
        if (clazz2 == null) {
            clazz3 = Class.forName(String.format("%s.%sParcelizer", clazz.getPackage().getName(), clazz.getSimpleName()), false, clazz.getClassLoader());
            this.c.put(clazz.getName(), clazz3);
        }
        return clazz3;
    }

    public final int a(int n2, int n3) {
        if (!this.s(n3)) {
            return n2;
        }
        return this.d.readInt();
    }

    public final Parcelable b(Parcelable object, int n2) {
        if (!this.s(n2)) {
            return object;
        }
        object = this.getClass();
        return this.d.readParcelable(((Class)object).getClassLoader());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final azt c() {
        Object object;
        String string = this.n();
        if (string == null) {
            return null;
        }
        azs azs2 = this.m();
        Object object2 = object = (Method)this.a.get(string);
        if (object != null) return (azt)((Method)object2).invoke(null, azs2);
        try {
            object2 = Class.forName(string, true, azs.class.getClassLoader()).getDeclaredMethod("read", azs.class);
            this.a.put(string, object2);
            return (azt)((Method)object2).invoke(null, azs2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(classNotFoundException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException(noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            if (object instanceof RuntimeException) throw (RuntimeException)object;
            if (!(object instanceof Error)) throw new RuntimeException(invocationTargetException);
            throw (Error)object;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    public final CharSequence d(CharSequence charSequence, int n2) {
        if (!this.s(n2)) {
            return charSequence;
        }
        charSequence = this.d;
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel((Parcel)charSequence);
    }

    public final String e(String string, int n2) {
        if (!this.s(n2)) {
            return string;
        }
        return this.n();
    }

    public final void f(boolean bl2, int n2) {
        this.p(n2);
        this.d.writeInt(bl2 ? 1 : 0);
    }

    public final void g(CharSequence charSequence, int n2) {
        this.p(n2);
        TextUtils.writeToParcel((CharSequence)charSequence, (Parcel)this.d, (int)0);
    }

    public final void h(int n2, int n3) {
        this.p(n3);
        this.q(n2);
    }

    public final void i(Parcelable parcelable, int n2) {
        this.p(n2);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(String string, int n2) {
        this.p(n2);
        this.r(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(azt azt2) {
        azs azs2;
        Object object;
        if (azt2 == null) {
            this.r(null);
            return;
        }
        try {
            object = this.v(azt2.getClass());
            this.r(((Class)object).getName());
            azs2 = this.m();
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(String.valueOf(azt2.getClass().getSimpleName()).concat(" does not have a Parcelizer"), classNotFoundException);
        }
        try {
            Class<?> clazz = azt2.getClass();
            Method method = (Method)this.b.get(clazz.getName());
            object = method;
            if (method == null) {
                object = this.v(clazz).getDeclaredMethod("write", clazz, azs.class);
                this.b.put(clazz.getName(), object);
            }
            ((Method)object).invoke(null, azt2, azs2);
            azs2.o();
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(classNotFoundException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException(noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            if (object instanceof RuntimeException) {
                throw (RuntimeException)object;
            }
            if (object instanceof Error) {
                throw (Error)object;
            }
            throw new RuntimeException(invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    public final boolean l(boolean bl2, int n2) {
        if (this.s(n2)) {
            if (this.d.readInt() != 0) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    protected final azs m() {
        int n2;
        int n3 = this.d.dataPosition();
        int n4 = n2 = this.j;
        if (n2 == this.f) {
            n4 = this.g;
        }
        Parcel parcel = this.d;
        String string = this.h;
        pa pa2 = this.a;
        pa pa3 = this.b;
        pa pa4 = this.c;
        return new azs(parcel, n3, n4, string.concat("  "), pa2, pa3, pa4);
    }

    public final String n() {
        return this.d.readString();
    }

    public final void o() {
        int n2 = this.i;
        if (n2 >= 0) {
            SparseIntArray sparseIntArray = this.e;
            Parcel parcel = this.d;
            n2 = sparseIntArray.get(n2);
            int n3 = parcel.dataPosition();
            this.d.setDataPosition(n2);
            this.d.writeInt(n3 - n2);
            this.d.setDataPosition(n3);
        }
    }

    public final void p(int n2) {
        this.o();
        this.i = n2;
        int n3 = this.d.dataPosition();
        this.e.put(n2, n3);
        this.q(0);
        this.q(n2);
    }

    public final void q(int n2) {
        this.d.writeInt(n2);
    }

    public final void r(String string) {
        this.d.writeString(string);
    }

    public final boolean s(int n2) {
        while (this.j < this.g) {
            int n3 = this.k;
            if (n3 == n2) {
                return true;
            }
            if (String.valueOf(n3).compareTo(String.valueOf(n2)) > 0) {
                return false;
            }
            this.d.setDataPosition(this.j);
            Parcel parcel = this.d;
            n3 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += n3;
        }
        return this.k == n2;
    }

    public final azt t(azt azt2) {
        if (!this.s(1)) {
            return azt2;
        }
        return this.c();
    }

    public final void u(azt azt2) {
        this.p(1);
        this.k(azt2);
    }
}

