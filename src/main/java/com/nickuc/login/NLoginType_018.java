/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.event.bukkit.auth.AuthenticateEvent
 *  com.nickuc.login.api.event.internal.EventPlayer
 *  com.nickuc.login.lib.caffeine.cache.Cache
 *  com.nickuc.login.lib.caffeine.cache.Caffeine
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONException
 *  com.nickuc.login.lib.json.JSONObject
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 *  org.bukkit.plugin.PluginManager
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.bukkit.auth.AuthenticateEvent;
import com.nickuc.login.api.event.internal.EventPlayer;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.tasks.SynchronizeWithServerThreadTask;
import com.nickuc.login.tasks.limbo.PlayerLimboProcessTask;
import com.nickuc.login.tasks.limbo.PlayerLimboRestoreTask;
import com.nickuc.login.NLoginCore_409;
import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_342;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.NLoginCore_285;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_134;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_480;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_121;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_482;
import com.nickuc.login.NLoginCore_504;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_393;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginType_016;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_527;
import com.nickuc.login.NLoginCore_370;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.PluginManager;

public class NLoginType_018 {
    private static long fu;
    private static long it;
    private static long cf;
    private static long le;
    private static int mb;
    private static int hb;
    private static long jl;
    private static long li;
    private static long bd;
    private static long nv;
    private static int je;
    private static int ph;
    private static long cs;
    private static int bu;
    private static long ek;
    private static int fe;
    private static long mw;
    private static long mn;
    private static long oq;
    private static long hf;
    private static long gq;
    private static long fn;
    private static int ft;
    private static long ku;
    private static int ex;
    private static long ny;
    private static long pp;
    private static int aj;
    private static long ed;
    private static int mt;
    private static long bk;
    private static int jw;
    private static long ld;
    private static long fd;
    private static int dk;
    private static int jt;
    private static int lg;
    private static int ad;
    private static int bo;
    private static long oh;
    private static long az;
    private static long nb;
    private static long db;
    private static long nh;
    private static long dm;
    private static int nm;
    private final Cache<NLoginCore_277, Object> cfr_renamed_27;
    private static long gb;
    private static int lc;
    private static int mg;
    private static int be;
    private static int my;
    private static float iw;
    private static int gp;
    private static int pn;
    private static int by;
    private static int pk;
    private static int kb;
    private static int lr;
    private static int dc;
    private static long am;
    private static int gl;
    private static long lb;
    private static int oa;
    private static int jr;
    private long var_long_d;
    private static int ja;
    private static long dd;
    private static long pd;
    private static int nw;
    private static int co;
    private static int jd;
    private static int bp;
    private static long ll;
    private static int nl;
    private static int bs;
    private static long lj;
    private static long jf;
    private static int lf;
    private static int md;
    private static long ib;
    private static int cm;
    private static long gr;
    private static int dn;
    private static int lw;
    private static int dq;
    private static int ak;
    private static int br;
    private static int v;
    private static long gv;
    private static int gk;
    private static int es;
    private static int fj;
    private static int lk;
    private static int kl;
    private static long u;
    private static int s;
    private static int mp;
    private static final long var_long_c = 15000L;
    private static int m;
    private static long fk;
    private static long no;
    private static long bh;
    private static int x;
    private static int gd;
    private static int oo;
    private static long im;
    private static long lq;
    private static long ne;
    private static int gs;
    private static long ng;
    private static long nk;
    private static long go;
    private static int fh;
    private static int oe;
    private static int lz;
    private static int j;
    private static long in;
    private static int or;
    private static long ls;
    private static long nt;
    private static int fv;
    private static int cfr_renamed_1;
    private static int gj;
    private static int fp;
    private static int z;
    private static long iu;
    private static int an;
    private static long du;
    private static long la;
    private static long ev;
    private static int kt;
    private static int ca;
    private static long er;
    private final NLoginCore_504 var_com_nickuc_login_NLoginCore_504_a = new NLoginCore_504(this);
    private static int ef;
    private byte[] var_byte_arr_a;
    private static long fo;
    private static long jo;
    private static long hk;
    private static int au;
    private static int kf;
    private static int ni;
    private static int fx;
    private static long ds;
    private static long oy;
    private static int fb;
    private static long at;
    private static float iv;
    private static long ht;
    private static int aa;
    private static long oi;
    private static int l;
    private static long as;
    private static int ju;
    private static long kv;
    private static int ma;
    private static int gu;
    private static long jv;
    private static int hc;
    private static long dl;
    private static int mc;
    private static int cr;
    private static int jj;
    private static long ho;
    private static long pj;
    private static long pm;
    private static int on;
    private static int hp;
    private static int hq;
    private static int jg;
    private static int aq;
    private static int hw;
    private static int el;
    private static int gt;
    private static long bx;
    private static int jm;
    private static int pr;
    private static int ao;
    private static int jq;
    private static long hu;
    private static int cx;
    private static long gw;
    private static long cb;
    private static int fw;
    private static int hz;
    private static int lx;
    private final Timer var_java_util_Timer_a;
    private static int nj;
    private static long cv;
    private static long ce;
    private static int ec;
    private static int ii;
    private static long eb;
    private static long bt;
    private static int nd;
    private static int ez;
    private static long kx;
    private static long r;
    private static int mz;
    private static long hr;
    private static long ks;
    private final AtomicLong var_java_util_concurrent_atomic_AtomicLong_a = new AtomicLong();
    private final File var_java_io_File_c;
    private static long om;
    private static int ms;
    private static int ov;
    private static int kh;
    private static int hv;
    private static long ag;
    private static long hl;
    private static int lm;
    private static long of;
    private static int dz;
    private static int oz;
    private static int bn;
    private static int og;
    private static int fq;
    private static int jn;
    private static long ol;
    private static int eo;
    private static long ka;
    private static String[] var_java_lang_String_arr_b;
    private static int ok;
    private static long jb;
    private static long h;
    private static int pe;
    private static int nr;
    private static long kr;
    private static long gy;
    private static int kj;
    private static int jz;
    private static long dy;
    private static long mf;
    private static long ew;
    private static long em;
    private static long fi;
    private static long ly;
    private static long hy;
    private static long hi;
    private static int nc;
    private static int al;
    private static int hj;
    private static int ns;
    private static long mr;
    private static long q;
    private static long bq;
    private static int is;
    private final Cache<Long, CompletableFuture<JSONObject>> cfr_renamed_28;
    private static int ch;
    private static long po;
    private static int ix;
    private final Cache<NLoginCore_277, Set<byte[]>> cfr_renamed_29;
    private static int fg;
    private static int bb;
    private static int ke;
    private static long jc;
    private static long df;
    private static long gm;
    private static long jh;
    private static int y;
    private static long pa;
    private static int af;
    private static float cfr_renamed_0;
    private static long kd;
    private static int gx;
    private static int ar;
    private static long jp;
    private static int hg;
    private static int bv;
    private static long eg;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_o;
    private static long dp;
    private static int mv;
    private static int ey;
    private static long iq;
    private static float ig;
    private static int g;
    private static int ha;
    private static long ir;
    private static int gc;
    private static int pi;
    private static long me;
    private static long dj;
    private static long ga;
    private static int mk;
    private static long en;
    private static long jy;
    private static long kg;
    private static long cc;
    private static long lt;
    private static int av;
    private static long ee;
    private static int ob;
    private static long hh;
    private final AtomicLong var_java_util_concurrent_atomic_AtomicLong_b;
    private static int io;
    private static int cd;
    private static int nz;
    private static long cl;
    private static String[] var_java_lang_String_arr_a;
    private static int id;
    private static int mj;
    private static long bw;
    private static long da;
    private static long gh;
    private static long var_long_o;
    private static int gn;
    private static int cu;
    private static int fm;
    private static int bl;
    private static int kz;
    private static long fl;
    private static long var_long_e;
    private static int pq;
    private static int dt;
    private static long ct;
    private static long iz;
    private static int ot;
    private static int nf;
    private static int ko;
    private static long eh;
    private static long ax;
    private static long hx;
    private static int ia;
    private static int gz;
    private static int ae;
    private static int dh;
    private static int he;
    private static long n;
    private static long ik;
    private static int mh;
    private static long bz;
    private static int dr;
    private static int gg;
    private static int np;
    private static long kk;
    private static int fc;
    private static int mi;
    private static int hm;
    private static int hd;
    private static int od;
    private static long lv;
    private static long fy;
    private static long pc;
    private static int bf;
    private static int bi;
    private static int dw;
    private static int ic;
    private static int cw;
    private static int gf;
    private static long fs;
    private static int cp;
    private static long k;
    private static int ip;
    private static int bg;
    private static long js;
    private static long ac;
    private static long ci;
    private static long fr;
    private static int fz;
    private final Object var_java_lang_Object_a;
    private static int gi;
    private static long pg;
    private static int mx;
    private static long ge;
    private static int pf;
    private static int ei;
    private static long ji;
    private static long cy;
    private static int nu;
    private static int bj;
    private static int cg;
    private static long op;
    private static long ba;
    private static int cz;
    private static int w;
    private static int lh;
    private static int il;
    private static long ck;
    private static long kp;
    private static long kc;
    private static long dg;
    private static int eu;
    private static long ou;
    private static long ij;
    private static long jk;
    private static int bm;
    private static int kq;
    private static long cn;
    private static int hs;
    private static long ah;
    private static int os;
    private static long ap;
    private static long ea;
    private static long nx;
    private static long kn;
    private static int dx;
    private static long nn;
    private static long ki;
    private static long i;
    private static int lu;
    private static int ep;
    private static long var_long_a;
    private static long ox;
    private static int jx;
    private static long pl;
    private static long hn;
    private static int ai;
    private static int mm;
    private static int et;
    private static int ff;
    private static long na;
    private static int pb;
    private static int km;
    private static long eq;
    private static long ln;
    private static int iy;
    private static long cq;
    private static int mq;
    private static int mu;
    private static long lp;
    private static int cj;
    private static int p;
    private static int fa;
    private static int lo;
    private static int oj;
    private static long di;
    private static long t;
    private static long oc;
    private static int ky;
    private static int kw;
    private static long dv;
    private static long ab;
    private static int bc;
    private static int de;
    private static int ih;
    private static int ow;
    private static int ay;
    private static long var_long_b;
    private static int mo;
    private static int ml;
    private static int ej;
    private static long ie;
    private static long nq;
    private static long f;
    private static long aw;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(NLoginCore_277 NLoginCore_2772, byte[] byArray) {
        try {
            Set set;
            if (byArray.length == 0) {
                return;
            }
            Set set2 = set = (Set)this.var_long_c.get((Object)NLoginCore_2772, NLoginCore_277 -> new HashSet());
            synchronized (set2) {
                if (this.var_com_nickuc_login_bukkit_nLoginBukkit_o.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_187_a().a(NLoginCore_2772) == null || !set.isEmpty()) {
                    set.add(byArray);
                } else {
                    this.b(NLoginCore_2772, byArray);
                }
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginType_018.c("㺀", (int)s, (long)(t ^ u)), exception, new Object[v]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void g(NLoginCore_277 NLoginCore_277) {
        Cache<NLoginCore_277, Object> cache = this.cfr_renamed_27;
        synchronized (cache) {
            this.cfr_renamed_27.put((Object)NLoginCore_277, this.var_java_lang_Object_a);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(NLoginCore_277 NLoginCore_277, JSONObject jSONObject) {
        block64: {
            String string = NLoginCore_277.getName();
            int n = jSONObject.getInt((String)NLoginType_018.c("㺀", (int)cfr_renamed_1, (long)dp));
            NLoginType_008 NLoginType_008 = this.var_com_nickuc_login_bukkit_nLoginBukkit_o.com_nickuc_login_NLoginType_008_a();
            NLoginCore_187 NLoginCore_1872 = NLoginType_008.com_nickuc_login_NLoginCore_187_a();
            block5 : switch (n) {
                case -1: {
                    String string2 = jSONObject.getString((String)NLoginType_018.c("㺃", (int)(dq & dr), (long)ds));
                    boolean bl = jSONObject.getBoolean((String)NLoginType_018.c("㺆", (int)dt, (long)(du ^ dv)));
                    if (bl) break;
                    Player player = (Player)NLoginCore_277.c();
                    NLoginCore_012.a(player, NLoginCore_150.j() ? (String)NLoginType_018.c("㺉", (int)(dw & dx), (long)dy) + string2 + (String)NLoginType_018.c("㺌", (int)dz, (long)(ea ^ eb)) : (String)NLoginType_018.c("㺏", (int)ec, (long)(ed ^ ee)) + string2 + (String)NLoginType_018.c("㺒", (int)ef, (long)(eg ^ eh)));
                    break;
                }
                case 0: {
                    int n2 = jSONObject.getInt((String)NLoginType_018.c("㺕", (int)(ei & ej), (long)ek));
                    switch (n2) {
                        case 0: {
                            String string3 = jSONObject.getString((String)NLoginType_018.c("㺘", (int)el, (long)(em ^ en)));
                            File file = new File(this.var_com_nickuc_login_bukkit_nLoginBukkit_o.java_io_File_c(), (String)NLoginType_018.c("㺛", (int)(eo & ep), (long)eq));
                            long l = System.currentTimeMillis();
                            if (!(l - this.var_java_util_concurrent_atomic_AtomicLong_a.getAndSet(l) <= er || file.exists() && NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.a(file, string3))) {
                                Object[] objectArray = new Object[es];
                                objectArray[NLoginType_018.et] = NLoginType_018.c("㺞", (int)eu, (long)(ev ^ ew));
                                objectArray[NLoginType_018.ex] = ey;
                                this.a(NLoginCore_277, n, objectArray);
                                break;
                            }
                            Object[] objectArray = new Object[ez];
                            objectArray[NLoginType_018.fa] = NLoginType_018.c("㺡", (int)(fb & fc), (long)fd);
                            objectArray[NLoginType_018.fe] = ff;
                            this.a(NLoginCore_277, n, objectArray);
                            break;
                        }
                        case 1: {
                            File file = new File(this.var_com_nickuc_login_bukkit_nLoginBukkit_o.java_io_File_c(), (String)NLoginType_018.c("㺤", (int)(fg & fh), (long)fi));
                            try {
                                if (file.exists() && (NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.a(file, jSONObject.getString((String)NLoginType_018.c("㺧", (int)fj, (long)(fk ^ fl)))) || !file.delete())) break block5;
                                ByteArrayInputStream byteArrayInputStream = NLoginCore_140.java_io_ByteArrayInputStream_a(jSONObject.getString((String)NLoginType_018.c("㺪", (int)fm, (long)(fn ^ fo))));
                                NLoginCore_366.a(byteArrayInputStream, file);
                                NLoginCore_134.a(this.var_com_nickuc_login_bukkit_nLoginBukkit_o, fp != 0);
                            }
                            catch (IOException iOException) {
                                NLoginCore_370.c((String)NLoginType_018.c("㺭", (int)fq, (long)(fr ^ fs)) + file.getName() + (String)NLoginType_018.c("㺰", (int)ft, (long)fu), iOException, new Object[fv]);
                            }
                            break;
                        }
                    }
                    break;
                }
                case 1: {
                    NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                    NLoginCore_447 NLoginCore_4472 = (NLoginCore_447)NLoginType_008.com_nickuc_login_NLoginType_005_b();
                    int n3 = jSONObject.getInt((String)NLoginType_018.c("㺳", (int)(fw & fx), (long)fy));
                    switch (n3) {
                        case 0: {
                            if (NLoginCore_1872.boolean_b(NLoginCore_277)) break;
                            boolean bl = jSONObject.has((String)NLoginType_018.c("㺶", (int)fz, (long)(ga ^ gb))) ? jSONObject.getBoolean((String)NLoginType_018.c("㺹", (int)(gc & gd), (long)ge)) : (!jSONObject.getBoolean((String)NLoginType_018.c("㺼", (int)(gf & gg), (long)gh)) ? gi : gj);
                            NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(new PlayerLimboProcessTask(() -> NLoginCore_4472.b(NLoginCore_277, NLoginCore_5092, bl)));
                            break;
                        }
                        case 1: {
                            NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(new PlayerLimboRestoreTask(() -> NLoginCore_4472.a(NLoginCore_277, NLoginCore_5092)));
                        }
                    }
                    break;
                }
                case 2: {
                    if (NLoginCore_1872.boolean_b(NLoginCore_277)) break;
                    int n4 = jSONObject.getInt((String)NLoginType_018.c("㺿", (int)(gk & gl), (long)gm));
                    int n5 = jSONObject.has((String)NLoginType_018.c("㻂", (int)gn, (long)go)) && jSONObject.getBoolean((String)NLoginType_018.c("㻅", (int)gp, (long)(gq ^ gr))) ? gs : gt;
                    int n6 = !jSONObject.has((String)NLoginType_018.c("㻈", (int)gu, (long)(gv ^ gw))) || jSONObject.getBoolean((String)NLoginType_018.c("㻋", (int)gx, (long)gy)) ? gz : ha;
                    NLoginCore_509 NLoginCore_5093 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                    if (n6 != 0) {
                        NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(new PlayerLimboRestoreTask(() -> NLoginType_008.com_nickuc_login_NLoginType_005_b().a(NLoginCore_277, NLoginCore_5093)));
                    } else {
                        NLoginCore_5093.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_y, (Object)(hb != 0));
                    }
                    NLoginCore_5093.a(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_g, null);
                    if (n5 != 0) {
                        Player player = (Player)NLoginCore_277.c();
                        this.var_com_nickuc_login_bukkit_nLoginBukkit_o.b(hc != 0).a(() -> NLoginType_008.callEvent(new AuthenticateEvent(player)));
                    }
                    NLoginCore_370.b(string + (String)NLoginType_018.c("㻎", (int)(hd & he), (long)hf) + n4 + (String)NLoginType_018.c("㻑", (int)hg, (long)(hh ^ hi)) + (n5 != 0) + (String)NLoginType_018.c("㻔", (int)hj, (long)(hk ^ hl)) + (n6 != 0) + (String)NLoginType_018.c("㻗", (int)hm, (long)(hn ^ ho)), new Object[hp]);
                    break;
                }
                case 3: {
                    Player player = (Player)NLoginCore_277.c();
                    NLoginCore_482 NLoginCore_4822 = this.var_com_nickuc_login_bukkit_nLoginBukkit_o.a().com_nickuc_login_NLoginCore_482_a();
                    NLoginCore_509 NLoginCore_5094 = NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                    NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5094.com_nickuc_login_NLoginInterface_024_a();
                    int n7 = jSONObject.getInt((String)NLoginType_018.c("㻚", (int)hq, (long)hr));
                    switch (n7) {
                        case 0: {
                            Object object;
                            NLoginType_016 NLoginType_0162 = NLoginType_016.a(jSONObject.getString((String)NLoginType_018.c("㻝", (int)hs, (long)(ht ^ hu))));
                            if (NLoginType_0162 == null) break;
                            if (NLoginType_0162 == NLoginType_016.var_com_nickuc_login_NLoginType_016_f) {
                                NLoginCore_4822.com_nickuc_login_NLoginCore_482_a(NLoginType_0162.aE(), hv != 0).ag();
                            } else {
                                NLoginCore_4822.a(NLoginType_0162.aE(), NLoginCore_393.a(player.getLocation())).ag();
                            }
                            String string4 = jSONObject.getString((String)NLoginType_018.c("㻠", (int)hw, (long)(hx ^ hy)));
                            if (string4 != null) {
                                object = NLoginCore_055.a(string4);
                                NLoginCore_527.a(NLoginType_008, NLoginInterface_0242, (NLoginCore_055)((Object)object));
                            }
                            if (NLoginType_0162 == NLoginType_016.var_com_nickuc_login_NLoginType_016_f && !NLoginCore_4822.c(NLoginType_016.var_com_nickuc_login_NLoginType_016_a.aE())) {
                                NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㻣", (int)(hz & ia), (long)ib)));
                                NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                            } else {
                                NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㻦", (int)(ic & id), (long)ie)));
                                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_119.C, cfr_renamed_0, ig);
                            }
                            object = (NLoginCore_447)NLoginType_008.com_nickuc_login_NLoginType_005_b();
                            ((NLoginCore_447)object).com_nickuc_login_NLoginCore_456_a().a(NLoginType_008, ih != 0);
                            break;
                        }
                        case 1: {
                            Object object;
                            NLoginType_016 NLoginType_0163 = NLoginType_016.a(jSONObject.getString((String)NLoginType_018.c("㻩", (int)ii, (long)(ij ^ ik))));
                            if (NLoginType_0163 == null) break;
                            String string5 = NLoginCore_4822.k(NLoginType_0163.aE());
                            if (string5 == null) {
                                NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㻬", (int)il, (long)(im ^ in))));
                                break;
                            }
                            if (NLoginType_0163 == NLoginType_016.var_com_nickuc_login_NLoginType_016_f) {
                                NLoginCore_4822.com_nickuc_login_NLoginCore_482_a(NLoginType_0163.aE(), io != 0).ag();
                            } else {
                                NLoginCore_4822.com_nickuc_login_NLoginCore_482_a(NLoginType_0163.aE()).ag();
                            }
                            String string6 = jSONObject.getString((String)NLoginType_018.c("㻯", (int)ip, (long)(iq ^ ir)));
                            if (string6 != null) {
                                object = NLoginCore_055.a(string6);
                                NLoginCore_527.a(NLoginType_008, NLoginInterface_0242, (NLoginCore_055)((Object)object));
                            }
                            NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㻲", (int)is, (long)(it ^ iu))));
                            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_119.C, iv, iw);
                            object = (NLoginCore_447)NLoginType_008.com_nickuc_login_NLoginType_005_b();
                            ((NLoginCore_447)object).com_nickuc_login_NLoginCore_456_a().a(NLoginType_008, ix != 0);
                            break;
                        }
                        case 2: {
                            NLoginType_016 NLoginType_0164 = NLoginType_016.a(jSONObject.getString((String)NLoginType_018.c("㻵", (int)iy, (long)iz)));
                            if (NLoginType_0164 != null) {
                                if (NLoginType_0164 == NLoginType_016.var_com_nickuc_login_NLoginType_016_f) break;
                                try {
                                    String string7 = NLoginCore_4822.k(NLoginType_0164.aE());
                                    if (string7 == null) {
                                        NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㻸", (int)ja, (long)(jb ^ jc))));
                                        break;
                                    }
                                    Location location = NLoginCore_393.a(string7);
                                    if (location == null) {
                                        NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㻻", (int)(jd & je), (long)jf)));
                                        break;
                                    }
                                    NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(new SynchronizeWithServerThreadTask(() -> {
                                        if (NLoginCore_012.V()) {
                                            player.teleportAsync(location, PlayerTeleportEvent.TeleportCause.PLUGIN);
                                        } else {
                                            player.teleport(location, PlayerTeleportEvent.TeleportCause.PLUGIN);
                                        }
                                    }));
                                    NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㻾", (int)jg, (long)(jh ^ ji))));
                                }
                                catch (Exception exception) {
                                    NLoginCore_370.c((String)NLoginType_018.c("㼁", (int)jj, (long)(jk ^ jl)) + exception.getLocalizedMessage(), exception, new Object[jm]);
                                    NLoginInterface_0242.a(jSONObject.getString((String)NLoginType_018.c("㼄", (int)jn, (long)(jo ^ jp))));
                                }
                                break;
                            }
                            break block64;
                        }
                        case 4: {
                            String string8 = jSONObject.getString((String)NLoginType_018.c("㼇", (int)(jq & jr), (long)js));
                            if (string8 != null) {
                                NLoginCore_055 NLoginCore_0552 = NLoginCore_055.a(string8);
                                NLoginCore_527.a(NLoginType_008, NLoginInterface_0242, NLoginCore_0552);
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    Player player = (Player)NLoginCore_277.c();
                    int n8 = jSONObject.getInt((String)NLoginType_018.c("㼊", (int)(jt & ju), (long)jv));
                    NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(new SynchronizeWithServerThreadTask(() -> {
                        switch (n8) {
                            case 0: {
                                NLoginCore_119 NLoginCore_1942 = NLoginCore_119.valueOf(jSONObject.getString((String)NLoginType_018.c("㺀", (int)ow, (long)(ox ^ oy))));
                                float f = jSONObject.getFloat((String)NLoginType_018.c("㺃", (int)oz, (long)pa));
                                float f2 = jSONObject.getFloat((String)NLoginType_018.c("㺆", (int)pb, (long)(pc ^ pd)));
                                NLoginCore_1942.a(sound -> player.playSound(player.getLocation(), sound, f, f2));
                                break;
                            }
                            case 1: {
                                String string = jSONObject.getString((String)NLoginType_018.c("㺉", (int)(pe & pf), (long)pg));
                                boolean bl = jSONObject.getBoolean((String)NLoginType_018.c("㺌", (int)(ph & pi), (long)pj));
                                if (bl) {
                                    this.var_com_nickuc_login_bukkit_nLoginBukkit_o.java_lang_Object_b().com_nickuc_login_NLoginInterface_006_a().l(string);
                                    break;
                                }
                                NLoginCore_277.p(string);
                                break;
                            }
                            case 2: {
                                String string = jSONObject.getString((String)NLoginType_018.c("㺏", (int)pk, (long)(pl ^ pm)));
                                if (!((String)NLoginType_018.c("㺒", (int)pn, (long)(po ^ pp))).equalsIgnoreCase(string)) break;
                                this.o();
                                break;
                            }
                        }
                    }));
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    long l = jSONObject.getLong((String)NLoginType_018.c("㼍", (int)(jw & jx), (long)jy));
                    Cache<Long, CompletableFuture<JSONObject>> cache = this.cfr_renamed_28;
                    synchronized (cache) {
                        CompletableFuture completableFuture = (CompletableFuture)this.cfr_renamed_28.getIfPresent((Object)l);
                        if (completableFuture != null) {
                            this.cfr_renamed_28.invalidate((Object)l);
                            if (jSONObject.has((String)NLoginType_018.c("㼐", (int)jz, (long)ka))) {
                                String string9 = jSONObject.getString((String)NLoginType_018.c("㼓", (int)kb, (long)(kc ^ kd)));
                                completableFuture.completeExceptionally(new RuntimeException(string9));
                            } else {
                                Object object = jSONObject.get((String)NLoginType_018.c("㼖", (int)(ke & kf), (long)kg));
                                completableFuture.complete(object instanceof JSONObject ? (JSONObject)object : null);
                            }
                        }
                        break;
                    }
                }
                case 7: {
                    Class[] classArray;
                    EventEnum eventEnum = EventEnum.valueOf((String)jSONObject.getString((String)NLoginType_018.c("㼙", (int)kh, (long)ki)));
                    if (!eventEnum.isForwardEvent()) {
                        throw new IllegalArgumentException((String)NLoginType_018.c("㼜", (int)kj, (long)kk) + eventEnum + (String)NLoginType_018.c("㼟", (int)(kl & km), (long)kn));
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray((String)NLoginType_018.c("㼢", (int)ko, (long)kp));
                    Object[] objectArray = new Object[jSONArray.length()];
                    if (objectArray.length != (classArray = eventEnum.getRewrittenClasses()).length) {
                        throw new RuntimeException((String)NLoginType_018.c("㼥", (int)kq, (long)(kr ^ ks)) + objectArray.length + (String)NLoginType_018.c("㼨", (int)kt, (long)(ku ^ kv)) + classArray.length + (String)NLoginType_018.c("㼫", (int)kw, (long)kx) + eventEnum);
                    }
                    for (int i = ky; i < objectArray.length; ++i) {
                        JSONArray jSONArray2;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Class clazz = classArray[i];
                        if (EventPlayer.class.isAssignableFrom(clazz)) {
                            objectArray[i] = NLoginCore_277.c();
                            continue;
                        }
                        if (String[].class.isAssignableFrom(clazz)) {
                            if (jSONObject.has((String)NLoginType_018.c("㼮", (int)kz, (long)(la ^ lb)))) {
                                jSONArray2 = jSONObject.getJSONArray((String)NLoginType_018.c("㼱", (int)lc, (long)(ld ^ le)));
                                String[] stringArray = new String[jSONArray2.length()];
                                for (int j = lf; j < stringArray.length; ++j) {
                                    stringArray[j] = jSONArray2.getString(j);
                                }
                                objectArray[i] = stringArray;
                                continue;
                            }
                            objectArray[i] = new String[lg];
                            continue;
                        }
                        if (UUID.class.isAssignableFrom(clazz)) {
                            objectArray[i] = jSONObject.has((String)NLoginType_018.c("㼴", (int)lh, (long)(li ^ lj))) ? NLoginCore_432.c(jSONObject.getString((String)NLoginType_018.c("㼷", (int)lk, (long)ll))) : null;
                            continue;
                        }
                        Object object = jSONArray2 = jSONObject2.has((String)NLoginType_018.c("㼺", (int)lm, (long)ln)) ? jSONObject2.get((String)NLoginType_018.c("㼽", (int)lo, (long)(lp ^ lq))) : null;
                        if (Enum.class.isAssignableFrom(clazz)) {
                            if (!(jSONArray2 instanceof String)) {
                                throw new RuntimeException((String)NLoginType_018.c("㽀", (int)lr, (long)(ls ^ lt)) + i + (String)NLoginType_018.c("㽃", (int)lu, (long)lv));
                            }
                            try {
                                Class[] classArray2 = new Class[lz];
                                classArray2[NLoginType_018.ma] = String.class;
                                Object[] objectArray2 = new Object[mb];
                                objectArray2[NLoginType_018.mc] = (String)jSONArray2;
                                objectArray[i] = clazz.getMethod((String)NLoginType_018.c("㽆", (int)(lw & lx), (long)ly), classArray2).invoke(null, objectArray2);
                            }
                            catch (ReflectiveOperationException reflectiveOperationException) {
                                NLoginCore_370.c((String)NLoginType_018.c("㽉", (int)md, (long)(me ^ mf)), reflectiveOperationException, new Object[mg]);
                            }
                            continue;
                        }
                        objectArray[i] = jSONArray2;
                    }
                    this.var_com_nickuc_login_bukkit_nLoginBukkit_o.b(mh != 0).a(() -> NLoginType_008.a(eventEnum, objectArray));
                    break;
                }
            }
        }
    }

    private static void b() {
        int n;
        var_long_e = 231258870992027737L;
        long l = var_long_e ^ 0x50477DFBB1DD8AAFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(21 + 48), (byte)(56 + 27), (byte)(9 + 38), (byte)(63 + 4), (byte)(63 + 3), (byte)(66 + 1), (byte)(19 + 28), (byte)(36 + 44), (byte)(35 + 40), (byte)(13 + 54), (byte)(48 + 35), (byte)(21 + 32), (byte)(51 + 29), 97, (byte)(39 + 61), 100, (byte)(9 + 96), (byte)(86 + 24), (byte)(92 + 11)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), (byte)(35 + 48)}, StandardCharsets.UTF_8));
        byte[] byArray = new byte[8];
        byArray[0] = (byte)(l >>> 56);
        for (n = 1; n < 8; ++n) {
            byArray[n] = (byte)(l << n * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
        n = 1;
        block7: for (int i = 0; i < n; ++i) {
            switch (i) {
                case 0: {
                    NLoginType_018.var_java_lang_String_arr_b[0] = NLoginCore_223.D("ѪѿҒҶҡҫҶѳѷҴҌүҹҔѽӂҺҡӄҽҟҧ҇҅ҹҵҸѿӆӈӀӈ҄ӍҩҝҞҖғӍӓҵҴҡ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[1] = NLoginCore_559.E("ԩԸՀԾԿՑՂՈԸզժԩԭեՎԨՌՃԫէ԰մԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[2] = NLoginCore_559.D("ҍҋҵҧҁҁҮҚҪҫқҔҮҽҫҀҐҁӃҤӃҟ҈҈ӋҩҞҽӁӂҠҝҽҜҳҠҧҤҗӒәҸҗҡ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[3] = NLoginCore_027.D("ҡҰҰѰґҏҙҍ҂ҖҖѵѸҌґҮҢҖҼҾҕҟҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[4] = NLoginCore_138.C("ҢҮҏҬҦҦҬҙѰѲҔҔѸҏҸғҜҷҕҀӀҘӉҪӀһҨӆӊ҆ҐґӎҎҫӏҨҤӁӉҥҖӔӛҞӘҳҰӝҭңӕҸӕҬҭ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[5] = NLoginCore_173.D("ѩѳҏҀҌ҉ѳѫѸѻҍѯҕҙҾҞҮҚґҞҰ҂ѺҶҀӇӍҺӅҎҤӌҐ҉ҤҳҿҭҕӋӌӑҎӌӕӕҘҳӢҠӏҽӠӚӀһӆӀңҩӂҷӜӡӥҽҪӧӍӠӠӳӯӭӦӁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[6] = NLoginCore_384.A("ćđĭĞĪħđĉĖęīčĳķŜļŌĸįļŎĠĘŔĞťūŘţĬłŪĮħłőŝŋĳũŪůĬŪųųĶőƀľŭśžŸŞřŤŞŁŇŠŕźſƃśňƅūžžƑƍƋƄş", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[7] = NLoginCore_223.B("ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧţŃŬŗœŇůšŵĵžķƅņŘŪŀŊņŃƆƄũťƓƀŝŒşŴŕƂƓōƓŦƏŖŰřŹƒŠƆƠƚŹƪƀžƢƧūƁƊƤũƌƧƍƖƭƫơƨŵƇƖƲƽƽƚƵžƿƕƯƣƀƾƽơǈƶƝǄ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[8] = NLoginCore_427.D("ҢҮҏҬҦҦҬҙѰѲҔҔѸҏҸғҜҷҕҀӀҘӉҪӀһҨӆӊ҆ҐґӎҎҫӏҨҤӁӉҥҖӔӛҞӘҳҰӝҭңӕҸӕҬҭ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[9] = NLoginCore_004.F("ԺԷԱեՃբԱԼՒժԻ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[10] = NLoginCore_575.B("ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧŢűŨŒŔŝšŽƂŲŖťŖŒłťƈŠŻŌŎŁƐŧŌŅőũƈƀūƚťŸūůƟşƙſƌſŽŽŪū", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[11] = NLoginCore_453.C("ҰҬҌҕҦҢҤғѱҹ҆ѹѵҨҗҜӀқұҡӄҧѾұӅҶ҈ҺҨӇҭҝҊҾӀӉӌңӁҷҫҬҚӕһӐҠҺҜҝһҷҲӇҨӗӅӉӀӡӮӢҿҧ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[12] = NLoginCore_138.A("ĩĦĠŔĲőĠīŁřĪğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[13] = NLoginCore_201.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԪԫԦԹԻԩԱլիՐ՟յմԳԸԸէ՘էԹըԾռՔաՅՓր՗սոճւչգեծղ֎֓փէցՖհ֌էշլՏ֎ն֏կ՝յյ֍աՠ֗ա֞֕հ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[14] = NLoginCore_575.B("ĬĪőğĠďĐŒĩİĔīŉśĐĹĖśőŔĖŤĳĠĶĽŇŁŉĺķŅİŲĽŏŃŇŏűŗŖũźŶťŏŨƀřŲĺĽļŢżœƂźŧňƇţŪŉŽŰűťƍƑşŖťŘŭżƒŰƊŬơųşƗŢƁƚƛŽšƩţūƁż", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[15] = NLoginCore_110.D("ѾҰҢҀҶҨҶѱҊҏ҄ҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[16] = NLoginCore_092.A("ŁőŎŅĜĐľĠĲėĺĨŅĥĕįŏŢŃģģįĴęĸĠŀĺńĵĺŅśřňŎńťųŌįũŋŅŨŗŔŠŉŐśşŏœŏƃŞŜŠƉŹōƌŗŇōŧƊżšƂũŮŮœƐƐƘƕƗŶŝŔƍŮţťſƚƄƖƞŬƬŶžưŬƞƟƋƣƯƣƧŶƅŸƚŵƌƋŸƎǁƷƑƹŽƻƂƟƠƟƕƕƅƪơƼƨƉƊǌǉƤƔƪƮƗƦƳǍƩǐǜƯƵƜǀƱƴƧƾǟǕǨǛƬƪ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[17] = NLoginCore_446.A("ĞĩĠņĊĵŁĬĪŊŘğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[18] = NLoginCore_387.D("Ҁҋ҂ҨѬҗңҎҌҬҺҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[19] = NLoginCore_559.F("ՎաՙՅԲԟԧ՘ԹՕԤթՊծԡԺԺ՜ՓձՔՑնՊ՘ժճէԼհԻԽնՙԹփՀՙՒՆՈՒՆՐ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[20] = NLoginCore_559.E("ԿԲԵԱԸԘ՗դ՗բԷ԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[21] = NLoginCore_559.C("ѰңҒҴѬҟҧ҅ҪҊҮҁ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[22] = NLoginCore_446.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԸՎՃԡՅԾԪՉ՞ՄԮՔԪճզզ՝ըՈԷՓ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[23] = NLoginCore_027.A("ŁńľįįŖŔĖĥŉĻŘęŕōŝŏğŃęŞţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[24] = NLoginCore_384.E("ԵգԱԢՎԼԷբաՄԺԣծԶՉ՟ԫգՑԪԬՎԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[25] = NLoginCore_384.D("ҬҌ҄ҍѱҐґҍѸ҆Ҳҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[26] = NLoginCore_091.D("Ґ҃҆҂҉ѩҨҵҨҳ҈ҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[27] = NLoginCore_559.F("ԟՒՁգԛՎՖԴՙԹ՝԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[28] = NLoginCore_201.C("ҢҮҏҬҦҦҬҙѰѲҕѶҷѶҟѽҌѵҾҢҘҒҔҾ҃ҜҩҿҖӍ҆ӉҠҞҔӀҶӋӒҙґҧӎҡ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[29] = NLoginCore_091.A("ŁńľįįŖŔĖĥŉĻŘęŕōŝŏğŃęŞţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[30] = NLoginCore_223.F("ԵգԱԢՎԼԷբաՄԺԣծԶՉ՟ԫգՑԪԬՎԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[31] = NLoginCore_427.B("ŊĪĢīďĮįīĖĤŐğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[32] = NLoginCore_324.A("ĮġĤĠħćņœņőĦğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[33] = NLoginCore_004.F("ԼԛԛԟԾ՘ՏՈՉԵԣՃ՘ՇԨթՇ԰լՃՇդԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[34] = NLoginCore_446.A("ŐĮĮąŎŔēĨĐŔĢŕĜīŗŔŜĠĜļŤţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[35] = NLoginCore_223.D("ҎҌҳҁ҂ѱѲҴҋҒѴҔҼҪҠѽѾҘѾӄӇӆӈӊ҂қҦӄҙҌҧҧҿӇҳӔӅҸҬӘҩҬҬҹҖӘӑӐҲҙӞҳҦӆӥҳҡӊӇӢӤәӝӍӨӒӌӡҬӉӲҷӴӲӄӹӶӨӯԀӂӳҾӒҼӾӹӵԈӠӼӥӋӇӞӥԇӎӦӳӧӔӏӯԋӕԋӥԓԋӿԍӿӱԟԔӦӥԩԕӡӤԡԤӸԪԟӮ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[36] = NLoginCore_138.A("őŊģĥĽĒĮőĘģőđęŔŉŞĭēŘĿŐģĥŠĹŦŗĥľņũŃŋŧŭšłłŀŖĲņůķĲŭĶŒĸƁŶśžĽļƃŚŷƉŉŞżŎŹƏŮżōōŠƓŴƉŒƙƜŖŽƗƇŖƍŭŠŤƜƂƀŧƗŦƗƀŦƆƤŨƩƲƢƎƂƇƃŰŸƏƇƲƶƛŻƊƫƯƲƽƁƣǈƥǈƖƦǅƕǇƥƥǍǆƜƓƽƭƦƶƮǇƷƮƛǒƕǚƠǣƲƞƽƽǟǒƛƢǈƽƧǢǁǬǀǩǏƾǋǬǸƮǫǐǭǻǛǱǬǏǵǪǓǳǹǰƽǑǻǤǻȆǦǜǋȑǿǻǿǪǧǬǒȂǩǴǶȜȌǻǭȗǿȝǵȏȓǹǸȒȟǴțȌȗȧȦșȫȂȟǪȈȏǩȧșǰȧǵȝȸȉȕɂǼȕȂȀȚȤȢȺșȢȨȣɎȧȧȊɓȾȤȿȟɁȭȱȔȯɊșɊȝɒȮȷȕɏȳȮɀȴȵȜȤȥɟȷɊɰȫȲɆȬɧɪɆɳɨɸɼɧȺɈəɨɐɊȻɓɺɦɁʈɨɇɫɜɻʈɊɐɹɍɛɌɪɮɫɑʏʓɍʜʔʊɗʊʂɾɟʜɾʗʂɡɵɷɥɬɾʊʛɦʈʠʫʦɯʒʌʳʥʒɿ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[37] = NLoginCore_201.E("ԽԻբ԰ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնԨՂԳըՖձԻՖԼ՚ՑղճյգՄՅջրԿյՅրՃօՊր֊փՒ֑֕բը։ճզՒՔֆ֔֎՟ճղ՚֛֑֥նոև֖֙ջշըփ֥֨ր֥֑֪֑֒֡ք֖֭֙ջվ֧֝չ׀֋ս֖֜֞և׃֝֩֋׌֝֏֪֣֌։׀֛֮֬֜", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[38] = NLoginCore_173.B("ĮĿĠŅŃŉņŁĎċķřĖŇĵĝĒŋĞļĳŏśťŗĨŇĩšňĠŮŮŁĪļŃĴŊňŗĲœŏŽŰŒŲŌŔŠŃşƃŘńŀŔŊĽŴŠŭŧŪňńšŴœƏŢƌŨƔƆśŪŮƞƉŲŬƝŸƦƀƕƂƇƙƧŻūƯŷƤŧƎƥųƇƌƁŮƖŸƊƉƼŻƳƸƔưƹƖƤǅƥƂƽƶƔǉǍǃƦǄƋƐƛƿƇƥƑƭǏƻǓƚƼǛǜǝǌƾǟƶǎƽƴƿǘǟǔƦǟƭǫƹƻƮǜƾǅǟƯǂǊƴǙǄǾǱǽǶǫǁǱƿǡǲǓǐǼǲǙȆǌǗǠǧǚǞǐǏǨǍǴǧȖǒǨȏǭȟțǝȁǳǛǹȥȂȠȨȘǳǹȭǵȣȉȰȍȓȑǯȧȢȤȁǶȏȇȔȈȭȬȚȑȳȁȹȠȻȷȕȱȥȢșȟȽȢɏșȫɅȜȨɁȖɒɁȹɃȷȚȷȿɍɉȰɕɔȥɤɐɗɤɟɈɃɨȼɭɦɌɑɟɅɶɡȩɌȹɚɧɼɕɗɌɴȺɺɣȿɸɔɀɁɣɒɬʇɈʋɥɤɽʁʂʒɝɐʎʏʘɮɟ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[39] = NLoginCore_559.B("ĐĲĤĽĪćĿĲĤŊĺğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[40] = NLoginCore_091.F("ԸԢՍԚԿԝՁդաՉԢ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[41] = NLoginCore_091.C("ѲҢҕҥѳҏѳѵҰѸҋҸҞҮ҉ҒӃҒҗҟӆӅҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[42] = NLoginCore_091.C("ҧѱҍҬҖ҅҆ҩңҺҪҁ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[43] = NLoginCore_223.A("ŅďīŊĴģĤŇŁŘňğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[44] = NLoginCore_091.A("ĐŀĳŃđĭđēŎĖĩŖļŌħİšİĵĽŤţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[45] = NLoginCore_201.F("ԸԢՍԚԿԝՁդաՉԢ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[46] = NLoginCore_027.E("ՒՐՓԚԲԻՙԠ՛Ֆա԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[47] = NLoginCore_138.D("ҢҮҏҬҦҦҬҙѰѲҕѽҵҧҴҼҙҮӅұӅҞҧҽҞ҉҉ӊҬҦһҪ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[48] = NLoginCore_092.A("ďŊĚňċďĨģĶœĪğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[49] = NLoginCore_110.B("ŅďīŊĴģĤŇŁŘňğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[50] = NLoginCore_027.C("ңѫҞҤҞѰҠ҃ѹҨҷүҶғҽғҘҕҾҳҧҴңҞҲ҇҇ѿҬ҅Ҩӑ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[51] = NLoginCore_027.D("ңѫҞҤҞѰҠ҃ѹҨҷүҶғҽғҘҕҾҳҧҴңҞҲ҇҇ѿҬ҅Ҩӑ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[52] = NLoginCore_324.D("ҍѪүҎү҃ҖҏҢҰѵѽҰҼѶҌҴҹӀҟҡҟҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[53] = NLoginCore_004.A("İęĽĨīōŀġŇœĕğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[54] = NLoginCore_004.F("Ռ՚ՐԣՅԳԹՖժԴեԴէբԬ՟դլԲըձծՋՊյՐ՘ն՗Վռմ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[55] = NLoginCore_223.C("ҝҫҡѴҖ҄Ҋҧһ҅Ҷ҅ҸҳѽҰҵҽ҃ҹӂҿҜқӆҡҩӇҨҟӍӅ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[56] = NLoginCore_575.D("ҫҞҠѮѶѰҫҷҭҜҶҔѺҮҜҼҪҰқҶґӅҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[57] = NLoginCore_223.F("՚ՍՏԝԥԟ՚զ՜ՋեՃԩ՝Ջիՙ՟ՊեՀմԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[58] = NLoginCore_453.E("ԸԢՕՕԵ՝՜՛բԺՕ՘՜ՄՐՀԨՅճաԳՃՒԮթԬլղՕՐռվձւԹտՔևցՙօռզ՘աՌֈժՠժէ՜Օզյմ֗քեխճ֜ջ֖֠ռ֍ռ֣֣֧֔թրզհ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[59] = NLoginCore_575.E("ԩԜԵՕՀԟՃզգԪդԞզԾԺ՛ԫեՂԭՈմզՖնԸԹե՚սշԶ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[60] = NLoginCore_559.E("ԡԚԫՑՅԲԯԶՇԪՖԺՠԾԥԼժ՜դէ԰ԾԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[61] = NLoginCore_384.F("՘ԲԬ՜դԺԥԶԩՆԻ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[62] = NLoginCore_384.D("ҧѱҍҬҖ҅҆ҩңҺҪҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[63] = NLoginCore_453.B("İęĽĨīōŀġŇœĕğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[64] = NLoginCore_575.F("ՍբԕՏԴԱ՘ՃդիԤթ՟ՋհծՅՠէԳզճԯՁՊՓչԷԴխ՗ՍղիՏհաքՔզՑւէՐ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[65] = NLoginCore_027.B("ļőĄľģĠŇĲœŚēŘŋĩŌļĬŖķŐĹţĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[66] = NLoginCore_223.F("ՍբԕՏԴԱ՘ՃդիԣէՎդ՚ՏԽԨլծԿմԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[67] = NLoginCore_446.E("ՁԪՎԹԼ՞ՑԲ՘դԦ԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[68] = NLoginCore_387.A("ļőĄľģĠŇĲœŚĔŊēļřĭśŔľĶĚţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[69] = NLoginCore_446.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļšŚľşŐųŃŕŀűŖĿ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[70] = NLoginCore_201.C("ҞҳѦҠ҅҂ҩҔҵҼѴҸҟҵҫҠҎѹҽҿҐӅҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[71] = NLoginCore_387.D("ҒѻҟҊҍүҢ҃ҩҵѷҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[72] = NLoginCore_201.F("ՍբԕՏԴԱ՘Ճդիԥ՛ԤՍժԾլեՏՇԫմԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[73] = NLoginCore_384.F("ՍբԕՏԴԱ՘ՃդիԢ՜եԻՈլձՃՈհՐխՃթՖծ՗հՒ՜Վ՚", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[74] = NLoginCore_201.C("ҞҳѦҠ҅҂ҩҔҵҼѴҸҟҵҫҠҎѹҽҿҐӅҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[75] = NLoginCore_324.B("ŌľœįĢĴğŊĶŕĮŔŏņŌıĽįŀŌĤŗŦŏţĺŒūōğĩŝŇĽīũİŰŮıšŏŨĿ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[76] = NLoginCore_092.E("ՍբԕՏԴԱ՘ՃդիԣՌՖԸԥ՚ձխ԰ՃՆեՍՌՂՏՃ՜ՔՉՔՍ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[77] = NLoginCore_453.E("ՍբԕՏԴԱ՘ՃդիԤթ՟ՋհծՅՠէԳզճԯՁՊՓչԷԴխ՗ՍղիՏհաքՔզՑւէՐ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[78] = NLoginCore_575.E("ՖԠԼ՛ՅԴԵ՘Ւթՙ԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[79] = NLoginCore_451.C("ғҡҨѫҋҦҍұѲҼѹ҆ҘҴҚ҉ҫңҐѷӂҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[80] = NLoginCore_384.B("ĮĞŌğİĩĒėŊœĮĶĭņıĪŘōĸķĸœĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[81] = NLoginCore_092.B("ĮĞŌğİĩĒėŊœĮĶĭņıĪŘōĸķĸœĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[82] = NLoginCore_223.B("ňŌœĳĒİīĭĲİĺŚňĥķśŋĽłńőĽĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[83] = NLoginCore_004.A("čĠńěŕĠŀŋĩĳđğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[84] = NLoginCore_138.D("ҏ҄ҠҥҔҲҔҬҤҬғҏѸґҗѸҀҚҢҶҔҏҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[85] = NLoginCore_384.B("ĨŐŅňĒŊĴĴńœśŒōĥœŊİőŞŗšĴĴţĠťŝĦŃŚşŋšĽőĩĽıŕŷŴšŎĿ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[86] = NLoginCore_027.C("ѺҁҫҏѲҸҪѵҲҎҔҴҿѽҽҳѼҬ҄ҁ҄ӅҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[87] = NLoginCore_559.D("ҟѰ҇ѯҭҰҢҊ҅ҧҎѯѼҌҴғҋұҒҿҙҳҹһҷҩӄҿҊҹӋӍґҒӍӎҳҭӐҴҗҮҗҝӖӠҚӘӜҝәҲӦӨҠӓҢӇһӘҷӎҢӪ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[88] = NLoginCore_076.E("ԙ՛ՐԟՕդբա՟եՕ԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[89] = NLoginCore_027.A("ĺęŏĭĳċŇĢĠŉĨĸĖŒŗľıĜĶŁŚĽĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[90] = NLoginCore_324.B("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[91] = NLoginCore_446.B("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[92] = NLoginCore_384.D("҇ҮҰҥѱґңѱ҄ҒҲҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[93] = NLoginCore_091.A("ĥŌŎŃďįŁďĢİŐğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[94] = NLoginCore_173.D("҇ҮҰҥѱґңѱ҄ҒҲҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[95] = NLoginCore_027.E("Զ՝՟ՔԠՀՒԠԳՁա԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[96] = NLoginCore_091.B("ĽĎĥčŋŎŀĨģŅĪĔŕĨĺŏşĮĝŁŎţĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[97] = NLoginCore_027.A("ġĹňĦēēĈĨŐĬŇķňŔŉŐŖİŁĶĵńőŁŧŃşĪĬĩŜĭŢĻŰųĲĿŒŸĸŏŒţŶŜſřŘŲŁœŠżťƄŴŵźƀŞŷŘŇ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[98] = NLoginCore_427.B("ĪĩİĥģņġĲķģńğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[99] = NLoginCore_091.B("ŀŌĭŊńńŊķĎĐĲňĔœŒŖĝľŐĢŁģťħũķřĤŧĬņĨťŰĩŃŅĲŐŐŧţĺŭĮœřŗŭŔŏŽźŢŢżŕųżšƂźšťňŏŻŪŤƐƉůŷƁƓźųƊƛőƍŵŵŹƏƎƎżųŸšŹƫƅŻƥ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[100] = NLoginCore_027.C("ғҡҨѫҋҦҍұѲҼѹ҆ҘҴҚ҉ҫңҐѷӂҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[101] = NLoginCore_004.D("ѱҩҀүүң҅Ңҫ҃ґҪ҇ҪҾҀҵҷҁҖңҵҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[102] = NLoginCore_446.F("ԩ԰՚ԾԡէՙԤաԽՃգծԬլբԫ՛Գ԰ԳմԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[103] = NLoginCore_027.D("ҞҴҋҮҗѩҒҋҢңҷҹҗҊҹҪҝҘңҽґҸҗӅҢ҇ҕң҆҇ӇҽґҬҫӃҥӈӄӅӃҕҤҡ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[104] = NLoginCore_092.B("ĩĦĠŔĲőĠīŁřĪğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[105] = NLoginCore_223.D("Ґ҃҆҂҉ѩҨҵҨҳ҈ҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[106] = NLoginCore_173.E("ԟՒՁգԛՎՖԴՙԹ՝԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[107] = NLoginCore_559.B("ČĚďŎĵŊŒŀŀįőŔŚĵİŊŕĞĶĭŚŢĿįħķřūŅĶŪŚ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[108] = NLoginCore_451.B("ĿŎŎĎįĭķīĠĴĴēĖĪįŌŀĴŚŜĳĽĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[109] = NLoginCore_384.C("ҡҰҰѰґҏҙҍ҂ҖҖѵѸҌґҮҢҖҼҾҕҟҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[110] = NLoginCore_559.C("҇ҍґүѱѴғҰҤҍѲҶҍҟҘѼґһҁѾҹӅҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[111] = NLoginCore_384.E("ԹԪԽԣՔԺՂԚ՗ԸՅՠեԩՉԾձ՚բՊԯ԰կԮՕՏՖ՚ղպԵնՔՖսՄճեՙև՗օէՐ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[112] = NLoginCore_076.C("҇ҍґүѱѴғҰҤҍѼҞҼҘӁҳҴҰѽүҸҟҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[113] = NLoginCore_559.B("ŀŌĭŊńńŊķĎĐĵřĘŒĮňŜŢĘŁįĵŕİŃľŦŌīŤĺĪ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[114] = NLoginCore_201.D("ѫҝѱ҂Ү҃ҥҩѺҨҲҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[115] = NLoginCore_091.C("ѬҰҰҰҥѲҨ҅ҎҪґҨү҉ҙҖӃүҾѿӄҘұӁҁ҈ҽӆҍ҈ҋӏҳӍҍҎӊҫҤӍӋӓҘҜӎҾҷҙҼҺҠӚӕӛӑҲӇҴҶӠӦӗӢңӋҿӤӝӖӧҪӪӌӜӰӕӑҸӏһӴԃӬӯӕӠӴӹӥԂӌԌӨԀӌӢԊӅԃӮӴӧӲӹӤӷӤӡ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[116] = NLoginCore_384.B("ŀŌĭŊńńŊķĎĐĲĔŘŕĝĮĪĵĲŕŕĥĵĹĤĥĨĨŭŋŚŮĿņłśńľĮİůŔĵųĮťŲŲũŕœŠſƃŊŋ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[117] = NLoginCore_091.A("ŀŌĭŊńńŊķĎĐĵňŖĪĐŌĮŁŎİĵŚġşŒĸŅśŌŅŅňĩşĲūųıĿŉİŅŏŎœŧůŹŒŋžƀŸŖŕŦťŻźſŕƅƇƉ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[118] = NLoginCore_223.C("ѼҟѰҳѨ҇ҁҤұѲѳҁ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[119] = NLoginCore_384.E("ՍՍԻԮաԠՀԺԡՅԿ԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[120] = NLoginCore_138.A("ĐĽĝĊľčňĐĸńńğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[121] = NLoginCore_223.F("ԟԳՒգՄԼԝեԵՇԪ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[122] = NLoginCore_091.C("ҌҝҏұҭҡѷҢҹҸҰҾҒұҎҟҞҮҽ҃ҮҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[123] = NLoginCore_446.B("ġĊĢĠņŃŐīıŘđğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[124] = NLoginCore_324.E("ՠԙՕԛՓզԡ԰ԲԻ՝էխԠԪզՏԾԳԿՏմԻԼ", (byte)44, 69);
                    continue block7;
                }
                case 1: {
                    NLoginType_018.var_java_lang_String_arr_b[0] = NLoginCore_173.C("ѪѿҒҶҡҫҶѳѷҴҌүҹҔѽӂҺҡӄҽҟҧ҇҅ҹҵҸѿӆӈӀӈӇҏӊӀҍӐҸӉұҒҤҡ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[1] = NLoginCore_201.B("ĘħįĭĮŀıķħŕŚıŎŞĽįŕőĺĚŔĭĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[2] = NLoginCore_446.C("ҍҋҵҧҁҁҮҚҪҫқҔҮҽҫҀҐҁӃҤӃҟ҈҈ӋҩҞҽӁӂҠҝӄҮұҵҥҏӒҥҮӐҗҡ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[3] = NLoginCore_559.C("ҡҰҰѰґҏҙҍ҂ҖҗҲҍҕӀҏҞӀҷҒҙҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[4] = NLoginCore_201.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՃՃԧԾէՂՋզՄԯկՇոՙկժ՗յչԵԿՀսԽ՚վ՗ՓհոՔՅւ֊ֆՊ։ՆլՌՌռՑժզթմշկ՛ՖՖ։֛", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[5] = NLoginCore_384.D("ѩѳҏҀҌ҉ѳѫѸѻҍѯҕҙҾҞҮҚґҞҰ҂ѺҶҀӇӍҺӅҎҤӌҐ҉ҤҳҿҭҕӋӌӑҎӌӕӕҘҳӢҠӏҽӠӚӀһӆӀңҩӂҷӜӡӒҾӃӄӠӵҪӘӪӷҷӁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[6] = NLoginCore_324.E("ԘԢԾԯԻԸԢԚԧԪԼԞՄՈխՍ՝ՉՀՍ՟ԱԩեԯնռթմԽՓջԿԸՓբծ՜ՄպջրԽջքքՇբ֑Տվլ֏։կժյկՒ՘ձզ֋֐խմց֗ձ֙ՙ֑֗պջհ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[7] = NLoginCore_110.C("ҢҮҏҬҦҦҬҙѰѲҗѻѼѷҊҌѺ҂ҽҼҡҰӆӅ҄҉҉ҸҩҸҊҹҏӍҥҲҖҤӑҨӎӉӅҥӎҹҵҩӑӃӗҗӠҙӧҨҺӌҢҬҨҥӨӦӋӇӵӢҿҴӁӖҷӤӵүӵӈӱҸӒһӛӴӂӨԂӼӛԌӢӠԄԉӍӣӬԆӋӮԉӯӸԏԍԃԊӗөӸԔԟԟӼԗӠԡӸӥԞԋӝӤӷԧԗӯԀԂԏԟԏԏԨԠԴԐԨԪԁ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[8] = NLoginCore_559.A("ŀŌĭŊńńŊķĎĐĲĲĖĭŖıĺŕĳĞŞĶŧňŞřņŤŨĤĮįŬĬŉŭņłşŧŃĴųŮůŇĽŰŝūűŌťŻšƆŝŧŢŽŗƀŅŹ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[9] = NLoginCore_092.F("ՉԭԞԵ԰դԠԥԻՈԨՄՃՌՀԿՃիզՑեԾԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[10] = NLoginCore_223.B("ŀŌĭŊńńŊķĎĐĵęĚĕĨĪĘĠśŚĿŎŤţĢħħŖŇŖĨŗĭūŃŐĴłůņŬŧŢűŨŒŔŝšŽƂŲŖťŖŒłťƈŠŻŌŎŁƐŧŌŅőũƈƀūƚťƄůśśƏűŚŲƄŚŽŪū", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[11] = NLoginCore_201.C("ҰҬҌҕҦҢҤғѱҹ҆ѹѵҨҗҜӀқұҡӄҧѾұӅҶ҈ҺҨӇҭҝҊҾӀӉӌңӁҷҫҬҚӕһӐҠҺҜҝһҷҲҿҟөӒӉӡҫҿҺӆӃөӒӣӪӃұӷӕұӴӌӁ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[12] = NLoginCore_173.A("ġăŎŉĠċĦŎĵŏįŃēĝĔŎľļĳľńĭĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[13] = NLoginCore_076.D("ҢҮҏҬҦҦҬҙѰѲҗѻѼѷҊҌѺ҂ҽҼҡҰӆӅ҄҉҉ҸҩҸҊҹҏӍҥҲҖҤӑҨӎӉӄӓӊҴҶҿӃӟӤӔҸӒҧӁӝҸӈҽҠӟӇӠӊӡӤүӊӱӕҴӷӉӚөӶӱҸӺӘӒӀҾӥӵӌӍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[14] = NLoginCore_384.C("ҎҌҳҁ҂ѱѲҴҋҒѶҍҫҽѲқѸҽҳҶѸӆҕ҂ҘҟҩңҫҜҙҧҒӔҟұҥҩұӓҹҸӋӜӘӇұӊӢһӔҜҟҞӄӞҵӤӜӉҪөӅӌҫӟӒӓӇӯӳӁҸӇҺӏӞӴӒӬӎԃӕӁӹҿӼӠӨӸӕӝӧӛӏԅ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[15] = NLoginCore_384.E("ՋԘԹԠՆԯՐԼԣԾԦ԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[16] = NLoginCore_173.A("ŁőŎŅĜĐľĠĲėĺĨŅĥĕįŏŢŃģģįĴęĸĠŀĺńĵĺŅśřňŎńťųŌįũŋŅŨŗŔŠŉŐśşŏœŏƃŞŜŠƉŹōƌŗŇōŧƊżšƂũŮŮœƐƐƘƕƗŶŝŔƍŮţťſƚƄƖƞŬƬŶžưŬƞƟƋƣƯƣƧŶƅŸƚŵƌƋŸƎǁƷƑƹŽƻƂƟƠƟƕƕƅƪơƼƨƉƊǌǉƤƔƪƮƗƦƳǍƩǐǜƯƵƜǅƶǚǂǧǒƽƦǙǉǉ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[17] = NLoginCore_575.C("ҌѽҬѫұѴҸғҘҘҋѶұѽҒғӁһѻҟҙӅҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[18] = NLoginCore_138.D("҃ѪѪҌ҅҂ҋѷғҖ҈ҜҗҽҭҙѴѺҎҶҖҵҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[19] = NLoginCore_223.B("ĽŐňĴġĎĖŇĨńēŘĹŝĐĩĩŋłŠŃŀťĹŇřŢŖīşĪĬŞĭĮšųŶŎňĴŊĺűŇŦōıĹŎƀĽŒųŊŋ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[20] = NLoginCore_027.C("ҤҩҜҖѭ҅ҌѹҮ҃Ґҁ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[21] = NLoginCore_004.E("՘ԺԴգԽԢԷ԰Դ՘զՕԶբգժՀԨ՛ՐԴՎԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[22] = NLoginCore_384.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՆԸՎՃԡՅԾԪՉ՞ՄԲՄՕզՎգՔռԺԵ՚Պ՜խԾԻՓտՐ֊՝գՐ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[23] = NLoginCore_384.D("ңҦҠґґҸҶѸ҇ҫҤҙҒҙҐҶҗѾҕҤ҆ҵҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[24] = NLoginCore_324.C("҆Ҵ҂ѳҟҍ҈ҳҲҕҊҴҊҺѹҝҐҴҙҏѽҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[25] = NLoginCore_091.A("ĥōľēħĞĭğīđĕğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[26] = NLoginCore_223.E("ԪԿՔԷԭդԾ՞ՙՀԷ԰", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[27] = NLoginCore_324.F("ԝԪՠԹեԿՇՄԢԵ՞ՀՅՍԽԫՐ԰ՒժՄդԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[28] = NLoginCore_201.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՄԥզԥՎԬԻԤխՑՇՁՃխԲՋ՘ծՅռԵոժնՁծՍԽ՛՞եՊսՐ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[29] = NLoginCore_451.A("ŁńľįįŖŔĖĥŉłőņķĻňĝŉśĶŞĽĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[30] = NLoginCore_138.C("҆Ҵ҂ѳҟҍ҈ҳҲҕ҈ҧҘҼҠҘ҂ҋҘҚҟҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[31] = NLoginCore_446.F("Լ՜ՌԠ՚ԽէեԢԷԿ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[32] = NLoginCore_027.A("ČęŇĊņĩŉőŐŎĺğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[33] = NLoginCore_201.F("ԼԛԛԟԾ՘ՏՈՉԵԤխլ՝ԸԩԼԨբՎՋդԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[34] = NLoginCore_091.B("ŐĮĮąŎŔēĨĐŔĢİōĴŊŀĜĪŖĸŤţĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[35] = NLoginCore_446.E("ԽԻբ԰ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնյշչԱՊՕճՈԻՖՖծնբփմէ՛և՘՛՛ըՅևրտաՈ֍բՕյ֔բՐչն֑֓ֈ֌ռ֗ցջ֐՛ո֡զ֣֡ճ֥֨֗֞֯ձ֢խցիַ֤֭֨֏֫֔պն֍ֶ֔ս֢֖֕փվֺ֞քֺֺּׂ֮֮֔֠׎׃֕֌ְֵֶ֚֗֒֬זִ֯ז֢כ֖ו֦ףֺ֦ףיְ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[36] = NLoginCore_575.D("ҳҬ҅҇ҟѴҐҳѺ҅ҳѳѻҶҫӀҏѵҺҡҲ҅҇ӂқӈҹ҇ҠҨӋҥҭӉӏӃҤҤҢҸҔҨӑҙҔӏҘҴҚӣӘҽӠҟҞӥҼәӫҫӀӞҰӛӱӐӞүүӂӵӖӫҴӻӾҸӟӹөҸӯӏӂӆӾӤӢӉӹӈӹӢӈӨԆӊԋԔԄӰӤөӥӒӚӱөԔԘӽӝӬԍԑԔԟӣԅԪԇԪӸԈԧӷԩԇԇԯԨӾӵԟԏԈԘԐԩԙԐӽԴӷԼԂՅԔԀԟԟՁԴӽԄԪԟԉՄԣՎԢՋԱԠԭՎ՚ԐՍԲՏ՝ԽՓՎԱ՗ՌԵՕ՛ՒԟԳ՝Ն՝ըՈԾԭճա՝աՌՉՎԴդՋՖ՘վծ՝Տչատ՗ձյ՛՚մցՖսծչ։ֈջ֍դցՌժձՋ։ջՒ։՗տ֚իշ֤՞շդբռֆք֜ջք֊օְ։։լֵ֠ֆ֡ց֣֏֓ն֑֬ջ֬տִ֐֙շֱ֕֐֢֖֗վֆևׁ֙֬ג֍֔֨֎׉׌֨ו׊ךמ׉ֻ֪֜׊ֲֵ֬֝ל׈֣ת׊֩׍־םתֲ֬כֽ֮֯׌א׍ֳױ׵֯׾׶׬ֹ׬פנׁ׾נ׹פ׃חיׇ׎נ׬׽؆אעאו׿ףؚ؋ؑ׵؈؏״׾؀؝׽׬ؖ؟׿׬׭", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[37] = NLoginCore_027.E("ԽԻբ԰ԱԠԡգԺՁԣՃիՙՏԬԭՇԭճնԨՂԳըՖձԻՖԼ՚ՑղճյգՄՅջրԿյՅրՃօՊր֊փՒ֑֕բը։ճզՒՔֆ֔֎՟ճղ՚֛֑֥նոև֖֙ջշըփ֥֨ր֥֑֪֑֒֡ք֖֭֙ջվ֧֝չ׀֋ս֖֜֞և׃֧֝ֈ׀֞׎֥։ְֳ֢׌֛ׄ֜", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[38] = NLoginCore_110.F("ԿՐԱՖՔ՚՗ՒԟԜՈժԧ՘ՆԮԣ՜ԯՍՄՠլնըԹ՘ԺղՙԱտտՒԻՍՔՅ՛ՙըՃդՠ֎ցգփ՝եձՔհ֔թՕՑե՛ՎօձվոջՙՕղօդ֠ճ֝չ֥֗լջտ֚֯փս֮։ַָ֑֦֪֓֘֌ռ׀ֈֵոֶ֟ք֘֝֒տ֧։֛֚׍֌ׄ׉ׁ֥׊ֵ֧זֶ֓׎ׇ֥ךמהַו֜֡֬אֶ֢֘־נ׌פ֫׍׬׭׮ם׏װׇן׎ׅאשװץַװ־׼׊׌ֿ׭׏זװ׀דכׅתו؏؂؎؇׼ג؂אײ؃פס؍؃תؗםרױ׸׫ׯסנ׹מ؅׸اף׹ؠ׾ذج׮ؒ؄׬؊ضؓرعة؄؊ؾ؆شؚف؞ؤآ؀ظسصؒ؇ؠؘإؙؾؽثآلؒيرٌوئقضستذَس٠تؼٖحعْا٣ْئوثوِٞٚف٦٥ضٵ١٨ٵٰٙٔٹٍپٷٝ٢ٰٖڇٲغٝي٫ٸڍ٦٨ٝڅًڋٴِډ٥ّْٴ٣ٽژٙڜٶٙ٠٭ٞٷڥپڐ١٨ڬڕڄٿڈڪٰٱڄڝڳڴٻټ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[39] = NLoginCore_384.E("ԱՏաԛԛՅՃ՜եԦԺՋՎԫՀԩթ՚ժԮԽմԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[40] = NLoginCore_559.A("įĈĳľĬŉŒīĢŋńğ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[41] = NLoginCore_110.C("ѲҢҕҥѳҏѳѵҰѸ҉ѷҪҐҐһҕӁқһҥѹҚҽѼ҉Ҵ҄ҨҮҨӒ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[42] = NLoginCore_092.D("ґҥѽѲҀҶґҳ҆ҰҕҍҝѺҽѼҊҸҞҤҝҵҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[43] = NLoginCore_027.F("ԿՊՁԱԢԺՓԤՀԴԵՀՅի՟ԺեՋծԿզմԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[44] = NLoginCore_384.A("ĐŀĳŃđĭđēŎĖĩōĮĭřŐıōĳĕĳĽĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[45] = NLoginCore_453.B("ĬŃīŎŕĝŋĬĖŘĩőœŅĘĪśěŐĢŌœĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[46] = NLoginCore_387.A("ĥňČŅœōģĢŁĘŒŜĶŗřśĿŋŜĝŞœĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[47] = NLoginCore_324.A("ŀŌĭŊńńŊķĎĐĳěœŅŒŚķŌţŏţĳŘŕŉŀňŝŜŕŭĪ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[48] = NLoginCore_173.C("ґѰѯѴҎѵҸҢѵґѻҬҨҼҍҎҷѿұѽҳҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[49] = NLoginCore_201.A("įŏŒĤĨħĵĳıīņŃėęīğŊŝŃĳĬĽĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[50] = NLoginCore_451.F("ՒԚՍՓՍԟՏԲԨ՗զ՞եՂլՂՇՄխբՖՏՑՈՈժՓՉՓհթՍ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[51] = NLoginCore_453.B("ŁĉļłļĎľġėņŕōŔıśıĶĳŜőŅŅťŇŤňŗĤŠŃŞŁ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[52] = NLoginCore_387.C("ҍѪүҎү҃ҖҏҢҰѵѵҦҙҕѼҔѹҎүӂҟҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[53] = NLoginCore_027.B("ĻĈŌąĨďŒĠīŎŐğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[54] = NLoginCore_324.F("Ռ՚ՐԣՅԳԹՖժԴեԴէբԬ՟դլԲըձհԲՆժԵզզՓհ՞Փ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[55] = NLoginCore_324.A("ĻŉĿĒĴĢĨŅřģŔģŖőěŎœśġŗŠśŧŕİĶŅġĿĦśį", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[56] = NLoginCore_138.C("ҫҞҠѮѶѰҫҷҭҜҶҥҶҜґқҊҸӀҶҜҸғҸҚҁ҈ҫ҅ҽң҈", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[57] = NLoginCore_091.C("ҫҞҠѮѶѰҫҷҭҜҸҭҖҭҵѿҙҋҶҰҽҵҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[58] = NLoginCore_138.D("҉ѳҦҦ҆ҮҭҬҳҋҦҩҭҕҡґѹҖӄҲ҄ҔңѿҺѽҽӃҦҡӍӏӂӓҊӐҥӘӒҪӖӍҷҩҲҝәһұһҸҭҦҷӆӅӨӕҶҾӄӭӌӧҤӠӱӌҰӊӹӚҸҭһӁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[59] = NLoginCore_004.B("ĘċĤńįĎĲŕŒęœčŕĭĩŊĚŔıĜķĝĶĠŠĠķŊŊŇŞř", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[60] = NLoginCore_324.D("ѲѫѼҢҖ҃Ҁ҇ҘѻҧѼѺҾқҺҍӃҚҔӇҳҢҒҕҼҵҕҸӃ҇ҩ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[61] = NLoginCore_223.F("բ՞ԟՏԮԣՇԢէըԢ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[62] = NLoginCore_223.A("ħŏŀŊŔĲŉĭŗŕĖĘœņĸňŁğŢİŔœĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[63] = NLoginCore_575.F("ԫԱՃՏ԰ԷԽԳՕԾԪ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[64] = NLoginCore_027.B("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļřĹŜľĭŃŅšĵūŖĿ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[65] = NLoginCore_201.B("ļőĄľģĠŇĲœŚđīŇīĶŎŜįĵĚŢńśŃťģķĝŭĵŎħ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[66] = NLoginCore_324.A("ļőĄľģĠŇĲœŚēŏĨŞňĽŘĞŗĽŘĹşŨĽŤĤļŅŬŖĮ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[67] = NLoginCore_223.F("ԽԙԹ՛ԥՂԝՖԻՒթ԰", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[68] = NLoginCore_138.E("ՍբԕՏԴԱ՘ՃդիԢՌԵ՘թձԼբՍԪՃՁնՋԵլթսկ՗ՠո", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[69] = NLoginCore_091.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļţŋŰŧĪıĵĶŁŦŸĿ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[70] = NLoginCore_076.F("ՍբԕՏԴԱ՘ՃդիԢԤՌը՛ՌԺՌճՈԽՐիաԯ԰թԸՋվՓ՛", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[71] = NLoginCore_138.A("ČċĩļČĢıĢŒŕřœōŗřĲĭĭŔŋŠţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[72] = NLoginCore_387.F("ՍբԕՏԴԱ՘ՃդիԢ՚ԻՉ՘՝ԩԼԿբՂՖԱՐ՗զԭՍՅ՟թշ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[73] = NLoginCore_110.B("ļőĄľģĠŇĲœŚđŋŔĪķśŠĲķşĿŘĿśńĶĶĽŋłŮġ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[74] = NLoginCore_004.B("ļőĄľģĠŇĲœŚĒĔħļĺįļĵĚŢĜĲĝĿŖĳŃŦŗńšř", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[75] = NLoginCore_223.A("ŌľœįĢĴğŊĶŕĮŔŏņŌıĽįŀŌĤŗŦŏţĺŒūōğĩŝŪũĩųĳŦŦŴņķŖŘĳŲĵŠůşŐľĶōŊŋ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[76] = NLoginCore_138.A("ļőĄľģĠŇĲœŚĒĻŅħĔŉŠŜğĲĵŝġĿŖłļŪŚĭĩĩŠĭīŒĪİŅĲŪŕŴĿ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[77] = NLoginCore_451.A("ļőĄľģĠŇĲœŚēŘŎĺşŝĴŏŖĢŕŢĞİĹłŨĦģŜņļľŉĺŉŤįĭįũšŒĿ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[78] = NLoginCore_110.F("՗՝ԟՓԵԹԹԿՑԷՀ՝ՇԻՎՐժժԲ԰ՓմԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[79] = NLoginCore_324.E("ՂՐ՗ԚԺՕԼՠԡիԨԸԬԶՈԹբՀձ՝եԾԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[80] = NLoginCore_223.B("ĮĞŌğİĩĒėŊœİŊśďĲıŀĚŎġıţĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[81] = NLoginCore_138.E("Կԯ՝԰ՁԺԣԨ՛դՂԴԼըԪԩԾՐԪՋՌմԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[82] = NLoginCore_138.C("ҪҮҵҕѴҒҍҏҔҒҥҝҴѹҬѹқңҶѼҜҟҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[83] = NLoginCore_091.D("ҋѩ҉ҔүҋҒҶҖҦ҅ҕҟҴҳҲҮѹһ҄ҢҟҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[84] = NLoginCore_559.C("ҏ҄ҠҥҔҲҔҬҤҬғҶҰҞҫҮҹһҷӀӁҵҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[85] = NLoginCore_453.E("ԹաՖՙԣ՛ՅՅՕդլգ՞Զդ՛ՁբկըղՅՅմԱնծԷՔիհ՜մԻԼՔՔզՒք։՗՛Ր", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[86] = NLoginCore_091.E("ԩ԰՚ԾԡէՙԤաԽՄՈԤզգ՛ԧծԥՠ՞ԾԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[87] = NLoginCore_559.B("ĽĎĥčŋŎŀĨģŅĬčĚĪŒıĩŏİŝķőŗřŕŇŢŝĨŗũūįİūŬőŋŮŒĵŌĵĻŴžĸŶźĻŷŐƄļŚƁœŝŪŗƇŗƁŞŉƑŢŏŒũƏşŔŵƘş", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[88] = NLoginCore_223.D("Ҡ҆ңҨҦҌҸҐҊҖҹҗҨѼӀҔҒҞүҁҏҏҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[89] = NLoginCore_027.D("Ҝѻұҏҕѭҩ҄҂ҫҋҺҷѵҟҵҬҞґғҲҵҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[90] = NLoginCore_223.B("ĤĪōĦĿĳĤĨŊĶōĒňŐħŌįŒġĜŎţĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[91] = NLoginCore_223.B("ļŊĥőİğňňĹċĺğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[92] = NLoginCore_110.C("҉҉ҴҲҥғѵҗҎѻѲһѽһѻѽңҞѼҭ҃ҟҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[93] = NLoginCore_223.D("үҜ҇ѽ҂ҩҰҊ҂ҎҼѵҰҐүѷҟҌҽҥҎҏҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[94] = NLoginCore_076.B("ĨĞĐńįġČĉĹŊńğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[95] = NLoginCore_453.B("ıīœěŉģōİĕłŔėŇĻŜĭėŉśţŎĭĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[96] = NLoginCore_076.B("ĽĎĥčŋŎŀĨģŅĭŊĵėņœŜěĞĝĬœĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[97] = NLoginCore_384.F("ԲՊՙԷԤԤԙԹաԽ՘Ոՙե՚աէՁՒՇՆՕբՒոՔհԻԽԺխԾճՌցքՃՐգ։Չՠգմևխ֐ժթփՒդձ֌գնփդկճ֝ֈ֙ժ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[98] = NLoginCore_092.F("Ը՚Փ԰ՓԳ՛ՅՙԲԼՂԤ՟ՎՎլԫԽՁՅՎԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[99] = NLoginCore_223.E("Ց՝Ծ՛ՕՕ՛ՈԟԡՃՙԥդգէԮՏաԳՒԴնԸպՈժԵոԽ՗ԹնցԺՔՖՃաաոմՋվԿդժըվեՠ֎֋ճճ֍զք֍ղ֓֋ղնՙՠ֌ջյ֚֡րֈ֤֒֋ք֛֬բ֞ֆֆ֊ַ֮֠֗ք֏նֹ֧֘ո֖", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[100] = NLoginCore_324.C("ғҡҨѫҋҦҍұѲҼѸҕҏҺһҝҹҍҟҚҤҏҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[101] = NLoginCore_223.D("ѱҩҀүүң҅Ңҫ҃ґ҉Ҝ҇ѲҋҭѺҗҼҔӅҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[102] = NLoginCore_091.B("ĘğŉĭĐŖňēŐĬĲŗĥŖİİŕľĪōĜœĪī", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[103] = NLoginCore_091.E("ՍգԺ՝ՆԘՁԺՑՒզըՆԹըՙՌՇՒլՀէՆմՑԶՄՒԵԶնլՕ՞քԼՀղւզՅՖիՐ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[104] = NLoginCore_092.A("ıħōĉġġőėįĳŃēŘŎŘĨĽĞĸĲĿţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[105] = NLoginCore_004.D("ұҭҦҮҟҤѵҐҺҴѳҁ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[106] = NLoginCore_384.F("աՓՓԲԽԟԢ՚ՄԺԩ՟զԠՌՀՄծժընՎԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[107] = NLoginCore_091.D("ѮѼѱҰҗҬҴҢҢґҳҶҼҗҒҬҷҀҘҏҼҷҷҀҿӅҫҦ҉ҙҹӃӆҭҞӇҔӐҲҔӘҮҨҡ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[108] = NLoginCore_446.A("ĿŎŎĎįĭķīĠĴĳōŖőĝīĝłĠŝĚĽĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[109] = NLoginCore_427.C("ҡҰҰѰґҏҙҍ҂ҖҔҽѷҘғҗҐҿҲҜҚҟҌҍ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[110] = NLoginCore_451.F("ԶԼՀ՞ԠԣՂ՟ՓԼԪ՜թՌըՉՎծհԴՂԾԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[111] = NLoginCore_004.D("ҊѻҎѴҥҋғѫҨ҉ҖұҶѺҚҏӂҫҳқҀҁӀѿҦҠҧҫӃӋ҆ӇӇңҤҽҐҬүӋҹҩҒҕҲӖҽҚҡӝӠҮұӕҬҭ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[112] = NLoginCore_004.F("ԶԼՀ՞ԠԣՂ՟ՓԼԡլՅդՄԺիբԪէձյՓԪղՎիպոզ՝պ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[113] = NLoginCore_027.A("ŀŌĭŊńńŊķĎĐĵřĘŒĮňŜŢĘŁįĶŞħğśŕĳťţťň", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[114] = NLoginCore_091.E("ՂԿԿԻ՗՘ՐդԻԣժԣծբհձՉժհՏԫդԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[115] = NLoginCore_201.B("ĊŎŎŎŃĐņģĬňįņōħķĴšōŜĝŢĶŏşğĦśŤīĦĩŭőūīĬŨŉłūũűĶĺŬŜŕķŚŘľŸųŹůŐťŒŔžƄŵƀŁũŝƂŻŴƅňƈŪźƎųůŖŭřƒơƊƍųžƒƗƃƠŪƪƆƞŪƀŪţƏƁƨƵưſƱƈƋƧŷƒƎŵƴŽƝžƭƳƊƋ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[116] = NLoginCore_384.A("ŀŌĭŊńńŊķĎĐĲĔŘŕĝĮĪĵĲŕŕĥĵĹĤĥĨĨŭŋŚŮĿņłśńľĮİůŔĵŒűĶřŰĸőĴűƀŶťŞųŖŊƊţŗŷŉ", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[117] = NLoginCore_076.F("Ց՝Ծ՛ՕՕ՛ՈԟԡՆՙէԻԡ՝ԿՒ՟ՁՆիԲհգՉՖլ՝ՖՖՙԺհՃռքՂՐ՚ՁՖՠ՟դոր֊գ՜֏֑։ը֕զնՑյևռֆ՝ի", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[118] = NLoginCore_384.C("Ѥҳҋѭ҄ҤҎҮҕҰҌҁ", (byte)44, 67);
                    NLoginType_018.var_java_lang_String_arr_b[119] = NLoginCore_453.A("ĪŋőĩŁŁŕĨĪĐőŌĩŘĳōŏŐřĿĽţĪī", (byte)44, 65);
                    NLoginType_018.var_java_lang_String_arr_b[120] = NLoginCore_004.B("ĨģĒĲĬČĬņėĹđğ", (byte)44, 66);
                    NLoginType_018.var_java_lang_String_arr_b[121] = NLoginCore_223.F("ՁԻՋ՘ԸէԞԞԛՃՊգԣզԾլ՚՝ՌգնԾԻԼ", (byte)44, 70);
                    NLoginType_018.var_java_lang_String_arr_b[122] = NLoginCore_451.E("ԻՌԾՠ՜ՐԦՑըէՠԾՃԽգԻՇ՞Ճգ՞դԻԼ", (byte)44, 69);
                    NLoginType_018.var_java_lang_String_arr_b[123] = NLoginCore_091.D("ѽҤѬѲҭҵҡғҳҬҲҒҩҼҜҏҊҷӃҕҝҵҌҍ", (byte)44, 68);
                    NLoginType_018.var_java_lang_String_arr_b[124] = NLoginCore_223.A("ŏĈńĊłŕĐğġĪōįĶďŉľŕšřĶŁĭĪī", (byte)44, 65);
                    continue block7;
                }
                case 2: {
                    NLoginType_018.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ұѥ҄ҊѴѵҦҙҋѳґҊҹҽҰҝҵҒҍӆѽҵҌҍ", (byte)44, 68);
                    continue block7;
                }
                case 4: {
                    NLoginType_018.var_java_lang_String_arr_b[0] = NLoginCore_076.E("ԗԱԙԛԝՠՀԥ՛ՂԻԣ՟ՎՇԯՍ՟ԯԭղԾԻԼ", (byte)44, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_018.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.C("ґҳҵҕҹӘӐӦӒҡӟӕӣӝҦӋӭӬӤӪӤҹ", (byte)60, 67), NLoginType_018.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.E("՛ըէԪժզաժյդԱկճլկյԷࢯ࣓࣒࣒࣊ࣂࣈࣖࢴࢸՍ", (byte)60, 69) + string + NLoginCore_201.D("ң", (byte)60, 68) + methodType.toString(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f(NLoginCore_277 NLoginCore_2772) {
        Set set;
        if (NLoginCore_134.var_com_nickuc_login_NLoginCore_134_a.ar()) {
            this.var_java_util_Timer_a.schedule((TimerTask)new NLoginCore_480(this, NLoginCore_2772), var_long_o);
        }
        Set set2 = set = (Set)this.var_long_c.get((Object)NLoginCore_2772, NLoginCore_277 -> new HashSet());
        synchronized (set2) {
            set.forEach(byArray -> this.b(NLoginCore_2772, (byte[])byArray));
            set.clear();
        }
    }

    private void o() {
        block6: {
            PluginManager pluginManager = this.var_com_nickuc_login_bukkit_nLoginBukkit_o.org_bukkit_Server_a().getPluginManager();
            if (pluginManager.getPlugin((String)NLoginType_018.c("㺀", (int)nu, (long)nv)) == null && (!NLoginCore_012.U() || NLoginCore_409.a().c(NLoginCore_409.var_com_nickuc_login_NLoginCore_409_o))) {
                NLoginCore_370.e((String)NLoginType_018.c("㺃", (int)nw, (long)(nx ^ ny)), new Object[nz]);
                File file = this.var_com_nickuc_login_bukkit_nLoginBukkit_o.java_io_File_c().getParentFile();
                File file2 = new File(file, (String)NLoginType_018.c("㺆", (int)(oa & ob), (long)oc));
                if (file2.exists() && !file2.delete()) {
                    file2.deleteOnExit();
                    NLoginCore_370.d((String)NLoginType_018.c("㺉", (int)(od & oe), (long)of) + file2 + (String)NLoginType_018.c("㺌", (int)og, (long)(oh ^ oi)), new Object[oj]);
                    return;
                }
                NLoginCore_285 NLoginCore_2852 = NLoginCore_305.a().a((String)NLoginType_018.c("㺏", (int)ok, (long)(ol ^ om)), file2);
                if (NLoginCore_2852.p() != on || !NLoginCore_2852.af()) {
                    NLoginCore_370.d((String)NLoginType_018.c("㺒", (int)oo, (long)(op ^ oq)) + NLoginCore_2852.p(), new Object[or]);
                } else {
                    try {
                        pluginManager.loadPlugin(file2);
                    }
                    catch (Exception exception) {
                        NLoginCore_370.c((String)NLoginType_018.c("㺕", (int)(os & ot), (long)ou), exception, new Object[ov]);
                        if (file2.delete()) break block6;
                        file2.deleteOnExit();
                    }
                }
            }
        }
    }

    private void b(NLoginCore_277 NLoginCore_277, String string) {
        this.g(NLoginCore_277);
        JSONObject jSONObject = new JSONObject(string);
        if (!jSONObject.has((String)NLoginType_018.c("㺀", (int)av, (long)(aw ^ ax)))) {
            NLoginCore_370.c((String)NLoginType_018.c("㺃", (int)ay, (long)(az ^ ba)), new Object[bb]);
            NLoginCore_370.c((String)NLoginType_018.c("㺆", (int)bc, (long)bd), new Object[be]);
            return;
        }
        byte[] byArray = NLoginCore_158.byte_arr_a(jSONObject.getString((String)NLoginType_018.c("㺉", (int)(bf & bg), (long)bh)).getBytes(StandardCharsets.UTF_8));
        if (this.var_byte_arr_a == null) {
            NLoginCore_366.a(new ByteArrayInputStream(byArray), this.var_java_io_File_c);
            this.m();
        }
        if (!Arrays.equals(byArray, this.var_byte_arr_a)) {
            NLoginCore_370.c((String)NLoginType_018.c("㺌", (int)(bi & bj), (long)bk), new Object[bl]);
            String[] stringArray = new String[bm];
            stringArray[NLoginType_018.bn] = NLoginType_018.c("㺏", (int)(bo & bp), (long)bq);
            stringArray[NLoginType_018.br] = NLoginType_018.c("㺒", (int)bs, (long)bt);
            stringArray[NLoginType_018.bu] = NLoginType_018.c("㺕", (int)bv, (long)(bw ^ bx));
            String string2 = NLoginCore_112.a(stringArray);
            NLoginCore_277.a(string2);
            return;
        }
        if (jSONObject.has((String)NLoginType_018.c("㺘", (int)by, (long)bz))) {
            JSONArray jSONArray = jSONObject.getJSONArray((String)NLoginType_018.c("㺛", (int)ca, (long)(cb ^ cc)));
            if (jSONArray.length() == 0) {
                throw new IllegalArgumentException((String)NLoginType_018.c("㺞", (int)cd, (long)(ce ^ cf)));
            }
            for (int i = cg; i < jSONArray.length(); ++i) {
                String string3;
                int n;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                try {
                    this.a(NLoginCore_277, jSONObject2);
                    continue;
                }
                catch (JSONException jSONException) {
                    n = jSONObject2.getInt((String)NLoginType_018.c("㺡", (int)ch, (long)ci));
                    string3 = jSONObject2.getString((String)NLoginType_018.c("㺤", (int)cj, (long)(ck ^ cl)));
                    NLoginCore_370.c((String)NLoginType_018.c("㺧", (int)cm, (long)cn) + n + (String)NLoginType_018.c("㺪", (int)(co & cp), (long)cq) + string3 + (String)NLoginType_018.c("㺭", (int)cr, (long)(cs ^ ct)) + i + (String)NLoginType_018.c("㺰", (int)cu, (long)cv), jSONException, new Object[cw]);
                    continue;
                }
                catch (Exception exception) {
                    n = jSONObject2.getInt((String)NLoginType_018.c("㺳", (int)cx, (long)cy));
                    string3 = jSONObject2.getString((String)NLoginType_018.c("㺶", (int)cz, (long)(da ^ db)));
                    NLoginCore_370.c((String)NLoginType_018.c("㺹", (int)dc, (long)dd) + n + (String)NLoginType_018.c("㺼", (int)de, (long)(df ^ dg)) + string3 + (String)NLoginType_018.c("㺿", (int)dh, (long)(di ^ dj)) + i + (String)NLoginType_018.c("㻂", (int)dk, (long)(dl ^ dm)), exception, new Object[dn]);
                }
            }
        } else {
            this.a(NLoginCore_277, jSONObject);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CompletableFuture<JSONObject> a(NLoginCore_277 NLoginCore_277, NLoginCore_121 NLoginCore_1212, Object ... objectArray) {
        CompletableFuture<JSONObject> completableFuture = new CompletableFuture<JSONObject>();
        Cache<Long, CompletableFuture<JSONObject>> cache = this.cfr_renamed_28;
        synchronized (cache) {
            long l = this.var_java_util_concurrent_atomic_AtomicLong_b.incrementAndGet();
            this.cfr_renamed_28.put((Object)l, completableFuture);
            Object[] objectArray2 = new Object[mj];
            objectArray2[NLoginType_018.mk] = NLoginType_018.c("㺀", (int)(ml & mm), (long)mn);
            objectArray2[NLoginType_018.mo] = l;
            objectArray2[NLoginType_018.mp] = NLoginType_018.c("㺃", (int)mq, (long)mr);
            objectArray2[NLoginType_018.ms] = NLoginCore_1212.int_b();
            objectArray2[NLoginType_018.mt] = NLoginType_018.c("㺆", (int)(mu & mv), (long)mw);
            objectArray2[NLoginType_018.mx] = NLoginCore_1212.a(objectArray);
            this.a(NLoginCore_277, mi, objectArray2);
        }
        return completableFuture;
    }

    private void m() {
        if (this.var_byte_arr_a != null) {
            throw new IllegalStateException((String)NLoginType_018.c("㺀", (int)(l & m), (long)n));
        }
        if (this.var_java_io_File_c.exists()) {
            this.var_byte_arr_a = Files.readAllBytes(this.var_java_io_File_c.toPath());
        }
    }

    public void n() {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_o.com_nickuc_login_NLoginCore_120_a().a(NLoginType_018.c("㺀", (int)p, (long)(q ^ r)), this.var_com_nickuc_login_NLoginCore_504_a);
    }

    private static String a(int n, long l) {
        l ^= 0x43L;
        l ^= 0x50477DFBB1DD8AAFL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(20 + 49), (byte)(10 + 73), (byte)(9 + 38), (byte)(49 + 18), 66, (byte)(47 + 20), (byte)(40 + 7), (byte)(11 + 69), (byte)(73 + 2), (byte)(43 + 24), (byte)(50 + 33), (byte)(28 + 25), (byte)(44 + 36), 97, (byte)(21 + 79), (byte)(75 + 25), (byte)(59 + 46), (byte)(83 + 27), (byte)(88 + 15)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(12 + 56), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.B("ŖţŢĥťšŜťŰşĬŪŮŧŪŰĲҪӎӅӍӍҽӃӑүҳ", (byte)58, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_018.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static /* synthetic */ Cache com_nickuc_login_lib_caffeine_cache_Cache_a(NLoginType_018 NLoginType_018) {
        return NLoginType_018.cfr_renamed_27;
    }

    private void b(NLoginCore_277 NLoginCore_277, byte[] byArray) {
        try {
            if (byArray.length == 0) {
                return;
            }
            String string = new String(byArray, StandardCharsets.UTF_8);
            if (string.isEmpty()) {
                return;
            }
            try {
                if (string.charAt(w) == x && string.charAt(string.length() - y) == z) {
                    this.b(NLoginCore_277, string);
                    return;
                }
                Object[] objectArray = new Object[ad];
                objectArray[NLoginType_018.ae] = string;
                NLoginCore_370.d((String)NLoginType_018.c("㺀", (int)aa, (long)(ab ^ ac)), objectArray);
            }
            catch (JSONException jSONException) {
                Object[] objectArray = new Object[ai];
                objectArray[NLoginType_018.aj] = string;
                NLoginCore_370.c((String)NLoginType_018.c("㺃", (int)af, (long)(ag ^ ah)), jSONException, objectArray);
            }
        }
        catch (Exception exception) {
            if (byArray[ak] != al) {
                long l = System.currentTimeMillis();
                if (l - this.var_long_d >= am) {
                    this.var_long_d = l;
                    NLoginCore_370.d((String)NLoginType_018.c("㺆", (int)(an & ao), (long)ap), new Object[aq]);
                }
            }
            NLoginCore_370.c((String)NLoginType_018.c("㺉", (int)ar, (long)(as ^ at)), exception, new Object[au]);
        }
    }

    public void a(NLoginCore_277 NLoginCore_277, int n, Object ... objectArray) {
        if (objectArray.length % my != 0) {
            throw new IllegalArgumentException((String)NLoginType_018.c("㺀", (int)mz, (long)(na ^ nb)));
        }
        JSONObject jSONObject = new JSONObject();
        if (this.var_byte_arr_a != null) {
            jSONObject.put((String)NLoginType_018.c("㺃", (int)(nc & nd), (long)ne), (Object)NLoginCore_158.java_lang_String_a(this.var_byte_arr_a));
        }
        jSONObject.put((String)NLoginType_018.c("㺆", (int)nf, (long)(ng ^ nh)), n);
        jSONObject.put((String)NLoginType_018.c("㺉", (int)(ni & nj), (long)nk), (Object)NLoginCore_277.getName());
        for (int i = nl; i < objectArray.length; ++i) {
            Object object;
            if (!((object = objectArray[i++]) instanceof String)) {
                throw new IllegalArgumentException((String)NLoginType_018.c("㺌", (int)nm, (long)(nn ^ no)) + object);
            }
            Object object2 = objectArray[i];
            jSONObject.put((String)object, object2 != null ? object2 : JSONObject.NULL);
        }
        byte[] byArray = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
        if (!this.var_com_nickuc_login_bukkit_nLoginBukkit_o.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_581_b().a(NLoginCore_277, (String)NLoginType_018.c("㺏", (int)np, (long)nq), byArray)) {
            NLoginCore_277.a(this.var_com_nickuc_login_bukkit_nLoginBukkit_o, NLoginCore_337.var_com_nickuc_login_NLoginCore_337_b, NLoginType_018.c("㺒", (int)(nr & ns), (long)nt), byArray);
        }
    }

    static /* synthetic */ nLoginBukkit com_nickuc_login_bukkit_nLoginBukkit_a(NLoginType_018 NLoginType_018) {
        return NLoginType_018.var_com_nickuc_login_bukkit_nLoginBukkit_o;
    }

    static {
        var_long_a = Long.reverse(-5476377146882523136L);
        var_long_b = Long.reverse(0x7800000000000000L);
        f = Long.reverse(0x7800000000000000L);
        g = Integer.reverse(0);
        h = Long.reverse(-7349094952542294848L);
        i = Long.reverse(-4467570830351532032L);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = Long.reverse(6341847914664012992L);
        l = (0x20000000 >>> 220 | 0x20000000 << ~220 + 1) & 0xFFFFFFFF;
        m = -1 >>> 157 | -1 << ~157 + 1;
        n = Long.reverse(6341847914664012992L);
        var_long_o = Long.reverse(640637046993453056L);
        p = 24576 >>> 109 | 24576 << ~109 + 1;
        q = Long.reverse(-7349094952542294848L);
        r = Long.reverse(-4467570830351532032L);
        s = Integer.reverse(0x20000000);
        t = Long.reverse(-7349094952542294848L);
        u = Long.reverse(-4467570830351532032L);
        v = 0 >>> 150 | 0 << -150;
        w = 0 >>> 0 | 0 << -0;
        x = Integer.reverse(-570425344);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = 125 >>> 224 | 125 << -224;
        aa = Integer.reverse(-1610612736);
        ab = Long.reverse(-7349094952542294848L);
        ac = Long.reverse(-4467570830351532032L);
        ad = (4096 >>> 204 | 4096 << -204) & 0xFFFFFFFF;
        ae = (0 >>> 7 | 0 << -7) & 0xFFFFFFFF;
        af = 3072 >>> 233 | 3072 << -233;
        ag = Long.reverse(-7349094952542294848L);
        ah = Long.reverse(-4467570830351532032L);
        ai = (Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << ~95 + 1) & 0xFFFFFFFF;
        aj = Integer.reverse(0);
        ak = (0 >>> 40 | 0 << ~40 + 1) & 0xFFFFFFFF;
        al = Integer.reverse(-570425344);
        am = Long.reverse(1281274093986906112L);
        an = Integer.reverse(-536870912);
        ao = -1 >>> 74 | -1 << -74;
        ap = Long.reverse(6341847914664012992L);
        aq = Integer.reverse(0);
        ar = (256 >>> 197 | 256 << ~197 + 1) & 0xFFFFFFFF;
        as = Long.reverse(-7349094952542294848L);
        at = Long.reverse(-4467570830351532032L);
        au = Integer.reverse(0);
        av = (288 >>> 101 | 288 << ~101 + 1) & 0xFFFFFFFF;
        aw = Long.reverse(-7349094952542294848L);
        ax = Long.reverse(-4467570830351532032L);
        ay = Integer.reverse(0x50000000);
        az = Long.reverse(-7349094952542294848L);
        ba = Long.reverse(-4467570830351532032L);
        bb = Integer.reverse(0);
        bc = (0x60000001 >>> 253 | 0x60000001 << ~253 + 1) & 0xFFFFFFFF;
        bd = Long.reverse(6341847914664012992L);
        be = 0 >>> 166 | 0 << -166;
        bf = (24576 >>> 203 | 24576 << -203) & 0xFFFFFFFF;
        bg = Integer.reverse(-1);
        bh = Long.reverse(6341847914664012992L);
        bi = 0x340000 >>> 210 | 0x340000 << -210;
        bj = Integer.reverse(-1);
        bk = Long.reverse(6341847914664012992L);
        bl = 0 >>> 65 | 0 << ~65 + 1;
        bm = Integer.reverse(-1073741824);
        bn = Integer.reverse(0);
        bo = Integer.reverse(0x70000000);
        bp = Integer.reverse(-1);
        bq = Long.reverse(6341847914664012992L);
        br = 0x400000 >>> 182 | 0x400000 << -182;
        bs = Integer.reverse(-268435456);
        bt = Long.reverse(6341847914664012992L);
        bu = (256 >>> 167 | 256 << ~167 + 1) & 0xFFFFFFFF;
        bv = 64 >>> 226 | 64 << ~226 + 1;
        bw = Long.reverse(-7349094952542294848L);
        bx = Long.reverse(-4467570830351532032L);
        by = (544 >>> 165 | 544 << -165) & 0xFFFFFFFF;
        bz = Long.reverse(6341847914664012992L);
        ca = Integer.reverse(0x48000000);
        cb = Long.reverse(-7349094952542294848L);
        cc = Long.reverse(-4467570830351532032L);
        cd = 0x1300000 >>> 52 | 0x1300000 << ~52 + 1;
        ce = Long.reverse(-7349094952542294848L);
        cf = Long.reverse(-4467570830351532032L);
        cg = Integer.reverse(0);
        ch = (163840 >>> 109 | 163840 << -109) & 0xFFFFFFFF;
        ci = Long.reverse(6341847914664012992L);
        cj = Integer.reverse(-1476395008);
        ck = Long.reverse(-7349094952542294848L);
        cl = Long.reverse(-4467570830351532032L);
        cm = -2147483643 >>> 254 | -2147483643 << -254;
        cn = Long.reverse(6341847914664012992L);
        co = Integer.reverse(-402653184);
        cp = Integer.reverse(-1);
        cq = Long.reverse(6341847914664012992L);
        cr = Integer.reverse(0x18000000);
        cs = Long.reverse(-7349094952542294848L);
        ct = Long.reverse(-4467570830351532032L);
        cu = (819200 >>> 15 | 819200 << -15) & 0xFFFFFFFF;
        cv = Long.reverse(6341847914664012992L);
        cw = Integer.reverse(0);
        cx = Integer.reverse(0x58000000);
        cy = Long.reverse(6341847914664012992L);
        cz = 0xD800000 >>> 23 | 0xD800000 << ~23 + 1;
        da = Long.reverse(-7349094952542294848L);
        db = Long.reverse(-4467570830351532032L);
        dc = Integer.reverse(0x38000000);
        dd = Long.reverse(6341847914664012992L);
        de = 232 >>> 227 | 232 << ~227 + 1;
        df = Long.reverse(-7349094952542294848L);
        dg = Long.reverse(-4467570830351532032L);
        dh = Integer.reverse(0x78000000);
        di = Long.reverse(-7349094952542294848L);
        dj = Long.reverse(-4467570830351532032L);
        dk = Integer.reverse(-134217728);
        dl = Long.reverse(-7349094952542294848L);
        dm = Long.reverse(-4467570830351532032L);
        dn = (0 >>> 154 | 0 << ~154 + 1) & 0xFFFFFFFF;
        cfr_renamed_1 = 0x8000000 >>> 86 | 0x8000000 << -86;
        dp = Long.reverse(6341847914664012992L);
        dq = (528 >>> 228 | 528 << ~228 + 1) & 0xFFFFFFFF;
        dr = Integer.reverse(-1);
        ds = Long.reverse(6341847914664012992L);
        dt = 0x44000000 >>> 25 | 0x44000000 << ~25 + 1;
        du = Long.reverse(-7349094952542294848L);
        dv = Long.reverse(-4467570830351532032L);
        dw = (560 >>> 132 | 560 << -132) & 0xFFFFFFFF;
        dx = Integer.reverse(-1);
        dy = Long.reverse(6341847914664012992L);
        dz = (294912 >>> 237 | 294912 << -237) & 0xFFFFFFFF;
        ea = Long.reverse(-7349094952542294848L);
        eb = Long.reverse(-4467570830351532032L);
        ec = 151552 >>> 204 | 151552 << ~204 + 1;
        ed = Long.reverse(-7349094952542294848L);
        ee = Long.reverse(-4467570830351532032L);
        ef = Integer.reverse(0x64000000);
        eg = Long.reverse(-7349094952542294848L);
        eh = Long.reverse(-4467570830351532032L);
        ei = Integer.reverse(-469762048);
        ej = Integer.reverse(-1);
        ek = Long.reverse(6341847914664012992L);
        el = Integer.reverse(0x14000000);
        em = Long.reverse(-7349094952542294848L);
        en = Long.reverse(-4467570830351532032L);
        eo = Integer.reverse(-1811939328);
        ep = Integer.reverse(-1);
        eq = Long.reverse(6341847914664012992L);
        er = Long.reverse(1827335548805578752L);
        es = Integer.reverse(0x40000000);
        et = Integer.reverse(0);
        eu = (0x5400000 >>> 181 | 0x5400000 << ~181 + 1) & 0xFFFFFFFF;
        ev = Long.reverse(-7349094952542294848L);
        ew = Long.reverse(-4467570830351532032L);
        ex = (1024 >>> 202 | 1024 << -202) & 0xFFFFFFFF;
        ey = 0 >>> 220 | 0 << ~220 + 1;
        ez = (1 >>> 31 | 1 << ~31 + 1) & 0xFFFFFFFF;
        fa = (0 >>> 126 | 0 << -126) & 0xFFFFFFFF;
        fb = Integer.reverse(-738197504);
        fc = Integer.reverse(-1);
        fd = Long.reverse(6341847914664012992L);
        fe = 0x20000000 >>> 125 | 0x20000000 << -125;
        ff = Integer.reverse(Integer.MIN_VALUE);
        fg = Integer.reverse(0x34000000);
        fh = -1 >>> 109 | -1 << -109;
        fi = Long.reverse(6341847914664012992L);
        fj = (0x5A0000 >>> 177 | 0x5A0000 << ~177 + 1) & 0xFFFFFFFF;
        fk = Long.reverse(-7349094952542294848L);
        fl = Long.reverse(-4467570830351532032L);
        fm = Integer.reverse(0x74000000);
        fn = Long.reverse(-7349094952542294848L);
        fo = Long.reverse(-4467570830351532032L);
        fp = Integer.reverse(0);
        fq = (-268435454 >>> 124 | -268435454 << ~124 + 1) & 0xFFFFFFFF;
        fr = Long.reverse(-7349094952542294848L);
        fs = Long.reverse(-4467570830351532032L);
        ft = (12 >>> 62 | 12 << -62) & 0xFFFFFFFF;
        fu = Long.reverse(6341847914664012992L);
        fv = (0 >>> 232 | 0 << ~232 + 1) & 0xFFFFFFFF;
        fw = (0x62000000 >>> 249 | 0x62000000 << ~249 + 1) & 0xFFFFFFFF;
        fx = -1 >>> 106 | -1 << -106;
        fy = Long.reverse(6341847914664012992L);
        fz = -939524096 >>> 122 | -939524096 << -122;
        ga = Long.reverse(-7349094952542294848L);
        gb = Long.reverse(-4467570830351532032L);
        gc = 0x30000003 >>> 220 | 0x30000003 << -220;
        gd = Integer.reverse(-1);
        ge = Long.reverse(6341847914664012992L);
        gf = (3328 >>> 6 | 3328 << -6) & 0xFFFFFFFF;
        gg = Integer.reverse(-1);
        gh = Long.reverse(6341847914664012992L);
        gi = 0x100000 >>> 244 | 0x100000 << -244;
        gj = 0 >>> 194 | 0 << -194;
        gk = (444596224 >>> 151 | 444596224 << ~151 + 1) & 0xFFFFFFFF;
        gl = (-1 >>> 99 | -1 << ~99 + 1) & 0xFFFFFFFF;
        gm = Long.reverse(6341847914664012992L);
        gn = Integer.reverse(0x6C000000);
        go = Long.reverse(6341847914664012992L);
        gp = Integer.reverse(-335544320);
        gq = Long.reverse(-7349094952542294848L);
        gr = Long.reverse(-4467570830351532032L);
        gs = Integer.reverse(Integer.MIN_VALUE);
        gt = (0 >>> 178 | 0 << ~178 + 1) & 0xFFFFFFFF;
        gu = Integer.reverse(0x1C000000);
        gv = Long.reverse(-7349094952542294848L);
        gw = Long.reverse(-4467570830351532032L);
        gx = 29184 >>> 169 | 29184 << ~169 + 1;
        gy = Long.reverse(6341847914664012992L);
        gz = (16 >>> 228 | 16 << -228) & 0xFFFFFFFF;
        ha = Integer.reverse(0);
        hb = 0x400000 >>> 118 | 0x400000 << -118;
        hc = 131072 >>> 209 | 131072 << -209;
        hd = Integer.reverse(0x5C000000);
        he = Integer.reverse(-1);
        hf = Long.reverse(6341847914664012992L);
        hg = 236 >>> 98 | 236 << -98;
        hh = Long.reverse(-7349094952542294848L);
        hi = Long.reverse(-4467570830351532032L);
        hj = Integer.reverse(0x3C000000);
        hk = Long.reverse(-7349094952542294848L);
        hl = Long.reverse(-4467570830351532032L);
        hm = Integer.reverse(-1140850688);
        hn = Long.reverse(-7349094952542294848L);
        ho = Long.reverse(-4467570830351532032L);
        hp = (0 >>> 240 | 0 << -240) & 0xFFFFFFFF;
        hq = Integer.reverse(0x7C000000);
        hr = Long.reverse(6341847914664012992L);
        hs = Integer.reverse(-67108864);
        ht = Long.reverse(-7349094952542294848L);
        hu = Long.reverse(-4467570830351532032L);
        hv = (0x800000 >>> 247 | 0x800000 << -247) & 0xFFFFFFFF;
        hw = Integer.reverse(0x2000000);
        hx = Long.reverse(-7349094952542294848L);
        hy = Long.reverse(-4467570830351532032L);
        hz = Integer.reverse(-2113929216);
        ia = (-1 >>> 68 | -1 << -68) & 0xFFFFFFFF;
        ib = Long.reverse(6341847914664012992L);
        ic = -2080374784 >>> 185 | -2080374784 << ~185 + 1;
        id = Integer.reverse(-1);
        ie = Long.reverse(6341847914664012992L);
        cfr_renamed_0 = Float.intBitsToFloat(Integer.reverse(3714));
        ig = Float.intBitsToFloat((263168 >>> 52 | 263168 << -52) & 0xFFFFFFFF);
        ih = Integer.reverse(0);
        ii = 134 >>> 1 | 134 << -1;
        ij = Long.reverse(-7349094952542294848L);
        ik = Long.reverse(-4467570830351532032L);
        il = 2176 >>> 5 | 2176 << -5;
        im = Long.reverse(-7349094952542294848L);
        in = Long.reverse(-4467570830351532032L);
        io = 0 >>> 47 | 0 << -47;
        ip = Integer.reverse(-1577058304);
        iq = Long.reverse(-7349094952542294848L);
        ir = Long.reverse(-4467570830351532032L);
        is = 8960 >>> 7 | 8960 << ~7 + 1;
        it = Long.reverse(-7349094952542294848L);
        iu = Long.reverse(-4467570830351532032L);
        iv = Float.intBitsToFloat(67008 >>> 18 | 67008 << ~18 + 1);
        iw = Float.intBitsToFloat(Integer.reverse(514));
        ix = (0 >>> 92 | 0 << -92) & 0xFFFFFFFF;
        iy = Integer.reverse(-503316480);
        iz = Long.reverse(6341847914664012992L);
        ja = Integer.reverse(0x12000000);
        jb = Long.reverse(-7349094952542294848L);
        jc = Long.reverse(-4467570830351532032L);
        jd = Integer.reverse(-1845493760);
        je = (-1 >>> 166 | -1 << -166) & 0xFFFFFFFF;
        jf = Long.reverse(6341847914664012992L);
        jg = Integer.reverse(0x52000000);
        jh = Long.reverse(-7349094952542294848L);
        ji = Long.reverse(-4467570830351532032L);
        jj = (307200 >>> 172 | 307200 << -172) & 0xFFFFFFFF;
        jk = Long.reverse(-7349094952542294848L);
        jl = Long.reverse(-4467570830351532032L);
        jm = Integer.reverse(0);
        jn = Integer.reverse(0x32000000);
        jo = Long.reverse(-7349094952542294848L);
        jp = Long.reverse(-4467570830351532032L);
        jq = 20185088 >>> 146 | 20185088 << ~146 + 1;
        jr = Integer.reverse(-1);
        js = Long.reverse(6341847914664012992L);
        jt = (-2147483629 >>> 254 | -2147483629 << -254) & 0xFFFFFFFF;
        ju = Integer.reverse(-1);
        jv = Long.reverse(6341847914664012992L);
        jw = 1006632961 >>> 122 | 1006632961 << ~122 + 1;
        jx = -1 >>> 211 | -1 << ~211 + 1;
        jy = Long.reverse(6341847914664012992L);
        jz = (0x50000000 >>> 152 | 0x50000000 << ~152 + 1) & 0xFFFFFFFF;
        ka = Long.reverse(6341847914664012992L);
        kb = Integer.reverse(-1979711488);
        kc = Long.reverse(-7349094952542294848L);
        kd = Long.reverse(-4467570830351532032L);
        ke = Integer.reverse(0x4A000000);
        kf = Integer.reverse(-1);
        kg = Long.reverse(6341847914664012992L);
        kh = (664 >>> 227 | 664 << ~227 + 1) & 0xFFFFFFFF;
        ki = Long.reverse(6341847914664012992L);
        kj = 43008 >>> 137 | 43008 << ~137 + 1;
        kk = Long.reverse(6341847914664012992L);
        kl = 10880 >>> 199 | 10880 << -199;
        km = Integer.reverse(-1);
        kn = Long.reverse(6341847914664012992L);
        ko = 0x60000005 >>> 188 | 0x60000005 << ~188 + 1;
        kp = Long.reverse(6341847914664012992L);
        kq = Integer.reverse(-369098752);
        kr = Long.reverse(-7349094952542294848L);
        ks = Long.reverse(-4467570830351532032L);
        kt = Integer.reverse(0x1A000000);
        ku = Long.reverse(-7349094952542294848L);
        kv = Long.reverse(-4467570830351532032L);
        kw = Integer.reverse(-1711276032);
        kx = Long.reverse(6341847914664012992L);
        ky = 0 >>> 210 | 0 << ~210 + 1;
        kz = (368640 >>> 140 | 368640 << ~140 + 1) & 0xFFFFFFFF;
        la = Long.reverse(-7349094952542294848L);
        lb = Long.reverse(-4467570830351532032L);
        lc = 47710208 >>> 147 | 47710208 << ~147 + 1;
        ld = Long.reverse(-7349094952542294848L);
        le = Long.reverse(-4467570830351532032L);
        lf = Integer.reverse(0);
        lg = 0 >>> 210 | 0 << ~210 + 1;
        lh = (0xB800000 >>> 245 | 0xB800000 << ~245 + 1) & 0xFFFFFFFF;
        li = Long.reverse(-7349094952542294848L);
        lj = Long.reverse(-4467570830351532032L);
        lk = -1174405120 >>> 121 | -1174405120 << ~121 + 1;
        ll = Long.reverse(6341847914664012992L);
        lm = Integer.reverse(0x7A000000);
        ln = Long.reverse(6341847914664012992L);
        lo = (796917760 >>> 87 | 796917760 << ~87 + 1) & 0xFFFFFFFF;
        lp = Long.reverse(-7349094952542294848L);
        lq = Long.reverse(-4467570830351532032L);
        lr = Integer.reverse(0x6000000);
        ls = Long.reverse(-7349094952542294848L);
        lt = Long.reverse(-4467570830351532032L);
        lu = Integer.reverse(-2046820352);
        lv = Long.reverse(6341847914664012992L);
        lw = Integer.reverse(0x46000000);
        lx = (-1 >>> 55 | -1 << ~55 + 1) & 0xFFFFFFFF;
        ly = Long.reverse(6341847914664012992L);
        lz = Integer.reverse(Integer.MIN_VALUE);
        ma = 0 >>> 198 | 0 << ~198 + 1;
        mb = (8 >>> 3 | 8 << ~3 + 1) & 0xFFFFFFFF;
        mc = (0 >>> 160 | 0 << -160) & 0xFFFFFFFF;
        md = 202752 >>> 139 | 202752 << -139;
        me = Long.reverse(-7349094952542294848L);
        mf = Long.reverse(-4467570830351532032L);
        mg = Integer.reverse(0);
        mh = Integer.reverse(Integer.MIN_VALUE);
        mi = Integer.reverse(0x60000000);
        mj = 49152 >>> 45 | 49152 << -45;
        mk = Integer.reverse(0);
        ml = 25 >>> 190 | 25 << -190;
        mm = -1 >>> 38 | -1 << ~38 + 1;
        mn = Long.reverse(6341847914664012992L);
        mo = Integer.reverse(Integer.MIN_VALUE);
        mp = 64 >>> 69 | 64 << -69;
        mq = Integer.reverse(-1509949440);
        mr = Long.reverse(6341847914664012992L);
        ms = (6 >>> 97 | 6 << ~97 + 1) & 0xFFFFFFFF;
        mt = Integer.reverse(0x20000000);
        mu = 835584 >>> 77 | 835584 << ~77 + 1;
        mv = Integer.reverse(-1);
        mw = Long.reverse(6341847914664012992L);
        mx = (0x500000 >>> 20 | 0x500000 << -20) & 0xFFFFFFFF;
        my = Integer.reverse(0x40000000);
        mz = Integer.reverse(-436207616);
        na = Long.reverse(-7349094952542294848L);
        nb = Long.reverse(-4467570830351532032L);
        nc = Integer.reverse(0x16000000);
        nd = (-1 >>> 68 | -1 << -68) & 0xFFFFFFFF;
        ne = Long.reverse(6341847914664012992L);
        nf = 105 >>> 192 | 105 << -192;
        ng = Long.reverse(-7349094952542294848L);
        nh = Long.reverse(-4467570830351532032L);
        ni = Integer.reverse(0x56000000);
        nj = -1 >>> 85 | -1 << ~85 + 1;
        nk = Long.reverse(6341847914664012992L);
        nl = (0 >>> 228 | 0 << ~228 + 1) & 0xFFFFFFFF;
        nm = (1712 >>> 164 | 1712 << ~164 + 1) & 0xFFFFFFFF;
        nn = Long.reverse(-7349094952542294848L);
        no = Long.reverse(-4467570830351532032L);
        np = 0x3600000 >>> 83 | 0x3600000 << -83;
        nq = Long.reverse(6341847914664012992L);
        nr = (-2147483594 >>> 63 | -2147483594 << -63) & 0xFFFFFFFF;
        ns = (-1 >>> 217 | -1 << ~217 + 1) & 0xFFFFFFFF;
        nt = Long.reverse(6341847914664012992L);
        nu = 0x3700000 >>> 19 | 0x3700000 << ~19 + 1;
        nv = Long.reverse(6341847914664012992L);
        nw = (2013265923 >>> 59 | 2013265923 << ~59 + 1) & 0xFFFFFFFF;
        nx = Long.reverse(-7349094952542294848L);
        ny = Long.reverse(-4467570830351532032L);
        nz = 0 >>> 99 | 0 << -99;
        oa = (0x3800000 >>> 83 | 0x3800000 << ~83 + 1) & 0xFFFFFFFF;
        ob = -1 >>> 35 | -1 << ~35 + 1;
        oc = Long.reverse(6341847914664012992L);
        od = Integer.reverse(-1912602624);
        oe = Integer.reverse(-1);
        of = Long.reverse(6341847914664012992L);
        og = Integer.reverse(0x4E000000);
        oh = Long.reverse(-7349094952542294848L);
        oi = Long.reverse(-4467570830351532032L);
        oj = 0 >>> 215 | 0 << -215;
        ok = (964689920 >>> 119 | 964689920 << -119) & 0xFFFFFFFF;
        ol = Long.reverse(-7349094952542294848L);
        om = Long.reverse(-4467570830351532032L);
        on = Integer.reverse(0x13000000);
        oo = (58 >>> 255 | 58 << -255) & 0xFFFFFFFF;
        op = Long.reverse(-7349094952542294848L);
        oq = Long.reverse(-4467570830351532032L);
        or = Integer.reverse(0);
        os = Integer.reverse(-1375731712);
        ot = Integer.reverse(-1);
        ou = Long.reverse(6341847914664012992L);
        ov = (0 >>> 211 | 0 << ~211 + 1) & 0xFFFFFFFF;
        ow = Integer.reverse(0x6E000000);
        ox = Long.reverse(-7349094952542294848L);
        oy = Long.reverse(-4467570830351532032L);
        oz = 0x770000 >>> 240 | 0x770000 << -240;
        pa = Long.reverse(6341847914664012992L);
        pb = (0x78000000 >>> 56 | 0x78000000 << -56) & 0xFFFFFFFF;
        pc = Long.reverse(-7349094952542294848L);
        pd = Long.reverse(-4467570830351532032L);
        pe = 0x79000000 >>> 184 | 0x79000000 << -184;
        pf = -1 >>> 10 | -1 << ~10 + 1;
        pg = Long.reverse(6341847914664012992L);
        ph = 15616 >>> 135 | 15616 << ~135 + 1;
        pi = -1 >>> 205 | -1 << ~205 + 1;
        pj = Long.reverse(6341847914664012992L);
        pk = Integer.reverse(-570425344);
        pl = Long.reverse(-7349094952542294848L);
        pm = Long.reverse(-4467570830351532032L);
        pn = Integer.reverse(0x3E000000);
        po = Long.reverse(-7349094952542294848L);
        pp = Long.reverse(-4467570830351532032L);
        pq = Integer.reverse(-1107296256);
        pr = Integer.reverse(-1107296256);
        var_java_lang_String_arr_a = new String[pq];
        var_java_lang_String_arr_b = new String[pr];
        NLoginType_018.b();
    }

    public NLoginType_018(nLoginBukkit nLoginBukkit2) {
        this.var_long_c = (long)Caffeine.newBuilder().expireAfterAccess(var_long_a, TimeUnit.SECONDS).build();
        this.cfr_renamed_27 = Caffeine.newBuilder().expireAfterWrite(var_long_b, TimeUnit.SECONDS).build();
        this.var_java_lang_Object_a = new Object();
        this.var_java_util_concurrent_atomic_AtomicLong_b = new AtomicLong();
        this.cfr_renamed_28 = Caffeine.newBuilder().expireAfterWrite(f, TimeUnit.SECONDS).build();
        this.var_com_nickuc_login_bukkit_nLoginBukkit_o = nLoginBukkit2;
        this.var_java_util_Timer_a = new Timer(nLoginBukkit2.q() + (String)NLoginType_018.c("㺀", (int)g, (long)(h ^ i)));
        this.var_java_io_File_c = new File(nLoginBukkit2.java_io_File_c(), (String)NLoginType_018.c("㺃", (int)j, (long)k));
        this.m();
    }
}

