/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.StateSet
 */
import android.content.Context;
import android.util.StateSet;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Collection$_EL;
import j$.util.Comparator$_CC;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import java.text.Collator;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public final class izk {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public izk(int n2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, Executor executor) {
        this.a = n2;
        this.d = ambientModeSupport$AmbientController;
        this.c = executor;
        this.b = new ConcurrentHashMap(8);
    }

    public izk(buc buc2, bsw bsw2, int n2, brx brx2) {
        a.s(brx2, "Null locale received.");
        fxf.r(brz.d(buc2).contains(brx2), "Voice pack entry being created for a locale not supported by its voice metadata.");
        this.d = brx2;
        this.c = buc2;
        this.b = bsw2;
        this.a = n2;
    }

    public izk(kqr kqr2) {
        this.a = kqr2.a;
        this.d = kqr2.b;
        this.c = kqr2.d;
        this.b = kqr2.c;
    }

    public static gzx b(Context object, List object2) {
        object = Collator.getInstance(ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(object.getResources().getConfiguration()), 0));
        Stream stream = Collection$_EL.stream((Collection)object2).map(new bpf(8));
        object2 = new bpf(9);
        Objects.requireNonNull(object);
        object = stream.sorted(Comparator$_CC.comparing(object2, new bvk(object, 0)));
        int n2 = gzx.d;
        return (gzx)object.collect(gye.a);
    }

    public final int a(int[] nArray) {
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (!StateSet.stateSetMatches((int[])((int[][])this.c)[i2], (int[])nArray)) continue;
            return i2;
        }
        return -1;
    }

    public final boolean c() {
        return (this.a & 0x20) != 0;
    }

    public final boolean d() {
        return (this.a & 0x10) != 0;
    }

    public final boolean e() {
        return this.b != null;
    }

    public final boolean f() {
        Object object = this.b;
        return object != null && ((bsw)object).c;
    }

    public final boolean g() {
        Object object = this.b;
        if (object != null) {
            Object object2 = this.c;
            if (((bsw)object).a.e < ((buc)object2).e && !this.d()) {
                return true;
            }
        }
        return false;
    }
}

