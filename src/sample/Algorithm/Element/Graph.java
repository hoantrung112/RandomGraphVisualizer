package sample.Algorithm.Element;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Vertex> vList = new ArrayList<>();
	private List<Edge> eList = new ArrayList<>();
	private int initVCount;
	private int totalDegree = 0;

	// Constructor
	public Graph(int v) {
		this.initVCount = v;
	}

	public void addVertex(Vertex v) {
		vList.add(v);
	}

	public void addEdge(Edge e) {
		eList.add(e);
	}

	public void removeEdge(Edge e) {
		if (eList.contains(e)) {
			eList.remove(e);
		}
	}

	public void removeEdge(int id) {
		if (eList.contains(eList.get(id))) {
			eList.remove(id);
		}
	}
	

	public void removeVertex(int idx) {
		if (idx < vList.size()) {
			vList.remove(idx);
		}
	}

	public void resetGraph() {
		vList.clear();
		eList.clear();
	}

	public int getVCount() {
		return vList.size();
	}

	public int getECount() {
		return eList.size();
	}

	public int getInitVCount() {
		return initVCount;
	}

	public int getTotalDegree() {
		return totalDegree;
	}

	public List<Vertex> getVList() {
		return vList;
	}

	public List<Edge> getEList() {
		return eList;
	}
}