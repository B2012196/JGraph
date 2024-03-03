/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import javax.swing.*;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;
import java.util.Random;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxEdgeStyle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphDrawingExample extends JFrame {

    private mxGraphComponent graphComponent;
    public mxGraph graph;
    Object parent;
    public mxCell[] vertex;
    public mxCell[] edgegraph;

    public GraphDrawingExample(int arrDU[], int arrDV[], int arrDW[],int n, int m) {//(dinh u, dinh v, trong so, so sinh , số cung)
        System.out.println(n);
        System.out.println(m);
        Random random = new Random(); // Khởi tạo đối tượng Random
        graph = new mxGraph(); //Tạo đối tượng mxgraph
        
        parent = graph.getDefaultParent(); // Lấy đối tượng cha để chèn đỉnh vào
        graph.getModel().beginUpdate();
        vertex = new mxCell[n+1]; // mot mang dinh 
        try {
            for(int i=1; i<=n; i++){
                // Tạo số nguyên ngẫu nhiên trong khoảng từ 0 đến 299
                int randomNumber1 = random.nextInt(400);
                int randomNumber2 = random.nextInt(400);
                // mỗi dinh xuất hiện trên đồ thị với tọa độ ngẫu nhiên
                vertex[i] =(mxCell) graph.insertVertex(parent, "d" + i, i, randomNumber1, randomNumber2, 30, 30);
                vertex[i].setStyle(mxConstants.STYLE_STROKECOLOR + "=blue;" + mxConstants.STYLE_STROKEWIDTH + "=2;" + mxConstants.STYLE_SHAPE + "=ellipse");
            }   
            // add cung về đồ thị
            edgegraph = new mxCell[m+1];
            for(int i=1; i<=m; i++){
                edgegraph[i] = (mxCell) graph.insertEdge(parent, ""+i, arrDW[i], vertex[arrDU[i]], vertex[arrDV[i]]);
//                graph.setCellStyles(mxConstants.STYLE_STROKECOLOR, "#0000FF", new Object[]{edgegraph[i]});
                // Thiết lập gián đoạn không thể di chuyển
                mxGeometry edgeGeometry = graph.getModel().getGeometry(edgegraph[i]);
                edgeGeometry.setTerminalPoint(edgeGeometry.getSourcePoint(), true);
                edgeGeometry.setTerminalPoint(edgeGeometry.getTargetPoint(), false);
                edgegraph[i].getGeometry().setRelative(true);
                edgegraph[i].setStyle(mxConstants.STYLE_MOVABLE + "=0;"+ mxConstants.STYLE_STROKECOLOR + "=blue;"+ mxConstants.STYLE_FONTSIZE + "=15;" ); // + mxConstants.STYLE_STROKEWIDTH + "=1.1;"
            }
        } finally {
            graph.getModel().endUpdate();
        }
        
        //lớp mxGraphComponent tương tác với đồ thị và giao diện người dùng
        // Tạo mxGraphComponent để hiển thị mxGraph
        graphComponent = new mxGraphComponent(graph); // Taok đối tượng mxGraphComponent và gán graph vào đó
        getContentPane().add(graphComponent); // Thêm graphComponent vào giao diện người dùng Swing. Được sử dụng để truy cập và thao tác với nội dung chính của JFrame.
        
    }
    
    public mxGraphComponent getGraphComponent(){
        return graphComponent;
    }
    
    public mxGraph gett(){
        return graph;
    }
    
    public void doiMauCung(String d[], int k){ // d cung, k chi số
        for(int i=1; i<=k; i++){
            System.out.println(d[i]);
        }
        Object[] edges = new Object[( vertex.length)]; // đoi tuong cung chứa đường đi
        System.out.println("Doi mau cung");
        int c=1;
        for(int i=1; i <( vertex.length); i++){
            System.out.println("Lappp" +i);
            if(d[c].equals(vertex[i].getId())){
                System.out.println("dau bang");
                for(int j=1; j<(vertex.length); j++){
                        
                        if(d[c+1].equals(vertex[j].getId())){
                            System.out.println("CUoi bằng");
                            edges = graph.getEdgesBetween((Object) vertex[i], (Object) vertex[j]);
                            for (Object edge : edges) {
                                mxCell cell = (mxCell) edge;
                                    graph.setCellStyles(mxConstants.STYLE_STROKECOLOR, "#FF0000", new Object[]{cell});
                            } 
                            break;
                        }
                }
                c++; // chỉ số của đỉnh, đường đi ngắn nhất.
                i=0;
            }

            if(c == k)
                break;
        }
    }
    
    public void refreshMauCung(String d[], int k){ // d cung, k chi số
        for(int i=1; i<=k; i++){
            System.out.println(d[i]);
        }
        Object[] edges = new Object[( vertex.length)]; // mang 
        System.out.println("Doi mau cung");
        int c=1;
        for(int i=1; i <( vertex.length); i++){
            System.out.println("Lappp" +i);
            if(d[c].equals(vertex[i].getId())){
                System.out.println("dau bang");
                for(int j=1; j<(vertex.length); j++){
                        
                        if(d[c+1].equals(vertex[j].getId())){
                            System.out.println("CUoi bằng");
                            edges = graph.getEdgesBetween((Object) vertex[i], (Object) vertex[j]);
                            for (Object edge : edges) {
                                mxCell cell = (mxCell) edge;
                                    graph.setCellStyles(mxConstants.STYLE_STROKECOLOR, "#0000FF", new Object[]{cell});
                            } 
                            break;
                        }
                }
                c++; // chỉ số của đỉnh, đường đi ngắn nhất.
                i=0;
            }

            if(c == k)
                break;
        }
    }
    
}
// id dinh thứ 1 va dinh 2 trùng nhau với dinh ngăn nhat Graph
