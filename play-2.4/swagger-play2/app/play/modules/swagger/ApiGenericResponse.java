package play.modules.swagger;

import io.swagger.annotations.ApiResponse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by mac on 15.05.16.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiGenericResponse {
    /**
     * Returns the generic type of the response
     * @return generic type
     */
    Class<?> genericType() default Void.class;
    /**
     * Returns the generic type of a response as a string
     * @return generic type as a string from a response
     */
    Class<?> genericTypeParameter() default Void.class;
}
