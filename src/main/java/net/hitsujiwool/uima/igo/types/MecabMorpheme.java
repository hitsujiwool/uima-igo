

/* First created by JCasGen Mon Dec 09 16:28:05 CET 2013 */
package net.hitsujiwool.uima.igo.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Mon Dec 09 16:28:05 CET 2013
 * XML source: /Users/ryo/uima-igo/desc/MecabMorphemeTypeSystem.xml
 * @generated */
public class MecabMorpheme extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MecabMorpheme.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MecabMorpheme() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MecabMorpheme(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MecabMorpheme(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MecabMorpheme(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: surface

  /** getter for surface - gets 
   * @generated */
  public String getSurface() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_surface == null)
      jcasType.jcas.throwFeatMissing("surface", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_surface);}
    
  /** setter for surface - sets  
   * @generated */
  public void setSurface(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_surface == null)
      jcasType.jcas.throwFeatMissing("surface", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_surface, v);}    
   
    
  //*--------------*
  //* Feature: feature

  /** getter for feature - gets 
   * @generated */
  public String getFeature() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_feature);}
    
  /** setter for feature - sets  
   * @generated */
  public void setFeature(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_feature, v);}    
   
    
  //*--------------*
  //* Feature: subcategories

  /** getter for subcategories - gets 
   * @generated */
  public StringArray getSubcategories() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategories == null)
      jcasType.jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategories)));}
    
  /** setter for subcategories - sets  
   * @generated */
  public void setSubcategories(StringArray v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategories == null)
      jcasType.jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setRefValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategories, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for subcategories - gets an indexed value - 
   * @generated */
  public String getSubcategories(int i) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategories == null)
      jcasType.jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategories), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategories), i);}

  /** indexed setter for subcategories - sets an indexed value - 
   * @generated */
  public void setSubcategories(int i, String v) { 
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategories == null)
      jcasType.jcas.throwFeatMissing("subcategories", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategories), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategories), i, v);}
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated */
  public String getPos() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets  
   * @generated */
  public void setPos(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_pos, v);}    
   
    
  //*--------------*
  //* Feature: inflectionType

  /** getter for inflectionType - gets 
   * @generated */
  public String getInflectionType() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_inflectionType == null)
      jcasType.jcas.throwFeatMissing("inflectionType", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_inflectionType);}
    
  /** setter for inflectionType - sets  
   * @generated */
  public void setInflectionType(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_inflectionType == null)
      jcasType.jcas.throwFeatMissing("inflectionType", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_inflectionType, v);}    
   
    
  //*--------------*
  //* Feature: inflectionForm

  /** getter for inflectionForm - gets 
   * @generated */
  public String getInflectionForm() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_inflectionForm == null)
      jcasType.jcas.throwFeatMissing("inflectionForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_inflectionForm);}
    
  /** setter for inflectionForm - sets  
   * @generated */
  public void setInflectionForm(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_inflectionForm == null)
      jcasType.jcas.throwFeatMissing("inflectionForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_inflectionForm, v);}    
   
    
  //*--------------*
  //* Feature: basicForm

  /** getter for basicForm - gets 
   * @generated */
  public String getBasicForm() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_basicForm == null)
      jcasType.jcas.throwFeatMissing("basicForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_basicForm);}
    
  /** setter for basicForm - sets  
   * @generated */
  public void setBasicForm(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_basicForm == null)
      jcasType.jcas.throwFeatMissing("basicForm", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_basicForm, v);}    
   
    
  //*--------------*
  //* Feature: reading

  /** getter for reading - gets 
   * @generated */
  public String getReading() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_reading == null)
      jcasType.jcas.throwFeatMissing("reading", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_reading);}
    
  /** setter for reading - sets  
   * @generated */
  public void setReading(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_reading == null)
      jcasType.jcas.throwFeatMissing("reading", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_reading, v);}    
   
    
  //*--------------*
  //* Feature: pronunciation

  /** getter for pronunciation - gets 
   * @generated */
  public String getPronunciation() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_pronunciation == null)
      jcasType.jcas.throwFeatMissing("pronunciation", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_pronunciation);}
    
  /** setter for pronunciation - sets  
   * @generated */
  public void setPronunciation(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_pronunciation == null)
      jcasType.jcas.throwFeatMissing("pronunciation", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_pronunciation, v);}    
   
    
  //*--------------*
  //* Feature: subcategory1

  /** getter for subcategory1 - gets 
   * @generated */
  public String getSubcategory1() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategory1 == null)
      jcasType.jcas.throwFeatMissing("subcategory1", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategory1);}
    
  /** setter for subcategory1 - sets  
   * @generated */
  public void setSubcategory1(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategory1 == null)
      jcasType.jcas.throwFeatMissing("subcategory1", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategory1, v);}    
   
    
  //*--------------*
  //* Feature: subcategory2

  /** getter for subcategory2 - gets 
   * @generated */
  public String getSubcategory2() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategory2 == null)
      jcasType.jcas.throwFeatMissing("subcategory2", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategory2);}
    
  /** setter for subcategory2 - sets  
   * @generated */
  public void setSubcategory2(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategory2 == null)
      jcasType.jcas.throwFeatMissing("subcategory2", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategory2, v);}    
   
    
  //*--------------*
  //* Feature: subcategory3

  /** getter for subcategory3 - gets 
   * @generated */
  public String getSubcategory3() {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategory3 == null)
      jcasType.jcas.throwFeatMissing("subcategory3", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategory3);}
    
  /** setter for subcategory3 - sets  
   * @generated */
  public void setSubcategory3(String v) {
    if (MecabMorpheme_Type.featOkTst && ((MecabMorpheme_Type)jcasType).casFeat_subcategory3 == null)
      jcasType.jcas.throwFeatMissing("subcategory3", "net.hitsujiwool.uima.igo.types.MecabMorpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((MecabMorpheme_Type)jcasType).casFeatCode_subcategory3, v);}    
  }

    