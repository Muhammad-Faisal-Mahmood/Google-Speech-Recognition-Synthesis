/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class hih
implements Iterable {
    final hav a;
    final AmbientModeSupport$AmbientController b;

    public hih(AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, hav hav2) {
        this.a = hav2;
        this.b = ambientModeSupport$AmbientController;
    }

    public final Iterator iterator() {
        hdx hdx2 = this.a.k();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque<hdx> arrayDeque2 = new ArrayDeque<hdx>();
        arrayDeque2.add(hdx2);
        return new hii(arrayDeque2, arrayDeque);
    }
}

