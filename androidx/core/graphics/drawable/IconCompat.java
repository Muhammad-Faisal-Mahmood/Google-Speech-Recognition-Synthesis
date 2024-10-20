/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.Log
 */
package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat
extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public IconCompat(byte[] byArray) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = 2;
    }

    public static IconCompat c(int n2) {
        if (n2 != 0) {
            IconCompat iconCompat = new IconCompat(null);
            iconCompat.f = n2;
            iconCompat.c = "";
            iconCompat.k = "";
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int a() {
        int n2 = this.b;
        if (n2 == -1) {
            block8: {
                Object object = this.c;
                if (Build.VERSION.SDK_INT >= 28) {
                    n2 = fs$$ExternalSyntheticApiModelOutline0.m((Icon)object);
                } else {
                    try {
                        n2 = (Integer)object.getClass().getMethod("getResId", null).invoke(object, null);
                        break block8;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)noSuchMethodException);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)invocationTargetException);
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)illegalAccessException);
                    }
                    n2 = 0;
                }
            }
            return n2;
        }
        if (n2 == 2) {
            return this.f;
        }
        ((Object)this).toString();
        throw new IllegalStateException("called getResId() on ".concat(((Object)this).toString()));
    }

    public final Uri b() {
        int n2 = this.b;
        if (n2 == -1) {
            Object object;
            block8: {
                object = this.c;
                if (Build.VERSION.SDK_INT >= 28) {
                    object = fs$$ExternalSyntheticApiModelOutline0.m((Icon)object);
                } else {
                    try {
                        object = (Uri)object.getClass().getMethod("getUri", null).invoke(object, null);
                        break block8;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)noSuchMethodException);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)invocationTargetException);
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)illegalAccessException);
                    }
                    object = null;
                }
            }
            return object;
        }
        if (n2 != 4 && n2 != 6) {
            ((Object)this).toString();
            throw new IllegalStateException("called getUri() on ".concat(((Object)this).toString()));
        }
        return Uri.parse((String)((String)this.c));
    }

    public final String toString() {
        String string;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
        switch (this.b) {
            default: {
                string = "UNKNOWN";
                break;
            }
            case 6: {
                string = "URI_MASKABLE";
                break;
            }
            case 5: {
                string = "BITMAP_MASKABLE";
                break;
            }
            case 4: {
                string = "URI";
                break;
            }
            case 3: {
                string = "DATA";
                break;
            }
            case 2: {
                string = "RESOURCE";
                break;
            }
            case 1: {
                string = "BITMAP";
            }
        }
        stringBuilder.append(string);
        switch (this.b) {
            default: {
                break;
            }
            case 4: 
            case 6: {
                stringBuilder.append(" uri=");
                stringBuilder.append(this.c);
                break;
            }
            case 3: {
                stringBuilder.append(" len=");
                stringBuilder.append(this.f);
                if (this.g == 0) break;
                stringBuilder.append(" off=");
                stringBuilder.append(this.g);
                break;
            }
            case 2: {
                stringBuilder.append(" pkg=");
                stringBuilder.append(this.k);
                stringBuilder.append(" id=");
                stringBuilder.append(String.format("0x%08x", this.a()));
                break;
            }
            case 1: 
            case 5: {
                stringBuilder.append(" size=");
                stringBuilder.append(((Bitmap)this.c).getWidth());
                stringBuilder.append("x");
                stringBuilder.append(((Bitmap)this.c).getHeight());
            }
        }
        if (this.h != null) {
            stringBuilder.append(" tint=");
            stringBuilder.append(this.h);
        }
        if (this.i != a) {
            stringBuilder.append(" mode=");
            stringBuilder.append(this.i);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

