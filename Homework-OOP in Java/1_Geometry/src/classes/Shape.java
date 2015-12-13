package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
	
	private List<Vertex> shapeVertices;
	
	protected Shape() {
		shapeVertices = new ArrayList<>();		
	}
	
	protected List<Vertex> getVertices() {
		return shapeVertices;
	}
	
	protected void addVertices(Vertex... vertices) {
		for (Vertex v : vertices) {
			this.shapeVertices.add(v);
		}
	}

}
