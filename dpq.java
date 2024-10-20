/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioRecord
 */
import android.content.Context;
import android.media.AudioRecord;
import java.util.concurrent.Executor;

public final class dpq {
    public final Object a;
    public final Object b;

    public dpq(Context context) {
        this.a = new dmc();
        this.b = context;
    }

    public dpq(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        jnu3.getClass();
        this.b = jnu3;
    }

    public dpq(jnu jnu2, jnu jnu3, byte[] byArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
    }

    public dpq(jnu jnu2, jnu jnu3, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
    }

    public dpq(jnu jnu2, jnu jnu3, byte[] byArray, char[] cArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
    }

    public dpq(jnu jnu2, jnu jnu3, char[] cArray) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.b = jnu3;
    }

    public final eds a(edo edo2, ekk ekk2) {
        edo2.getClass();
        ekk2.getClass();
        bzo bzo2 = (bzo)this.b.b();
        bzo2.getClass();
        ell ell2 = (ell)this.a.b();
        ell2.getClass();
        return new eds(edo2, ekk2, bzo2, ell2);
    }

    public final egw b(int n2, gto gto2, gto gto3) {
        czh czh2 = ((end)this.a).a();
        Executor executor = (Executor)this.b.b();
        executor.getClass();
        return new egw(n2, gto2, gto3, czh2, executor);
    }

    public final egq c(AudioRecord audioRecord, efx efx2, gto gto2, efs efs2) {
        audioRecord.getClass();
        efx2.getClass();
        efs2.getClass();
        Object object = this.a;
        Object object2 = this.b.b();
        boolean bl2 = (Boolean)object.b();
        return new egq(audioRecord, efx2, gto2, efs2, (dlm)object2, bl2);
    }
}

