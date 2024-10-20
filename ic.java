/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.widget.TextView
 */
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

final class ic
extends tb {
    final int a;
    final int b;
    final WeakReference c;
    final ie d;

    public ic(ie ie2, int n2, int n3, WeakReference weakReference) {
        this.d = ie2;
        this.a = n2;
        this.b = n3;
        this.c = weakReference;
    }

    @Override
    public final void a(Typeface object) {
        Typeface typeface = object;
        if (Build.VERSION.SDK_INT >= 28) {
            int n2 = this.a;
            typeface = object;
            if (n2 != -1) {
                boolean bl2 = (this.b & 2) != 0;
                typeface = fs$$ExternalSyntheticApiModelOutline0.m(object, n2, bl2);
            }
        }
        object = this.d;
        WeakReference weakReference = this.c;
        if (object.c) {
            object.b = typeface;
            if ((weakReference = (TextView)weakReference.get()) != null) {
                if (weakReference.isAttachedToWindow()) {
                    weakReference.post(new mp((TextView)weakReference, typeface, object.a, 1));
                    return;
                }
                ie.f((TextView)weakReference, typeface, object.a);
            }
        }
    }

    @Override
    public final void b() {
    }
}

