/*
 * Decompiled with CFR 0.152.
 */
class azm
extends aay {
    protected th[] m = null;
    String n;
    int o = 0;
    int p;

    public azm() {
        super(null);
    }

    public azm(azm azm2) {
        super(null);
        this.n = azm2.n;
        int n2 = azm2.p;
        this.p = 0;
        this.m = kt.j(azm2.m);
    }

    public th[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public boolean l() {
        return false;
    }

    public void setPathData(th[] thArray) {
        block5: {
            int n2;
            Object[] objectArray = this.m;
            if (objectArray != null && thArray != null && objectArray.length == (n2 = thArray.length)) {
                Object object;
                int n3;
                for (n2 = 0; n2 < objectArray.length; ++n2) {
                    th th2 = objectArray[n2];
                    n3 = th2.a;
                    object = thArray[n2];
                    if (n3 == object.a && th2.b.length == object.b.length) {
                        continue;
                    }
                    break block5;
                }
                object = this.m;
                for (n2 = 0; n2 < thArray.length; ++n2) {
                    object[n2].a = thArray[n2].a;
                    for (n3 = 0; n3 < (objectArray = (Object[])thArray[n2].b).length; ++n3) {
                        object[n2].b[n3] = (float)objectArray[n3];
                    }
                }
                return;
            }
        }
        this.m = kt.j(thArray);
    }
}

