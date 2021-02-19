package aduial.ithildin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by luthien on 18/02/2021.
 */
@Entity
public class Entrynoteview {

  @Id
  private long entryId;
  private long ordering;
  private String txt;


  public long getEntryId() {
    return entryId;
  }

  public void setEntryId(long entryId) {
    this.entryId = entryId;
  }


  public long getOrdering() {
    return ordering;
  }

  public void setOrdering(long ordering) {
    this.ordering = ordering;
  }


  public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

}
