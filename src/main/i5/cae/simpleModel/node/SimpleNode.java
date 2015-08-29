package i5.cae.simpleModel.node;

import java.io.Serializable;
import java.util.ArrayList;

import i5.cae.simpleModel.SimpleEntityAttribute;


/**
 * 
 * SimpleNode Data-Class
 * 
 * Part of the CAE-Simple-Model-Representation.
 *
 */
public class SimpleNode implements Serializable {

  private static final long serialVersionUID = 8470437280652866993L;

  private String id;
  private String type;
  private ArrayList<SimpleEntityAttribute> attributes;


  /**
   * 
   * Creates a new {@link SimpleNode} entity.
   * 
   * @param nodeId the nodes id
   * @param type the type of this {@link SimpleNode}
   * @param attributes an {@link ArrayList} of {@link SimpleEntityAttribute}s
   * 
   */
  public SimpleNode(String nodeId, String type, ArrayList<SimpleEntityAttribute> attributes) {
    this.id = nodeId;
    this.type = type;
    this.attributes = attributes;
  }


  public String getId() {
    return id;
  }


  public String getType() {
    return type;
  }


  public ArrayList<SimpleEntityAttribute> getAttributes() {
    return attributes;
  }

}
