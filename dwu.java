/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.util.Log
 */
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;

public final class dwu
implements gui {
    public final int a;
    public final int b;
    public final flh c;

    public /* synthetic */ dwu(flh flh2, int n2, int n3) {
        this.c = flh2;
        this.a = n2;
        this.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        Object object;
        Resources resources;
        hwp hwp2 = hqp.a.l();
        flh flh2 = this.c;
        int n2 = this.a;
        Object object2 = null;
        try {
            resources = ((dwv)flh2.c).a();
            if (resources == null) {
                String string = ((dwv)flh2.c).a;
                object = new StringBuilder("Failed to read Phenotype registration resources from ");
                ((StringBuilder)object).append(string);
                Log.i((String)"PhenotypeResourceReader", (String)((StringBuilder)object).toString());
                return object2;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.i((String)"PhenotypeResourceReader", (String)"Failed to read Phenotype registration resources from ".concat(String.valueOf(((dwv)flh2.c).a)));
            return object2;
        }
        try {
            flh2.b(hwp2, resources, n2);
            long l2 = (Long)((dwv)flh2.c).b.a();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (hqp)hwp2.b;
            ((hqp)object).b |= 0x80;
            ((hqp)object).l = l2;
        }
        catch (IOException | NullPointerException exception) {
            Log.i((String)"PhenotypeResourceReader", (String)"Failed to read Phenotype registration resources from ".concat(String.valueOf(((dwv)flh2.c).a)));
            return object2;
        }
        Object object3 = ((hqp)object).g;
        n2 = ((String)object3).indexOf(35);
        object = object3;
        if (n2 >= 0) {
            object = ((String)object3).substring(0, n2);
        }
        object3 = flh2.b;
        fxf.E(((String)object).equals(object3), "Resource package does not match expected package, expected package: %s", object3);
        object = (hqp)hwp2.b;
        object3 = ((hqp)object).g;
        Object object4 = flh2.c;
        boolean bl2 = ((hqp)object).h;
        if (((String)object3).isEmpty()) throw new IllegalArgumentException("Empty configuration package");
        object = object3;
        if (bl2) {
            if (((String)object3).indexOf(35) >= 0) {
                throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", Character.valueOf('#'), object3));
            }
            object4 = ((dwv)object4).a;
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append("#");
            ((StringBuilder)object).append((String)object4);
            object = ((StringBuilder)object).toString();
        }
        if (((hqp)hwp2.b).c != 2) {
            object3 = (Integer)((dwv)flh2.c).c.a();
            ((Integer)object3).intValue();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object4 = (hqp)hwp2.b;
            ((hqp)object4).c = 2;
            ((hqp)object4).d = object3;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object3 = hwp2.b;
        object4 = (hqp)object3;
        object.getClass();
        ((hqp)object4).b |= 1;
        ((hqp)object4).g = object;
        object = flh2.c;
        if (!((hwv)object3).B()) {
            hwp2.u();
        }
        object = ((dwv)object).a;
        object3 = hwp2.b;
        object4 = (hqp)object3;
        object.getClass();
        ((hqp)object4).e = 7;
        ((hqp)object4).f = object;
        if (!((hwv)object3).B()) {
            hwp2.u();
        }
        n2 = this.b;
        object = (hqp)hwp2.b;
        ((hqp)object).k = 3;
        ((hqp)object).b |= 0x20;
        if (n2 == 0) {
            return (hqp)hwp2.o();
        }
        object = dwr.a.l();
        try {
            flh2.b((hye)object, resources, n2);
        }
        catch (IOException iOException) {
            Log.i((String)"PhenotypeResourceReader", (String)"Failed to read Phenotype HeterodyneInfo resources from ".concat(String.valueOf(((dwv)flh2.c).a)));
            return object2;
        }
        fxf.G(((dwr)((hwp)object).b).c.equals(flh2.b), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((dwr)((hwp)object).b).c, flh2.b);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object2 = (dwr)((hwp)object).b;
        ((dwr)object2).b &= 0xFFFFFFFE;
        ((dwr)object2).c = dwr.a.c;
        object2 = ((dwr)((hwp)object).o()).e();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (hqp)hwp2.b;
        ((hqp)object).b |= 0x100;
        ((hqp)object).m = object2;
        return (hqp)hwp2.o();
    }
}

