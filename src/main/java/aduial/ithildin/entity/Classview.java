package aduial.ithildin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by luthien on 18/02/2021.
 */
@Entity
public class Classview {

  @Id
  private long entryid;
  private String mark;
  private long lgorder;
  private String grammartxt;
  private String grammartypetxt;
  private long grammarid;


  public long getEntryid() {
    return entryid;
  }

  public void setEntryid(long entryid) {
    this.entryid = entryid;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public long getLgorder() {
    return lgorder;
  }

  public void setLgorder(long lgorder) {
    this.lgorder = lgorder;
  }


  public String getGrammartxt() {
    return grammartxt;
  }

  public void setGrammartxt(String grammartxt) {
    this.grammartxt = grammartxt;
  }


  public String getGrammartypetxt() {
    return grammartypetxt;
  }

  public void setGrammartypetxt(String grammartypetxt) {
    this.grammartypetxt = grammartypetxt;
  }


  public long getGrammarid() {
    return grammarid;
  }

  public void setGrammarid(long grammarid) {
    this.grammarid = grammarid;
  }

}
