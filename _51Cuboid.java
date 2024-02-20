class Cuboid{
    //setters
    private int length,breath,height;
    public void setLength(int l){
        length=l;
    }
    public void setBreath(int b){
        breath=b;
    }
    public void setHeight(int h){
        height=h;
    }

    //getters- it returns the value

    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
    public int getHeight(){
        return height;
    }
    public int getVolume(){
        return length*breath*height;
    }
    public int getSurfaceArea(){
        return 2*(length*breath+breath*height+height*length);
    }


}

public class _51Cuboid{
    public static void main(String []args){
        Cuboid obj=new Cuboid();
        obj.setLength(45);
        obj.setBreath(34);
        obj.setHeight(12);
        System.out.println("Length="+obj.getLength());
        System.out.println("Breath="+obj.getBreath());
        System.out.println("Height="+obj.getHeight());
        System.out.println("Volume="+obj.getVolume());
        System.out.println("Surface Area="+obj.getSurfaceArea());
    }
}