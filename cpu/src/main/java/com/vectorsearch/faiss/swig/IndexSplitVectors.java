/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class IndexSplitVectors extends Index {
  private transient long swigCPtr;

  protected IndexSplitVectors(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexSplitVectors_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexSplitVectors obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexSplitVectors(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.IndexSplitVectors_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.IndexSplitVectors_own_fields_get(swigCPtr, this);
  }

  public void setThreaded(boolean value) {
    swigfaissJNI.IndexSplitVectors_threaded_set(swigCPtr, this, value);
  }

  public boolean getThreaded() {
    return swigfaissJNI.IndexSplitVectors_threaded_get(swigCPtr, this);
  }

  public void setSub_indexes(SWIGTYPE_p_std__vectorT_faiss__Index_p_t value) {
    swigfaissJNI.IndexSplitVectors_sub_indexes_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_faiss__Index_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_faiss__Index_p_t getSub_indexes() {
    long cPtr = swigfaissJNI.IndexSplitVectors_sub_indexes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_faiss__Index_p_t(cPtr, false);
  }

  public void setSum_d(int value) {
    swigfaissJNI.IndexSplitVectors_sum_d_set(swigCPtr, this, value);
  }

  public int getSum_d() {
    return swigfaissJNI.IndexSplitVectors_sum_d_get(swigCPtr, this);
  }

  public IndexSplitVectors(int d, boolean threaded) {
    this(swigfaissJNI.new_IndexSplitVectors__SWIG_0(d, threaded), true);
  }

  public IndexSplitVectors(int d) {
    this(swigfaissJNI.new_IndexSplitVectors__SWIG_1(d), true);
  }

  public void add_sub_index(Index arg0) {
    swigfaissJNI.IndexSplitVectors_add_sub_index(swigCPtr, this, Index.getCPtr(arg0), arg0);
  }

  public void sync_with_sub_indexes() {
    swigfaissJNI.IndexSplitVectors_sync_with_sub_indexes(swigCPtr, this);
  }

  public void add(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexSplitVectors_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void search(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexSplitVectors_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexSplitVectors_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void reset() {
    swigfaissJNI.IndexSplitVectors_reset(swigCPtr, this);
  }

}
