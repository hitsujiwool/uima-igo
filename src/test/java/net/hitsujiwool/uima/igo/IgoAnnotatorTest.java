package net.hitsujiwool.uima.igo;

import java.util.Collection;

import net.hitsujiwool.uima.igo.types.MecabMorpheme;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.jcas.JCas;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.Test;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.util.JCasUtil;

public class IgoAnnotatorTest {
  
  private static Collection<MecabMorpheme> morphemes;

  @Rule
  public TestName name = new TestName();
  
  @BeforeClass
  public static void runIgo() throws Exception {
    String sampleSentence = "供述によると、ペレイラがはじめて彼に会ったのは、ある夏の日だったという。";
    AnalysisEngine ae = AnalysisEngineFactory.createAnalysisEngine("desc.IgoAnnotator");
    JCas jCas = ae.newJCas();
    jCas.setDocumentText(sampleSentence);
    ae.process(jCas);
    morphemes = JCasUtil.select(jCas, MecabMorpheme.class);
  }
  
  @Before
  public void prepare() {
    System.out.println("\n--------- method: " + this.name.getMethodName() + "() ---------\n");
  }
  
  @Test
  public void getSurface() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getSurface());
    }
  }
  
  @Test
  public void getFeature() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getFeature());
    }
  }
  
  @Test
  public void getPos() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getPos());
    }
  }

  @Test
  public void getSubcategories() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getSubcategories());
    }
  }

  @Test
  public void getSubcategory1() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getSubcategory1());
    }
  }

  @Test
  public void getSubcategory2() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getSubcategory2());
    }
  }

  @Test
  public void getSubcategory3() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getSubcategory3());
    }
  }
  
  @Test
  public void getInflectionForm() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getInflectionForm());
    }
  }
  
  @Test
  public void getInflectionType() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getInflectionType());
    }
  }

  @Test
  public void getReading() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getReading());
    }
  }  
  
  @Test
  public void getPronunciation() throws Exception {
    for (MecabMorpheme m : morphemes) {
      System.out.println(m.getPronunciation());
    }
  }  
  
}
