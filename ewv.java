/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import org.json.JSONObject;

public final class ewv
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final jnu i;
    private final jnu j;

    public ewv(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
        this.j = jnu11;
    }

    @Override
    public final /* synthetic */ Object b() {
        boolean bl2 = ((imr)this.a).a();
        CharSequence charSequence = ((iqx)this.b).a();
        hwg hwg2 = ((iqw)this.c).a();
        boolean bl3 = ((imr)this.d).a();
        boolean bl4 = ((imr)this.e).a();
        boolean bl5 = ((imr)this.f).a();
        Object object = ((iqx)this.g).a();
        hwg hwg3 = ((iqw)this.h).a();
        boolean bl6 = ((imr)this.i).a();
        long l2 = ((ims)this.j).a();
        charSequence = new JSONObject().put("quic_version", (Object)"h3").put("connection_options", (Object)charSequence).put("migrate_sessions_on_network_change_v2", true).put("retransmittable_on_wire_timeout_milliseconds", 200).put("set_quic_flags", (Object)"FLAGS_quic_max_aggressive_retransmittable_on_wire_ping_count=200").put("migrate_sessions_early_v2", true).put("retry_on_alternate_network_before_handshake", true).put("race_cert_verification", true).put("max_server_configs_stored_in_properties", 20).put("idle_connection_timeout_seconds", 300);
        long l3 = hwg2.b;
        if (l3 > 0L) {
            charSequence.put("initial_delay_for_broken_alternative_service_seconds", l3);
        }
        hwg2 = new JSONObject().put("AsyncDNS", (Object)new JSONObject().put("enable", bl5));
        JSONObject jSONObject = new JSONObject().put("enable", true);
        hzu.d(hwg3);
        hwg3 = hwg2.put("StaleDNS", jSONObject.put("delay_ms", hhk.ap(hhk.aq(hwg3.b, 1000L), hwg3.c / 1000000)).put("allow_other_network", true).put("persist_to_disk", true).put("max_expired_time_ms", 1814400000).put("use_stale_on_name_not_resolved", true)).put("enable_telemetry", bl3);
        if (object.length() > 0) {
            hwg3.put("HostResolverRules", new JSONObject().put("host_resolver_rules", object));
        }
        if (bl4) {
            hwg3.put("QUIC", charSequence);
        }
        object = new hse();
        ((hse)object).e(true);
        ((hse)object).b(false);
        ((hse)object).c(false);
        ((hse)object).i = (byte)(((hse)object).i | 8);
        ((hse)object).d(false);
        ((hse)object).a(1000);
        ((hse)object).i = (byte)(((hse)object).i | 0x40);
        ((hse)object).f(20);
        ((hse)object).e(bl4);
        ((hse)object).b(true);
        ((hse)object).g = hwg3.toString();
        ((hse)object).d(bl2);
        ((hse)object).f(-2);
        ((hse)object).a = "cronet_cache";
        ((hse)object).c(bl6);
        ((hse)object).a((int)l2);
        if (((hse)object).i != -1) {
            charSequence = new StringBuilder();
            if ((((hse)object).i & 1) == 0) {
                ((StringBuilder)charSequence).append(" enableQuic");
            }
            if ((((hse)object).i & 2) == 0) {
                ((StringBuilder)charSequence).append(" enableBrotli");
            }
            if ((((hse)object).i & 4) == 0) {
                ((StringBuilder)charSequence).append(" enableCertificateCache");
            }
            if ((((hse)object).i & 8) == 0) {
                ((StringBuilder)charSequence).append(" enableHttpCache");
            }
            if ((((hse)object).i & 0x10) == 0) {
                ((StringBuilder)charSequence).append(" enableNetworkQualityEstimator");
            }
            if ((((hse)object).i & 0x20) == 0) {
                ((StringBuilder)charSequence).append(" diskCacheSizeBytes");
            }
            if ((((hse)object).i & 0x40) == 0) {
                ((StringBuilder)charSequence).append(" inMemoryFallbackCacheSizeBytes");
            }
            if ((((hse)object).i & 0x80) == 0) {
                ((StringBuilder)charSequence).append(" threadPriority");
            }
            throw new IllegalStateException("Missing required properties:".concat(charSequence.toString()));
        }
        object = new hsf(((hse)object).a, ((hse)object).b, ((hse)object).c, ((hse)object).d, ((hse)object).e, ((hse)object).f, ((hse)object).g, ((hse)object).h);
        if (((hsf)object).d) {
            bl5 = ((hsf)object).a != null;
            fxf.B(bl5, "Must specify cache storage path.");
        }
        return object;
    }
}

