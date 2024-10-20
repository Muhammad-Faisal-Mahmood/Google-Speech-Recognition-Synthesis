/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

public class qn
extends qg {
    public ArrayList aI = new ArrayList();

    @Override
    public final void S(AmbientDelegate ambientDelegate) {
        super.S(ambientDelegate);
        int n2 = this.aI.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((qg)this.aI.get(i2)).S(ambientDelegate);
        }
    }

    public void T() {
        Object object = this.aI;
        if (object != null) {
            int n2 = ((ArrayList)object).size();
            for (int i2 = 0; i2 < n2; ++i2) {
                object = (qg)this.aI.get(i2);
                if (!(object instanceof qn)) continue;
                ((qn)object).T();
            }
        }
    }

    public final void Y(qg qg2) {
        this.aI.remove(qg2);
        qg2.s();
    }

    @Override
    public void s() {
        this.aI.clear();
        super.s();
    }
}

