package aduial.ithildin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by luthien on 18/02/2021.
 */
@Entity
public class RefCognateView{

  @Id
  private long   entryId;
  private String lang;
  private String form;
  private String gloss;
  private String sources;

  protected RefCognateView() {}

  public long getEntryId() {
    return entryId;
  }

  public void setEntryId(long entryidfrom) {
    this.entryId = entryidfrom;
  }


  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }


  public String getGloss() {
    return gloss;
  }

  public void setGloss(String gloss) {
    this.gloss = gloss;
  }


  public String getSources() {
    return sources;
  }

  public void setSources(String sources) {
    this.sources = sources;
  }

}
