/*
 * Decompiled with CFR 0.152.
 */
public final class evu {
    public static final evr a = new evr();
    public final evw b;
    public final ewc c;

    public evu(evw evw2, ewc ewc2) {
        jse.e(evw2, "memoryStore");
        jse.e(ewc2, "persistentStore");
        this.b = evw2;
        this.c = ewc2;
    }

    public final boolean a(ely object) {
        int n2;
        jse.e(object, "storingDestination");
        elz elz2 = elz.b(((ely)object).c);
        object = elz2;
        if (elz2 == null) {
            object = elz.a;
        }
        if ((n2 = ((Enum)object).ordinal()) != 0 && n2 != 1) {
            if (n2 == 2) {
                return this.c.b;
            }
            throw new joa();
        }
        return true;
    }
}

