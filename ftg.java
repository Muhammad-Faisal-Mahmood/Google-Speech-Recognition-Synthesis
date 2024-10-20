/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.util.Property
 *  android.widget.ImageView
 */
import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public final class ftg
extends Property {
    private final Matrix a = new Matrix();

    public ftg() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* synthetic */ void set(Object object, Object object2) {
        ((ImageView)object).setImageMatrix((Matrix)object2);
    }
}

