/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public abstract class bvi
extends dp {
    private btn k;
    private final bul l = new bvg(this, 0);

    public abstract void E();

    public final void J() {
        this.runOnUiThread(new bpv(this, 13));
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = ((bvh)fvd.l(this.getApplicationContext(), bvh.class)).k();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onPause() {
        btn btn2 = this.k;
        Object object = btn2.b;
        bul bul2 = this.l;
        synchronized (object) {
            btn2.d.remove(bul2);
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        this.k.c(this.l);
        this.J();
    }
}

