import java.util.Arrays;
public class Zoo {

    // Override toString here...

    Object[] objects;

    public Zoo() {
        objects = new Object[3];

        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }

    public void print() {
        for (Object a : objects) {
            System.out.println(a);
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }

    public String toString(){
        String result = "Zoo: [";
        for (int i = 0; i < objects.length; i++) {
            result += objects[i].toString();
            if (i < objects.length-1) {
                result += ", ";
            } else result += "]";
        }
        return result;
    }
}