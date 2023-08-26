package GraphQs;
import java.util.*;
public class CycleDetectionDirectedGraphKahnsTopoSortBFS {
	static boolean cycledetect(ArrayList<ArrayList<Integer>> adjlist) {
		int n=adjlist.size();
//		int[]answer=new int[n];
//		Arrays.fill(answer, -1);
		int[]indegree=new int[n];
		for(int i=0;i<n;i++) {
			for(int it:adjlist.get(i)) {
				indegree[it]++;
				
			}
		}

		Queue<Integer>q=new LinkedList<>();
		for(int h=0;h<indegree.length;h++) {
			if(indegree[h]==0)q.add(h);
			
		}
		if(q.isEmpty())return true;

//		int index=0;
		int counter=0;
		while(!q.isEmpty()) {
			int k=q.poll();
//			answer[index++]=k;
			counter++;
			for(int g:adjlist.get(k)) {
				if(--indegree[g]==0)q.add(g);
			}
			
		}
//		for(int y=0;y<n;y++) {
//			if(answer[y]==-1)return true;
//		}
		if(n!=counter)return true;
	return false;
	}
	public static void main(String[] args) {
		ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(5).add(0);
        
        adj.get(4).add(0);
   
        adj.get(5).add(2);
      
        adj.get(2).add(3);
        adj.get(4).add(1);
        adj.get(3).add(1);
        adj.get(3).add(5);
      
        
        
        boolean ans = cycledetect(adj);
        System.out.println(ans);
        
 
//        int n=5,m=5;
//		int adjmat[][] =new int[n+1][n+1];
//		//edge 0--1
//		adjmat[0][1]=1;
//		adjmat[1][0]=1;
//		//edge 0--2
//		adjmat[0][2]=1;
//		adjmat[2][0]=1;
//		//edge 1--2
//		adjmat[1][2]=1;
//		adjmat[2][1]=1;
//		//edge 2--3
//		adjmat[3][2]=1;
//		adjmat[2][3]=1;
//		//edge 1--4
//		adjmat[1][4]=1;
//		adjmat[4][1]=1;
//		ArrayList < Integer > ans2 = dfsmainmat(5, adjmat);
//		int no2 = ans2.size(); 
//        for(int i = 0;i<no2;i++) {
//            System.out.print(ans2.get(i)+" "); 
//        }
	}

}
