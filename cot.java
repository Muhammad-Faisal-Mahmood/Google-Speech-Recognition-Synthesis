/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class cot
extends coz {
    final hpr a;
    final jnu b;

    public cot(hpr hpr2, jnu jnu2) {
        this.a = hpr2;
        this.b = jnu2;
    }

    @Override
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable = new cou(runnable, this.b);
        this.a.execute(runnable);
    }

    @Override
    public final /* synthetic */ hpq f() {
        return this.a;
    }

    @Override
    public final /* synthetic */ ExecutorService g() {
        return this.a;
    }

    @Override
    public final hpr h() {
        return this.a;
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String toString() {
        String string = super.toString();
        StringBuilder stringBuilder = new StringBuilder("ExceptionHandling[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

