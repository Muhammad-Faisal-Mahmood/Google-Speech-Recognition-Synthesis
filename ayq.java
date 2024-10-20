/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.Property
 *  android.view.View
 */
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

final class ayq
extends Property {
    public ayq(Class clazz) {
        super(clazz, "clipBounds");
    }

    public final /* synthetic */ Object get(Object object) {
        return ((View)object).getClipBounds();
    }

    public final /* synthetic */ void set(Object object, Object object2) {
        ((View)object).setClipBounds((Rect)object2);
    }
}

