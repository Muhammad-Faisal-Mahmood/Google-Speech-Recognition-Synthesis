/*
 * Decompiled with CFR 0.152.
 */
import java.security.Provider;

public final class fpd
extends Provider {
    public fpd() {
        super("Ssl_Guard", 1.01, "Makes SSL Connections wait for security patches.");
        String string = fpa.class.getName();
        this.put("SSLContext.SSL", string);
        this.put("SSLContext.SSLv3", string);
        this.put("SSLContext.TLS", string);
        this.put("SSLContext.TLSv1", string);
        this.put("SSLContext.TLSv1.1", string);
        this.put("SSLContext.TLSv1.2", string);
        this.put("SSLContext.Default", string);
    }
}

