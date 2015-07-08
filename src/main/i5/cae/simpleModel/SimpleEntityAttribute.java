package i5.cae.simpleModel;

import java.io.Serializable;

/**
 * 
 * Entity-Attribute Data-Class
 * 
 * Part of the CAE-Simple-Model-Representation.
 *
 */
public class SimpleEntityAttribute implements Serializable {

  private static final long serialVersionUID = -8290453332375432790L;

  private int id = -1; // given by the database
  private String syncMetaId; // each attribute type shares the same id according to its metamodel
  private String name;
  private String value;

  /**
   * 
   * Creates a new @link{SimpleEntityAttribute}.
   * 
   * @param id the id of this model
   * @param syncMetaId the SyncMeta id of this @link{SimpleEntityAttribute}
   * @param name the name of this @link{SimpleEntityAttribute}
   * @param value the value of this @link{SimpleEntityAttribute}
   * 
   */
  public SimpleEntityAttribute(int id, String syncMetaId, String name, String value) {
    this.id = id;
    this.syncMetaId = syncMetaId;
    this.name = name;
    this.value = value;
  }

  public int getId() {
    return id;
  }

  public String getSyncMetaId() {
    return syncMetaId;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

}
