/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class klj
implements kmi {
    final kll a;
    final kmi b;

    public klj(kll kll2, kmi kmi2) {
        this.a = kll2;
        this.b = kmi2;
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
    public final void bK(klm object, long l2) {
        Throwable throwable2222222;
        kll kll2;
        block9: {
            kmp.x(((klm)object).b, 0L, l2);
            while (true) {
                long l3;
                long l4 = 0L;
                if (l2 <= 0L) {
                    return;
                }
                Object object2 = ((klm)object).a;
                jse.b(object2);
                while (true) {
                    l3 = l4;
                    if (l4 >= 65536L) break;
                    if ((l4 += (long)(((kmf)object2).c - ((kmf)object2).b)) >= l2) {
                        l3 = l2;
                        break;
                    }
                    object2 = ((kmf)object2).f;
                    jse.b(object2);
                }
                kll2 = this.a;
                object2 = this.b;
                kll2.e();
                object2.bK((klm)object, l3);
                if (kll2.f()) break;
                l2 -= l3;
                continue;
                {
                    catch (Throwable throwable2222222) {
                        break block9;
                    }
                    catch (IOException iOException) {}
                    object = iOException;
                    {
                        if (kll2.f()) {
                            object = kll2.d(iOException);
                        }
                        throw object;
                    }
                }
            }
            throw kll2.d(null);
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
        kmi kmi2 = this.b;
        kmi2.close();
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void flush() {
        Throwable throwable2222222;
        kll kll2 = this.a;
        kll2.e();
        kmi kmi2 = this.b;
        kmi2.flush();
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
        StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.sink(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

