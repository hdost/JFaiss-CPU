/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class IVFPQSearchParameters extends IVFSearchParameters {
  private transient long swigCPtr;

  protected IVFPQSearchParameters(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IVFPQSearchParameters_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IVFPQSearchParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IVFPQSearchParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setScan_table_threshold(long value) {
    swigfaissJNI.IVFPQSearchParameters_scan_table_threshold_set(swigCPtr, this, value);
  }

  public long getScan_table_threshold() {
    return swigfaissJNI.IVFPQSearchParameters_scan_table_threshold_get(swigCPtr, this);
  }

  public void setPolysemous_ht(int value) {
    swigfaissJNI.IVFPQSearchParameters_polysemous_ht_set(swigCPtr, this, value);
  }

  public int getPolysemous_ht() {
    return swigfaissJNI.IVFPQSearchParameters_polysemous_ht_get(swigCPtr, this);
  }

  public IVFPQSearchParameters() {
    this(swigfaissJNI.new_IVFPQSearchParameters(), true);
  }

}
