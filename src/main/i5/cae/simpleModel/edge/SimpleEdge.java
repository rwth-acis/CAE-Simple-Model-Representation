package i5.cae.simpleModel.edge;

import java.io.Serializable;
import java.util.ArrayList;

import i5.cae.simpleModel.SimpleEntityAttribute;
import i5.cae.simpleModel.node.SimpleNode;

/**
 * 
 * SimpleEdge Data-Class
 * 
 * Part of the CAE-Simple-Model-Representation.
 *
 */
public class SimpleEdge implements Serializable {

  private static final long serialVersionUID = 262178271488811654L;

  private String id;
  private String sourceNode;
  private String targetNode;
  private String type;
  // an edge has a label value (in comparison to a node which uses the "name" value here)
  private String labelValue;
  private ArrayList<SimpleEntityAttribute> attributes;

  /**
   * 
   * Creates a new {@link SimpleEdge} entity.
   * 
   * @param edgeId the edges id
   * @param sourceNode a reference to a {@link SimpleNode} id
   * @param targetNode a reference to a {@link SimpleNode} id
   * @param type the type of this {@link SimpleEdge}
   * @param labelValue the label value of this {@link SimpleEdge}
   * @param attributes an {@link ArrayList} of {@link SimpleEntityAttribute}s
   * 
   */
  public SimpleEdge(String edgeId, String sourceNode, String targetNode, String type,
      String labelValue, ArrayList<SimpleEntityAttribute> attributes) {
    this.id = edgeId;
    this.sourceNode = sourceNode;
    this.targetNode = targetNode;
    this.type = type;
    this.labelValue = labelValue;
    this.attributes = attributes;

  }


  public String getId() {
    return this.id;
  }


  public String getSourceNode() {
    return this.sourceNode;
  }


  public String getTargetNode() {
    return this.targetNode;
  }


  public String getType() {
    return this.type;
  }


  public ArrayList<SimpleEntityAttribute> getAttributes() {
    return this.attributes;
  }


  public String getLabelValue() {
    return this.labelValue;
  }


}
