/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 */
import android.app.Service;

public final class ilq
implements ilw {
    private final Service a;
    private Object b;

    public ilq(Service service) {
        this.a = service;
    }

    @Override
    public final Object bn() {
        if (this.b == null) {
            Object object = this.a.getApplication();
            fvc.ak(object instanceof ilw, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", object.getClass());
            awf awf2 = ((ilp)idi.e(object, ilp.class)).O();
            awf2.b = this.a;
            idi.k(awf2.b, Service.class);
            object = awf2.a;
            awf2 = (Service)awf2.b;
            this.b = new bre((brg)object, (Service)awf2);
        }
        return this.b;
    }
}

