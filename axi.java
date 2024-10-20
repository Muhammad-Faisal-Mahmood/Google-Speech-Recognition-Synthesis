/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.util.Property
 */
import android.graphics.PointF;
import android.util.Property;

final class axi
extends Property {
    public axi(Class clazz) {
        super(clazz, "bottomRight");
    }

    public final /* synthetic */ void set(Object object, Object object2) {
        int n2;
        object = (axo)object;
        object2 = (PointF)object2;
        ((axo)object).c = Math.round(((PointF)object2).x);
        ((axo)object).d = Math.round(((PointF)object2).y);
        ((axo)object).f = n2 = ((axo)object).f + 1;
        if (((axo)object).e == n2) {
            ((axo)object).a();
        }
    }
}

