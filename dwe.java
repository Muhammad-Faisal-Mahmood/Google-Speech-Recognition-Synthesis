/*
 * Decompiled with CFR 0.152.
 */
public final class dwe
implements dwf {
    private final int a;

    public /* synthetic */ dwe(int n2) {
        this.a = n2;
    }

    @Override
    public final Object a(Object object) {
        switch (this.a) {
            default: {
                object = (byte[])object;
                bvv bvv2 = bvv.a;
                int n2 = ((Object)object).length;
                Object object2 = hwj.a;
                object2 = hyo.a;
                object = hwv.o(bvv2, (byte[])object, 0, n2, hwj.a);
                hwv.D((hwv)object);
                return (bvv)object;
            }
            case 16: {
                return fvc.ag(object);
            }
            case 15: {
                return fvc.ag(object);
            }
            case 14: {
                return fvc.ag(object);
            }
            case 13: {
                return fvc.ag(object);
            }
            case 12: {
                return fvc.ag(object);
            }
            case 11: {
                return fvc.ag(object);
            }
            case 10: {
                return fvc.ag(object);
            }
            case 9: {
                object = (byte[])object;
                dpo dpo2 = dpo.a;
                int n3 = ((Object)object).length;
                Object object3 = hwj.a;
                object3 = hyo.a;
                object = hwv.o(dpo2, (byte[])object, 0, n3, hwj.a);
                hwv.D((hwv)object);
                return (dpo)object;
            }
            case 8: {
                object = (byte[])object;
                dns dns2 = dns.a;
                int n4 = ((Object)object).length;
                Object object4 = hwj.a;
                object4 = hyo.a;
                object = hwv.o(dns2, (byte[])object, 0, n4, hwj.a);
                hwv.D((hwv)object);
                return (dns)object;
            }
            case 7: {
                object = (byte[])object;
                dnt dnt2 = dnt.a;
                int n5 = ((Object)object).length;
                Object object5 = hwj.a;
                object5 = hyo.a;
                object = hwv.o(dnt2, (byte[])object, 0, n5, hwj.a);
                hwv.D((hwv)object);
                return (dnt)object;
            }
            case 6: {
                object = (byte[])object;
                dnh dnh2 = dnh.a;
                int n6 = ((Object)object).length;
                Object object6 = hwj.a;
                object6 = hyo.a;
                object = hwv.o(dnh2, (byte[])object, 0, n6, hwj.a);
                hwv.D((hwv)object);
                return (dnh)object;
            }
            case 5: {
                return fvc.ag(object);
            }
            case 4: {
                return fvc.ag(object);
            }
            case 3: {
                byte[] byArray = (byte[])object;
                object = kdb.a;
                int n7 = byArray.length;
                Object object7 = hwj.a;
                object7 = hyo.a;
                object = hwv.o((hwv)object, byArray, 0, n7, hwj.a);
                hwv.D((hwv)object);
                return (kdb)object;
            }
            case 2: {
                return (String)object;
            }
            case 1: {
                return Long.parseLong((String)object);
            }
            case 0: 
        }
        return Boolean.parseBoolean((String)object);
    }
}

