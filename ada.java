/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SequencedCollection;

public final class ada
extends ade
implements Runnable {
    public boolean a;
    final adb b;

    public ada(adb adb2) {
        this.b = adb2;
    }

    @Override
    public final Object a() {
        ArrayList<String[]> arrayList = this.b;
        SequencedCollection sequencedCollection = new SequencedCollection();
        String[] stringArray = crh.E(((adc)((Object)arrayList)).e.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        int n2 = stringArray.length;
        arrayList = new ArrayList<String[]>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = stringArray[i2];
            int n3 = string.indexOf(32);
            Object object = string.substring(0, n3).split(":");
            boolean bl2 = ((String[])object).length == 2 && n3 > 0;
            fxf.E(bl2, "Invalid license meta-data line:\n%s", string);
            long l2 = Long.parseLong(object[0]);
            int n4 = Integer.parseInt(object[1]);
            string = string.substring(n3 + 1);
            object = new eys(string, l2, n4);
            arrayList.add((String[])object);
            continue;
        }
        try {
            Collections.sort(arrayList);
            sequencedCollection.addAll(arrayList);
            arrayList = new ArrayList<String[]>(sequencedCollection);
            sequencedCollection = DesugarCollections.unmodifiableList(arrayList);
            return sequencedCollection;
        }
        catch (ty ty2) {
            if (this.f()) {
                return null;
            }
            throw ty2;
        }
    }

    @Override
    public final void b(Object object) {
        adb adb2 = this.b;
        if (adb2.a == this) {
            if (adb2.g) {
                return;
            }
            SystemClock.uptimeMillis();
            adb2.a = null;
            adb2.b((List)object);
            return;
        }
        adb2.c(this);
    }

    @Override
    public final void c() {
        this.b.c(this);
    }

    @Override
    public final void run() {
        this.a = false;
        this.b.a();
    }
}

