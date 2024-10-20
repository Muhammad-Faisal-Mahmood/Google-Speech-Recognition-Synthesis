/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(azs object) {
        IconCompat iconCompat;
        block10: {
            block11: {
                iconCompat = new IconCompat();
                iconCompat.b = ((azs)object).a(iconCompat.b, 1);
                byte[] byArray = iconCompat.d;
                if (((azs)object).s(2)) {
                    int n2 = ((azs)object).d.readInt();
                    if (n2 < 0) {
                        byArray = null;
                    } else {
                        Parcel parcel = ((azs)object).d;
                        byArray = new byte[n2];
                        parcel.readByteArray(byArray);
                    }
                }
                iconCompat.d = byArray;
                iconCompat.e = ((azs)object).b(iconCompat.e, 3);
                iconCompat.f = ((azs)object).a(iconCompat.f, 4);
                iconCompat.g = ((azs)object).a(iconCompat.g, 5);
                iconCompat.h = (ColorStateList)((azs)object).b((Parcelable)iconCompat.h, 6);
                iconCompat.j = ((azs)object).e(iconCompat.j, 7);
                iconCompat.k = ((azs)object).e(iconCompat.k, 8);
                iconCompat.i = PorterDuff.Mode.valueOf((String)iconCompat.j);
                switch (iconCompat.b) {
                    default: {
                        break block10;
                    }
                    case 3: {
                        iconCompat.c = iconCompat.d;
                        break block10;
                    }
                    case 2: 
                    case 4: 
                    case 6: {
                        iconCompat.c = new String(iconCompat.d, Charset.forName("UTF-16"));
                        if (iconCompat.b == 2 && iconCompat.k == null) {
                            iconCompat.k = ((String)iconCompat.c).split(":", -1)[0];
                        }
                        break block10;
                    }
                    case 1: 
                    case 5: {
                        object = iconCompat.e;
                        if (object != null) break;
                        iconCompat.c = object = (Object)iconCompat.d;
                        iconCompat.b = 3;
                        iconCompat.f = 0;
                        iconCompat.g = ((Object)object).length;
                        break block10;
                    }
                    case -1: {
                        object = iconCompat.e;
                        if (object == null) break block11;
                    }
                }
                iconCompat.c = object;
                break block10;
            }
            throw new IllegalArgumentException("Invalid icon");
        }
        return iconCompat;
    }

    public static void write(IconCompat object, azs azs2) {
        Object object2;
        ((IconCompat)object).j = ((IconCompat)object).i.name();
        switch (((IconCompat)object).b) {
            default: {
                break;
            }
            case 4: 
            case 6: {
                ((IconCompat)object).d = ((IconCompat)object).c.toString().getBytes(Charset.forName("UTF-16"));
                break;
            }
            case 3: {
                ((IconCompat)object).d = (byte[])((IconCompat)object).c;
                break;
            }
            case 2: {
                ((IconCompat)object).d = ((String)((IconCompat)object).c).getBytes(Charset.forName("UTF-16"));
                break;
            }
            case 1: 
            case 5: {
                ((IconCompat)object).e = (Parcelable)((IconCompat)object).c;
                break;
            }
            case -1: {
                ((IconCompat)object).e = (Parcelable)((IconCompat)object).c;
            }
        }
        int n2 = ((IconCompat)object).b;
        if (n2 != -1) {
            azs2.h(n2, 1);
        }
        if ((object2 = ((IconCompat)object).d) != null) {
            azs2.p(2);
            azs2.d.writeInt(((byte[])object2).length);
            azs2.d.writeByteArray(object2);
        }
        if ((object2 = (Object)((IconCompat)object).e) != null) {
            azs2.i((Parcelable)object2, 3);
        }
        if ((n2 = ((IconCompat)object).f) != 0) {
            azs2.h(n2, 4);
        }
        if ((n2 = ((IconCompat)object).g) != 0) {
            azs2.h(n2, 5);
        }
        if ((object2 = (Object)((IconCompat)object).h) != null) {
            azs2.i((Parcelable)object2, 6);
        }
        if ((object2 = (Object)((IconCompat)object).j) != null) {
            azs2.j((String)object2, 7);
        }
        if ((object = ((IconCompat)object).k) != null) {
            azs2.j((String)object, 8);
        }
    }
}

