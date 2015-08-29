package i5.cae.simpleModel;

import java.io.Serializable;
import java.util.ArrayList;

import i5.cae.simpleModel.edge.SimpleEdge;
import i5.cae.simpleModel.node.SimpleNode;

/**
 * 
 * Simplified representation of a SyncMeta model. Lacks style information (position elements), JSON
 * converting functionality and persistence options. Also aggregates the Model-Attributes group into
 * the model itself and removes data only used by database operations (ids..). Used as a read-only
 * element send via the LAS2peer network to the CAE-Code-Generation Service.
 * 
 * Part of the CAE-Simple-Model-Representation.
 *
 */
public class SimpleModel implements Serializable {

  private static final long serialVersionUID = -7841290138342593951L;

  private String name;
  private ArrayList<SimpleNode> nodes;
  private ArrayList<SimpleEdge> edges;
  private ArrayList<SimpleEntityAttribute> attributes;


  /**
   * 
   * Creates a new model.
   * 
   * @param name the name of this {@link SimpleModel}
   * @param nodes an {@link ArrayList} of {@link SimpleNode}s
   * @param edges an {@link ArrayList} of {@link SimpleEdge}s
   * @param attributes an {@link ArrayList} of {@link SimpleEntityAttribute}s
   * 
   */
  public SimpleModel(String name, ArrayList<SimpleNode> nodes, ArrayList<SimpleEdge> edges,
      ArrayList<SimpleEntityAttribute> attributes) {
    this.name = name;
    this.nodes = nodes;
    this.edges = edges;
    this.attributes = attributes;
  }


  public String getName() {
    return name;
  }


  public ArrayList<SimpleNode> getNodes() {
    return nodes;
  }


  public ArrayList<SimpleEdge> getEdges() {
    return edges;
  }


  public ArrayList<SimpleEntityAttribute> getAttributes() {
    return attributes;
  }

}
