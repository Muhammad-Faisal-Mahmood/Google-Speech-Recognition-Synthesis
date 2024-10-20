/*
 * Decompiled with CFR 0.152.
 */
final class epk
extends jsf
implements jrk {
    final epm a;
    final epc b;
    final int c;
    private final int d;

    public epk(epm epm2, epc epc2, int n2, int n3) {
        this.d = n3;
        this.a = epm2;
        this.b = epc2;
        this.c = n2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        boolean bl2;
        if (this.d != 0) {
            object = (ebv)object;
            jse.e(object, "it");
            this.a.e(this.b, this.c, (ebv)object, true);
            return jon.a;
        }
        Object object2 = (ebg)object;
        jse.e(object2, "it");
        object = ekr.j((ebg)object2);
        jse.e(object2, "<this>");
        switch (((Enum)object2).ordinal()) {
            default: {
                throw new joa();
            }
            case 3: 
            case 6: 
            case 18: 
            case 19: 
            case 20: {
                bl2 = true;
                break;
            }
            case 0: 
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: {
                bl2 = false;
            }
        }
        int n2 = this.c;
        object2 = this.b;
        this.a.e((epc)object2, n2, (ebv)object, bl2 ^ true);
        return jon.a;
    }
}

