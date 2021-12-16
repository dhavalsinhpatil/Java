import java.util.*;

//TreeNodeAddtionProgram.java
@SuppressWarnings("unchecked")
class dada{

static int sz = 100005;
static int n;

static ArrayList []tree = new ArrayList[sz];
static int []subtree_size = new int[sz];
static int []vis = new int[sz];
static void AddEdge(int a, int b)
{
	tree[a].add(b);
	tree[b].add(a);
}


static int dfs(int node)
{
	

	vis[node] = 1;
	subtree_size[node] = 1;

	for(int child : (ArrayList<Integer>)tree[node])
	{
		
		if (vis[child] == 0)
		{
			
			subtree_size[node] += dfs(child);
		}
	}
	return subtree_size[node];
}

static int contribution(int node, int ans)
{
	
	vis[node] = 1;

	for(int child : (ArrayList<Integer>)tree[node])
	{
		
		if (vis[child] == 0)
		{
			ans += (subtree_size[child] *
			(n - subtree_size[child]));
			ans = contribution(child, ans);
		}
	}
	return ans;
}

static int getSum()
{
	
	Arrays.fill(vis, 0);
	dfs(0);
	
	int ans = 0;
	Arrays.fill(vis, 0);
	ans = contribution(0, ans);

	return ans;
}

public static void main(String []args)
{
	n = 5;
	
	for(int i = 0; i < sz; i++)
	{
		tree[i] = new ArrayList();
	}
	
	AddEdge(0, 1);
	AddEdge(0, 3);
	AddEdge(1, 2);
	AddEdge(1, 3);

	System.out.println(getSum());
}
}
