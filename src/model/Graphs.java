package model;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Graphs {
    private int[][] adjacencyMatrix;
    private int n,m=0; // n dinh, m cung
    final int oo = 999; 
    final int NO_EDGE = 0;
    public int WHITE = 0; // trang thai chua duyet
    public int GRAY = 1; // trang thai dang duyet
    public int BLACK = 2; // trang thai da duyet
    private int[] color = new int[100];
    private int has_circle = 0;//Co biet do thi chua chu trinh hay khong
    private String chuoiduong = null;
    private String chutrinh = null;
    private String phu = "";
    private int trongSo;
    private int piDinhCuoi = 0;
    private int u[];
    private int v[];
    private int w[];
    private int path[];
    public int k;
    public String sDFS = new String();
    private String d[] = new String [11]; // lưu lại đỉnh chứa đường đi ngắn nhất
    
    private int bestPath[];
    private int minWeight;
    
    private String sBestPath = new String();
    
    
    
    public Graphs() {
        adjacencyMatrix = new int[100][100];
    }

    public void addEdge(int u, int v, int w) {
        if (u < 1 || u > n || v < 1 || v > n) {
            return;
        }
        adjacencyMatrix[u][v] = w;
        this.m++;
    }
    
    public int getdinh(){
        return n;
    }
    
    public void printGraph() {
        for (int u=1; u<=n; u++) {
            for (int v=1; v<=n; v++)
                System.out.print(adjacencyMatrix[u][v] + " ");
            System.out.print("\n");
        }
    }

    public void docDoThi(){
        int m;
        this.m = 0;
        File f = new File("D:\\NetbeanProject\\dothi\\src\\dulieu.txt");
        Scanner sc;
        try {
            sc = new Scanner(f);
            // doc so dinh va so cung
            this.n = sc.nextInt();
            m = sc.nextInt();
            // Doc u, v, w
            u = new int[m+1];
            v = new int[m+1];
            w = new int[m+1];
            int k=1;
            for (int e=0; e<m; e++){
                System.out.println("Dang doc cung thu " + (e+1));
                System.out.print("Doc u ");
                u[k] = sc.nextInt();
                System.out.print("Doc v ");
                v[k] = sc.nextInt();
                System.out.print("Doc w ");
                w[k] = sc.nextInt();
                System.out.println("");
                addEdge(u[k], v[k], w[k]);
                System.out.println(u[k] +" "+ v[k] +" "+ w[k]);
                k++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Đồ thị được xây dựng:");
        printGraph();
    }
    
    public String MooreDijkstra(int s1, int s2){
        int u, v, it, sum_w=0;
        int p[] = new int[n+1]; // dinh truoc cua dinh dang duyet
        int pi[] = new int[n+1]; // pi la khoang cach
        int mark[] = new int[n+1]; // mark la danh dau cung duyet
        //khoi tao pi = oo va danh dau mark  = 0
        for (u=1; u<=n; u++){
            pi[u] = oo;
            mark[u] = 0;
        }
        // danh dau cung s duyet dau tien
        pi[s1] = 0; // chieu dai tu s den chinh no bang 0
        p[s1] = -1;
        System.out.println(p[s1]);
        
        // Lap n-1 lan
        String duong = null;
        for (it = 1; it < n; it++){
            //buoc 1. tim u co mark = 0 (chua duoc duyet) va co pi nho nhat (duong di ngan nhat)
            int  j, min_pi = oo;
            for (j=1; j<=n; j++){
                if(mark[j] == 0 && pi[j] < min_pi){
                    min_pi = pi[j];
                    u = j;
                }
            }
            
            //buoc 2. danh dau u da xet
            mark[u] = 1;
            
            //buoc 3. Cap nhat pi va p cua cac dinh ke cuar v (neu thoa)
            for (v=1; v<=n; v++){
                if(adjacencyMatrix[u][v] != NO_EDGE && mark[v] == 0){
                    if(pi[u] + adjacencyMatrix[u][v] < pi[v]){
                        pi[v] = pi[u] + adjacencyMatrix[u][v];
                        p[v] = u;
                        System.out.println(p[v]);
                    }
                }
            }
        }
        
        piDinhCuoi = pi[s2];
            
        //Tim duong di ngan nhat
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dinh muon tim duong di ngan nhat: ");
        int current = s2;
        int g = current; // luu dinh dau
        path = new int[100]; // luu cac dinh tren duong di
        k=0; // so dinh cua duong di
        duong = "Đường đi ngắn nhất là: ";
        //Lan luot theo p de lay duong di
        while (current != -1){
            if(k > m){
                duong = "Không chứa đường đi ngắn nhất";
                piDinhCuoi = 0;
                return duong;
            }
            path[k] = current; // path chứa đường đi từ đỉnh cuối đến đỉnh đầu
            System.out.println(path[k]);
            k++;
            current = p[current];
        }
        
        //In ra man hinh theo chieu nguoc  lai
        System.out.print("Đường đi ngắn nhất từ " + s1 + " đến " + g + " là: ");
        
        int c=1;
        for (u=k-1; u >= 1; u--){
            System.out.print(path[u] + " => ");
            duong = duong + path[u] + " => "; // lưu chuỗi đường đi hiển thị lên form
            d[c] = "d"+path[u]; // lưu lại đỉnh mà chứa đường đi ngắn nhất. Kiểm tra bên JGraphX
            c++;
        }
        System.out.println(path[0]);
        d[c] = "d" +path[0];
        
    // In ra dinh dau
        duong = duong + path[0]; // them dinh dau vao chuoi
        System.out.println("");
        return duong;  
    }
    
    public boolean timduongdi(String diemdi, String diemden){
        System.out.println("More-Dijkstra");
        int s1=0, s2=0;
        try {
            s1 = Integer.parseInt(diemdi);
            s2 = Integer.parseInt(diemden);
        } catch (NumberFormatException e) {
            System.out.println("Chuỗi không thể chuyển đổi thành số nguyên.");
            e.printStackTrace(); // In thông tin chi tiết về ngoại lệ
            return false;
        }

        chuoiduong = MooreDijkstra(s1, s2);
        chutrinh = timChuTrinh();
        Prim(1);
        return true;
    }
    
    public String timChuTrinh(){
        //b1. Khoi tao mang color[u] = WHITE
        for (int u=1; u<=n ;u++)
            color[u] = WHITE;
        
        //b2. Khoi tao bien has_circle
        has_circle = 0;
        
        //b3. Duyet toan bo do thi kiem tra chu trinh
        for(int u=1; u<=n; u++){
            if(color[u] == WHITE)
                DFS(u);
        }
        
        //b4. Kiem tra has_circle
        String chutrinh = new String();
        sDFS += 1 ;
        System.out.println(sDFS);
        if(has_circle == 1){
            System.out.println("Đồ thị chứa chu trình");
            chutrinh = "Đồ thị chứa chu trình";
        }
        else{
            System.out.println("Đồ thị không chu trình");
            chutrinh = "Đồ thị không chứa chu trình";
        }
        return chutrinh;
    }
    
    
    public void setSBestPath(){
        sBestPath = "";
    }
    
    
    
    
    public String getduong(){
        return chuoiduong;
    }
    public String getChuTrinh(){
        return chutrinh;
    }
    
    public String getSDFS(){
        return sDFS;
    }
    
    public void setSDFS(String s){
        sDFS = s;
    }
    
    public String[] getD(){
        return d;
    }
    public int getK(){
        return k;
    }

    // DFS de quy kiem tra do thi co chu trinh
    public void DFS(int u){   
        // 2. To mau dang duyet cho u
        color[u] = GRAY;
        sDFS += u + " => ";
        // 3. Xet cac dinh ke cua u
        for(int v=1; v<=n; v++){
            if(adjacent(u, v)){
                if(color[v] == WHITE){
                    DFS(v);
                }
                else if (color[v] == GRAY)
                    has_circle = 1;
            }
        }
        // 4. To mau da duyet xong cho u
        color[u] = BLACK;
        
    }
    
    //Thuat toan Prim tim cay khung nho nhat
    public void Prim(int s){
        int i, u, v, x, sum_w=0;
        int p[] = new int[n+1]; // dinh truoc cua dinh dang duyet
        int pi[] = new int[n+1]; // pi la khoang cach
        int mark[] = new int[n+1]; // mark la danh dau cung duyet
        //b1. Khoi tao
        for(u=1; u<=n ;u++){
            pi[u] = oo; // khởi tạo pi= vô cùng
            p[u] = -1; // pi[u] chưa xác định
            mark[u] = 0; // dánh dấu tất cả đỉnh chưa duyệt
        }
        
        pi[s] = 0; // dường đi của đỉnh s bằng 0
        
        //b2. Lap n-1 lan
        for(i=1; i<=n; i++){
            //b2a. Tim u gan voi s nhat (tim u co pi[u] nho nhat)
            int min_dist = oo;
            for(x=1; x<=n; x++){
                if(mark[x] == 0 && pi[x] < min_dist){ // nếu chưa duyệt và pi[] < mindist
                    min_dist = pi[x];
                    u = x;
                }
            }
            
            //b2b. Danh dau u
            mark[u] = 1;
            
            //b2c. Cap nhat lai pi va p cua cac dinh ke v cua u
            for(v=1; v<=n; v++){
                if(adjacencyMatrix[u][v] != NO_EDGE){
                    if(mark[v] == 0 && pi[v] > adjacencyMatrix[u][v]){ // nếu v chưa duyệt và pi[v] >
                        pi[v] = adjacencyMatrix[u][v];
                        p[v] = u;
                    }
                }
            }
        }
        // Tìm phủ tối tiểu
        for (u=1; u<=n; u++){
            if(p[u] != -1){
                System.out.println("Lặp " +u);
                int w = adjacencyMatrix[p[u]][u];
                phu += (p[u] + " => " + u +" Trọng số: "+ w + "<br>");
                sum_w += w;
            }
        }
        trongSo = sum_w;
        System.out.println(phu);
    }
    
    public int getTrongSoDuong(){
        return piDinhCuoi;
    }
    
    
    public String getPhu(){
        return phu;
    }
    
    public void setPhu(String s){
        phu = s;
    }
    
    public int getTrongSo(){
        return trongSo;
    }
  
    // Kiem tra u ke voi v
    public boolean adjacent(int u, int v){
        if(adjacencyMatrix[u][v] > 0) return true;
           return false;
    }
    
    public int getN(){
        return n;
    }
    
    public int setN(){
        this.n++;
        return n;        
    }
    
    public int getM(){
        return m;
    }
    
    public void setM(){
        m++;
    }
    
    public int[] arrU(){
        return u;
    }
    public int[] arrV(){
        return v;
    }
    public int[] arrW(){
        return w;
    }
    
    public String getSBestPath(){
        return sBestPath;
    }
    
    
    public String findMinWeightHamiltonianCycle() {
        bestPath = new int[n+1];
        minWeight = Integer.MAX_VALUE;
        int[] path = new int[n+1]; // mảng đường đi của  chu trình
        boolean[] visited = new boolean[n+1]; // kiểm tra chu trình được duyệt hay chưa
        sBestPath += "1";
        path[1] = 1; //  đánh dấu vị trí đỉnh 1
        visited[1] = true;  // dánh dấu đỉnh đầu tiên đã  duyệt

        hamiltonianCycleUtil(path, visited, 1, 0);

        if (minWeight == Integer.MAX_VALUE) {
            return("Không tìm thấy chu trình đi qua tất cả các đỉnh.");
        } else {
            return ("Đồ thị chứa chu trình: " + sBestPath + ". Trọng số: " + minWeight);
        }
    }
    
    private void hamiltonianCycleUtil(int[] path, boolean[] visited, int pos, int weight) {
        if (pos == n) {
            System.out.println("Có đường đi");
            if (adjacencyMatrix[path[pos]][path[1]] != 0) { // nếu có đường đi đỉnh cuối đến đỉnh đầu
                int totalWeight = weight + adjacencyMatrix[path[pos]][path[1]];

                if (totalWeight < minWeight) {
                    minWeight = totalWeight;
                    bestPath = Arrays.copyOf(path, n+1);
                    sBestPath += " =>" + 1;
                }
            }
            return;
        }

        for (int v = 1; v <= n; v++) {
            System.out.println("V:" + v + " ");
            if (!visited[v] && adjacencyMatrix[path[pos]][v] != 0) {
                path[pos+1] = v;
                visited[v] = true;
                sBestPath += " =>" +v; // chuoi chu trinh tim duong 
                hamiltonianCycleUtil(path, visited, pos + 1, weight + adjacencyMatrix[path[pos]][v]);
                System.out.println("Quay lai " +v);
                return;
                
            }
        }
    }
}




