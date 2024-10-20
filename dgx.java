/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public abstract class dgx {
    public abstract dcv a();

    public abstract dej b();

    public abstract der c();

    public abstract des d();

    public abstract hac e();

    public deh f() {
        throw null;
    }

    public abstract elq g();

    public String toString() {
        gtn gtn2 = new gtn("");
        gtn2.d();
        gtn2.b("fetcher", crh.n(this.b()));
        gtn2.b("unpacker", crh.n(this.d()));
        if (!this.e().isEmpty()) {
            hdx hdx2 = this.e().k().k();
            while (hdx2.hasNext()) {
                Object object = (Map.Entry)hdx2.next();
                String string = (String)object.getKey();
                String string2 = crh.n((dgh)object.getValue());
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(": ");
                ((StringBuilder)object).append(string2);
                gtn2.b("validator", ((StringBuilder)object).toString());
            }
        }
        gtn2.f("size", this.c().f().d());
        gtn2.f("compressed", this.g().a);
        gtn2.b("scheme", this.g().b);
        gtn2.b("params", this.f());
        return gtn2.toString();
    }
}

