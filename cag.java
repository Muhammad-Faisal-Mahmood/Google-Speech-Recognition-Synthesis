/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public abstract class cag {
    public final caf a;
    protected boolean b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public Set g;
    public String h;
    public String i;
    public final cao j;
    public final hpn k;
    public cao l;
    public boolean m;
    public final hwr n;

    protected cag(caf object) {
        hwr hwr2;
        this.n = hwr2 = (hwr)ikp.a.l();
        this.b = false;
        Object var6_3 = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.m = false;
        this.a = object;
        this.i = ((caf)object).g;
        this.h = null;
        Object object2 = ((caf)object).e.getApplicationContext() instanceof cal ? (cal)((caf)object).e.getApplicationContext() : (cal)can.a.get();
        Object object3 = object2 != null ? object2.a() : null;
        if (object3 == null) {
            this.j = null;
        } else {
            Object object4 = ((cao)object3).b;
            if (object4 != ikq.b && object4 != ikq.c) {
                object3 = object4.toString();
                String string = String.valueOf(ikq.b);
                object4 = String.valueOf(ikq.c);
                StringBuilder stringBuilder = new StringBuilder("The provided ProductIdOrigin ");
                stringBuilder.append((String)object3);
                stringBuilder.append(" is not one of the process-level expected values: ");
                stringBuilder.append(string);
                stringBuilder.append(" or ");
                stringBuilder.append((String)object4);
                Log.e((String)"AbstractLogEventBuilder", (String)stringBuilder.toString());
                this.j = null;
            } else {
                this.j = object3;
            }
        }
        object3 = var6_3;
        if (object2 != null) {
            object3 = object2.b();
        }
        this.k = object3;
        long l2 = System.currentTimeMillis();
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        object2 = (ikp)hwr2.b;
        ((ikp)object2).b |= 1;
        ((ikp)object2).c = l2;
        l2 = ((ikp)hwr2.b).c;
        l2 = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(l2));
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        object2 = (ikp)hwr2.b;
        ((ikp)object2).b |= 0x20000;
        ((ikp)object2).g = l2;
        if (crt.d(((caf)object).e)) {
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            object = (ikp)hwr2.b;
            ((ikp)object).b |= 0x800000;
            ((ikp)object).h = true;
        }
        if ((l2 = SystemClock.elapsedRealtime()) != 0L) {
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            object = (ikp)hwr2.b;
            ((ikp)object).b |= 2;
            ((ikp)object).d = l2;
        }
    }

    public abstract ckz a();

    public final void b(cao object) {
        Object object2;
        Object object3 = object2 = ((ikp)this.n.b).j;
        if (object2 == null) {
            object3 = ikr.a;
        }
        object2 = (hwp)((hwv)object3).C(5);
        ((hwp)object2).x((hwv)object3);
        hwr hwr2 = (hwr)object2;
        object2 = ((cao)object).b;
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        object3 = (ikr)hwr2.b;
        ((ikr)object3).d = ((ikq)object2).l;
        ((ikr)object3).b |= 2;
        object3 = object2 = ((ikr)object3).c;
        if (object2 == null) {
            object3 = ias.a;
        }
        hwp hwp2 = (hwp)((hwv)object3).C(5);
        hwp2.x((hwv)object3);
        object3 = object2 = ((ias)hwp2.b).c;
        if (object2 == null) {
            object3 = iar.a;
        }
        object2 = (hwp)((hwv)object3).C(5);
        ((hwp)object2).x((hwv)object3);
        int n2 = ((cao)object).a;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object = (iar)((hwp)object2).b;
        ((iar)object).b |= 1;
        ((iar)object).c = n2;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (ias)hwp2.b;
        object3 = (iar)((hwp)object2).o();
        object3.getClass();
        ((ias)object).c = object3;
        ((ias)object).b |= 1;
        object = this.n;
        if (!hwr2.b.B()) {
            ((hwp)hwr2).u();
        }
        object3 = (ikr)hwr2.b;
        object2 = (ias)hwp2.o();
        object2.getClass();
        ((ikr)object3).c = object2;
        ((ikr)object3).b |= 1;
        object3 = (ikr)hwr2.o();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object = (ikp)((hwr)object).b;
        object3.getClass();
        ((ikp)object).j = object3;
        ((ikp)object).b |= 0x8000000;
    }

    public final void c(int[] nArray) {
        if (!this.a.c()) {
            int n2 = nArray.length;
            if (n2 != 0) {
                int n3;
                ArrayList arrayList = this.e;
                int n4 = n3 = 0;
                if (arrayList == null) {
                    this.e = new ArrayList();
                    n4 = n3;
                }
                while (n4 < n2) {
                    n3 = nArray[n4];
                    this.e.add(n3);
                    ++n4;
                }
            }
            return;
        }
        throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
    }

    public final void d(String string) {
        if (!this.a.c()) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(string);
            return;
        }
        throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
    }

    public final void e(int n2) {
        hwt hwt2 = this.n;
        if (!hwt2.b.B()) {
            ((hwp)((Object)hwt2)).u();
        }
        hwt2 = (ikp)hwt2.b;
        ikp ikp2 = ikp.a;
        ((ikp)hwt2).b |= 0x20;
        ((ikp)hwt2).e = n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        stringBuilder.append(this.h);
        stringBuilder.append(", logSourceName: ");
        stringBuilder.append(this.i);
        stringBuilder.append(", qosTier: 0, veMessage: null, testCodes: ");
        Object object = this.c;
        Object var2_3 = null;
        object = object != null ? caf.a((Iterable)object) : null;
        stringBuilder.append((String)object);
        stringBuilder.append(", mendelPackages: ");
        object = this.d;
        object = object != null ? caf.a((Iterable)object) : null;
        stringBuilder.append((String)object);
        stringBuilder.append(", experimentIds: ");
        object = this.e;
        object = object != null ? caf.a((Iterable)object) : null;
        stringBuilder.append((String)object);
        stringBuilder.append(", experimentTokens: ");
        ArrayList arrayList = this.f;
        object = var2_3;
        if (arrayList != null) {
            object = caf.a(arrayList);
        }
        stringBuilder.append((String)object);
        stringBuilder.append(", addPhenotype: true]");
        return stringBuilder.toString();
    }
}

