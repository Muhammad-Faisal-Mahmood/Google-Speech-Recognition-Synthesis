/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 *  hom
 */
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class ggm
implements ghb {
    public final ggh a;
    public final dus b;

    public /* synthetic */ ggm(ggh ggh2, dus dus2) {
        this.a = ggh2;
        this.b = dus2;
    }

    @Override
    public final hpn a() {
        Object object = new ggn(this.b);
        Object object2 = goo.a;
        object2 = fxf.at("Registering packages with phenotype", gqv.a, (gop)object2);
        ggh ggh2 = this.a;
        try {
            Object object3 = ggh2.f.keySet();
            Object object4 = new ArrayList(jns.B(object3));
            object3 = object3.iterator();
            while (object3.hasNext()) {
                String string = (String)object3.next();
                string = ggh2.m.h(string);
                Object object5 = ggh2.j;
                Object object6 = new ggj((knl)object5, string);
                object6 = gqk.j((Callable)object6);
                Object object7 = ((knl)object5).c.bf((Callable)object6);
                jse.d(object7, "submit(...)");
                object5 = new evy(ggh2, string, (jrq)object, 2);
                object6 = new frm(object5, 15);
                object6 = fxf.ak((hpn)object7, (hny)object6, ggh2.b);
                object7 = new ezq(ggh2, string, 4);
                object5 = new ggg((jrk)object7);
                object5 = fxf.ak((hpn)object6, (hny)object5, (Executor)hom.a);
                gax.c((hpn)object5, "Failed to register for %s", string);
                object4.add(object5);
            }
            object4 = fxf.aB(object4);
            object = new frn(ggh2, 15);
            ((gol)object2).a(((cxt)object4).C((hnx)object, (Executor)hom.a));
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                jsd.f((Closeable)object2, throwable);
                throw throwable2;
            }
        }
        jsd.f((Closeable)object2, null);
        return hpj.a;
    }
}

