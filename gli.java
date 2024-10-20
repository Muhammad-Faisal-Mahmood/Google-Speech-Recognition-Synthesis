/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import java.util.Arrays;

public final class gli {
    public final gmm a;
    public final gkk b;
    public final fym c;

    /*
     * Enabled aggressive block sorting
     */
    public gli(gmm object) {
        gml gml2;
        this.a = object;
        gml gml3 = gml2 = ((gmm)object).c;
        if (gml2 == null) {
            gml3 = gml.a;
        }
        this.b = new gkk(gml3);
        object = (((gmm)object).b & 2) != 0 ? fym.a(((gmm)object).d, gda.a) : null;
        this.c = object;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object object) {
        block2: {
            block4: {
                Object object2;
                block3: {
                    if (!(object instanceof gli)) break block2;
                    object2 = (gli)object;
                    if (!this.b.equals(((gli)object2).b)) break block2;
                    object = this.c;
                    object2 = ((gli)object2).c;
                    if (object != null) break block3;
                    if (object2 != null) break block2;
                    break block4;
                }
                if (!object.equals(object2)) break block2;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}

