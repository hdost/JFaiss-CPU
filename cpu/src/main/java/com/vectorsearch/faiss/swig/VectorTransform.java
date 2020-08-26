/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class VectorTransform {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VectorTransform(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorTransform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_VectorTransform(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setD_in(int value) {
    swigfaissJNI.VectorTransform_d_in_set(swigCPtr, this, value);
  }

  public int getD_in() {
    return swigfaissJNI.VectorTransform_d_in_get(swigCPtr, this);
  }

  public void setD_out(int value) {
    swigfaissJNI.VectorTransform_d_out_set(swigCPtr, this, value);
  }

  public int getD_out() {
    return swigfaissJNI.VectorTransform_d_out_get(swigCPtr, this);
  }

  public void setIs_trained(boolean value) {
    swigfaissJNI.VectorTransform_is_trained_set(swigCPtr, this, value);
  }

  public boolean getIs_trained() {
    return swigfaissJNI.VectorTransform_is_trained_get(swigCPtr, this);
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.VectorTransform_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public SWIGTYPE_p_float apply(int n, SWIGTYPE_p_float x) {
    long cPtr = swigfaissJNI.VectorTransform_apply(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void apply_noalloc(int n, SWIGTYPE_p_float x, SWIGTYPE_p_float xt) {
    swigfaissJNI.VectorTransform_apply_noalloc(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(xt));
  }

  public void reverse_transform(int n, SWIGTYPE_p_float xt, SWIGTYPE_p_float x) {
    swigfaissJNI.VectorTransform_reverse_transform(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(xt), SWIGTYPE_p_float.getCPtr(x));
  }

}
