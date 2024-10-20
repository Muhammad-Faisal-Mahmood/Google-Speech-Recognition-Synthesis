/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class klk
implements kmk {
    final kll a;
    final kmk b;

    public klk(kll kll2, kmk kmk2) {
        this.a = kll2;
        this.b = kmk2;
    }

    @Override
    public final /* synthetic */ kmm a() {
        return this.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long b(klm klm2, long l2) {
        Throwable throwable2222222;
        kll kll2 = this.a;
        kll2.e();
        Object object = this.b;
        l2 = object.b(klm2, l2);
        if (kll2.f()) throw kll2.d(null);
        return l2;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            object = iOException;
            {
                if (!kll2.f()) throw object;
                object = kll2.d(iOException);
                throw object;
            }
        }
        kll2.f();
        throw throwable2222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        Throwable throwable2222222;
        kll kll2 = this.a;
        kll2.e();
        kmk kmk2 = this.b;
        kmk2.close();
        if (kll2.f()) throw kll2.d(null);
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            IOException iOException = iOException;
            {
                if (!kll2.f()) throw iOException;
                iOException = kll2.d(iOException);
                throw iOException;
            }
        }
        kll2.f();
        throw throwable2222222;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.source(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

