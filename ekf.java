/*
 * Decompiled with CFR 0.152.
 */
public final class ekf
implements ekd {
    private final int a;
    private final eam b;

    public ekf(int n2, eam eam2) {
        jse.e(eam2, "params");
        this.a = n2;
        this.b = eam2;
    }

    @Override
    public final int a() {
        return this.a;
    }

    @Override
    public final eam b() {
        return this.b;
    }

    @Override
    public final /* synthetic */ epc c() {
        return cqq.at(this);
    }

    @Override
    public final /* synthetic */ etp d() {
        return cqq.au(this);
    }

    @Override
    public final boolean e() {
        return true;
    }
}

