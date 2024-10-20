/*
 * Decompiled with CFR 0.152.
 */
public final class gjn
implements iua {
    final gjl a;

    public gjn(gjl gjl2) {
        this.a = gjl2;
    }

    @Override
    public final itz a(ixb ixb2, itw itw2, itx itx2) {
        Object object = this.a;
        String string = ((gjl)object).a;
        object = ((gjl)object).b;
        itv itv2 = hri.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        stringBuilder.append(object);
        return new iva(itx2.a(ixb2, itw2.f(itv2, stringBuilder.toString())));
    }
}

