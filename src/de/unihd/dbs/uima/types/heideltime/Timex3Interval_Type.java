
/* First created by JCasGen Thu Sep 20 15:38:14 CEST 2012 */
package de.unihd.dbs.uima.types.heideltime;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Sep 20 15:38:14 CEST 2012
 * @generated */
public class Timex3Interval_Type extends Timex3_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Timex3Interval_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Timex3Interval_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Timex3Interval(addr, Timex3Interval_Type.this);
  			   Timex3Interval_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Timex3Interval(addr, Timex3Interval_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Timex3Interval.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.unihd.dbs.uima.types.heideltime.Timex3Interval");
 
  /** @generated */
  final Feature casFeat_TimexValueEB;
  /** @generated */
  final int     casFeatCode_TimexValueEB;
  /** @generated */ 
  public String getTimexValueEB(int addr) {
        if (featOkTst && casFeat_TimexValueEB == null)
      jcas.throwFeatMissing("TimexValueEB", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    return ll_cas.ll_getStringValue(addr, casFeatCode_TimexValueEB);
  }
  /** @generated */    
  public void setTimexValueEB(int addr, String v) {
        if (featOkTst && casFeat_TimexValueEB == null)
      jcas.throwFeatMissing("TimexValueEB", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    ll_cas.ll_setStringValue(addr, casFeatCode_TimexValueEB, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TimexValueLE;
  /** @generated */
  final int     casFeatCode_TimexValueLE;
  /** @generated */ 
  public String getTimexValueLE(int addr) {
        if (featOkTst && casFeat_TimexValueLE == null)
      jcas.throwFeatMissing("TimexValueLE", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    return ll_cas.ll_getStringValue(addr, casFeatCode_TimexValueLE);
  }
  /** @generated */    
  public void setTimexValueLE(int addr, String v) {
        if (featOkTst && casFeat_TimexValueLE == null)
      jcas.throwFeatMissing("TimexValueLE", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    ll_cas.ll_setStringValue(addr, casFeatCode_TimexValueLE, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TimexValueEE;
  /** @generated */
  final int     casFeatCode_TimexValueEE;
  /** @generated */ 
  public String getTimexValueEE(int addr) {
        if (featOkTst && casFeat_TimexValueEE == null)
      jcas.throwFeatMissing("TimexValueEE", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    return ll_cas.ll_getStringValue(addr, casFeatCode_TimexValueEE);
  }
  /** @generated */    
  public void setTimexValueEE(int addr, String v) {
        if (featOkTst && casFeat_TimexValueEE == null)
      jcas.throwFeatMissing("TimexValueEE", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    ll_cas.ll_setStringValue(addr, casFeatCode_TimexValueEE, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TimexValueLB;
  /** @generated */
  final int     casFeatCode_TimexValueLB;
  /** @generated */ 
  public String getTimexValueLB(int addr) {
        if (featOkTst && casFeat_TimexValueLB == null)
      jcas.throwFeatMissing("TimexValueLB", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    return ll_cas.ll_getStringValue(addr, casFeatCode_TimexValueLB);
  }
  /** @generated */    
  public void setTimexValueLB(int addr, String v) {
        if (featOkTst && casFeat_TimexValueLB == null)
      jcas.throwFeatMissing("TimexValueLB", "de.unihd.dbs.uima.types.heideltime.Timex3Interval");
    ll_cas.ll_setStringValue(addr, casFeatCode_TimexValueLB, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Timex3Interval_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TimexValueEB = jcas.getRequiredFeatureDE(casType, "TimexValueEB", "uima.cas.String", featOkTst);
    casFeatCode_TimexValueEB  = (null == casFeat_TimexValueEB) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TimexValueEB).getCode();

 
    casFeat_TimexValueLE = jcas.getRequiredFeatureDE(casType, "TimexValueLE", "uima.cas.String", featOkTst);
    casFeatCode_TimexValueLE  = (null == casFeat_TimexValueLE) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TimexValueLE).getCode();

 
    casFeat_TimexValueEE = jcas.getRequiredFeatureDE(casType, "TimexValueEE", "uima.cas.String", featOkTst);
    casFeatCode_TimexValueEE  = (null == casFeat_TimexValueEE) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TimexValueEE).getCode();

 
    casFeat_TimexValueLB = jcas.getRequiredFeatureDE(casType, "TimexValueLB", "uima.cas.String", featOkTst);
    casFeatCode_TimexValueLB  = (null == casFeat_TimexValueLB) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TimexValueLB).getCode();

  }
}



    