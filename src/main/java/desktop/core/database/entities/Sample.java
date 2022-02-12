package desktop.core.database.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sample {
  @Id
  @GeneratedValue
  private Integer id;

  private String name;

  @Override
  public String toString() {
    return "Sample [id=" + id + ", name=" + name + "]";
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
