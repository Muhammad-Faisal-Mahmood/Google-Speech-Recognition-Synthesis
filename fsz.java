/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

abstract class fsz {
    final Object a;
    public final String b;
    public final fsw[] c;
    HashMap d;
    public int e;
    private final jnu f;
    private boolean g;

    public fsz(String object, jnu jnu2, fsw ... fswArray) {
        int n2 = 1;
        this.g = true;
        this.b = object;
        this.c = fswArray;
        int n3 = fswArray.length;
        if (n3 > 0) {
            n2 = 10;
        }
        this.d = object = new HashMap(n2);
        if (n3 == 0) {
            ((HashMap)object).put(fsq.b, this.a());
        }
        this.e = 0;
        this.f = jnu2;
        this.a = new Object();
    }

    public abstract fsr a();

    public final void c() {
        this.g = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void d(Object object, fsq object2) {
        ScheduledFuture<?> scheduledFuture;
        ScheduledFuture scheduledFuture2;
        Object object3 = this.a;
        synchronized (object3) {
            scheduledFuture2 = (fsr)this.d.get(object2);
            scheduledFuture = scheduledFuture2;
            if (scheduledFuture2 == null) {
                scheduledFuture = this.a();
                this.d.put(object2, scheduledFuture);
            }
            scheduledFuture.b(object);
            ++this.e;
        }
        object = ((ftb)this.f).a;
        if (object == null) {
            return;
        }
        scheduledFuture = (fte)object;
        if (((fte)((Object)scheduledFuture)).d.incrementAndGet() >= 100L) {
            object2 = ((fte)((Object)scheduledFuture)).f;
            synchronized (object2) {
                if (((fte)object).d.get() >= 100L) {
                    scheduledFuture = ((fte)object).f;
                    synchronized (scheduledFuture) {
                        scheduledFuture2 = ((fte)object).e;
                        if (scheduledFuture2 != null && !scheduledFuture2.isDone() && !((fte)object).e.isCancelled()) {
                            if (((fte)object).e.getDelay(TimeUnit.MILLISECONDS) > 100L) {
                                ((fte)object).c();
                                object3 = ((fte)object).a;
                                scheduledFuture2 = new ScheduledFuture(object, 10);
                                ((fte)object).e = scheduledFuture2 = object3.schedule((Runnable)((Object)scheduledFuture2), 1L, TimeUnit.MILLISECONDS);
                            }
                        } else {
                            scheduledFuture2 = ((fte)object).a;
                            object3 = new ffd(object, 10);
                            scheduledFuture2 = scheduledFuture2.schedule((Runnable)object3, 1L, TimeUnit.MILLISECONDS);
                            ((fte)object).e = scheduledFuture2;
                        }
                        return;
                    }
                }
            }
        }
        object2 = ((fte)((Object)scheduledFuture)).f;
        synchronized (object2) {
            scheduledFuture = ((fte)object).e;
            if (scheduledFuture == null || scheduledFuture.isDone() || ((fte)object).e.isCancelled()) {
                scheduledFuture = ((fte)object).a;
                scheduledFuture2 = new ScheduledFuture(object, 10);
                ((fte)object).e = scheduledFuture = scheduledFuture.schedule((Runnable)((Object)scheduledFuture2), ((fte)object).c, TimeUnit.MILLISECONDS);
            }
            return;
        }
    }

    protected final void e(Object ... object) {
        int n2 = this.c.length;
        int n3 = ((Object[])object).length;
        boolean bl2 = n2 == n3;
        fxf.q(bl2);
        if (this.g) {
            for (int i2 = 0; i2 < ((Object[])object).length; ++i2) {
                Class<?> clazz = object[i2];
                if (clazz != null) {
                    if (this.c[i2].b.isInstance(clazz)) {
                        continue;
                    }
                    String string = this.b;
                    object = ((Object)clazz).toString();
                    clazz = clazz.getClass();
                    Object object2 = this.c;
                    clazz = String.valueOf(clazz);
                    Object object3 = object2[i2];
                    object2 = ((fsw)object3).a;
                    object3 = ((Object)((fsw)object3).b).toString();
                    StringBuilder stringBuilder = new StringBuilder("Streamz ");
                    stringBuilder.append(string);
                    stringBuilder.append(" has parameter {index: ");
                    stringBuilder.append(i2);
                    stringBuilder.append(", value: ");
                    stringBuilder.append((String)object);
                    stringBuilder.append(", type: ");
                    stringBuilder.append((String)((Object)clazz));
                    stringBuilder.append("}, but expected: {name: ");
                    stringBuilder.append((String)object2);
                    stringBuilder.append(", type: ");
                    stringBuilder.append((String)object3);
                    stringBuilder.append("}");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                String string = this.b;
                object = Arrays.toString(object);
                clazz = new StringBuilder("Streamz ");
                ((StringBuilder)((Object)clazz)).append(string);
                ((StringBuilder)((Object)clazz)).append(" has null parameter: ");
                ((StringBuilder)((Object)clazz)).append((String)object);
                throw new NullPointerException(((StringBuilder)((Object)clazz)).toString());
            }
        }
    }

    final void f(fsw ... object) {
        if (Arrays.equals(this.c, (Object[])object)) {
            return;
        }
        String string = this.b;
        String string2 = Arrays.toString(this.c);
        String string3 = Arrays.toString((Object[])object);
        object = new StringBuilder("Streamz ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" with field diffs: ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" and ");
        ((StringBuilder)object).append(string3);
        throw new ftd(((StringBuilder)object).toString());
    }
}

