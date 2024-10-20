/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 *  android.os.CancellationSignal$OnCancelListener
 *  android.os.OperationCanceledException
 */
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.Closeable;

final class fsk
extends fsm
implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b = new CancellationSignal();

    public fsk(fsl fsl2) {
        super(fsl2);
    }

    @Override
    public final boolean cancel(boolean bl2) {
        this.b.cancel();
        return super.cancel(bl2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final void d(fsl fsl2) {
        block9: {
            this.b.setOnCancelListener((CancellationSignal.OnCancelListener)this);
            fsl2 = fsl2.a(this.b);
            {
                catch (OperationCanceledException operationCanceledException) {
                    super.cancel(true);
                    return;
                }
            }
            if (this.isCancelled() || fsl2 == null) break block9;
            fsl2.getCount();
        }
        if (this.m(fsl2)) return;
        fhq.e((Closeable)((Object)fsl2));
        return;
        catch (Throwable throwable) {
            this.n(throwable);
            {
                catch (Throwable throwable2) {
                    if (this.m(fsl2)) {
                        throw throwable2;
                    }
                    fhq.e((Closeable)((Object)fsl2));
                    throw throwable2;
                }
            }
            if (this.m(fsl2)) return;
            fhq.e((Closeable)((Object)fsl2));
            return;
        }
    }

    public final void onCancel() {
        super.cancel(true);
    }
}

