
/* First created by JCasGen Mon Dec 09 16:28:05 CET 2013 */
package net.hitsujiwool.uima.igo.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Dec 09 16:28:05 CET 2013
 * @generated */
public class MecabMorpheme_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MecabMorpheme_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MecabMorpheme_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MecabMorpheme(addr, MecabMorpheme_Type.this);
  			   MecabMorpheme_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MecabMorpheme(addr, MecabMorpheme_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MecabMorpheme.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.hitsujiwool.uima.igo.types.MecabMorpheme");
 
  /** @generated */
  final Feature casFeat_surface;
  /** @generated */
  final int     casFeatCode_surface;
  /** @generated */ 
  public String getSurface(int addr) {
        if (featOkTst && casFeat_surface == null)
      jcas.throwFeatMissing("surface", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_surface);
  }
  /** @generated */    
  public void setSurface(int addr, String v) {
        if (featOkTst && casFeat_surface == null)
      jcas.throwFeatMissing("surface", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_surface, v);}
    
  
 
  /** @generated */
  final Feature casFeat_feature;
  /** @generated */
  final int     casFeatCode_feature;
  /** @generated */ 
  public String getFeature(int addr) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_feature);
  }
  /** @generated */    
  public void setFeature(int addr, String v) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_feature, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subcategories;
  /** @generated */
  final int     casFeatCode_subcategories;
  /** @generated */ 
  public int getSubcategories(int addr) {
        if (featOkTst && casFeat_subcategories == null)
      jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getRefValue(addr, casFeatCode_subcategories);
  }
  /** @generated */    
  public void setSubcategories(int addr, int v) {
        if (featOkTst && casFeat_subcategories == null)
      jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setRefValue(addr, casFeatCode_subcategories, v);}
    
   /** @generated */
  public String getSubcategories(int addr, int i) {
        if (featOkTst && casFeat_subcategories == null)
      jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_subcategories), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_subcategories), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_subcategories), i);
  }
   
  /** @generated */ 
  public void setSubcategories(int addr, int i, String v) {
        if (featOkTst && casFeat_subcategories == null)
      jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_subcategories), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_subcategories), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_subcategories), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_pos;
  /** @generated */
  final int     casFeatCode_pos;
  /** @generated */ 
  public String getPos(int addr) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pos);
  }
  /** @generated */    
  public void setPos(int addr, String v) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_pos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_inflectionType;
  /** @generated */
  final int     casFeatCode_inflectionType;
  /** @generated */ 
  public String getInflectionType(int addr) {
        if (featOkTst && casFeat_inflectionType == null)
      jcas.throwFeatMissing("inflectionType", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_inflectionType);
  }
  /** @generated */    
  public void setInflectionType(int addr, String v) {
        if (featOkTst && casFeat_inflectionType == null)
      jcas.throwFeatMissing("inflectionType", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_inflectionType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_inflectionForm;
  /** @generated */
  final int     casFeatCode_inflectionForm;
  /** @generated */ 
  public String getInflectionForm(int addr) {
        if (featOkTst && casFeat_inflectionForm == null)
      jcas.throwFeatMissing("inflectionForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_inflectionForm);
  }
  /** @generated */    
  public void setInflectionForm(int addr, String v) {
        if (featOkTst && casFeat_inflectionForm == null)
      jcas.throwFeatMissing("inflectionForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_inflectionForm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_basicForm;
  /** @generated */
  final int     casFeatCode_basicForm;
  /** @generated */ 
  public String getBasicForm(int addr) {
        if (featOkTst && casFeat_basicForm == null)
      jcas.throwFeatMissing("basicForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_basicForm);
  }
  /** @generated */    
  public void setBasicForm(int addr, String v) {
        if (featOkTst && casFeat_basicForm == null)
      jcas.throwFeatMissing("basicForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_basicForm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reading;
  /** @generated */
  final int     casFeatCode_reading;
  /** @generated */ 
  public String getReading(int addr) {
        if (featOkTst && casFeat_reading == null)
      jcas.throwFeatMissing("reading", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_reading);
  }
  /** @generated */    
  public void setReading(int addr, String v) {
        if (featOkTst && casFeat_reading == null)
      jcas.throwFeatMissing("reading", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_reading, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pronunciation;
  /** @generated */
  final int     casFeatCode_pronunciation;
  /** @generated */ 
  public String getPronunciation(int addr) {
        if (featOkTst && casFeat_pronunciation == null)
      jcas.throwFeatMissing("pronunciation", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pronunciation);
  }
  /** @generated */    
  public void setPronunciation(int addr, String v) {
        if (featOkTst && casFeat_pronunciation == null)
      jcas.throwFeatMissing("pronunciation", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_pronunciation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subcategory1;
  /** @generated */
  final int     casFeatCode_subcategory1;
  /** @generated */ 
  public String getSubcategory1(int addr) {
        if (featOkTst && casFeat_subcategory1 == null)
      jcas.throwFeatMissing("subcategory1", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subcategory1);
  }
  /** @generated */    
  public void setSubcategory1(int addr, String v) {
        if (featOkTst && casFeat_subcategory1 == null)
      jcas.throwFeatMissing("subcategory1", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_subcategory1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subcategory2;
  /** @generated */
  final int     casFeatCode_subcategory2;
  /** @generated */ 
  public String getSubcategory2(int addr) {
        if (featOkTst && casFeat_subcategory2 == null)
      jcas.throwFeatMissing("subcategory2", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subcategory2);
  }
  /** @generated */    
  public void setSubcategory2(int addr, String v) {
        if (featOkTst && casFeat_subcategory2 == null)
      jcas.throwFeatMissing("subcategory2", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_subcategory2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subcategory3;
  /** @generated */
  final int     casFeatCode_subcategory3;
  /** @generated */ 
  public String getSubcategory3(int addr) {
        if (featOkTst && casFeat_subcategory3 == null)
      jcas.throwFeatMissing("subcategory3", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subcategory3);
  }
  /** @generated */    
  public void setSubcategory3(int addr, String v) {
        if (featOkTst && casFeat_subcategory3 == null)
      jcas.throwFeatMissing("subcategory3", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_subcategory3, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MecabMorpheme_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_surface = jcas.getRequiredFeatureDE(casType, "surface", "uima.cas.String", featOkTst);
    casFeatCode_surface  = (null == casFeat_surface) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_surface).getCode();

 
    casFeat_feature = jcas.getRequiredFeatureDE(casType, "feature", "uima.cas.String", featOkTst);
    casFeatCode_feature  = (null == casFeat_feature) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_feature).getCode();

 
    casFeat_subcategories = jcas.getRequiredFeatureDE(casType, "subcategories", "uima.cas.StringArray", featOkTst);
    casFeatCode_subcategories  = (null == casFeat_subcategories) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subcategories).getCode();

 
    casFeat_pos = jcas.getRequiredFeatureDE(casType, "pos", "uima.cas.String", featOkTst);
    casFeatCode_pos  = (null == casFeat_pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pos).getCode();

 
    casFeat_inflectionType = jcas.getRequiredFeatureDE(casType, "inflectionType", "uima.cas.String", featOkTst);
    casFeatCode_inflectionType  = (null == casFeat_inflectionType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_inflectionType).getCode();

 
    casFeat_inflectionForm = jcas.getRequiredFeatureDE(casType, "inflectionForm", "uima.cas.String", featOkTst);
    casFeatCode_inflectionForm  = (null == casFeat_inflectionForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_inflectionForm).getCode();

 
    casFeat_basicForm = jcas.getRequiredFeatureDE(casType, "basicForm", "uima.cas.String", featOkTst);
    casFeatCode_basicForm  = (null == casFeat_basicForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_basicForm).getCode();

 
    casFeat_reading = jcas.getRequiredFeatureDE(casType, "reading", "uima.cas.String", featOkTst);
    casFeatCode_reading  = (null == casFeat_reading) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reading).getCode();

 
    casFeat_pronunciation = jcas.getRequiredFeatureDE(casType, "pronunciation", "uima.cas.String", featOkTst);
    casFeatCode_pronunciation  = (null == casFeat_pronunciation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pronunciation).getCode();

 
    casFeat_subcategory1 = jcas.getRequiredFeatureDE(casType, "subcategory1", "uima.cas.String", featOkTst);
    casFeatCode_subcategory1  = (null == casFeat_subcategory1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subcategory1).getCode();

 
    casFeat_subcategory2 = jcas.getRequiredFeatureDE(casType, "subcategory2", "uima.cas.String", featOkTst);
    casFeatCode_subcategory2  = (null == casFeat_subcategory2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subcategory2).getCode();

 
    casFeat_subcategory3 = jcas.getRequiredFeatureDE(casType, "subcategory3", "uima.cas.String", featOkTst);
    casFeatCode_subcategory3  = (null == casFeat_subcategory3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subcategory3).getCode();

  }
}



    