/*
 * Decompiled with CFR 0.152.
 */
final class dbe
implements dbv {
    @Override
    public final dbu a(dbx object2) {
        dbt dbt2 = dbu.e();
        for (Object object2 : object2.h()) {
            deq deq2 = der.g();
            deq2.f((den)object2);
            dbt2.b(deq2.a());
        }
        return dbt2.a();
    }

    @Override
    public final /* synthetic */ void b() {
    }

    public final String toString() {
        return "GetAllSlicingStrategy";
    }
}

