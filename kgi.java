/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

final class kgi
extends jsf
implements jqz {
    final jqz a;

    public kgi(jqz jqz2) {
        this.a = jqz2;
        super(0);
    }

    public final List b() {
        List list;
        try {
            list = (List)this.a.a();
        }
        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
            list = jpa.a;
        }
        return list;
    }
}

