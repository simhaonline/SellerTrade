/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class zero_storage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected zero_storage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(zero_storage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_zero_storage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void initialize(storage_error arg0) {
    libtorrent_jni.zero_storage_initialize(swigCPtr, this, storage_error.getCPtr(arg0), arg0);
  }

  public boolean has_any_file(storage_error arg0) {
    return libtorrent_jni.zero_storage_has_any_file(swigCPtr, this, storage_error.getCPtr(arg0), arg0);
  }

  public void set_file_priority(unsigned_char_vector arg0, storage_error arg1) {
    libtorrent_jni.zero_storage_set_file_priority(swigCPtr, this, unsigned_char_vector.getCPtr(arg0), arg0, storage_error.getCPtr(arg1), arg1);
  }

  public int move_storage(String arg0, int arg1, storage_error arg2) {
    return libtorrent_jni.zero_storage_move_storage(swigCPtr, this, arg0, arg1, storage_error.getCPtr(arg2), arg2);
  }

  public boolean verify_resume_data(bdecode_node arg0, storage_error arg1) {
    return libtorrent_jni.zero_storage_verify_resume_data(swigCPtr, this, bdecode_node.getCPtr(arg0), arg0, storage_error.getCPtr(arg1), arg1);
  }

  public void write_resume_data(entry arg0, storage_error arg1) {
    libtorrent_jni.zero_storage_write_resume_data(swigCPtr, this, entry.getCPtr(arg0), arg0, storage_error.getCPtr(arg1), arg1);
  }

  public void release_files(storage_error arg0) {
    libtorrent_jni.zero_storage_release_files(swigCPtr, this, storage_error.getCPtr(arg0), arg0);
  }

  public void rename_file(int arg0, String arg1, storage_error arg2) {
    libtorrent_jni.zero_storage_rename_file(swigCPtr, this, arg0, arg1, storage_error.getCPtr(arg2), arg2);
  }

  public void delete_files(storage_error arg0) {
    libtorrent_jni.zero_storage_delete_files(swigCPtr, this, storage_error.getCPtr(arg0), arg0);
  }

  public zero_storage() {
    this(libtorrent_jni.new_zero_storage(), true);
  }

}
