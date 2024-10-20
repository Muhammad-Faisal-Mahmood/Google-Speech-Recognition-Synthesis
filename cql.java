/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

final class cql
extends AbstractOwnableSynchronizer {
    public final void a(Thread thread) {
        this.setExclusiveOwnerThread(thread);
    }
}

