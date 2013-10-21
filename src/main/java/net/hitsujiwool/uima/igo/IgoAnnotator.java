package net.hitsujiwool.uima.igo;

import java.io.FileNotFoundException;
import java.io.IOException;

import net.hitsujiwool.uima.igo.types.MecabMorpheme;
import net.reduls.igo.Tagger;
import net.reduls.igo.Morpheme;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.UimaContext;

public class IgoAnnotator extends JCasAnnotator_ImplBase {
  
  public static final String MESSAGE_DIGEST = "net.hitsujiwool.uima.igo.IgoAnnotator_Messages";
  
  private String dicDir; 
      
  @Override 
  public void initialize(UimaContext ctx) throws ResourceInitializationException {
    this.dicDir = (String) ctx.getConfigParameterValue("DicDir");
  }
  
  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
    try {      
      Tagger tagger = new Tagger(this.dicDir);
      for (Morpheme m : tagger.parse(jCas.getDocumentText())) {
        MecabMorpheme mecab = new MecabMorpheme(jCas);
        mecab.setBegin(m.start);
        mecab.setEnd(m.start + m.surface.length());
        mecab.setSurface(m.surface);
        mecab.setFeature(m.feature);
        String[] rawFeatures = m.feature.split(",");
        String[] features = new String[rawFeatures.length];
        for (int i = 0, len = rawFeatures.length; i < len; i++) {
          String f = rawFeatures[i];
          if (!f.equals("*")) {
            features[i] = f;
          }
        }        
        mecab.setPos(features[0]);
        StringArray arr = new StringArray(jCas, 3);
        arr.copyFromArray(features, 1, 0, 3);
        mecab.setSubcategories(arr);
        mecab.setSubcategory1(features[1]);
        mecab.setSubcategory2(features[2]);
        mecab.setSubcategory3(features[3]);       
        mecab.setInflectionForm(features[4]);
        mecab.setInflectionType(features[5]);
        mecab.setBasicForm(features[6]);
        if (features.length > 7) {
          mecab.setReading(features[7]);
          mecab.setPronunciation(features[8]);
        }
        mecab.addToIndexes();
      }
    } catch (FileNotFoundException e) {
      throw new AnalysisEngineProcessException(MESSAGE_DIGEST, "resource_not_found_error", new Object[]{ e.getMessage() });
    } catch (IOException e) {
      throw new AnalysisEngineProcessException(MESSAGE_DIGEST, "io_error", new Object[]{ e.getMessage() });
    }
  }  
}
