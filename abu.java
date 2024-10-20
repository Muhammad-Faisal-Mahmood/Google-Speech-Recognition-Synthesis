/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.util.Size
 *  android.util.SizeF
 */
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public final class abu
implements awe {
    public final abw a;

    public /* synthetic */ abu(abw abw2) {
        this.a = abw2;
    }

    @Override
    public final Bundle a() {
        Class<Object> clazz;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        block35: {
            object5 = this.a;
            object4 = jjj.K(((abw)object5).c).entrySet().iterator();
            block0: while (true) {
                boolean bl2 = object4.hasNext();
                object3 = null;
                if (!bl2) break block35;
                object2 = object4.next();
                object = (String)object2.getKey();
                object2 = ((awe)object2.getValue()).a();
                jse.e(object, "key");
                clazz = abw.a;
                if (clazz instanceof Collection && clazz.isEmpty()) break;
                clazz = clazz.iterator();
                while (clazz.hasNext()) {
                    if (!((Class)clazz.next()).isInstance(object2)) continue;
                    clazz = ((abw)object5).d.get(object);
                    if (clazz instanceof abo) {
                        object3 = (abo)((Object)clazz);
                    }
                    if (object3 != null) {
                        ((abn)object3).g(object2);
                    } else {
                        ((abw)object5).b.put(object, object2);
                    }
                    if ((object3 = (jzq)((abw)object5).e.get(object)) == null) continue block0;
                    ((jzq)object3).b(object2);
                    continue block0;
                }
                break;
            }
            object3 = new StringBuilder("Can't put value with type ");
            ((StringBuilder)object3).append(object2.getClass());
            ((StringBuilder)object3).append(" into saved state");
            throw new IllegalArgumentException(((StringBuilder)object3).toString());
        }
        object4 = new joc("keys", new ArrayList(((abw)object5).b.keySet()));
        object2 = new joc("values", new ArrayList(((abw)object5).b.values()));
        object5 = new Bundle(2);
        for (int i2 = 0; i2 < 2; ++i2) {
            object = (new joc[]{object4, object2})[i2];
            object3 = (String)((joc)object).a;
            object = ((joc)object).b;
            if (object == null) {
                object5.putString((String)object3, null);
                continue;
            }
            if (object instanceof Boolean) {
                object5.putBoolean((String)object3, ((Boolean)object).booleanValue());
                continue;
            }
            if (object instanceof Byte) {
                object5.putByte((String)object3, ((Number)object).byteValue());
                continue;
            }
            if (object instanceof Character) {
                object5.putChar((String)object3, ((Character)object).charValue());
                continue;
            }
            if (object instanceof Double) {
                object5.putDouble((String)object3, ((Number)object).doubleValue());
                continue;
            }
            if (object instanceof Float) {
                object5.putFloat((String)object3, ((Number)object).floatValue());
                continue;
            }
            if (object instanceof Integer) {
                object5.putInt((String)object3, ((Number)object).intValue());
                continue;
            }
            if (object instanceof Long) {
                object5.putLong((String)object3, ((Number)object).longValue());
                continue;
            }
            if (object instanceof Short) {
                object5.putShort((String)object3, ((Number)object).shortValue());
                continue;
            }
            if (object instanceof Bundle) {
                object5.putBundle((String)object3, (Bundle)object);
                continue;
            }
            if (object instanceof CharSequence) {
                object5.putCharSequence((String)object3, (CharSequence)object);
                continue;
            }
            if (object instanceof Parcelable) {
                object5.putParcelable((String)object3, (Parcelable)object);
                continue;
            }
            if (object instanceof boolean[]) {
                object5.putBooleanArray((String)object3, (boolean[])object);
                continue;
            }
            if (object instanceof byte[]) {
                object5.putByteArray((String)object3, (byte[])object);
                continue;
            }
            if (object instanceof char[]) {
                object5.putCharArray((String)object3, (char[])object);
                continue;
            }
            if (object instanceof double[]) {
                object5.putDoubleArray((String)object3, (double[])object);
                continue;
            }
            if (object instanceof float[]) {
                object5.putFloatArray((String)object3, (float[])object);
                continue;
            }
            if (object instanceof int[]) {
                object5.putIntArray((String)object3, (int[])object);
                continue;
            }
            if (object instanceof long[]) {
                object5.putLongArray((String)object3, (long[])object);
                continue;
            }
            if (object instanceof short[]) {
                object5.putShortArray((String)object3, (short[])object);
                continue;
            }
            if (object instanceof Object[]) {
                clazz = object.getClass().getComponentType();
                jse.b(clazz);
                if (Parcelable.class.isAssignableFrom(clazz)) {
                    object5.putParcelableArray((String)object3, (Parcelable[])object);
                    continue;
                }
                if (String.class.isAssignableFrom(clazz)) {
                    object5.putStringArray((String)object3, (String[])object);
                    continue;
                }
                if (CharSequence.class.isAssignableFrom(clazz)) {
                    object5.putCharSequenceArray((String)object3, (CharSequence[])object);
                    continue;
                }
                if (Serializable.class.isAssignableFrom(clazz)) {
                    object5.putSerializable((String)object3, (Serializable)object);
                    continue;
                }
                object4 = clazz.getCanonicalName();
                object5 = new StringBuilder("Illegal value array type ");
                ((StringBuilder)object5).append((String)object4);
                ((StringBuilder)object5).append(" for key \"");
                ((StringBuilder)object5).append((String)object3);
                ((StringBuilder)object5).append('\"');
                throw new IllegalArgumentException(((StringBuilder)object5).toString());
            }
            if (object instanceof Serializable) {
                object5.putSerializable((String)object3, (Serializable)object);
                continue;
            }
            if (object instanceof IBinder) {
                object5.putBinder((String)object3, (IBinder)object);
                continue;
            }
            if (object instanceof Size) {
                object5.putSize((String)object3, (Size)object);
                continue;
            }
            if (object instanceof SizeF) {
                object5.putSizeF((String)object3, (SizeF)object);
                continue;
            }
            object5 = object.getClass().getCanonicalName();
            object4 = new StringBuilder("Illegal value type ");
            ((StringBuilder)object4).append((String)object5);
            ((StringBuilder)object4).append(" for key \"");
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append('\"');
            throw new IllegalArgumentException(((StringBuilder)object4).toString());
        }
        return object5;
    }
}

