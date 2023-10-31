class noobject{
    static int noofobject = 0 ;
    {
    noofobject +=1;
    }
    public static void display(){
        System.out.println("Number of object created: "+noofobject);
    }
}
class countojbect {
    public static void main(String args[]){
        noobject n1 = new noobject();
        noobject.display();
        noobject n2 = new noobject();
        noobject.display();
    }
    
}
