/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_peer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected torrent_peer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_peer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_torrent_peer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public torrent_peer(int port, boolean connectable, int src) {
    this(libtorrent_jni.new_torrent_peer(port, connectable, src), true);
  }

  public java.math.BigInteger total_download() {
    return libtorrent_jni.torrent_peer_total_download(swigCPtr, this);
  }

  public java.math.BigInteger total_upload() {
    return libtorrent_jni.torrent_peer_total_upload(swigCPtr, this);
  }

  public String dest() {
    return libtorrent_jni.torrent_peer_dest(swigCPtr, this);
  }

  public tcp_endpoint ip() {
    return new tcp_endpoint(libtorrent_jni.torrent_peer_ip(swigCPtr, this), true);
  }

  public void setPrev_amount_upload(long value) {
    libtorrent_jni.torrent_peer_prev_amount_upload_set(swigCPtr, this, value);
  }

  public long getPrev_amount_upload() {
    return libtorrent_jni.torrent_peer_prev_amount_upload_get(swigCPtr, this);
  }

  public void setPrev_amount_download(long value) {
    libtorrent_jni.torrent_peer_prev_amount_download_set(swigCPtr, this, value);
  }

  public long getPrev_amount_download() {
    return libtorrent_jni.torrent_peer_prev_amount_download_get(swigCPtr, this);
  }

  public void setPeer_rank(long value) {
    libtorrent_jni.torrent_peer_peer_rank_set(swigCPtr, this, value);
  }

  public long getPeer_rank() {
    return libtorrent_jni.torrent_peer_peer_rank_get(swigCPtr, this);
  }

  public void setLast_optimistically_unchoked(int value) {
    libtorrent_jni.torrent_peer_last_optimistically_unchoked_set(swigCPtr, this, value);
  }

  public int getLast_optimistically_unchoked() {
    return libtorrent_jni.torrent_peer_last_optimistically_unchoked_get(swigCPtr, this);
  }

  public void setLast_connected(int value) {
    libtorrent_jni.torrent_peer_last_connected_set(swigCPtr, this, value);
  }

  public int getLast_connected() {
    return libtorrent_jni.torrent_peer_last_connected_get(swigCPtr, this);
  }

  public void setPort(int value) {
    libtorrent_jni.torrent_peer_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return libtorrent_jni.torrent_peer_port_get(swigCPtr, this);
  }

  public void setHashfails(short value) {
    libtorrent_jni.torrent_peer_hashfails_set(swigCPtr, this, value);
  }

  public short getHashfails() {
    return libtorrent_jni.torrent_peer_hashfails_get(swigCPtr, this);
  }

  public void setFailcount(long value) {
    libtorrent_jni.torrent_peer_failcount_set(swigCPtr, this, value);
  }

  public long getFailcount() {
    return libtorrent_jni.torrent_peer_failcount_get(swigCPtr, this);
  }

  public void setConnectable(boolean value) {
    libtorrent_jni.torrent_peer_connectable_set(swigCPtr, this, value);
  }

  public boolean getConnectable() {
    return libtorrent_jni.torrent_peer_connectable_get(swigCPtr, this);
  }

  public void setOptimistically_unchoked(boolean value) {
    libtorrent_jni.torrent_peer_optimistically_unchoked_set(swigCPtr, this, value);
  }

  public boolean getOptimistically_unchoked() {
    return libtorrent_jni.torrent_peer_optimistically_unchoked_get(swigCPtr, this);
  }

  public void setSeed(boolean value) {
    libtorrent_jni.torrent_peer_seed_set(swigCPtr, this, value);
  }

  public boolean getSeed() {
    return libtorrent_jni.torrent_peer_seed_get(swigCPtr, this);
  }

  public void setFast_reconnects(long value) {
    libtorrent_jni.torrent_peer_fast_reconnects_set(swigCPtr, this, value);
  }

  public long getFast_reconnects() {
    return libtorrent_jni.torrent_peer_fast_reconnects_get(swigCPtr, this);
  }

  public void setTrust_points(int value) {
    libtorrent_jni.torrent_peer_trust_points_set(swigCPtr, this, value);
  }

  public int getTrust_points() {
    return libtorrent_jni.torrent_peer_trust_points_get(swigCPtr, this);
  }

  public void setSource(long value) {
    libtorrent_jni.torrent_peer_source_set(swigCPtr, this, value);
  }

  public long getSource() {
    return libtorrent_jni.torrent_peer_source_get(swigCPtr, this);
  }

  public void setPe_support(boolean value) {
    libtorrent_jni.torrent_peer_pe_support_set(swigCPtr, this, value);
  }

  public boolean getPe_support() {
    return libtorrent_jni.torrent_peer_pe_support_get(swigCPtr, this);
  }

  public void setIs_v6_addr(boolean value) {
    libtorrent_jni.torrent_peer_is_v6_addr_set(swigCPtr, this, value);
  }

  public boolean getIs_v6_addr() {
    return libtorrent_jni.torrent_peer_is_v6_addr_get(swigCPtr, this);
  }

  public void setOn_parole(boolean value) {
    libtorrent_jni.torrent_peer_on_parole_set(swigCPtr, this, value);
  }

  public boolean getOn_parole() {
    return libtorrent_jni.torrent_peer_on_parole_get(swigCPtr, this);
  }

  public void setBanned(boolean value) {
    libtorrent_jni.torrent_peer_banned_set(swigCPtr, this, value);
  }

  public boolean getBanned() {
    return libtorrent_jni.torrent_peer_banned_get(swigCPtr, this);
  }

  public void setSupports_utp(boolean value) {
    libtorrent_jni.torrent_peer_supports_utp_set(swigCPtr, this, value);
  }

  public boolean getSupports_utp() {
    return libtorrent_jni.torrent_peer_supports_utp_get(swigCPtr, this);
  }

  public void setConfirmed_supports_utp(boolean value) {
    libtorrent_jni.torrent_peer_confirmed_supports_utp_set(swigCPtr, this, value);
  }

  public boolean getConfirmed_supports_utp() {
    return libtorrent_jni.torrent_peer_confirmed_supports_utp_get(swigCPtr, this);
  }

  public void setSupports_holepunch(boolean value) {
    libtorrent_jni.torrent_peer_supports_holepunch_set(swigCPtr, this, value);
  }

  public boolean getSupports_holepunch() {
    return libtorrent_jni.torrent_peer_supports_holepunch_get(swigCPtr, this);
  }

  public void setWeb_seed(boolean value) {
    libtorrent_jni.torrent_peer_web_seed_set(swigCPtr, this, value);
  }

  public boolean getWeb_seed() {
    return libtorrent_jni.torrent_peer_web_seed_get(swigCPtr, this);
  }

}
