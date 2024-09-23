// Custom Annotation Definition
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define an annotation called MyAnnotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "Default Annotation Value";
}

public class Day18 {

    // Applying the custom annotation
    @MyAnnotation(value = "Custom Annotation Applied")
    public void myMethod() {
        System.out.println("My method is executed.");
    }

    public static void main(String[] args) throws Exception {
        Day18 obj = new Day18();
        obj.myMethod();

        // Accessing the annotation value using reflection
        MyAnnotation annotation = obj.getClass()
                                     .getMethod("myMethod")
                                     .getAnnotation(MyAnnotation.class);

        // Printing the value of the annotation
        System.out.println("Annotation value: " + annotation.value());
    }
}
