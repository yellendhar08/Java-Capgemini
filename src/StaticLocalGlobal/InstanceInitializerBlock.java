package StaticLocalGlobal;

//The non-static block will get executed whenever we create a new object using new keyword

public class InstanceInitializerBlock {
    {
        System.out.println("New Object was created for this class");
    }
    public static void main(String[] args) {
        InstanceInitializerBlock obj = new InstanceInitializerBlock();
        InstanceInitializerBlock obj1 = new InstanceInitializerBlock();
        InstanceInitializerBlock obj2 = new InstanceInitializerBlock();

    }
}
