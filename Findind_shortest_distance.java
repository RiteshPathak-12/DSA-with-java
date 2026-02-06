public class Findind_shortest_distance {
    public static float shortestDistance(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='W'){
                x--;
            }else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        int dis=x2+y2;
        float distance=(float)Math.sqrt(dis);
        return distance;
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println("The shortest distance are from the origin is: "+shortestDistance(path));
    }
}
