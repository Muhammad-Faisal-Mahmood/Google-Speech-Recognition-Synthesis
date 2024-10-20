/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface hpq
extends ExecutorService {
    public hpn be(Runnable var1);

    public hpn bf(Callable var1);

    public hpn bg(Runnable var1, Object var2);
}

