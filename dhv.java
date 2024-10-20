/*
 * Decompiled with CFR 0.152.
 */
public final class dhv {
    public dfd a;
    public ddu b;
    public int c;
    private final dgv d;
    private hpn e;

    public dhv(dfd dfd2, dgv dgv2) {
        this.a = dfd2;
        this.b = dis.a(dfd2);
        this.d = dgv2;
        this.c = 2;
    }

    final boolean a() {
        return this.e != null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(int n2, cxv cxv2) {
        Object object;
        Object object2;
        Object object3;
        if (this.a()) return;
        try {
            object3 = (hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/ActiveDownloads$DownloadContext", "pause", 268, "ActiveDownloads.java");
            object2 = this.a.d().e();
            object = n2 != 3 ? (n2 != 4 ? (n2 != 5 ? "PREEMPTED" : "PARAMETERS_CHANGED") : "JOB_STOPPED") : "CANCELLATION";
            object3.C("Pausing download %s, reason: %s", object2, object);
            object3 = ddn.d(this.a.i());
            object = this.d;
            synchronized (object) {
            }
        }
        catch (IllegalStateException illegalStateException) {
            ((hfk)((hfk)((hfk)ddd.a.g()).i(illegalStateException)).j("com/google/android/libraries/micore/superpacks/scheduling/ActiveDownloads$DownloadContext", "pause", 292, "ActiveDownloads.java")).u("Failed to parse download %s for canceling", this.a.d().e());
            return;
        }
        {
            object2 = (dgu)((dgv)object).c.get(object3);
            if (object2 != null) {
                ((dgu)object2).a();
            }
        }
        {
            object = new dbc(this, 7);
            cxv2.a((dau)object);
            this.c = n2;
            this.e = this.d.a((ddn)object3);
            return;
        }
    }

    public final String toString() {
        String string = this.a.i();
        String string2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

