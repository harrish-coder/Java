interface GeoAnalyzer{
    final static float pi=3.14F;
    float area();
    float perimeter();
}

class Circle implements GeoAnalyzer{
    Float radius;
    Circle(float r){
        radius = r;
    }
    public float area(){
        return (pi*radius*radius);
    }
    public float perimeter(){
        return (2*pi*radius);
    }
}

class Ellipse implements GeoAnalyzer{
    float major;
    float minor;
    Ellipse(float m, float n){
        major=m;
        minor=n;
    }
    public float area(){
        return (pi*major*minor);
    }
    public float perimeter(){
        return (pi*(major+minor));
    }
}
class Rectangle implements GeoAnalyzer{
    float length;
    float width;
    Rectangle(float l, float w){
        length=l;
        width=w;
    }
    public float area(){
        return (length*width);
    }
    public float perimeter(){
        return (2*(length+width));
    }
}