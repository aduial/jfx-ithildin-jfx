package aduial.ithildin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by luthien on 18/02/2021.
 */
@Entity
public class Gloss {

  @Id
  private long id;
  private long languageId;
  private String txt;

  protected Gloss() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getLanguageId() {
    return languageId;
  }

  public void setLanguageId(long languageId) {
    this.languageId = languageId;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

}