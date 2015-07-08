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

  private String syncMetaId;
  private String name;
  private String value;

  /**
   * 
   * Creates a new @link{SimpleEntityAttribute}.
   * 
   * @param syncMetaId the SyncMeta id of this @link{SimpleEntityAttribute}
   * @param name the name of this @link{SimpleEntityAttribute}
   * @param value the value of this @link{SimpleEntityAttribute}
   * 
   */
  public SimpleEntityAttribute(String syncMetaId, String name, String value) {

    this.name = name;
    this.value = value;
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
