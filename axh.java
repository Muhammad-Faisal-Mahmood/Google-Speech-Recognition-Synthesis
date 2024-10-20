/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.Property
 */
import android.graphics.PointF;
import android.util.Property;

final class axh
extends Property {
    public axh(Class clazz) {
        super(clazz, "topLeft");
    }

    public final /* synthetic */ void set(Object object, Object object2) {
        int n2;
        object = (axo)object;
        object2 = (PointF)object2;
        ((axo)object).a = Math.round(((PointF)object2).x);
        ((axo)object).b = Math.round(((PointF)object2).y);
        ((axo)object).e = n2 = ((axo)object).e + 1;
        if (n2 == ((axo)object).f) {
            ((axo)object).a();
        }
    }
}

