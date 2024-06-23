public final class ImmutableRechtangle {
    public final double width;
    public final double height;
    public ImmutableRechtangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double area(){
        return width * height;
    }
}
